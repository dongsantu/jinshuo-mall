package com.jinshuo.mall.admin.web.test.ums;

import com.jinshuo.mall.admin.application.service.ums.IUmsWxMenuService;
import com.jinshuo.mall.admin.domain.ums.UmsWxMenu;
import com.jinshuo.mall.core.response.WrapperResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 微信菜单 信息操作处理
 * 
 * @author dyh
 * @date 2020-08-12
 */
@RestController
@RequestMapping("/v1/wx/user/umsWxMenu")
@Api(tags = "微信菜单")
@Slf4j
public class UmsWxMenuController
{

	@Autowired
	private IUmsWxMenuService umsWxMenuService;

	
	/**
	 * 查询微信菜单列表
	 */
	@PostMapping("/listUmsWxMenu")
	@ApiOperation(value = "微信菜单列表", notes = "微信菜单列表")
	public WrapperResponse listUmsWxMenu(@RequestBody UmsWxMenu qry)
	{
		return WrapperResponse.success(umsWxMenuService.selectUmsWxMenuPage(qry));
	}
	
	/**
	 * 新增保存微信菜单
	 */
	@PostMapping("/addUmsWxMenu")
	@ApiOperation(value = "新增微信菜单", notes = "新增微信菜单")
	public WrapperResponse addUmsWxMenu(@RequestBody UmsWxMenu umsWxMenu)
	{		
		return WrapperResponse.success(umsWxMenuService.insertUmsWxMenu(umsWxMenu));
	}

	/**
	 * 修改保存微信菜单
	 */
	@PostMapping("/editUmsWxMenu")
	@ApiOperation(value = "修改微信菜单", notes = "修改微信菜单")
	public WrapperResponse editSaveUmsWxMenu(@RequestBody UmsWxMenu umsWxMenu)
	{		
		return WrapperResponse.success(umsWxMenuService.updateUmsWxMenu(umsWxMenu));
	}
	
	/**
	 * 删除微信菜单
	 */
	@PostMapping( "/removeUmsWxMenu/{id}")
	@ApiOperation(value = "删除微信菜单", notes = "删除微信菜单")
	public WrapperResponse removeUmsWxMenu(@PathVariable(value = "id") Long id)
	{		
		return WrapperResponse.success(umsWxMenuService.deleteUmsWxMenuById(id));
	}
	
}
