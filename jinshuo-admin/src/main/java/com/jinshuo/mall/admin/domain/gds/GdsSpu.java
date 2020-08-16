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
 * 表 gds_spu
 * 
 * @author dyh
 * @date 2020-08-12
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GdsSpu extends BaseEntity
{
	private static final long serialVersionUID = 1L;

	/** 商品名称 */
	@ApiModelProperty("商品名称")
	private String spuName;
	/** 产品状态 0正常 1下架 */
	@ApiModelProperty("产品状态 0正常 1下架")
	private Integer goodsStatus;
	/** 上架时间 */
	@ApiModelProperty("上架时间")
	private Date upTime;
	/** 下架时间 */
	@ApiModelProperty("下架时间")
	private Date downTime;
	/** 是否显示售卖数量 0是 1不是 */
	@ApiModelProperty("是否显示售卖数量 0是 1不是")
	private Integer isShowSell;
	/** 是否抢购商品 0是 1不是 */
	@ApiModelProperty("是否抢购商品 0是 1不是")
	private Integer isScareBuy;
	/** 抢购开始时间 */
	@ApiModelProperty("抢购开始时间")
	private Date buyStartDate;
	/** 抢购结束时间 */
	@ApiModelProperty("抢购结束时间")
	private Date buyEndDate;
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
	/** 库存警告 */
	@ApiModelProperty("库存警告")
	private Integer warningStock;
	/** 初始销量 */
	@ApiModelProperty("初始销量")
	private Integer virtualSales;
	/** 实际销量 */
	@ApiModelProperty("实际销量")
	private Integer realSales;
	/** 是否热门 */
	@ApiModelProperty("是否热门")
	private Integer isHot;
	/** 是否分销商品 0是 1否 */
	@ApiModelProperty("是否分销商品 0是 1否")
	private Integer isDis;

	/** 排序 */
	@ApiModelProperty("排序")
	private Integer sort;

	/** 是否单规格 0是 1否 */
	@ApiModelProperty("是否单规格 0是 1否")
	private Integer singleSku;
	/** 海报 */
	@ApiModelProperty("海报")
	private String poster;
	/** 商品简述 */
	@ApiModelProperty("商品简述")
	private String sketch;
	/** 封面图 */
	@ApiModelProperty("封面图")
	private String pictureUrl;
	/** 供应商id */
	@ApiModelProperty("供应商id")
	private Long supplierId;
	/** 商品分类编号 */
	@ApiModelProperty("商品分类编号")
	private String categoryId;
	/** 属性(特征)id */
	@ApiModelProperty("属性(特征)id")
	private Long featureId;
	/** 商家id */
	@ApiModelProperty("商家id")
	private Long merchantId;
	/** 店铺编号 */
	@ApiModelProperty("店铺编号")
	private Long shopId;
	/** 类型编号 */
	@ApiModelProperty("类型编号")
	private Long typeId;
	/** 品牌编号 */
	@ApiModelProperty("品牌编号")
	private Long brandId;
	/** 商品分组编号 */
	@ApiModelProperty("商品分组编号")
	private Long groudId;
	/** 商品标签 */
	@ApiModelProperty("商品标签")
	private String tag;
	/** SPU编码 */
	@ApiModelProperty("SPU编码")
	private String spuCode;
	/** 计量单位 */
	@ApiModelProperty("计量单位")
	private String unit;
	/** 是否积分产品 */
	@ApiModelProperty("是否积分产品")
	private Integer isIntegral;
	/** 可使用积分抵消 */
	@ApiModelProperty("可使用积分抵消")
	private Integer integral;
	/** 支持服务 */
	@ApiModelProperty("支持服务")
	private String services;
	/**  */
	@ApiModelProperty("")
	private String areaNames;
	/**  */
	@ApiModelProperty("")
	private String areaName;
	/** 是否需要发码 */
	@ApiModelProperty("是否需要发码")
	private Integer isSendcode;
	/** 预约地址 */
	@ApiModelProperty("预约地址")
	private String reserveAddress;
	/** 审核状态 */
	@ApiModelProperty("审核状态")
	private Integer auditStatus;

}
