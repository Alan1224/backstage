package com.xzf.backstage.entity.mapper;

import com.xzf.backstage.dto.OrderCountDTO;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Created by SuperHappyPolaris
 *
 * @Date:Create in 10:44 2018/11/16
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class TOrderReqMapperTest {

    @Autowired
    private TOrderReqMapper tOrderReqMapper;
    @Test
    public void select() {
        List<OrderCountDTO> orderCountDTOS = tOrderReqMapper.selectCount("2018-11-01 13:50:09","2018-11-16 13:50:09","");
        Assert.assertNotNull(orderCountDTOS);
    }
}