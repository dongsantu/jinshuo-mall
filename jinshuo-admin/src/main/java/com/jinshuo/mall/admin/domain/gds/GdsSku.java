package com.jinshuo.mall.admin.domain.gds;

import com.jinshuo.mall.admin.domain.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * 表 gds_sku
 * 
 * @author dyh
 * @date 2020-08-12
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GdsSku extends BaseEntity
{
	private static final long serialVersionUID = 1L;

	/** 商品编号 */
	@ApiModelProperty("商品编号")
	private Long spuId;
	/**  */
	@ApiModelProperty("")
	private String skuCode;
	/** sku名称 */
	@ApiModelProperty("sku名称")
	private String skuName;
	/** 主图 */
	@ApiModelProperty("主图")
	private String pictureUrl;
	/** 销售价 */
	@ApiModelProperty("销售价")
	private BigDecimal price;
	/** 市场价 */
	@ApiModelProperty("市场价")
	private BigDecimal marketPrice;
	/** 成本价 */
	@ApiModelProperty("成本价")
	private BigDecimal costPrice;
	/** 库存量 */
	@ApiModelProperty("库存量")
	private Integer stock;
	/** 销量 */
	@ApiModelProperty("销量")
	private Integer salesQuantity;
	/**  */
	@ApiModelProperty("")
	private String barCode;

}
