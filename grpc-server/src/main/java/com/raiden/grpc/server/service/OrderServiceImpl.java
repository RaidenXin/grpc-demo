package com.raiden.grpc.server.service;

import com.alibaba.fastjson.JSON;

import com.googlecode.protobuf.format.JsonFormat;
import com.raiden.grpc.dto.HotelOrder;
import com.raiden.grpc.facade.service.OrderService;
import com.raiden.grpc.vo.OrderDetailVO;
import com.raiden.grpc.vo.OrderVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


/**
 * @创建人:Raiden
 * @Descriotion:
 * @Date:Created in 17:07 2019/10/4
 * @Modified By:
 */
@Service
@Slf4j
public class OrderServiceImpl implements OrderService {


    @Override
    public HotelOrder.Order queryOrder(String s) {
        HotelOrder.Order.Builder builder = HotelOrder.Order.newBuilder();

        OrderVO orderDTO = new OrderVO();
        orderDTO.setOrderId(1024);
        orderDTO.setResNo("R20191004");
        orderDTO.setUserName("张三");
        orderDTO.setCreateDate("2019-10-04");

        OrderDetailVO orderDetailDTO = new OrderDetailVO();
        orderDetailDTO.setHotelId("2011038");
        orderDetailDTO.setAmount(399);
        orderDetailDTO.setResNo("R20191004");

        List<String> rooms = new ArrayList<>();
        rooms.add("101");
        rooms.add("102");
        orderDetailDTO.setRoomNos(rooms);
        List<OrderDetailVO> list = new ArrayList<>();
        list.add(orderDetailDTO);

        orderDTO.setOrderDetails(list);
        String json = JSON.toJSONString(orderDTO);
        try {
            JsonFormat.merge(json,builder);
            HotelOrder.Order build = builder.build();
            return build;
        } catch (JsonFormat.ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
}
