package com.jinshuo.mall.admin.web.test.ums;

import com.jinshuo.mall.admin.application.service.ums.IUmsWxTemplateService;
import com.jinshuo.mall.admin.domain.ums.UmsWxTemplate;
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
@RequestMapping("/v1/wx/user/umsWxTemplate")
@Api(tags = "微信配置")
@Slf4j
public class UmsWxTemplateController
{

	@Autowired
	private IUmsWxTemplateService umsWxTemplateService;

	
	/**
	 * 查询微信配置列表
	 */
	@PostMapping("/listUmsWxTemplate")
	@ApiOperation(value = "微信配置列表", notes = "微信配置列表")
	public WrapperResponse listUmsWxTemplate(@RequestBody UmsWxTemplate qry)
	{
		return WrapperResponse.success(umsWxTemplateService.selectUmsWxTemplatePage(qry));
	}
	
	/**
	 * 新增保存微信配置
	 */
	@PostMapping("/addUmsWxTemplate")
	@ApiOperation(value = "新增微信配置", notes = "新增微信配置")
	public WrapperResponse addUmsWxTemplate(@RequestBody UmsWxTemplate umsWxTemplate)
	{		
		return WrapperResponse.success(umsWxTemplateService.insertUmsWxTemplate(umsWxTemplate));
	}

	/**
	 * 修改保存微信配置
	 */
	@PostMapping("/editUmsWxTemplate")
	@ApiOperation(value = "修改微信配置", notes = "修改微信配置")
	public WrapperResponse editSaveUmsWxTemplate(@RequestBody UmsWxTemplate umsWxTemplate)
	{		
		return WrapperResponse.success(umsWxTemplateService.updateUmsWxTemplate(umsWxTemplate));
	}
	
	/**
	 * 删除微信配置
	 */
	@PostMapping( "/removeUmsWxTemplate/{id}")
	@ApiOperation(value = "删除微信配置", notes = "删除微信配置")
	public WrapperResponse removeUmsWxTemplate(@PathVariable(value = "id") Long id)
	{		
		return WrapperResponse.success(umsWxTemplateService.deleteUmsWxTemplateById(id));
	}
	
}
