package com.jinshuo.mall.admin.domain.ums;

import com.jinshuo.mall.admin.domain.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * 系统用户角色关联表 ums_user_roles
 * 
 * @author dyh
 * @date 2020-08-12
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UmsUserRoles extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	

	/** 用户ID */
	@ApiModelProperty("用户ID")
	private Long userId;
	/** 角色ID */
	@ApiModelProperty("角色ID")
	private Long roleId;
}
