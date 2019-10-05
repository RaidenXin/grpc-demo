package com.raiden.grpc.exception;

public class GrpcException extends RuntimeException {

    public GrpcException(String message){
        super(message);
    }

}
