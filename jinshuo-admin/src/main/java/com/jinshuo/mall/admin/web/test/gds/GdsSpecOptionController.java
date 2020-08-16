package com.jinshuo.mall.admin.web.test.gds;

import com.jinshuo.mall.admin.application.service.gds.IGdsSpecOptionService;
import com.jinshuo.mall.admin.domain.gds.GdsSpecOption;
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
@RequestMapping("/v1/wx/user/gdsSpecOption")
@Api(tags = "")
@Slf4j
public class GdsSpecOptionController
{

	@Autowired
	private IGdsSpecOptionService gdsSpecOptionService;

	
	/**
	 * 查询列表
	 */
	@PostMapping("/listGdsSpecOption")
	@ApiOperation(value = "列表", notes = "列表")
	public WrapperResponse listGdsSpecOption(@Valid @RequestBody GdsSpecOption qry)
	{
		return WrapperResponse.success(gdsSpecOptionService.selectGdsSpecOptionPage(qry));
	}
	
	/**
	 * 新增保存
	 */
	@PostMapping("/addGdsSpecOption")
	@ApiOperation(value = "新增", notes = "新增")
	public WrapperResponse addGdsSpecOption(@Valid @RequestBody GdsSpecOption gdsSpecOption)
	{		
		return WrapperResponse.success(gdsSpecOptionService.insertGdsSpecOption(gdsSpecOption));
	}

	/**
	 * 修改保存
	 */
	@PostMapping("/editGdsSpecOption")
	@ApiOperation(value = "修改", notes = "修改")
	public WrapperResponse editSaveGdsSpecOption(@Valid @RequestBody GdsSpecOption gdsSpecOption)
	{		
		return WrapperResponse.success(gdsSpecOptionService.updateGdsSpecOption(gdsSpecOption));
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/removeGdsSpecOption/{id}")
	@ApiOperation(value = "删除", notes = "删除")
	public WrapperResponse removeGdsSpecOption(@PathVariable(value = "id") Long id)
	{		
		return WrapperResponse.success(gdsSpecOptionService.deleteGdsSpecOptionById(id));
	}
	
}
