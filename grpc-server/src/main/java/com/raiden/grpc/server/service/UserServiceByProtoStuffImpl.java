package com.raiden.grpc.server.service;


import com.raiden.grpc.facade.entity.UserEntity;
import com.raiden.grpc.facade.service.UserServiceByProtoStuff;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Service
@Slf4j
public class UserServiceByProtoStuffImpl implements UserServiceByProtoStuff {

    /**
     * 模拟数据库存储用户信息
     */
    private Map<Long, UserEntity> userMap = new ConcurrentHashMap<>();

    @Override
    public void insert(UserEntity userEntity) {
        if (userEntity == null){
            log.warn("insert user fail, userEntity is null!");
            return ;
        }
        userMap.putIfAbsent(userEntity.getId(), userEntity);
        log.info("UserServiceByProtoStuffImpl method insert");
    }

    @Override
    public void deleteById(Long id) {
        if (id == null){
            log.warn("delete user fail, id is null!");
        }
        userMap.remove(id);
        log.info("UserServiceByProtoStuffImpl method deleteById");
    }

    @Override
    public List<UserEntity> findAll() {
        Collection<UserEntity> values = userMap.values();
        log.info("UserServiceByProtoStuffImpl method findAll");
        return new ArrayList<>(values);
    }

}
