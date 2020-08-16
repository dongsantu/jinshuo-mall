package com.jinshuo.mall.admin.domain.ums;

import com.jinshuo.mall.admin.domain.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 系统用户角色表 ums_user_role
 * 
 * @author dyh
 * @date 2020-08-12
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UmsUserRole extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	

	/** 角色名 */
	@ApiModelProperty("角色名")
	private String roleName;
	/** 角色代码 */
	@ApiModelProperty("角色代码")
	private String roleCode;
	/**  */
	@ApiModelProperty("")
	private Integer roleStatus;

}
