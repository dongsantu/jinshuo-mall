package com.jinshuo.mall.admin.domain.gds;

import com.jinshuo.mall.admin.domain.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 表 gds_coupon
 * 
 * @author dyh
 * @date 2020-08-12
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GdsCoupon extends BaseEntity
{
	private static final long serialVersionUID = 1L;

	/** 优惠券名称 */
	@ApiModelProperty("优惠券名称")
	private String name;
	/** 优惠券类型 */
	@ApiModelProperty("优惠券类型")
	private Integer type;
	/** 面值 */
	@ApiModelProperty("面值")
	private BigDecimal couponAmount;
	/** 减免金额 */
	@ApiModelProperty("减免金额")
	private Integer amount;
	/** 发行数量 */
	@ApiModelProperty("发行数量")
	private Integer maxLimit;
	/** 已领取数量 */
	@ApiModelProperty("已领取数量")
	private Integer receivedQuantity;
	/** 已核销数量 */
	@ApiModelProperty("已核销数量")
	private Integer checkquantity;
	/** 门槛规则 */
	@ApiModelProperty("门槛规则")
	private Integer isCondition;
	/** 适用范围类型 */
	@ApiModelProperty("适用范围类型")
	private Integer scopeType;
	/** 有效期类型 */
	@ApiModelProperty("有效期类型")
	private Integer validitType;
	/** 绝对有效期开始时间 */
	@ApiModelProperty("绝对有效期开始时间")
	private Date validityStartDate;
	/** 绝对有效期-结束时间 */
	@ApiModelProperty("绝对有效期-结束时间")
	private Date vaildityEndDate;
	/** 相对有效期天数 */
	@ApiModelProperty("相对有效期天数")
	private Integer vaildityDays;
	/** 限领张数 */
	@ApiModelProperty("限领张数")
	private Integer gainCount;
	/** 用户获取方式 */
	@ApiModelProperty("用户获取方式")
	private Integer gainMethod;
	/** 排序 */
	@ApiModelProperty("排序")
	private Integer sort;
	/** 优惠说明 */
	@ApiModelProperty("优惠说明")
	private String couponDesc;
	/** 是否生效 */
	@ApiModelProperty("是否生效")
	private Integer couponStatus;
	/** 审核状态 */
	@ApiModelProperty("审核状态")
	private Integer auditStatus;
	/** 领卷开始时间 */
	@ApiModelProperty("领卷开始时间")
	private Date receiveEndTime;
	/** 领卷结束时间 */
	@ApiModelProperty("领卷结束时间")
	private Date receiveStartTime;
	/** shopId */
	@ApiModelProperty("shopId")
	private Long shopId;
	/** 是否展示在前端 */
	@ApiModelProperty("是否展示在前端")
	private Integer isShow;
	/** 适用人群 */
	@ApiModelProperty("适用人群")
	private Integer forPeople;
}
