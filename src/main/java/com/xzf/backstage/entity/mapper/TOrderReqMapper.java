package com.xzf.backstage.entity.mapper;

import com.xzf.backstage.dto.OrderCountDTO;
import com.xzf.backstage.dto.OrderDetailDTO;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by SuperHappyPolaris
 *
 * @Date:Create in 10:42 2018/11/16
 */
public interface TOrderReqMapper {
    @Select("select a.cpId,a.cpName,a.allCount,a.countFee,a.successCount,a.successFee,a.exceptionCount,FORMAT(a.successCount / a.allCount,2) AS rate FROM(\n" +
            "SELECT req.cp_id AS cpId,\n" +
            "cp.name AS cpName ,\n" +
            "count(req.ff_id) as allCount,\n" +
            "round(SUM(req.fee)/100,2) AS countFee,\n" +
            "sum(req.is_success) AS successCount,\n" +
            "round(sum(CASE WHEN req.is_success=1 THEN req.fee ELSE 0 END)/100,2) AS successFee,\n" +
            "COUNT(CASE WHEN req.syn_status!=0 AND req.syn_status!=1 THEN req.ff_id END) AS exceptionCount\n" +
            "FROM t_order_req_11 AS req\n" +
            "LEFT JOIN t_cp_info AS cp\n" +
            "ON req.cp_id=cp.cp_id\n" +
            "where create_time>#{starTime} AND create_time<#{endTime} " +

            "            and req.cp_id like '${cpId}%'\n" +

            "  GROUP BY req.cp_id\n" +
            ") a")
    @Results({
            @Result(column = "a.cpId",property = "cpId"),
            @Result(column = "a.cpName",property = "cpName"),
            @Result(column = "a.allCount",property = "allCount"),
            @Result(column = "a.countFee",property = "countFee"),
            @Result(column = "a.successCount",property = "successCount"),
            @Result(column = "a.successFee",property = "successFee"),
            @Result(column = "a.exceptionCount",property = "exceptionCount"),
            @Result(column = "rate",property = "rate")
    })
    List<OrderCountDTO> selectCount(@Param("starTime") String starTime, @Param("endTime") String endTime, @Param("cpId") String cpId);
    @Select("")
    List<OrderDetailDTO> selectDetail();
}
