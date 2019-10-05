package com.raiden.grpc.facade.service;




import com.raiden.grpc.annotation.GrpcService;
import com.raiden.grpc.facade.entity.UserEntity;

import java.util.List;

@GrpcService(server = "user")
public interface UserServiceBySofaHessian {

    void insert(UserEntity userEntity);

    void deleteById(Long id);

    List<UserEntity> findAll();

}
