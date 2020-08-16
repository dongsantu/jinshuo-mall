package com.jinshuo.mall.admin.web.test.gds;

import com.jinshuo.mall.admin.application.service.gds.IGdsTypeService;
import com.jinshuo.mall.admin.domain.gds.GdsType;
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
@RequestMapping("/v1/wx/user/gdsType")
@Api(tags = "")
@Slf4j
public class GdsTypeController
{

	@Autowired
	private IGdsTypeService gdsTypeService;

	
	/**
	 * 查询列表
	 */
	@PostMapping("/listGdsType")
	@ApiOperation(value = "列表", notes = "列表")
	public WrapperResponse listGdsType(@Valid @RequestBody GdsType qry)
	{
		return WrapperResponse.success(gdsTypeService.selectGdsTypePage(qry));
	}
	
	/**
	 * 新增保存
	 */
	@PostMapping("/addGdsType")
	@ApiOperation(value = "新增", notes = "新增")
	public WrapperResponse addGdsType(@Valid @RequestBody GdsType gdsType)
	{		
		return WrapperResponse.success(gdsTypeService.insertGdsType(gdsType));
	}

	/**
	 * 修改保存
	 */
	@PostMapping("/editGdsType")
	@ApiOperation(value = "修改", notes = "修改")
	public WrapperResponse editSaveGdsType(@Valid @RequestBody GdsType gdsType)
	{		
		return WrapperResponse.success(gdsTypeService.updateGdsType(gdsType));
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/removeGdsType/{id}")
	@ApiOperation(value = "删除", notes = "删除")
	public WrapperResponse removeGdsType(@PathVariable(value = "id") Long id)
	{		
		return WrapperResponse.success(gdsTypeService.deleteGdsTypeById(id));
	}
	
}
