package com.xzf.backstage.entity;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "t_code_sd")
public class TCodeSd  implements Serializable {

	@Id
	private String spId;

	private String name;

	private String fee;

	private Long urlNo;

	private Long priority;

	private Long isOpen;

	private Long provinceType;

	private String provinceHide;

	private String provinceOpen;

	private String memo;

	private String url;

	private String spFlag;

	private Long serverVersion;

	private String keyword;

	private String matchRegex;

	private String delayed;

	private Long reqMethod;

	private Long paymentType;

	private String proport;

}
