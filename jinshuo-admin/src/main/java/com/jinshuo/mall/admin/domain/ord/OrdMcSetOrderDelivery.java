package com.jinshuo.mall.admin.domain.ord;

import com.jinshuo.mall.admin.domain.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import lombok.NoArgsConstructor;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

/**
 * 表 ord_mc_set_order_delivery
 * 
 * @author dyh
 * @date 2020-08-07
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrdMcSetOrderDelivery extends BaseEntity
{
	private static final long serialVersionUID = 1L;

	/**  */
	@ApiModelProperty("id")
	private Long setOrderId;
	/**  */
	@ApiModelProperty("id")
	private Integer applyRiceNum;
	/**  */
	@ApiModelProperty("id")
	private Date applyDate;
	/**  */
	@ApiModelProperty("id")
	private Integer applyStatus;

}
