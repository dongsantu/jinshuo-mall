package com.jinshuo.mall.admin.web.test.ums;

import com.jinshuo.mall.admin.application.service.ums.IUmsUserMenuService;
import com.jinshuo.mall.admin.domain.ums.UmsUserMenu;
import com.jinshuo.mall.core.response.WrapperResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 *  信息操作处理
 * 
 * @author dyh
 * @date 2020-08-12
 */
@RestController
@RequestMapping("/v1/wx/user/umsUserMenu")
@Api(tags = "")
@Slf4j
public class UmsUserMenuController
{

	@Autowired
	private IUmsUserMenuService umsUserMenuService;

	
	/**
	 * 查询列表
	 */
	@PostMapping("/listUmsUserMenu")
	@ApiOperation(value = "列表", notes = "列表")
	public WrapperResponse listUmsUserMenu(@RequestBody UmsUserMenu qry)
	{
		return WrapperResponse.success(umsUserMenuService.selectUmsUserMenuPage(qry));
	}
	
	/**
	 * 新增保存
	 */
	@PostMapping("/addUmsUserMenu")
	@ApiOperation(value = "新增", notes = "新增")
	public WrapperResponse addUmsUserMenu(@RequestBody UmsUserMenu umsUserMenu)
	{		
		return WrapperResponse.success(umsUserMenuService.insertUmsUserMenu(umsUserMenu));
	}

	/**
	 * 修改保存
	 */
	@PostMapping("/editUmsUserMenu")
	@ApiOperation(value = "修改", notes = "修改")
	public WrapperResponse editSaveUmsUserMenu(@RequestBody UmsUserMenu umsUserMenu)
	{		
		return WrapperResponse.success(umsUserMenuService.updateUmsUserMenu(umsUserMenu));
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/removeUmsUserMenu/{id}")
	@ApiOperation(value = "删除", notes = "删除")
	public WrapperResponse removeUmsUserMenu(@PathVariable(value = "id") Long id)
	{		
		return WrapperResponse.success(umsUserMenuService.deleteUmsUserMenuById(id));
	}
	
}
