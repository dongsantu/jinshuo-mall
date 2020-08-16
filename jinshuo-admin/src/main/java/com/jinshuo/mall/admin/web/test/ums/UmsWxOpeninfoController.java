package com.jinshuo.mall.admin.web.test.ums;

import com.jinshuo.mall.admin.application.service.ums.IUmsWxOpeninfoService;
import com.jinshuo.mall.admin.domain.ums.UmsWxOpeninfo;
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
@RequestMapping("/v1/wx/user/umsWxOpeninfo")
@Api(tags = "微信菜单")
@Slf4j
public class UmsWxOpeninfoController
{

	@Autowired
	private IUmsWxOpeninfoService umsWxOpeninfoService;

	
	/**
	 * 查询微信菜单列表
	 */
	@PostMapping("/listUmsWxOpeninfo")
	@ApiOperation(value = "微信菜单列表", notes = "微信菜单列表")
	public WrapperResponse listUmsWxOpeninfo(@RequestBody UmsWxOpeninfo qry)
	{
		return WrapperResponse.success(umsWxOpeninfoService.selectUmsWxOpeninfoPage(qry));
	}
	
	/**
	 * 新增保存微信菜单
	 */
	@PostMapping("/addUmsWxOpeninfo")
	@ApiOperation(value = "新增微信菜单", notes = "新增微信菜单")
	public WrapperResponse addUmsWxOpeninfo(@RequestBody UmsWxOpeninfo umsWxOpeninfo)
	{		
		return WrapperResponse.success(umsWxOpeninfoService.insertUmsWxOpeninfo(umsWxOpeninfo));
	}

	/**
	 * 修改保存微信菜单
	 */
	@PostMapping("/editUmsWxOpeninfo")
	@ApiOperation(value = "修改微信菜单", notes = "修改微信菜单")
	public WrapperResponse editSaveUmsWxOpeninfo(@RequestBody UmsWxOpeninfo umsWxOpeninfo)
	{		
		return WrapperResponse.success(umsWxOpeninfoService.updateUmsWxOpeninfo(umsWxOpeninfo));
	}
	
	/**
	 * 删除微信菜单
	 */
	@PostMapping( "/removeUmsWxOpeninfo/{id}")
	@ApiOperation(value = "删除微信菜单", notes = "删除微信菜单")
	public WrapperResponse removeUmsWxOpeninfo(@PathVariable(value = "id") Long id)
	{		
		return WrapperResponse.success(umsWxOpeninfoService.deleteUmsWxOpeninfoById(id));
	}
	
}
