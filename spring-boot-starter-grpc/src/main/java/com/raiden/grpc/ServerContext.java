package com.raiden.grpc;


import com.google.protobuf.ByteString;
import com.raiden.grpc.constant.SerializeType;
import com.raiden.grpc.service.GrpcRequest;
import com.raiden.grpc.service.GrpcResponse;
import com.raiden.grpc.service.SerializeService;
import com.raiden.grpc.util.SerializeUtils;
import com.raiden.rpc.CommonServiceGrpc;
import com.raiden.rpc.GrpcService;
import io.grpc.Channel;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.TimeUnit;

@Slf4j
public class ServerContext {

    private Channel channel;

    private final SerializeService defaultSerializeService;

    private CommonServiceGrpc.CommonServiceBlockingStub blockingStub;

    ServerContext(Channel channel, SerializeService serializeService) {
        this.channel = channel;
        this.defaultSerializeService = serializeService;
        blockingStub = CommonServiceGrpc.newBlockingStub(channel);
    }

    /**
     * 处理 gRPC 请求
     */
    public GrpcResponse handle(SerializeType serializeType, GrpcRequest grpcRequest) {
        SerializeService serializeService = SerializeUtils.getSerializeService(serializeType, this.defaultSerializeService);
        ByteString bytes = serializeService.serialize(grpcRequest);
        int value = (serializeType == null ? -1 : serializeType.getValue());
        GrpcService.Request request = GrpcService.Request.newBuilder().setSerialize(value).setRequest(bytes).build();
        GrpcService.Response response = null;
        try{
            response = blockingStub.handle(request);
        }catch (Exception exception){
            log.warn("rpc exception: {}", exception.getMessage());
            if ("UNAVAILABLE: io exception".equals(exception.getMessage().trim())){
                response = blockingStub.handle(request);
            }
        }
        return serializeService.deserialize(response);
    }

    /**
     * 获取 Channel
     */
    public Channel getChannel() {
        return channel;
    }

}
