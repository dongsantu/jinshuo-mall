package com.jinshuo.mall.admin.domain.gds;

import com.jinshuo.mall.admin.domain.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 表 gds_tag
 * 
 * @author dyh
 * @date 2020-08-12
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GdsTag extends BaseEntity
{
	private static final long serialVersionUID = 1L;

	/**  */
	@ApiModelProperty("")
	private String name;
	/** 绑定商品数量 */
	@ApiModelProperty("绑定商品数量")
	private Integer goodsCount;
	/**  */
	@ApiModelProperty("")
	private Integer sort;
	/** 店铺编号 */
	@ApiModelProperty("店铺编号")
	private Long shopId;
}
