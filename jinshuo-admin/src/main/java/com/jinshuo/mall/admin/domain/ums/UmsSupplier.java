package com.jinshuo.mall.admin.domain.ums;

import com.jinshuo.mall.admin.domain.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 供应商表 ums_supplier
 * 
 * @author dyh
 * @date 2020-08-12
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UmsSupplier extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	

	/** 商家id */
	@ApiModelProperty("商家id")
	private Long merchantId;
	/** 店铺id */
	@ApiModelProperty("店铺id")
	private Long shopId;
	/** 供应商号码 */
	@ApiModelProperty("供应商号码")
	private String supplierCode;
	/** 供应商logo */
	@ApiModelProperty("供应商logo")
	private String supplierLogo;
	/** 供应商名称 */
	@ApiModelProperty("供应商名称")
	private String supplierName;
	/** 供应商类型 */
	@ApiModelProperty("供应商类型")
	private Integer supplierType;
	/** 供应商状态状态：0正常 1冻结 */
	@ApiModelProperty("供应商状态状态：0正常 1冻结")
	private Integer supplierStatus;
	/** 联系人 */
	@ApiModelProperty("联系人")
	private String linkMan;
	/** 联系电话 */
	@ApiModelProperty("联系电话")
	private String linkMobile;
	/** 所在省 */
	@ApiModelProperty("所在省")
	private String province;
	/** 所在市 */
	@ApiModelProperty("所在市")
	private String city;
	/** 所在区 */
	@ApiModelProperty("所在区")
	private String disc;
	/** 详情地址 */
	@ApiModelProperty("详情地址")
	private String address;
	/** 供应商介绍 */
	@ApiModelProperty("供应商介绍")
	private String desc;
	/** 是否自主登录 */
	@ApiModelProperty("是否自主登录")
	private Integer loginFlag;

}
