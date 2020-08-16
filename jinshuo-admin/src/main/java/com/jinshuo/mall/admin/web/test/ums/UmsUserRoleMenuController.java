package com.jinshuo.mall.admin.web.test.ums;

import com.jinshuo.mall.admin.application.service.ums.IUmsUserRoleMenuService;
import com.jinshuo.mall.admin.domain.ums.UmsUserRoleMenu;
import com.jinshuo.mall.core.response.WrapperResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 角色菜单 信息操作处理
 * 
 * @author dyh
 * @date 2020-08-12
 */
@RestController
@RequestMapping("/v1/wx/user/umsUserRoleMenu")
@Api(tags = "角色菜单")
@Slf4j
public class UmsUserRoleMenuController
{

	@Autowired
	private IUmsUserRoleMenuService umsUserRoleMenuService;

	
	/**
	 * 查询角色菜单列表
	 */
	@PostMapping("/listUmsUserRoleMenu")
	@ApiOperation(value = "角色菜单列表", notes = "角色菜单列表")
	public WrapperResponse listUmsUserRoleMenu(@RequestBody UmsUserRoleMenu qry)
	{
		return WrapperResponse.success(umsUserRoleMenuService.selectUmsUserRoleMenuPage(qry));
	}
	
	/**
	 * 新增保存角色菜单
	 */
	@PostMapping("/addUmsUserRoleMenu")
	@ApiOperation(value = "新增角色菜单", notes = "新增角色菜单")
	public WrapperResponse addUmsUserRoleMenu(@RequestBody UmsUserRoleMenu umsUserRoleMenu)
	{		
		return WrapperResponse.success(umsUserRoleMenuService.insertUmsUserRoleMenu(umsUserRoleMenu));
	}

	/**
	 * 修改保存角色菜单
	 */
	@PostMapping("/editUmsUserRoleMenu")
	@ApiOperation(value = "修改角色菜单", notes = "修改角色菜单")
	public WrapperResponse editSaveUmsUserRoleMenu(@RequestBody UmsUserRoleMenu umsUserRoleMenu)
	{		
		return WrapperResponse.success(umsUserRoleMenuService.updateUmsUserRoleMenu(umsUserRoleMenu));
	}
	
	/**
	 * 删除角色菜单
	 */
	@PostMapping( "/removeUmsUserRoleMenu/{id}")
	@ApiOperation(value = "删除角色菜单", notes = "删除角色菜单")
	public WrapperResponse removeUmsUserRoleMenu(@PathVariable(value = "id") Long id)
	{		
		return WrapperResponse.success(umsUserRoleMenuService.deleteUmsUserRoleMenuById(id));
	}
	
}
