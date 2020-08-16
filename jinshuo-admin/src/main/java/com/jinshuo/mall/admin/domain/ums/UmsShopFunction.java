package com.jinshuo.mall.admin.domain.ums;

import com.jinshuo.mall.admin.domain.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * 表 ums_shop_function
 * 
 * @author dyh
 * @date 2020-08-12
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UmsShopFunction extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	

	/**  */
	@ApiModelProperty("")
	private Long shopId;
	/** 功能模块id  */
	@ApiModelProperty("功能模块id ")
	private Long functionId;
}
