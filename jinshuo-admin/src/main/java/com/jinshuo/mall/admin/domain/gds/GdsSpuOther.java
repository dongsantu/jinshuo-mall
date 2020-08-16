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
 * 表 gds_spu_other
 * 
 * @author dyh
 * @date 2020-08-12
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GdsSpuOther extends BaseEntity
{
	private static final long serialVersionUID = 1L;

	/** 商品编码 */
	@ApiModelProperty("商品编码")
	private Long spuId;
	/** 是否显示售卖数量 */
	@ApiModelProperty("是否显示售卖数量")
	private Integer isShowSell;
	/** 快递运费 */
	@ApiModelProperty("快递运费")
	private BigDecimal courierFee;
	/** 活动地址 */
	@ApiModelProperty("活动地址")
	private String activityAddress;
	/** 活动时间 */
	@ApiModelProperty("活动时间")
	private String activityDate;
	/** 活动开始时间 */
	@ApiModelProperty("活动开始时间")
	private Date activityStartDate;
	/** 活动结束时间 */
	@ApiModelProperty("活动结束时间")
	private Date activityEndDate;
}
