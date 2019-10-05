package com.raiden.grpc.service;

import com.google.protobuf.ByteString;
import com.raiden.rpc.GrpcService;

public interface SerializeService {

    /**
     * 序列化
     */
    ByteString serialize(GrpcResponse response);

    /**
     * 序列化
     */
    ByteString serialize(GrpcRequest request);

    /**
     * 反序列化
     */
    GrpcRequest deserialize(GrpcService.Request request);

    /**
     * 反序列化
     */
    GrpcResponse deserialize(GrpcService.Response response);

}
