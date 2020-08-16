package com.jinshuo.mall.admin.domain.ord;

import com.jinshuo.mall.admin.domain.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import lombok.NoArgsConstructor;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;

/**
 * 订单表 ord_order_coupon
 * 
 * @author dyh
 * @date 2020-08-07
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrdOrderCoupon extends BaseEntity
{
	private static final long serialVersionUID = 1L;

	/** 订单ID */
	@ApiModelProperty("id")
	private Long orderId;
	/** 优惠券接收Id */
	@ApiModelProperty("id")
	private Long couponReceiveId;
	/** 优惠券名称 */
	@ApiModelProperty("id")
	private String name;
	/** 金额 */
	@ApiModelProperty("id")
	private BigDecimal couponAmount;
}
