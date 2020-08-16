package com.jinshuo.mall.admin.web.test.gds;

import com.jinshuo.mall.admin.application.service.gds.IGdsTagService;
import com.jinshuo.mall.admin.domain.gds.GdsTag;
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
@RequestMapping("/v1/wx/user/gdsTag")
@Api(tags = "")
@Slf4j
public class GdsTagController
{

	@Autowired
	private IGdsTagService gdsTagService;

	
	/**
	 * 查询列表
	 */
	@PostMapping("/listGdsTag")
	@ApiOperation(value = "列表", notes = "列表")
	public WrapperResponse listGdsTag(@Valid @RequestBody GdsTag qry)
	{
		return WrapperResponse.success(gdsTagService.selectGdsTagPage(qry));
	}
	
	/**
	 * 新增保存
	 */
	@PostMapping("/addGdsTag")
	@ApiOperation(value = "新增", notes = "新增")
	public WrapperResponse addGdsTag(@Valid @RequestBody GdsTag gdsTag)
	{		
		return WrapperResponse.success(gdsTagService.insertGdsTag(gdsTag));
	}

	/**
	 * 修改保存
	 */
	@PostMapping("/editGdsTag")
	@ApiOperation(value = "修改", notes = "修改")
	public WrapperResponse editSaveGdsTag(@Valid @RequestBody GdsTag gdsTag)
	{		
		return WrapperResponse.success(gdsTagService.updateGdsTag(gdsTag));
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/removeGdsTag/{id}")
	@ApiOperation(value = "删除", notes = "删除")
	public WrapperResponse removeGdsTag(@PathVariable(value = "id") Long id)
	{		
		return WrapperResponse.success(gdsTagService.deleteGdsTagById(id));
	}
	
}
