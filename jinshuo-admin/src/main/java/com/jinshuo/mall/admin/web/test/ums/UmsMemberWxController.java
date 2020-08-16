package com.jinshuo.mall.admin.web.test.ums;

import com.jinshuo.mall.admin.application.service.ums.IUmsMemberWxService;
import com.jinshuo.mall.admin.domain.ums.UmsMemberWx;
import com.jinshuo.mall.core.response.WrapperResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 微信账户 信息操作处理
 * 
 * @author dyh
 * @date 2020-08-12
 */
@RestController
@RequestMapping("/v1/wx/user/umsMemberWx")
@Api(tags = "微信账户")
@Slf4j
public class UmsMemberWxController
{

	@Autowired
	private IUmsMemberWxService umsMemberWxService;

	
	/**
	 * 查询微信账户列表
	 */
	@PostMapping("/listUmsMemberWx")
	@ApiOperation(value = "微信账户列表", notes = "微信账户列表")
	public WrapperResponse listUmsMemberWx(@RequestBody UmsMemberWx qry)
	{
		return WrapperResponse.success(umsMemberWxService.selectUmsMemberWxPage(qry));
	}
	
	/**
	 * 新增保存微信账户
	 */
	@PostMapping("/addUmsMemberWx")
	@ApiOperation(value = "新增微信账户", notes = "新增微信账户")
	public WrapperResponse addUmsMemberWx(@RequestBody UmsMemberWx umsMemberWx)
	{		
		return WrapperResponse.success(umsMemberWxService.insertUmsMemberWx(umsMemberWx));
	}

	/**
	 * 修改保存微信账户
	 */
	@PostMapping("/editUmsMemberWx")
	@ApiOperation(value = "修改微信账户", notes = "修改微信账户")
	public WrapperResponse editSaveUmsMemberWx(@RequestBody UmsMemberWx umsMemberWx)
	{		
		return WrapperResponse.success(umsMemberWxService.updateUmsMemberWx(umsMemberWx));
	}
	
	/**
	 * 删除微信账户
	 */
	@PostMapping( "/removeUmsMemberWx/{id}")
	@ApiOperation(value = "删除微信账户", notes = "删除微信账户")
	public WrapperResponse removeUmsMemberWx(@PathVariable(value = "id") Long id)
	{		
		return WrapperResponse.success(umsMemberWxService.deleteUmsMemberWxById(id));
	}
	
}
