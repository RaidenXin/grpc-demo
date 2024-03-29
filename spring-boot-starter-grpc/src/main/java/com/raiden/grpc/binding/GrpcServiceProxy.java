package com.raiden.grpc.binding;

import com.raiden.grpc.GrpcClient;
import com.raiden.grpc.annotation.GrpcService;
import com.raiden.grpc.constant.GrpcResponseStatus;
import com.raiden.grpc.constant.SerializeType;
import com.raiden.grpc.exception.GrpcException;
import com.raiden.grpc.service.GrpcRequest;
import com.raiden.grpc.service.GrpcResponse;
import org.springframework.cglib.proxy.InvocationHandler;

import java.lang.reflect.Method;
import java.util.Arrays;

public class GrpcServiceProxy<T> implements InvocationHandler {

    private Class<T> grpcService;

    public GrpcServiceProxy(Class<T> grpcService) {
        this.grpcService = grpcService;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args){
        String methodName = method.getName();
        String className = grpcService.getName();
        if ("toString".equals(methodName) && args.length == 0) {
            return className + "@" + proxy.hashCode();
        } else if ("hashCode".equals(methodName) && args.length == 0) {
            return proxy.hashCode();
        } else if ("equals".equals(methodName) && args.length == 1) {
            Object another = args[0];
            return proxy.equals(another);
        }
        GrpcService annotation = grpcService.getAnnotation(GrpcService.class);
        String server = annotation.server();
        GrpcRequest request = new GrpcRequest();
        request.setClazz(className);
        request.setMethod(methodName);
        request.setArgs(args);
        SerializeType[] serializeTypeArray = annotation.serialization();
        SerializeType serializeType = null;
        if (serializeTypeArray.length > 0) {
            serializeType = serializeTypeArray[0];
        }
        GrpcResponse response = GrpcClient.connect(server).handle(serializeType, request);
        if (GrpcResponseStatus.ERROR.getCode() == response.getStatus()) {
            Throwable throwable = response.getException();
            GrpcException exception = new GrpcException(throwable.getClass().getName() + ": " + throwable.getMessage());
            StackTraceElement[] exceptionStackTrace = exception.getStackTrace();
            StackTraceElement[] responseStackTrace = response.getStackTrace();
            StackTraceElement[] allStackTrace = Arrays.copyOf(exceptionStackTrace, exceptionStackTrace.length + responseStackTrace.length);
            System.arraycopy(responseStackTrace, 0, allStackTrace, exceptionStackTrace.length, responseStackTrace.length);
            exception.setStackTrace(allStackTrace);
            throw exception;
        }
        return response.getResult();
    }

}
