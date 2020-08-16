package com.jinshuo.mall.admin.domain.ord;

import com.jinshuo.mall.admin.domain.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import lombok.NoArgsConstructor;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

/**
 * 样品订单表 ord_order_sample
 * 
 * @author dyh
 * @date 2020-08-07
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrdOrderSample extends BaseEntity
{
	private static final long serialVersionUID = 1L;

	/** 寄样信息 */
	@ApiModelProperty("id")
	private String sampleInfo;
	/** 发样编号 */
	@ApiModelProperty("id")
	private String sampleNo;
	/** 会员ID */
	@ApiModelProperty("id")
	private Long memberId;
	/** 店铺Id */
	@ApiModelProperty("id")
	private Long shopId;
	/** 收货人名称 */
	@ApiModelProperty("id")
	private String userName;
	/** 收件人地址 */
	@ApiModelProperty("id")
	private String userAddress;
	/** 收件人手机号码 */
	@ApiModelProperty("id")
	private String userPhone;
	/** 寄样订单状态 1：未寄  2：已寄样 3：不寄 */
	@ApiModelProperty("id")
	private Integer sampleStatus;
	/** 快递公司编码 */
	@ApiModelProperty("id")
	private String expressCode;
	/** 快递名称 */
	@ApiModelProperty("id")
	private String expressCompany;
	/** 快递单号 */
	@ApiModelProperty("id")
	private String expressNo;
	/** 发货时间 */
	@ApiModelProperty("id")
	private Date expressDate;
}
