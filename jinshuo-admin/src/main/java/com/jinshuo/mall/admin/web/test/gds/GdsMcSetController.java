package com.jinshuo.mall.admin.web.test.gds;

import com.jinshuo.mall.admin.application.service.gds.IGdsMcSetService;
import com.jinshuo.mall.admin.domain.gds.GdsMcSet;
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
@RequestMapping("/v1/wx/user/gdsMcSet")
@Api(tags = "")
@Slf4j
public class GdsMcSetController
{

	@Autowired
	private IGdsMcSetService gdsMcSetService;

	
	/**
	 * 查询列表
	 */
	@PostMapping("/listGdsMcSet")
	@ApiOperation(value = "列表", notes = "列表")
	public WrapperResponse listGdsMcSet(@Valid @RequestBody GdsMcSet qry)
	{
		return WrapperResponse.success(gdsMcSetService.selectGdsMcSetPage(qry));
	}
	
	/**
	 * 新增保存
	 */
	@PostMapping("/addGdsMcSet")
	@ApiOperation(value = "新增", notes = "新增")
	public WrapperResponse addGdsMcSet(@Valid @RequestBody GdsMcSet gdsMcSet)
	{		
		return WrapperResponse.success(gdsMcSetService.insertGdsMcSet(gdsMcSet));
	}

	/**
	 * 修改保存
	 */
	@PostMapping("/editGdsMcSet")
	@ApiOperation(value = "修改", notes = "修改")
	public WrapperResponse editSaveGdsMcSet(@Valid @RequestBody GdsMcSet gdsMcSet)
	{		
		return WrapperResponse.success(gdsMcSetService.updateGdsMcSet(gdsMcSet));
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/removeGdsMcSet/{id}")
	@ApiOperation(value = "删除", notes = "删除")
	public WrapperResponse removeGdsMcSet(@PathVariable(value = "id") Long id)
	{		
		return WrapperResponse.success(gdsMcSetService.deleteGdsMcSetById(id));
	}
	
}
