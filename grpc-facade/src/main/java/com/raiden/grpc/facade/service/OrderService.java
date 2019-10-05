package com.raiden.grpc.facade.service;


import com.raiden.grpc.annotation.GrpcService;
import com.raiden.grpc.constant.SerializeType;
import com.raiden.grpc.dto.HotelOrder;

/**
 * @创建人:Raiden
 * @Descriotion:
 * @Date:Created in 17:02 2019/10/4
 * @Modified By:
 */
@GrpcService(server = "order", serialization = SerializeType.PROTOSTUFF)
public interface OrderService {

    HotelOrder.Order queryOrder(String resNo);
}
