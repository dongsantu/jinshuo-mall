package com.jinshuo.mall.admin.web.test.gds;

import com.jinshuo.mall.admin.application.service.gds.IGdsCityService;
import com.jinshuo.mall.admin.domain.gds.GdsCity;
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
@RequestMapping("/v1/wx/user/gdsCity")
@Api(tags = "")
@Slf4j
public class GdsCityController
{

	@Autowired
	private IGdsCityService gdsCityService;

	
	/**
	 * 查询列表
	 */
	@PostMapping("/listGdsCity")
	@ApiOperation(value = "列表", notes = "列表")
	public WrapperResponse listGdsCity(@Valid @RequestBody GdsCity qry)
	{
		return WrapperResponse.success(gdsCityService.selectGdsCityPage(qry));
	}
	
	/**
	 * 新增保存
	 */
	@PostMapping("/addGdsCity")
	@ApiOperation(value = "新增", notes = "新增")
	public WrapperResponse addGdsCity(@Valid @RequestBody GdsCity gdsCity)
	{		
		return WrapperResponse.success(gdsCityService.insertGdsCity(gdsCity));
	}

	/**
	 * 修改保存
	 */
	@PostMapping("/editGdsCity")
	@ApiOperation(value = "修改", notes = "修改")
	public WrapperResponse editSaveGdsCity(@Valid @RequestBody GdsCity gdsCity)
	{		
		return WrapperResponse.success(gdsCityService.updateGdsCity(gdsCity));
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/removeGdsCity/{id}")
	@ApiOperation(value = "删除", notes = "删除")
	public WrapperResponse removeGdsCity(@PathVariable(value = "id") Long id)
	{		
		return WrapperResponse.success(gdsCityService.deleteGdsCityById(id));
	}
	
}
