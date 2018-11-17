package com.xzf.backstage.entity;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "t_cp_info")
public class TCpInfo  implements Serializable {

	@Id
	private String cpId;

	private String name;

	private String cpFlag;

	private Long isOpen;

	private String url;

	private String proport;

	private Long paymentType;

	private Long synRadio;

	private Long isMagic;

	private Long magicRadio;

	private String localSpId;

	private String magicSpId;

	private String memo;

	private Long backMethod;

	private Long isShow;

	private Long cityType;

	private String cityHide;

	private Long synOpen;

	private String synProvince;

	private String synNum;

	private Double money;

	private Double rate;

}
