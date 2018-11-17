package com.xzf.backstage.dao;

import com.xzf.backstage.dto.OrderDetailDTO;
import com.xzf.backstage.entity.TOrderReq;
import com.xzf.backstage.entity.TOrderReq11;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by SuperHappyPolaris
 *
 * @Date:Create in 14:50 2018/11/16
 */
public interface TOrderReqDao extends JpaRepository<TOrderReq11,String> {
//    List<OrderDetailDTO> findBySynStatus(Long synStatus);
}