package com.jinshuo.mall.admin.web.test.ums;

import com.jinshuo.mall.admin.application.service.ums.IUmsUserRolesService;
import com.jinshuo.mall.admin.domain.ums.UmsUserRoles;
import com.jinshuo.mall.core.response.WrapperResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 系统用户角色关联 信息操作处理
 * 
 * @author dyh
 * @date 2020-08-12
 */
@RestController
@RequestMapping("/v1/wx/user/umsUserRoles")
@Api(tags = "系统用户角色关联")
@Slf4j
public class UmsUserRolesController
{

	@Autowired
	private IUmsUserRolesService umsUserRolesService;

	
	/**
	 * 查询系统用户角色关联列表
	 */
	@PostMapping("/listUmsUserRoles")
	@ApiOperation(value = "系统用户角色关联列表", notes = "系统用户角色关联列表")
	public WrapperResponse listUmsUserRoles(@RequestBody UmsUserRoles qry)
	{
		return WrapperResponse.success(umsUserRolesService.selectUmsUserRolesPage(qry));
	}
	
	/**
	 * 新增保存系统用户角色关联
	 */
	@PostMapping("/addUmsUserRoles")
	@ApiOperation(value = "新增系统用户角色关联", notes = "新增系统用户角色关联")
	public WrapperResponse addUmsUserRoles(@RequestBody UmsUserRoles umsUserRoles)
	{		
		return WrapperResponse.success(umsUserRolesService.insertUmsUserRoles(umsUserRoles));
	}

	/**
	 * 修改保存系统用户角色关联
	 */
	@PostMapping("/editUmsUserRoles")
	@ApiOperation(value = "修改系统用户角色关联", notes = "修改系统用户角色关联")
	public WrapperResponse editSaveUmsUserRoles(@RequestBody UmsUserRoles umsUserRoles)
	{		
		return WrapperResponse.success(umsUserRolesService.updateUmsUserRoles(umsUserRoles));
	}
	
	/**
	 * 删除系统用户角色关联
	 */
	@PostMapping( "/removeUmsUserRoles/{id}")
	@ApiOperation(value = "删除系统用户角色关联", notes = "删除系统用户角色关联")
	public WrapperResponse removeUmsUserRoles(@PathVariable(value = "id") Long id)
	{		
		return WrapperResponse.success(umsUserRolesService.deleteUmsUserRolesById(id));
	}
	
}
