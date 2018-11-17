package com.xzf.backstage.dao;

import com.xzf.backstage.dto.OrderDetailDTO;
import com.xzf.backstage.entity.TOrderReq;
import com.xzf.backstage.entity.TOrderReq11;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

/**
 * Created by SuperHappyPolaris
 *
 * @Date:Create in 15:17 2018/11/16
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TOrderReqDaoTest {

    @Autowired
    private TOrderReqDao tOrderReqDao;
//    @Test
//    public void findBySynStatus() {
//        List<OrderDetailDTO> orderDetailDTOS = tOrderReqDao.findBySynStatus(-2L);
//        Assert.assertNotNull(orderDetailDTOS);
//    }
    @Test
    public void findAll() {
//        List<t_order_req_11> orderDetailDTOS = tOrderReqDao.findAll();
        Object o = tOrderReqDao.findAll();
        Assert.assertNotNull(o);
    }
}