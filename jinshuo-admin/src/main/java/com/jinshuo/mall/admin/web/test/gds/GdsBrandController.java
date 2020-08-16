package com.jinshuo.mall.admin.web.test.gds;

import com.jinshuo.mall.admin.application.service.gds.IGdsBrandService;
import com.jinshuo.mall.admin.domain.gds.GdsBrand;
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
@RequestMapping("/v1/wx/user/gdsBrand")
@Api(tags = "")
@Slf4j
public class GdsBrandController
{

	@Autowired
	private IGdsBrandService gdsBrandService;

	
	/**
	 * 查询列表
	 */
	@PostMapping("/listGdsBrand")
	@ApiOperation(value = "列表", notes = "列表")
	public WrapperResponse listGdsBrand(@Valid @RequestBody GdsBrand qry)
	{
		return WrapperResponse.success(gdsBrandService.selectGdsBrandPage(qry));
	}
	
	/**
	 * 新增保存
	 */
	@PostMapping("/addGdsBrand")
	@ApiOperation(value = "新增", notes = "新增")
	public WrapperResponse addGdsBrand(@Valid @RequestBody GdsBrand gdsBrand)
	{		
		return WrapperResponse.success(gdsBrandService.insertGdsBrand(gdsBrand));
	}

	/**
	 * 修改保存
	 */
	@PostMapping("/editGdsBrand")
	@ApiOperation(value = "修改", notes = "修改")
	public WrapperResponse editSaveGdsBrand(@Valid @RequestBody GdsBrand gdsBrand)
	{		
		return WrapperResponse.success(gdsBrandService.updateGdsBrand(gdsBrand));
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/removeGdsBrand/{id}")
	@ApiOperation(value = "删除", notes = "删除")
	public WrapperResponse removeGdsBrand(@PathVariable(value = "id") Long id)
	{		
		return WrapperResponse.success(gdsBrandService.deleteGdsBrandById(id));
	}
	
}
