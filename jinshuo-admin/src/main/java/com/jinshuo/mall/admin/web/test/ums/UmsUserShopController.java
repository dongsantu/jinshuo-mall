package com.jinshuo.mall.admin.web.test.ums;

import com.jinshuo.mall.admin.application.service.ums.IUmsUserShopService;
import com.jinshuo.mall.admin.domain.ums.UmsUserShop;
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
@RequestMapping("/v1/wx/user/umsUserShop")
@Api(tags = "用户店铺关联")
@Slf4j
public class UmsUserShopController
{

	@Autowired
	private IUmsUserShopService umsUserShopService;

	
	/**
	 * 查询用户店铺关联列表
	 */
	@PostMapping("/listUmsUserShop")
	@ApiOperation(value = "用户店铺关联列表", notes = "用户店铺关联列表")
	public WrapperResponse listUmsUserShop(@RequestBody UmsUserShop qry)
	{
		return WrapperResponse.success(umsUserShopService.selectUmsUserShopPage(qry));
	}
	
	/**
	 * 新增保存用户店铺关联
	 */
	@PostMapping("/addUmsUserShop")
	@ApiOperation(value = "新增用户店铺关联", notes = "新增用户店铺关联")
	public WrapperResponse addUmsUserShop(@RequestBody UmsUserShop umsUserShop)
	{		
		return WrapperResponse.success(umsUserShopService.insertUmsUserShop(umsUserShop));
	}

	/**
	 * 修改保存用户店铺关联
	 */
	@PostMapping("/editUmsUserShop")
	@ApiOperation(value = "修改用户店铺关联", notes = "修改用户店铺关联")
	public WrapperResponse editSaveUmsUserShop(@RequestBody UmsUserShop umsUserShop)
	{		
		return WrapperResponse.success(umsUserShopService.updateUmsUserShop(umsUserShop));
	}
	
	/**
	 * 删除用户店铺关联
	 */
	@PostMapping( "/removeUmsUserShop/{id}")
	@ApiOperation(value = "删除用户店铺关联", notes = "删除用户店铺关联")
	public WrapperResponse removeUmsUserShop(@PathVariable(value = "id") Long id)
	{		
		return WrapperResponse.success(umsUserShopService.deleteUmsUserShopById(id));
	}
	
}
