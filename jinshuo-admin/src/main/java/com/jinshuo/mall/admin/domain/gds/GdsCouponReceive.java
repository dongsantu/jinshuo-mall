package com.jinshuo.mall.admin.domain.gds;

import com.jinshuo.mall.admin.domain.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 表 gds_coupon_receive
 * 
 * @author dyh
 * @date 2020-08-12
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GdsCouponReceive extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	

	/** 优惠券编号 */
	@ApiModelProperty("优惠券编号")
	private Long couponId;
	/** 会员编码 */
	@ApiModelProperty("会员编码")
	private Long memId;
	/** 优惠券码 */
	@ApiModelProperty("优惠券码")
	private String couponCode;
	/** 领取时间 */
	@ApiModelProperty("领取时间")
	private Date receiveTime;
	/** 使用时间 */
	@ApiModelProperty("使用时间")
	private Date useTime;
	/** 使用状态 */
	@ApiModelProperty("使用状态")
	private Integer useStatus;

}
