package com.jinshuo.mall.admin.domain.gds;

import com.jinshuo.mall.admin.domain.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 表 gds_sku_attribute_and_option
 * 
 * @author dyh
 * @date 2020-08-12
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GdsSkuAttributeAndOption extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	

	/** sku编码 */
	@ApiModelProperty("sku编码")
	private Long skuId;
	/** 规格编码 */
	@ApiModelProperty("规格编码")
	private Long specId;
	/** 规格选项编码 */
	@ApiModelProperty("规格选项编码")
	private Long specOptionId;
	/** 排序 */
	@ApiModelProperty("排序")
	private Integer sort;

}
