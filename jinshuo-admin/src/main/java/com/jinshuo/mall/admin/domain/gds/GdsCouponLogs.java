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
 * 表 gds_coupon_logs
 * 
 * @author dyh
 * @date 2020-08-12
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GdsCouponLogs extends BaseEntity
{
	private static final long serialVersionUID = 1L;

	/** 优惠券码编号 */
	@ApiModelProperty("优惠券码编号")
	private Long couponReceiveId;
	/** 订单编号 */
	@ApiModelProperty("订单编号")
	private Long orderId;
	/** 原订单金额 */
	@ApiModelProperty("原订单金额")
	private BigDecimal orderOriginalAmount;
	/** 优惠券的金额 */
	@ApiModelProperty("优惠券的金额")
	private BigDecimal couponAmount;
	/** 抵扣优惠券之后的订单金额 */
	@ApiModelProperty("抵扣优惠券之后的订单金额")
	private BigDecimal orderFinalAmount;
	/** 使用 时间 */
	@ApiModelProperty("使用 时间")
	private Date useTime;
	/** 会员号 */
	@ApiModelProperty("会员号")
	private Long memId;
}
