package com.jinshuo.mall.admin.web.test.ums;

import com.jinshuo.mall.admin.application.service.ums.IUmsUserRoleService;
import com.jinshuo.mall.admin.domain.ums.UmsUserRole;
import com.jinshuo.mall.core.response.WrapperResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 系统用户角色 信息操作处理
 * 
 * @author dyh
 * @date 2020-08-12
 */
@RestController
@RequestMapping("/v1/wx/user/umsUserRole")
@Api(tags = "系统用户角色")
@Slf4j
public class UmsUserRoleController
{

	@Autowired
	private IUmsUserRoleService umsUserRoleService;

	
	/**
	 * 查询系统用户角色列表
	 */
	@PostMapping("/listUmsUserRole")
	@ApiOperation(value = "系统用户角色列表", notes = "系统用户角色列表")
	public WrapperResponse listUmsUserRole(@RequestBody UmsUserRole qry)
	{
		return WrapperResponse.success(umsUserRoleService.selectUmsUserRolePage(qry));
	}
	
	/**
	 * 新增保存系统用户角色
	 */
	@PostMapping("/addUmsUserRole")
	@ApiOperation(value = "新增系统用户角色", notes = "新增系统用户角色")
	public WrapperResponse addUmsUserRole(@RequestBody UmsUserRole umsUserRole)
	{		
		return WrapperResponse.success(umsUserRoleService.insertUmsUserRole(umsUserRole));
	}

	/**
	 * 修改保存系统用户角色
	 */
	@PostMapping("/editUmsUserRole")
	@ApiOperation(value = "修改系统用户角色", notes = "修改系统用户角色")
	public WrapperResponse editSaveUmsUserRole(@RequestBody UmsUserRole umsUserRole)
	{		
		return WrapperResponse.success(umsUserRoleService.updateUmsUserRole(umsUserRole));
	}
	
	/**
	 * 删除系统用户角色
	 */
	@PostMapping( "/removeUmsUserRole/{id}")
	@ApiOperation(value = "删除系统用户角色", notes = "删除系统用户角色")
	public WrapperResponse removeUmsUserRole(@PathVariable(value = "id") Long id)
	{		
		return WrapperResponse.success(umsUserRoleService.deleteUmsUserRoleById(id));
	}
	
}
