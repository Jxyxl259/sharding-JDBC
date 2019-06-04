package com.jiang.sharding;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;


/**
 * @description: 测试基类
 * @author: jiangbug@lenovo.com
 * @create: 2019-06-04 14:11
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({
        "/applicationContext-resources-test.xml",
        "/applicationContext-shardingJDBC-test.xml"
})
public class BaseTest {




}
