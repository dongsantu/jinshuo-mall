package com.jinshuo.mall.admin.domain.ums;

import com.jinshuo.mall.admin.domain.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 表 ums_shop
 * 
 * @author dyh
 * @date 2020-08-12
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UmsShop extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	

	/** 店铺名称 */
	@ApiModelProperty("店铺名称")
	private String name;
	/** 商家id */
	@ApiModelProperty("商家id")
	private Long merchantId;
	/** 店铺状态 */
	@ApiModelProperty("店铺状态")
	private Integer shopStatus;
	/** 店铺类型 */
	@ApiModelProperty("店铺类型")
	private Integer type;
	/** 简介 */
	@ApiModelProperty("简介")
	private String sketch;
	/** 联系人 */
	@ApiModelProperty("联系人")
	private String linkMan;
	/** 联系电话 */
	@ApiModelProperty("联系电话")
	private String linkMobile;
	/** 座机 */
	@ApiModelProperty("座机")
	private String phone;
	/** logo */
	@ApiModelProperty("logo")
	private String logo;
	/** 有效开始时间 */
	@ApiModelProperty("有效开始时间")
	private Date startTime;
	/** 有效结束时间 */
	@ApiModelProperty("有效结束时间")
	private Date endTime;

}
