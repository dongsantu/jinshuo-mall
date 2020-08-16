package com.jinshuo.mall.admin.domain.ums;

import com.jinshuo.mall.admin.domain.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * 角色菜单表 ums_user_role_menu
 * 
 * @author dyh
 * @date 2020-08-12
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UmsUserRoleMenu extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	

	/** 角色ID */
	@ApiModelProperty("角色ID")
	private String roleId;
	/** 菜单ID */
	@ApiModelProperty("菜单ID")
	private String menuId;
}
