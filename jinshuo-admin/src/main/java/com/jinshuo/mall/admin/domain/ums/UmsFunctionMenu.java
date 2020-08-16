package com.jinshuo.mall.admin.domain.ums;

import com.jinshuo.mall.admin.domain.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * 功能菜单表 ums_function_menu
 * 
 * @author dyh
 * @date 2020-08-12
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UmsFunctionMenu extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	

	/** 用户ID */
	@ApiModelProperty("用户ID")
	private Long functionId;
	/** 菜单列表 */
	@ApiModelProperty("菜单列表")
	private Long menuId;
}
