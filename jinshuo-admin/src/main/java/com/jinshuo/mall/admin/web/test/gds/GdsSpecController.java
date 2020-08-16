package com.jinshuo.mall.admin.web.test.gds;

import com.jinshuo.mall.admin.application.service.gds.IGdsSpecService;
import com.jinshuo.mall.admin.domain.gds.GdsSpec;
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
@RequestMapping("/v1/wx/user/gdsSpec")
@Api(tags = "")
@Slf4j
public class GdsSpecController
{

	@Autowired
	private IGdsSpecService gdsSpecService;

	
	/**
	 * 查询列表
	 */
	@PostMapping("/listGdsSpec")
	@ApiOperation(value = "列表", notes = "列表")
	public WrapperResponse listGdsSpec(@Valid @RequestBody GdsSpec qry)
	{
		return WrapperResponse.success(gdsSpecService.selectGdsSpecPage(qry));
	}
	
	/**
	 * 新增保存
	 */
	@PostMapping("/addGdsSpec")
	@ApiOperation(value = "新增", notes = "新增")
	public WrapperResponse addGdsSpec(@Valid @RequestBody GdsSpec gdsSpec)
	{		
		return WrapperResponse.success(gdsSpecService.insertGdsSpec(gdsSpec));
	}

	/**
	 * 修改保存
	 */
	@PostMapping("/editGdsSpec")
	@ApiOperation(value = "修改", notes = "修改")
	public WrapperResponse editSaveGdsSpec(@Valid @RequestBody GdsSpec gdsSpec)
	{		
		return WrapperResponse.success(gdsSpecService.updateGdsSpec(gdsSpec));
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/removeGdsSpec/{id}")
	@ApiOperation(value = "删除", notes = "删除")
	public WrapperResponse removeGdsSpec(@PathVariable(value = "id") Long id)
	{		
		return WrapperResponse.success(gdsSpecService.deleteGdsSpecById(id));
	}
	
}
