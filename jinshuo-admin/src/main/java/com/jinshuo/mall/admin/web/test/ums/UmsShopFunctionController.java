package com.jinshuo.mall.admin.web.test.ums;

import com.jinshuo.mall.admin.application.service.ums.IUmsShopFunctionService;
import com.jinshuo.mall.admin.domain.ums.UmsShopFunction;
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
@RequestMapping("/v1/wx/user/umsShopFunction")
@Api(tags = "")
@Slf4j
public class UmsShopFunctionController
{

	@Autowired
	private IUmsShopFunctionService umsShopFunctionService;

	
	/**
	 * 查询列表
	 */
	@PostMapping("/listUmsShopFunction")
	@ApiOperation(value = "列表", notes = "列表")
	public WrapperResponse listUmsShopFunction(@RequestBody UmsShopFunction qry)
	{
		return WrapperResponse.success(umsShopFunctionService.selectUmsShopFunctionPage(qry));
	}
	
	/**
	 * 新增保存
	 */
	@PostMapping("/addUmsShopFunction")
	@ApiOperation(value = "新增", notes = "新增")
	public WrapperResponse addUmsShopFunction(@RequestBody UmsShopFunction umsShopFunction)
	{		
		return WrapperResponse.success(umsShopFunctionService.insertUmsShopFunction(umsShopFunction));
	}

	/**
	 * 修改保存
	 */
	@PostMapping("/editUmsShopFunction")
	@ApiOperation(value = "修改", notes = "修改")
	public WrapperResponse editSaveUmsShopFunction(@RequestBody UmsShopFunction umsShopFunction)
	{		
		return WrapperResponse.success(umsShopFunctionService.updateUmsShopFunction(umsShopFunction));
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/removeUmsShopFunction/{id}")
	@ApiOperation(value = "删除", notes = "删除")
	public WrapperResponse removeUmsShopFunction(@PathVariable(value = "id") Long id)
	{		
		return WrapperResponse.success(umsShopFunctionService.deleteUmsShopFunctionById(id));
	}
	
}
