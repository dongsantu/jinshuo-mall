package com.jinshuo.mall.admin.web.test.ums;

import com.jinshuo.mall.admin.application.service.ums.IUmsFunctionMenuService;
import com.jinshuo.mall.admin.domain.ums.UmsFunctionMenu;
import com.jinshuo.mall.core.response.WrapperResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 功能菜单 信息操作处理
 * 
 * @author dyh
 * @date 2020-08-12
 */
@RestController
@RequestMapping("/v1/wx/user/umsFunctionMenu")
@Api(tags = "功能菜单")
@Slf4j
public class UmsFunctionMenuController
{

	@Autowired
	private IUmsFunctionMenuService umsFunctionMenuService;

	
	/**
	 * 查询功能菜单列表
	 */
	@PostMapping("/listUmsFunctionMenu")
	@ApiOperation(value = "功能菜单列表", notes = "功能菜单列表")
	public WrapperResponse listUmsFunctionMenu(@RequestBody UmsFunctionMenu qry)
	{
		return WrapperResponse.success(umsFunctionMenuService.selectUmsFunctionMenuPage(qry));
	}
	
	/**
	 * 新增保存功能菜单
	 */
	@PostMapping("/addUmsFunctionMenu")
	@ApiOperation(value = "新增功能菜单", notes = "新增功能菜单")
	public WrapperResponse addUmsFunctionMenu(@RequestBody UmsFunctionMenu umsFunctionMenu)
	{		
		return WrapperResponse.success(umsFunctionMenuService.insertUmsFunctionMenu(umsFunctionMenu));
	}

	/**
	 * 修改保存功能菜单
	 */
	@PostMapping("/editUmsFunctionMenu")
	@ApiOperation(value = "修改功能菜单", notes = "修改功能菜单")
	public WrapperResponse editSaveUmsFunctionMenu(@RequestBody UmsFunctionMenu umsFunctionMenu)
	{		
		return WrapperResponse.success(umsFunctionMenuService.updateUmsFunctionMenu(umsFunctionMenu));
	}
	
	/**
	 * 删除功能菜单
	 */
	@PostMapping( "/removeUmsFunctionMenu/{id}")
	@ApiOperation(value = "删除功能菜单", notes = "删除功能菜单")
	public WrapperResponse removeUmsFunctionMenu(@PathVariable(value = "id") Long id)
	{		
		return WrapperResponse.success(umsFunctionMenuService.deleteUmsFunctionMenuById(id));
	}
	
}
