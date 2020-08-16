package com.jinshuo.mall.admin.domain.gds;

import com.jinshuo.mall.admin.domain.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 表 gds_coupon_item
 * 
 * @author dyh
 * @date 2020-08-12
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GdsCouponItem extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	

	/** 优惠券编码 */
	@ApiModelProperty("优惠券编码")
	private Long couponId;
	/** 目标对象 */
	@ApiModelProperty("目标对象")
	private Long targetId;
	/** 类型 */
	@ApiModelProperty("类型")
	private Integer type;
	/** 是否适用类型 */
	@ApiModelProperty("是否适用类型")
	private Integer isApply;
	/** 审核状态 */
	@ApiModelProperty("审核状态")
	private Integer auditStatus;

}
