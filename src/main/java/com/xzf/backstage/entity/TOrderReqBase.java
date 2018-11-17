package com.xzf.backstage.entity;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@Data
@MappedSuperclass
public class TOrderReqBase {

	@Id
	private String ffId;

	private String cpId;

	private String imsi;

	private String imei;

	private String iccid;

	private String mobile;

	private String spId;

	private String pmodel;

	private String osversion;

	private String nwtype;

	private String ctech;

	private Long fee;

	private String ip;

	private String province;

	private String cpParam;

	private Long isSyn;

	private Long isSuccess;

	private Long synStatus;

	private String sdkResult;

	private String pck;

	private String app;

	private String sdkVer;

	private java.util.Date createTime;

	private java.util.Date updateTime;
}
