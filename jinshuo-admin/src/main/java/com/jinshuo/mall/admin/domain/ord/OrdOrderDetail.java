package com.jinshuo.mall.admin.domain.ord;

import com.jinshuo.mall.admin.domain.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * 订单详情表 ord_order_detail
 * 
 * @author dyh
 * @date 2020-08-07
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrdOrderDetail extends BaseEntity
{
	private static final long serialVersionUID = 1L;

	/** 订单编码 */
	@ApiModelProperty("id")
	private Long orderId;
	/** 商品编码 */
	@ApiModelProperty("id")
	private Long goodsSpuId;
	/** 供应商编号 */
	@ApiModelProperty("id")
	private Long supplierId;
	/** 供应商名称 */
	@ApiModelProperty("id")
	private String supplierName;
	/** 商品名称 */
	@ApiModelProperty("id")
	private String goodsName;
	/** sku名称 */
	@ApiModelProperty("id")
	private String skuName;
	/** 图片地址 */
	@ApiModelProperty("id")
	private String goodsImage;
	/** 商品价格 */
	@ApiModelProperty("id")
	private BigDecimal goodsPrice;
	/** 成本价 */
	@ApiModelProperty("id")
	private BigDecimal costPrice;
	/** 商品SKU */
	@ApiModelProperty("id")
	private Long goodsSkuId;
	/** 运费 */
	@ApiModelProperty("id")
	private BigDecimal logisticsFee;
	/** 折扣比例 */
	@ApiModelProperty("id")
	private Integer discountRate;
	/** 折扣比例金额 */
	@ApiModelProperty("id")
	private BigDecimal discountAmount;
	/** 购买数量 */
	@ApiModelProperty("id")
	private Integer number;
	/** 小计金额 */
	@ApiModelProperty("id")
	private BigDecimal subtotal;
	/** 商品是否有效 */
	@ApiModelProperty("id")
	private Integer isGoodsExists;
	/** 是否自主发码 0是 1否 */
	@ApiModelProperty("id")
	private Integer autoSendCode;
	/** 0 是   1否 */
	@ApiModelProperty("id")
	private Integer isSendcode;
	/** 预约地址 */
	@ApiModelProperty("id")
	private String reserveAddress;
}
