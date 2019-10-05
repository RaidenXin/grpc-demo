package com.raiden.grpc.vo;

import lombok.Data;

import java.util.List;

/**
 * @创建人:Raiden
 * @Descriotion:
 * @Date:Created in 17:47 2019/10/4
 * @Modified By:
 */
@Data
public class OrderVO {

    private int serialize;
    private int orderId;
    private String resNo;
    private String userName;
    private String createDate;
    private List<OrderDetailVO> orderDetails;
}
