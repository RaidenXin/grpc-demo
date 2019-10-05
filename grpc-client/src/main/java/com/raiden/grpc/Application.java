package com.raiden.grpc;

import com.raiden.grpc.annotation.GrpcServiceScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@GrpcServiceScan(packages = {"com.raiden.grpc.facade"})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}