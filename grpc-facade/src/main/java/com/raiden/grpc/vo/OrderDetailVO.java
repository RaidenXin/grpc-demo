package com.raiden.grpc.vo;

import lombok.Data;

import java.util.List;

/**
 * @创建人:Raiden
 * @Descriotion:
 * @Date:Created in 17:48 2019/10/4
 * @Modified By:
 */
@Data
public class OrderDetailVO {

    private String resNo;
    private String hotelId;
    private List<String> roomNos;
    private double amount;
}
