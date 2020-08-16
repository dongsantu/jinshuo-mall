package com.jinshuo.mall.admin.web.test.gds;

import com.jinshuo.mall.admin.application.service.gds.IGdsGroupService;
import com.jinshuo.mall.admin.domain.gds.GdsGroup;
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
@RequestMapping("/v1/wx/user/gdsGroup")
@Api(tags = "")
@Slf4j
public class GdsGroupController
{

	@Autowired
	private IGdsGroupService gdsGroupService;

	
	/**
	 * 查询列表
	 */
	@PostMapping("/listGdsGroup")
	@ApiOperation(value = "列表", notes = "列表")
	public WrapperResponse listGdsGroup(@Valid @RequestBody GdsGroup qry)
	{
		return WrapperResponse.success(gdsGroupService.selectGdsGroupPage(qry));
	}
	
	/**
	 * 新增保存
	 */
	@PostMapping("/addGdsGroup")
	@ApiOperation(value = "新增", notes = "新增")
	public WrapperResponse addGdsGroup(@Valid @RequestBody GdsGroup gdsGroup)
	{		
		return WrapperResponse.success(gdsGroupService.insertGdsGroup(gdsGroup));
	}

	/**
	 * 修改保存
	 */
	@PostMapping("/editGdsGroup")
	@ApiOperation(value = "修改", notes = "修改")
	public WrapperResponse editSaveGdsGroup(@Valid @RequestBody GdsGroup gdsGroup)
	{		
		return WrapperResponse.success(gdsGroupService.updateGdsGroup(gdsGroup));
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/removeGdsGroup/{id}")
	@ApiOperation(value = "删除", notes = "删除")
	public WrapperResponse removeGdsGroup(@PathVariable(value = "id") Long id)
	{		
		return WrapperResponse.success(gdsGroupService.deleteGdsGroupById(id));
	}
	
}
