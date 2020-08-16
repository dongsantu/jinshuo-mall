package com.jinshuo.mall.admin.web.test.gds;

import com.jinshuo.mall.admin.application.service.gds.IGdsCategoryService;
import com.jinshuo.mall.admin.domain.gds.GdsCategory;
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
@RequestMapping("/v1/wx/user/gdsCategory")
@Api(tags = "")
@Slf4j
public class GdsCategoryController
{

	@Autowired
	private IGdsCategoryService gdsCategoryService;

	
	/**
	 * 查询列表
	 */
	@PostMapping("/listGdsCategory")
	@ApiOperation(value = "列表", notes = "列表")
	public WrapperResponse listGdsCategory( @RequestBody GdsCategory qry)
	{
		return WrapperResponse.success(gdsCategoryService.selectGdsCategoryPage(qry));
	}
	
	/**
	 * 新增保存
	 */
	@PostMapping("/addGdsCategory")
	@ApiOperation(value = "新增", notes = "新增")
	public WrapperResponse addGdsCategory( @RequestBody GdsCategory gdsCategory)
	{		
		return WrapperResponse.success(gdsCategoryService.insertGdsCategory(gdsCategory));
	}

	/**
	 * 修改保存
	 */
	@PostMapping("/editGdsCategory")
	@ApiOperation(value = "修改", notes = "修改")
	public WrapperResponse editSaveGdsCategory(@Valid @RequestBody GdsCategory gdsCategory)
	{		
		return WrapperResponse.success(gdsCategoryService.updateGdsCategory(gdsCategory));
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/removeGdsCategory/{id}")
	@ApiOperation(value = "删除", notes = "删除")
	public WrapperResponse removeGdsCategory(@PathVariable(value = "id") Long id)
	{		
		return WrapperResponse.success(gdsCategoryService.deleteGdsCategoryById(id));
	}
	
}
