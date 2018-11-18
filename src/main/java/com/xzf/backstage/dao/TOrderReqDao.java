package com.xzf.backstage.dao;

import com.xzf.backstage.dto.OrderDetailDTO;
import com.xzf.backstage.entity.TOrderReq;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Created by SuperHappyPolaris
 *
 * @Date:Create in 14:50 2018/11/16
 */
public interface TOrderReqDao extends JpaRepository<TOrderReq,String> {
    @Query(value = "select create_time,cp_id,sp_id,ff_id,cp_param,fee,is_success,syn_status " +
            "from t_order_req_11 where cp_id like 'ww%' order by create_time limit ?#{#pageable}",nativeQuery = true)
    Page<OrderDetailDTO> selectDetail(
//            String month,
//                                      String cpId,
                                      Pageable pageable);

    @Query(value = "select create_time,cp_id,sp_id,ff_id,cp_param,fee,is_success,syn_status " +
            "from t_order_req_11 where cp_id like 'ww%' order by create_time",nativeQuery = true)
    List<OrderDetailDTO> selectDetail(@org.springframework.data.repository.query.Param("month") String month,
                                      @org.springframework.data.repository.query.Param("cpId") String cpId);
//    List<OrderDetailDTO> findBySynStatus(Long synStatus);
}