package com.xzf.backstage.dao;

import com.xzf.backstage.entity.TCodeSd;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.junit.Assert.*;

/**
 * Created by SuperHappyPolaris
 *
 * @Date:Create in 10:38 2018/11/16
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class TCodeSdDaoTest {


    @Autowired
    private TCodeSdDao tCodeSdDao;
    @Test
    public void fineOneTest(){
        Optional<TCodeSd> tCodeSd = tCodeSdDao.findById("sde7");
        Assert.assertNotNull(tCodeSd);
    }
}