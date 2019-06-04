package com.jiang.sharding;

import com.alibaba.fastjson.JSON;
import com.jiang.sharding.dao.OrderMapper;
import com.jiang.sharding.entity.Order;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @description: 分表测试类1
 * @author: jiangbug@outlook.com
 * @create: 2019-06-04 14:16
 */
public class ShardingTableTest extends BaseTest {

    @Autowired
    private OrderMapper orderMapper;


    @Test
    public void query(){
        String lenovoId = "10111168406";
        List<Order> list = orderMapper.selectOrderByLenovoId(lenovoId);
        System.out.println("result " + JSON.toJSONString(list));
    }

    @Test
    public void query_02(){
        String lenovoId = "10111168405";
        List<Order> list = orderMapper.selectOrderByLenovoId(lenovoId);
        System.out.println("result " + JSON.toJSONString(list));
    }


    @Test
    public void query_03(){
        String lenovoId_1 = "10111168406";
        String lenovoId_2 = "10111168405";
        List<Order> list = orderMapper.selectOrderByUserIds(new String[]{lenovoId_1, lenovoId_2});
        System.out.println("result " + JSON.toJSONString(list));
    }

}
