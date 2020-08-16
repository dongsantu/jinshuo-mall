package com.jinshuo.mall.admin.web.test.ums;

import com.jinshuo.mall.admin.application.service.ums.IUmsShopWxconfigService;
import com.jinshuo.mall.admin.domain.ums.UmsShopWxconfig;
import com.jinshuo.mall.core.response.WrapperResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 微信配置 信息操作处理
 * 
 * @author dyh
 * @date 2020-08-12
 */
@RestController
@RequestMapping("/v1/wx/user/umsShopWxconfig")
@Api(tags = "微信配置")
@Slf4j
public class UmsShopWxconfigController
{

	@Autowired
	private IUmsShopWxconfigService umsShopWxconfigService;

	
	/**
	 * 查询微信配置列表
	 */
	@PostMapping("/listUmsShopWxconfig")
	@ApiOperation(value = "微信配置列表", notes = "微信配置列表")
	public WrapperResponse listUmsShopWxconfig(@RequestBody UmsShopWxconfig qry)
	{
		return WrapperResponse.success(umsShopWxconfigService.selectUmsShopWxconfigPage(qry));
	}
	
	/**
	 * 新增保存微信配置
	 */
	@PostMapping("/addUmsShopWxconfig")
	@ApiOperation(value = "新增微信配置", notes = "新增微信配置")
	public WrapperResponse addUmsShopWxconfig(@RequestBody UmsShopWxconfig umsShopWxconfig)
	{		
		return WrapperResponse.success(umsShopWxconfigService.insertUmsShopWxconfig(umsShopWxconfig));
	}

	/**
	 * 修改保存微信配置
	 */
	@PostMapping("/editUmsShopWxconfig")
	@ApiOperation(value = "修改微信配置", notes = "修改微信配置")
	public WrapperResponse editSaveUmsShopWxconfig(@RequestBody UmsShopWxconfig umsShopWxconfig)
	{		
		return WrapperResponse.success(umsShopWxconfigService.updateUmsShopWxconfig(umsShopWxconfig));
	}
	
	/**
	 * 删除微信配置
	 */
	@PostMapping( "/removeUmsShopWxconfig/{id}")
	@ApiOperation(value = "删除微信配置", notes = "删除微信配置")
	public WrapperResponse removeUmsShopWxconfig(@PathVariable(value = "id") Long id)
	{		
		return WrapperResponse.success(umsShopWxconfigService.deleteUmsShopWxconfigById(id));
	}
	
}
