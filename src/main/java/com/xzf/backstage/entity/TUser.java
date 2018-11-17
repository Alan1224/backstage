package com.xzf.backstage.entity;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "t_user")
public class TUser {

	@Id
	private String username;

	private String password;

	private Long power;

	private String memo;

	private String cpId;

	private String phone;

	private String payPassword;

}
