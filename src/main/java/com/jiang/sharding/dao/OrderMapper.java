package com.jiang.sharding.dao;

import com.jiang.sharding.entity.Order;

import java.util.List;

public interface OrderMapper {

    /**
     * 根据分表 字段查询 订单信息
     * @param userId
     * @return
     */
    List<Order> selectOrderByLenovoId(String userId);


    /**
     * 根据lenovoIds查询
     * @param userIds
     * @return
     */
    List<Order> selectOrderByUserIds(String[] userIds);
}
