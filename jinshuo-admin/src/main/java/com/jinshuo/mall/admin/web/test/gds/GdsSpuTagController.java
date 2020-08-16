package com.jinshuo.mall.admin.web.test.gds;

import com.jinshuo.mall.admin.application.service.gds.IGdsSpuTagService;
import com.jinshuo.mall.admin.domain.gds.GdsSpuTag;
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
@RequestMapping("/v1/wx/user/gdsSpuTag")
@Api(tags = "")
@Slf4j
public class GdsSpuTagController
{

	@Autowired
	private IGdsSpuTagService gdsSpuTagService;

	
	/**
	 * 查询列表
	 */
	@PostMapping("/listGdsSpuTag")
	@ApiOperation(value = "列表", notes = "列表")
	public WrapperResponse listGdsSpuTag(@Valid @RequestBody GdsSpuTag qry)
	{
		return WrapperResponse.success(gdsSpuTagService.selectGdsSpuTagPage(qry));
	}
	
	/**
	 * 新增保存
	 */
	@PostMapping("/addGdsSpuTag")
	@ApiOperation(value = "新增", notes = "新增")
	public WrapperResponse addGdsSpuTag(@Valid @RequestBody GdsSpuTag gdsSpuTag)
	{		
		return WrapperResponse.success(gdsSpuTagService.insertGdsSpuTag(gdsSpuTag));
	}

	/**
	 * 修改保存
	 */
	@PostMapping("/editGdsSpuTag")
	@ApiOperation(value = "修改", notes = "修改")
	public WrapperResponse editSaveGdsSpuTag(@Valid @RequestBody GdsSpuTag gdsSpuTag)
	{		
		return WrapperResponse.success(gdsSpuTagService.updateGdsSpuTag(gdsSpuTag));
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/removeGdsSpuTag/{id}")
	@ApiOperation(value = "删除", notes = "删除")
	public WrapperResponse removeGdsSpuTag(@PathVariable(value = "id") Long id)
	{		
		return WrapperResponse.success(gdsSpuTagService.deleteGdsSpuTagById(id));
	}
	
}
