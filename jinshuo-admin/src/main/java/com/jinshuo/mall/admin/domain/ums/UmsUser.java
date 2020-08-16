package com.jinshuo.mall.admin.domain.ums;

import com.jinshuo.mall.admin.domain.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 用户账户表 ums_user
 * 
 * @author dyh
 * @date 2020-08-12
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UmsUser extends BaseEntity
{
	private static final long serialVersionUID = 1L;

	/** 用户类型  0系统管理员 1店铺 2供应商 3商家（暂不使用） */
	@ApiModelProperty("用户类型  0系统管理员 1店铺 2供应商 3商家（暂不使用）")
	private Integer userType;
	/** 商家id */
	@ApiModelProperty("商家id")
	private Long merchantId;
	/** 供应商id */
	@ApiModelProperty("供应商id")
	private Long supplierId;
	/** 店铺id */
	@ApiModelProperty("店铺id")
	private Long shopId;
	/** 用户名 */
	@ApiModelProperty("用户名")
	private String username;
	/** 密码 */
	@ApiModelProperty("密码")
	private String password;
	/** 手机 */
	@ApiModelProperty("手机")
	private String mobile;
	/** 姓名 */
	@ApiModelProperty("姓名")
	private String name;
	/** 证件类型 */
	@ApiModelProperty("证件类型")
	private Integer cardType;
	/** 证件id */
	@ApiModelProperty("证件id")
	private String cardId;
	/** 邮箱 */
	@ApiModelProperty("邮箱")
	private String email;
	/** 创建ip */
	@ApiModelProperty("创建ip")
	private String createIpAt;
	/** 昵称 */
	@ApiModelProperty("昵称")
	private String nickname;
	/** 最后一次登录时间 */
	@ApiModelProperty("最后一次登录时间")
	private Date loginAt;
	/** 最后一次登录ip */
	@ApiModelProperty("最后一次登录ip")
	private String loginIp;
	/** 登录次数 */
	@ApiModelProperty("登录次数")
	private Integer loginCount;
	/** 账户状态 */
	@ApiModelProperty("账户状态")
	private Integer userStatus;
}
