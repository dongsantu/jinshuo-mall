package com.jinshuo.mall.admin.domain.ums;

import com.jinshuo.mall.admin.domain.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 微信菜单表 ums_wx_openinfo
 * 
 * @author dyh
 * @date 2020-08-12
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UmsWxOpeninfo extends BaseEntity
{
	private static final long serialVersionUID = 1L;

	/** 店铺id */
	@ApiModelProperty("店铺id")
	private Long shopId;
	/** 授权方appid */
	@ApiModelProperty("授权方appid")
	private String appid;
	/** 授权方刷新token */
	@ApiModelProperty("授权方刷新token")
	private String authorizerRefreshToken;

}
