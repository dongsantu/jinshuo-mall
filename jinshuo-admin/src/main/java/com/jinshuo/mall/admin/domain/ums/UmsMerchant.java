package com.jinshuo.mall.admin.domain.ums;

import com.jinshuo.mall.admin.domain.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 表 ums_merchant
 * 
 * @author dyh
 * @date 2020-08-12
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UmsMerchant extends BaseEntity
{
	private static final long serialVersionUID = 1L;

	/** 商家状态 */
	@ApiModelProperty("商家状态")
	private Integer merchantStatus;
	/** 1：普通商家  2：渠道销售商 */
	@ApiModelProperty("1：普通商家  2：渠道销售商")
	private Integer merchantType;
	/** 名称 */
	@ApiModelProperty("名称")
	private String name;
	/** 企业法人 */
	@ApiModelProperty("企业法人")
	private String corporate;
	/** 注册资金 */
	@ApiModelProperty("注册资金")
	private BigDecimal registCapital;
	/** 注册日期 */
	@ApiModelProperty("注册日期")
	private Date openDate;
	/** 核准日期 */
	@ApiModelProperty("核准日期")
	private Date approvedDate;
	/** 统一社会信用代码 */
	@ApiModelProperty("统一社会信用代码")
	private String unifiedCreditCode;
	/** 组织机构代码 */
	@ApiModelProperty("组织机构代码")
	private String organizationCode;
	/** 纳税人识别号 */
	@ApiModelProperty("纳税人识别号")
	private String taxpayerCode;
	/** 等级机关 */
	@ApiModelProperty("等级机关")
	private String registrationAuthority;
	/** 企业类型 */
	@ApiModelProperty("企业类型")
	private String enterpriseType;
	/** 营业期限 */
	@ApiModelProperty("营业期限")
	private String operatingPeriod;
	/** 实缴资本 */
	@ApiModelProperty("实缴资本")
	private BigDecimal paidInCapital;
	/** 地址 */
	@ApiModelProperty("地址")
	private String adress;
	/** 联系人 */
	@ApiModelProperty("联系人")
	private String linkMan;
	/** 联系电话 */
	@ApiModelProperty("联系电话")
	private String linkMobile;
	/** 座机 */
	@ApiModelProperty("座机")
	private String phone;

}
