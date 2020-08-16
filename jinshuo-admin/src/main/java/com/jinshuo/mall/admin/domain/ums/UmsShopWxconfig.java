package com.jinshuo.mall.admin.domain.ums;

import com.jinshuo.mall.admin.domain.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 微信配置表 ums_shop_wxconfig
 * 
 * @author dyh
 * @date 2020-08-12
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UmsShopWxconfig extends BaseEntity
{
	private static final long serialVersionUID = 1L;

	/** 店铺id */
	@ApiModelProperty("店铺id")
	private Long shopId;
	/** 0:公众平台 1：小程序 */
	@ApiModelProperty("0:公众平台 1：小程序")
	private Integer type;
	/** 平台AppID */
	@ApiModelProperty("平台AppID")
	private String appId;
	/** 平台秘钥 */
	@ApiModelProperty("平台秘钥")
	private String appSecret;
	/** 平台名称 */
	@ApiModelProperty("平台名称")
	private String appName;
	/** 支付方式 0：自建 1：代收  3：授权 */
	@ApiModelProperty("支付方式 0：自建 1：代收  3：授权")
	private Integer payModel;
	/** 商户号 */
	@ApiModelProperty("商户号")
	private String mchId;
	/** 子商户号 */
	@ApiModelProperty("子商户号")
	private String subMchId;
	/** 商户秘钥 */
	@ApiModelProperty("商户秘钥")
	private String apiKey;
	/** 证书路径 */
	@ApiModelProperty("证书路径")
	private String certPath;

}
