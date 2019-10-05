package com.raiden.grpc.controller;

import com.raiden.grpc.dto.HotelOrder;
import com.raiden.grpc.facade.entity.UserEntity;
import com.raiden.grpc.facade.service.OrderService;
import com.raiden.grpc.facade.service.UserServiceByProtoStuff;
import com.raiden.grpc.vo.OrderDetailVO;
import com.raiden.grpc.vo.OrderVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @创建人:Raiden
 * @Descriotion:
 * @Date:Created in 19:58 2019/10/5
 * @Modified By:
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserServiceByProtoStuff userServiceByProtoStuff;
    @Autowired
    private OrderService orderService;

    @PostMapping("/add")
    public UserEntity insertUser(@RequestBody UserEntity userEntity){
        userServiceByProtoStuff.insert(userEntity);
        return userEntity;
    }

    @GetMapping("/list")
    public List<UserEntity> findAllUser(){
        return userServiceByProtoStuff.findAll();
    }

    @PostMapping("/remove")
    public String removeUser(@RequestParam("id") Long id){
        userServiceByProtoStuff.deleteById(id);
        return "success";
    }

    @PostMapping("/queryOrder")
    public OrderVO queryOrder(@RequestParam("resNo") String resNo){
        HotelOrder.Order order = orderService.queryOrder(resNo);
        OrderVO orderDTO = new OrderVO();
        orderDTO.setOrderId(order.getOrderId());
        orderDTO.setResNo(order.getResNo());
        orderDTO.setUserName(order.getUserName());
        orderDTO.setCreateDate(order.getCreateDate());

        List<OrderDetailVO> list = new ArrayList<>();

        for (HotelOrder.OrderDetail orderDetail : order.getOrderDetailsList()){
            OrderDetailVO orderDetailDTO = new OrderDetailVO();
            orderDetailDTO.setHotelId(orderDetail.getHotelId());
            orderDetailDTO.setAmount(orderDetail.getAmount());
            orderDetailDTO.setResNo(order.getResNo());
            List<String> rooms = new ArrayList<>();
            rooms.addAll(orderDetail.getRoomNosList());
            orderDetailDTO.setRoomNos(rooms);
            list.add(orderDetailDTO);
        }

        orderDTO.setOrderDetails(list);

        return orderDTO;
    }
}
