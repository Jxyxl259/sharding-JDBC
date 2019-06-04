package com.jiang.sharding.entity;

/**
 * @description:
 * @author:
 * @create: 2019-06-04 13:00
 */
public class Order {

    private Integer id;
    private String userId;
    private String orderId;
    private String info;

    public Order() {
    }

    public Order(String orderId, String info) {
        this.orderId = orderId;
        this.info = info;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
