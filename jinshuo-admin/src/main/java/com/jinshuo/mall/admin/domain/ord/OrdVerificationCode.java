package com.jinshuo.mall.admin.domain.ord;

import com.jinshuo.mall.admin.domain.BaseEntity;
import com.jinshuo.mall.core.model.IdentifiedEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import lombok.NoArgsConstructor;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

/**
 * 订单验证码表 ord_verification_code
 * 
 * @author dyh
 * @date 2020-08-07
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrdVerificationCode extends BaseEntity
{
	private static final long serialVersionUID = 1L;

	/** 订单编号 */
	@ApiModelProperty("id")
	private Long orderId;
	/** 详情id */
	@ApiModelProperty("id")
	private Long orderDetailId;
	/** 验证码 */
	@ApiModelProperty("id")
	private String verifySn;
	/** 二维码 */
	@ApiModelProperty("id")
	private String qrCode;
	/** 是否使用 0已使用 1未使用 */
	@ApiModelProperty("id")
	private Integer isUse;

}
