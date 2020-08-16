package com.jinshuo.mall.admin.web.test.ums;

import com.jinshuo.mall.admin.application.service.ums.IUmsFunctionService;
import com.jinshuo.mall.admin.domain.ums.UmsFunction;
import com.jinshuo.mall.core.response.WrapperResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 用户店铺关联 信息操作处理
 * 
 * @author dyh
 * @date 2020-08-12
 */
@RestController
@RequestMapping("/v1/wx/user/umsFunction")
@Api(tags = "用户店铺关联")
@Slf4j
public class UmsFunctionController
{

	@Autowired
	private IUmsFunctionService umsFunctionService;

	
	/**
	 * 查询用户店铺关联列表
	 */
	@PostMapping("/listUmsFunction")
	@ApiOperation(value = "用户店铺关联列表", notes = "用户店铺关联列表")
	public WrapperResponse listUmsFunction(@RequestBody UmsFunction qry)
	{
		return WrapperResponse.success(umsFunctionService.selectUmsFunctionPage(qry));
	}
	
	/**
	 * 新增保存用户店铺关联
	 */
	@PostMapping("/addUmsFunction")
	@ApiOperation(value = "新增用户店铺关联", notes = "新增用户店铺关联")
	public WrapperResponse addUmsFunction(@RequestBody UmsFunction umsFunction)
	{		
		return WrapperResponse.success(umsFunctionService.insertUmsFunction(umsFunction));
	}

	/**
	 * 修改保存用户店铺关联
	 */
	@PostMapping("/editUmsFunction")
	@ApiOperation(value = "修改用户店铺关联", notes = "修改用户店铺关联")
	public WrapperResponse editSaveUmsFunction(@RequestBody UmsFunction umsFunction)
	{		
		return WrapperResponse.success(umsFunctionService.updateUmsFunction(umsFunction));
	}
	
	/**
	 * 删除用户店铺关联
	 */
	@PostMapping( "/removeUmsFunction/{id}")
	@ApiOperation(value = "删除用户店铺关联", notes = "删除用户店铺关联")
	public WrapperResponse removeUmsFunction(@PathVariable(value = "id") Long id)
	{		
		return WrapperResponse.success(umsFunctionService.deleteUmsFunctionById(id));
	}
	
}
