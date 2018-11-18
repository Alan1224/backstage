package com.xzf.backstage.dto;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by SuperHappyPolaris
 *
 * @Date:Create in 15:04 2018/11/16
 */
@Entity
@Data
public class OrderDetailDTO {
    private Date createTime;
    private String cpId;
    private Double fee;
    private String spId;
    @Id
    private String ffId;
    private String cpParam;
    private Integer isSuccess;
    private Integer synStatus;
}