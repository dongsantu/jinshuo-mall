package com.jinshuo.mall.admin.web.test.gds;

import com.jinshuo.mall.admin.application.service.gds.IGdsSkuAttributeAndOptionService;
import com.jinshuo.mall.admin.domain.gds.GdsSkuAttributeAndOption;
import com.jinshuo.mall.core.response.WrapperResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 *  信息操作处理
 * 
 * @author dyh
 * @date 2020-08-12
 */
@RestController
@RequestMapping("/v1/wx/user/gdsSkuAttributeAndOption")
@Api(tags = "")
@Slf4j
public class GdsSkuAttributeAndOptionController
{

	@Autowired
	private IGdsSkuAttributeAndOptionService gdsSkuAttributeAndOptionService;

	
	/**
	 * 查询列表
	 */
	@PostMapping("/listGdsSkuAttributeAndOption")
	@ApiOperation(value = "列表", notes = "列表")
	public WrapperResponse listGdsSkuAttributeAndOption(@Valid @RequestBody GdsSkuAttributeAndOption qry)
	{
		return WrapperResponse.success(gdsSkuAttributeAndOptionService.selectGdsSkuAttributeAndOptionPage(qry));
	}
	
	/**
	 * 新增保存
	 */
	@PostMapping("/addGdsSkuAttributeAndOption")
	@ApiOperation(value = "新增", notes = "新增")
	public WrapperResponse addGdsSkuAttributeAndOption(@Valid @RequestBody GdsSkuAttributeAndOption gdsSkuAttributeAndOption)
	{		
		return WrapperResponse.success(gdsSkuAttributeAndOptionService.insertGdsSkuAttributeAndOption(gdsSkuAttributeAndOption));
	}

	/**
	 * 修改保存
	 */
	@PostMapping("/editGdsSkuAttributeAndOption")
	@ApiOperation(value = "修改", notes = "修改")
	public WrapperResponse editSaveGdsSkuAttributeAndOption(@Valid @RequestBody GdsSkuAttributeAndOption gdsSkuAttributeAndOption)
	{		
		return WrapperResponse.success(gdsSkuAttributeAndOptionService.updateGdsSkuAttributeAndOption(gdsSkuAttributeAndOption));
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/removeGdsSkuAttributeAndOption/{id}")
	@ApiOperation(value = "删除", notes = "删除")
	public WrapperResponse removeGdsSkuAttributeAndOption(@PathVariable(value = "id") Long id)
	{		
		return WrapperResponse.success(gdsSkuAttributeAndOptionService.deleteGdsSkuAttributeAndOptionById(id));
	}
	
}
