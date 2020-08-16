package com.jinshuo.mall.admin.web.test.ums;

import com.jinshuo.mall.admin.application.service.ums.IUmsMerchantService;
import com.jinshuo.mall.admin.domain.ums.UmsMerchant;
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
@RequestMapping("/v1/wx/user/umsMerchant")
@Api(tags = "")
@Slf4j
public class UmsMerchantController
{

	@Autowired
	private IUmsMerchantService umsMerchantService;

	
	/**
	 * 查询列表
	 */
	@PostMapping("/listUmsMerchant")
	@ApiOperation(value = "列表", notes = "列表")
	public WrapperResponse listUmsMerchant(@RequestBody UmsMerchant qry)
	{
		return WrapperResponse.success(umsMerchantService.selectUmsMerchantPage(qry));
	}
	
	/**
	 * 新增保存
	 */
	@PostMapping("/addUmsMerchant")
	@ApiOperation(value = "新增", notes = "新增")
	public WrapperResponse addUmsMerchant(@RequestBody UmsMerchant umsMerchant)
	{		
		return WrapperResponse.success(umsMerchantService.insertUmsMerchant(umsMerchant));
	}

	/**
	 * 修改保存
	 */
	@PostMapping("/editUmsMerchant")
	@ApiOperation(value = "修改", notes = "修改")
	public WrapperResponse editSaveUmsMerchant(@RequestBody UmsMerchant umsMerchant)
	{		
		return WrapperResponse.success(umsMerchantService.updateUmsMerchant(umsMerchant));
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/removeUmsMerchant/{id}")
	@ApiOperation(value = "删除", notes = "删除")
	public WrapperResponse removeUmsMerchant(@PathVariable(value = "id") Long id)
	{		
		return WrapperResponse.success(umsMerchantService.deleteUmsMerchantById(id));
	}
	
}
