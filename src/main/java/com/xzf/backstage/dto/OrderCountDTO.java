package com.xzf.backstage.dto;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by SuperHappyPolaris
 *
 * @Date:Create in 13:33 2018/11/16
 */
@Entity
@Data
public class OrderCountDTO {
    private Double countFee;
    private Double successFee;
    private Double rate;
    private Integer allCount;
    private Integer successCount;
    private Integer exceptionCount;
    @Id
    private String cpId;
    private String cpName;
}