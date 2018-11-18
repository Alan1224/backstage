package com.xzf.backstage.dao;

import com.xzf.backstage.dto.OrderDetailDTO;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.awt.print.Pageable;
import java.util.List;

/**
 * Created by SuperHappyPolaris
 *
 * @Date:Create in 15:17 2018/11/16
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
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
    @Test
    public void findOne() {
//        List<t_order_req_11> orderDetailDTOS = tOrderReqDao.findAll();
        Object o = tOrderReqDao.findById("");
        Assert.assertNotNull(o);
    }
    @Test
    public void selectDetailTest(){
        org.springframework.data.domain.Pageable pageable = new PageRequest(1,1);
        Page<OrderDetailDTO> orderDetailDTOS = tOrderReqDao.selectDetail(pageable);
//        List<OrderDetailDTO> orderDetailDTO = tOrderReqDao.selectDetail("t_order_req_11","ww");
        Assert.assertNotNull(orderDetailDTOS);
    }
}