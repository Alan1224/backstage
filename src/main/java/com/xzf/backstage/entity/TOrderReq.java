package com.xzf.backstage.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;

@Entity
@Table(name = "t_order_req")
public class TOrderReq extends TOrderReqBase {

}
