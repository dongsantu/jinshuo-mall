package com.jinshuo.mall.admin.domain.ord;

import com.jinshuo.mall.admin.domain.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import lombok.NoArgsConstructor;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 表 ord_mc_set_order
 * 
 * @author dyh
 * @date 2020-08-07
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrdMcSetOrder extends BaseEntity
{
	private static final long serialVersionUID = 1L;

	/**  */
	@ApiModelProperty("id")
	private Long setId;
	/** 套餐名称 */
	@ApiModelProperty("id")
	private String mcName;
	/** 套餐图片 */
	@ApiModelProperty("id")
	private String mcPic;
	/** 订单号 */
	@ApiModelProperty("id")
	private String orderNo;
	/** 店铺号 */
	@ApiModelProperty("id")
	private Long shopId;
	/**  */
	@ApiModelProperty("id")
	private Long userId;
	/**  */
	@ApiModelProperty("id")
	private BigDecimal amount;
	/**  */
	@ApiModelProperty("id")
	private Integer riceNum;
	/**  */
	@ApiModelProperty("id")
	private Integer vegetablesNum;
	/**  */
	@ApiModelProperty("id")
	private Integer riceNumUsed;
	/**  */
	@ApiModelProperty("id")
	private Integer vegetablesNumUsed;
	/**  */
	@ApiModelProperty("id")
	private String address;
	/**  */
	@ApiModelProperty("id")
	private String linkMan;
	/**  */
	@ApiModelProperty("id")
	private String linkPhone;
	/**  */
	@ApiModelProperty("id")
	private Date orderDate;
	/**  */
	@ApiModelProperty("id")
	private Integer orderStatus;

}
