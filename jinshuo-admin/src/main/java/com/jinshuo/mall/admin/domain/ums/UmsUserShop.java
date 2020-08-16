package com.jinshuo.mall.admin.domain.ums;

import com.jinshuo.mall.admin.domain.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * 用户店铺关联表 ums_user_shop
 * 
 * @author dyh
 * @date 2020-08-12
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UmsUserShop extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** 用户ID */
	@ApiModelProperty("用户ID")
	private Long userId;
	/** 店铺ID */
	@ApiModelProperty("店铺ID")
	private Long shopId;
}
