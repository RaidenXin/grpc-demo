package com.raiden.grpc.facade.service;


import com.raiden.grpc.annotation.GrpcService;
import com.raiden.grpc.constant.SerializeType;
import com.raiden.grpc.facade.entity.UserEntity;

import java.util.List;

@GrpcService(server = "user", serialization = SerializeType.PROTOSTUFF)
public interface UserServiceByProtoStuff {

    void insert(UserEntity userEntity);

    void deleteById(Long id);

    List<UserEntity> findAll();

}
