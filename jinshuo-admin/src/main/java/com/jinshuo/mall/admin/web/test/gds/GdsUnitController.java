package com.jinshuo.mall.admin.web.test.gds;

import com.jinshuo.mall.admin.application.service.gds.IGdsUnitService;
import com.jinshuo.mall.admin.domain.gds.GdsUnit;
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
@RequestMapping("/v1/wx/user/gdsUnit")
@Api(tags = "")
@Slf4j
public class GdsUnitController
{

	@Autowired
	private IGdsUnitService gdsUnitService;

	
	/**
	 * 查询列表
	 */
	@PostMapping("/listGdsUnit")
	@ApiOperation(value = "列表", notes = "列表")
	public WrapperResponse listGdsUnit(@Valid @RequestBody GdsUnit qry)
	{
		return WrapperResponse.success(gdsUnitService.selectGdsUnitPage(qry));
	}
	
	/**
	 * 新增保存
	 */
	@PostMapping("/addGdsUnit")
	@ApiOperation(value = "新增", notes = "新增")
	public WrapperResponse addGdsUnit(@Valid @RequestBody GdsUnit gdsUnit)
	{		
		return WrapperResponse.success(gdsUnitService.insertGdsUnit(gdsUnit));
	}

	/**
	 * 修改保存
	 */
	@PostMapping("/editGdsUnit")
	@ApiOperation(value = "修改", notes = "修改")
	public WrapperResponse editSaveGdsUnit(@Valid @RequestBody GdsUnit gdsUnit)
	{		
		return WrapperResponse.success(gdsUnitService.updateGdsUnit(gdsUnit));
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/removeGdsUnit/{id}")
	@ApiOperation(value = "删除", notes = "删除")
	public WrapperResponse removeGdsUnit(@PathVariable(value = "id") Long id)
	{		
		return WrapperResponse.success(gdsUnitService.deleteGdsUnitById(id));
	}
	
}
