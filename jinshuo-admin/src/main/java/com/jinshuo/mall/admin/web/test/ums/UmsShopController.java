package com.jinshuo.mall.admin.web.test.ums;

import com.jinshuo.mall.admin.application.service.ums.IUmsShopService;
import com.jinshuo.mall.admin.domain.ums.UmsShop;
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
@RequestMapping("/v1/wx/user/umsShop")
@Api(tags = "")
@Slf4j
public class UmsShopController
{

	@Autowired
	private IUmsShopService umsShopService;

	
	/**
	 * 查询列表
	 */
	@PostMapping("/listUmsShop")
	@ApiOperation(value = "列表", notes = "列表")
	public WrapperResponse listUmsShop(@RequestBody UmsShop qry)
	{
		return WrapperResponse.success(umsShopService.selectUmsShopPage(qry));
	}
	
	/**
	 * 新增保存
	 */
	@PostMapping("/addUmsShop")
	@ApiOperation(value = "新增", notes = "新增")
	public WrapperResponse addUmsShop(@RequestBody UmsShop umsShop)
	{		
		return WrapperResponse.success(umsShopService.insertUmsShop(umsShop));
	}

	/**
	 * 修改保存
	 */
	@PostMapping("/editUmsShop")
	@ApiOperation(value = "修改", notes = "修改")
	public WrapperResponse editSaveUmsShop(@RequestBody UmsShop umsShop)
	{		
		return WrapperResponse.success(umsShopService.updateUmsShop(umsShop));
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/removeUmsShop/{id}")
	@ApiOperation(value = "删除", notes = "删除")
	public WrapperResponse removeUmsShop(@PathVariable(value = "id") Long id)
	{		
		return WrapperResponse.success(umsShopService.deleteUmsShopById(id));
	}
	
}
