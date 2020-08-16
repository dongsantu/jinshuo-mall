package com.jinshuo.mall.admin.web.test.ums;

import com.jinshuo.mall.admin.application.service.ums.IUmsMerMenuService;
import com.jinshuo.mall.admin.domain.ums.UmsMerMenu;
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
@RequestMapping("/v1/wx/user/umsMerMenu")
@Api(tags = "")
@Slf4j
public class UmsMerMenuController
{

	@Autowired
	private IUmsMerMenuService umsMerMenuService;

	
	/**
	 * 查询列表
	 */
	@PostMapping("/listUmsMerMenu")
	@ApiOperation(value = "列表", notes = "列表")
	public WrapperResponse listUmsMerMenu(@RequestBody UmsMerMenu qry)
	{
		return WrapperResponse.success(umsMerMenuService.selectUmsMerMenuPage(qry));
	}
	
	/**
	 * 新增保存
	 */
	@PostMapping("/addUmsMerMenu")
	@ApiOperation(value = "新增", notes = "新增")
	public WrapperResponse addUmsMerMenu(@RequestBody UmsMerMenu umsMerMenu)
	{		
		return WrapperResponse.success(umsMerMenuService.insertUmsMerMenu(umsMerMenu));
	}

	/**
	 * 修改保存
	 */
	@PostMapping("/editUmsMerMenu")
	@ApiOperation(value = "修改", notes = "修改")
	public WrapperResponse editSaveUmsMerMenu(@RequestBody UmsMerMenu umsMerMenu)
	{		
		return WrapperResponse.success(umsMerMenuService.updateUmsMerMenu(umsMerMenu));
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/removeUmsMerMenu/{id}")
	@ApiOperation(value = "删除", notes = "删除")
	public WrapperResponse removeUmsMerMenu(@PathVariable(value = "id") Long id)
	{		
		return WrapperResponse.success(umsMerMenuService.deleteUmsMerMenuById(id));
	}
	
}
