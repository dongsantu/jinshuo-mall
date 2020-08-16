package com.jinshuo.mall.admin.web.test.ums;

import com.jinshuo.mall.admin.application.service.ums.IUmsMenuService;
import com.jinshuo.mall.admin.domain.ums.UmsMenu;
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
@RequestMapping("/v1/wx/user/umsMenu")
@Api(tags = "")
@Slf4j
public class UmsMenuController
{

	@Autowired
	private IUmsMenuService umsMenuService;

	
	/**
	 * 查询列表
	 */
	@PostMapping("/listUmsMenu")
	@ApiOperation(value = "列表", notes = "列表")
	public WrapperResponse listUmsMenu(@RequestBody UmsMenu qry)
	{
		return WrapperResponse.success(umsMenuService.selectUmsMenuPage(qry));
	}
	
	/**
	 * 新增保存
	 */
	@PostMapping("/addUmsMenu")
	@ApiOperation(value = "新增", notes = "新增")
	public WrapperResponse addUmsMenu(@RequestBody UmsMenu umsMenu)
	{		
		return WrapperResponse.success(umsMenuService.insertUmsMenu(umsMenu));
	}

	/**
	 * 修改保存
	 */
	@PostMapping("/editUmsMenu")
	@ApiOperation(value = "修改", notes = "修改")
	public WrapperResponse editSaveUmsMenu(@RequestBody UmsMenu umsMenu)
	{		
		return WrapperResponse.success(umsMenuService.updateUmsMenu(umsMenu));
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/removeUmsMenu/{id}")
	@ApiOperation(value = "删除", notes = "删除")
	public WrapperResponse removeUmsMenu(@PathVariable(value = "id") Long id)
	{		
		return WrapperResponse.success(umsMenuService.deleteUmsMenuById(id));
	}
	
}
