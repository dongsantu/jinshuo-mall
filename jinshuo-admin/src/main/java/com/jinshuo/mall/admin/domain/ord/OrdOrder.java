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
 * 订单表 ord_order
 * 
 * @author dyh
 * @date 2020-08-07
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrdOrder extends BaseEntity
{
	private static final long serialVersionUID = 1L;

	/** 订单流水号 */
	@ApiModelProperty("id")
	private String orderNo;
	/** 1、实物商品；2、串号产品（虚拟）；3、电子卡券（虚拟） */
	@ApiModelProperty("id")
	private Integer orderType;
	/** 邀请码 */
	@ApiModelProperty("id")
	private String inviteCode;
	/** 客户编号 */
	@ApiModelProperty("id")
	private Long memberId;
	/** 店铺id */
	@ApiModelProperty("id")
	private Long shopId;
	/**  */
	@ApiModelProperty("id")
	private String memberName;
	/** 商户编号 */
	@ApiModelProperty("id")
	private Long supplierId;
	/** 0未付款,1已付款,2已发货,3已签收,-1退货申请,-2退货中,-3已退货,-4取消交易 -5撤销申请 */
	@ApiModelProperty("id")
	private Integer orderStatus;
	/** 用户售后状 */
	@ApiModelProperty("id")
	private Integer afterStatus;
	/**  */
	@ApiModelProperty("id")
	private Integer exchangeStatus;
	/** 商品数 */
	@ApiModelProperty("id")
	private Integer goodsCount;
	/** 商品总价 */
	@ApiModelProperty("id")
	private BigDecimal goodsAmountTotal;
	/** 运费金额 */
	@ApiModelProperty("id")
	private BigDecimal logisticsFee;
	/**  */
	@ApiModelProperty("id")
	private BigDecimal couponAmount;
	/** 实际付款金额 */
	@ApiModelProperty("id")
	private BigDecimal orderAmountTotal;
	/** 收货地址编号 */
	@ApiModelProperty("id")
	private Long addressId;
	/**  0余额 1微信 2支付宝 */
	@ApiModelProperty("id")
	private Integer payChannel;
	/** 订单支付单号 */
	@ApiModelProperty("id")
	private String outTradeNo;
	/** 第三方支付流水号 */
	@ApiModelProperty("id")
	private String escrowTradeNo;
	/** 付款时间 */
	@ApiModelProperty("id")
	private Date payTime;
	/** 发货方式 1：快递 2：自提 */
	@ApiModelProperty("id")
	private String deliveryWay;
	/** 发货时间 */
	@ApiModelProperty("id")
	private Date deliveryTime;
	/** 兑换商品的卡号 */
	@ApiModelProperty("id")
	private String exchangeCardNo;
	/** 订单结算状态 */
	@ApiModelProperty("id")
	private Integer orderSettlementStatus;
	/** 订单结算时间 */
	@ApiModelProperty("id")
	private Date orderSettlementTime;
	/** 是否是积分产品 */
	@ApiModelProperty("id")
	private Integer isIntegral;
	/** 系统备注 */
	@ApiModelProperty("id")
	private String systemRemarks;
	/** 外部订单号 */
	@ApiModelProperty("id")
	private String outOrderNo;
	/** 订单类型 0：普通订单 1：秒杀订单 2：拼团订单 */
	@ApiModelProperty("id")
	private Integer orderClass;
	/** 自动取消（0：是 1：手动） */
	@ApiModelProperty("id")
	private String autoCancel;
	/** 订单完成时间 */
	@ApiModelProperty("id")
	private Date finshDate;
	/** 是否支付 0已支付 1未支付 */
	@ApiModelProperty("id")
	private Integer payStatus;
}
