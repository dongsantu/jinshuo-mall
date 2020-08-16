package com.jinshuo.mall.admin.domain.ord;

import com.jinshuo.mall.admin.domain.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 订单验证码表 ord_verification_code_log
 * 
 * @author dyh
 * @date 2020-08-12
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrdVerificationCodeLog extends BaseEntity
{
	private static final long serialVersionUID = 1L;

	/**  */
	@ApiModelProperty("")
	private Long verificationId;
	/**  */
	@ApiModelProperty("")
	private Long supplierId;
	/** 订单编号 */
	@ApiModelProperty("订单编号")
	private Long orderId;
	/** 详情id */
	@ApiModelProperty("详情id")
	private Long orderDetailId;
	/** 验证码 */
	@ApiModelProperty("验证码")
	private String verifySn;
	/** 二维码 */
	@ApiModelProperty("二维码")
	private Long userAccountId;
	/** 是否使用 0已使用 1未使用 */
	@ApiModelProperty("是否使用 0已使用 1未使用")
	private String name;
	/** 二维码 */
	@ApiModelProperty("二维码")
	private Integer errCode;
	/** 是否使用 0已使用 1未使用 */
	@ApiModelProperty("是否使用 0已使用 1未使用")
	private String errMsg;

}
