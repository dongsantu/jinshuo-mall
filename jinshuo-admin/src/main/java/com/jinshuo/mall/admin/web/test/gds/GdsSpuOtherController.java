package com.jinshuo.mall.admin.web.test.gds;

import com.jinshuo.mall.admin.application.service.gds.IGdsSpuOtherService;
import com.jinshuo.mall.admin.domain.gds.GdsSpuOther;
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
@RequestMapping("/v1/wx/user/gdsSpuOther")
@Api(tags = "")
@Slf4j
public class GdsSpuOtherController
{

	@Autowired
	private IGdsSpuOtherService gdsSpuOtherService;

	
	/**
	 * 查询列表
	 */
	@PostMapping("/listGdsSpuOther")
	@ApiOperation(value = "列表", notes = "列表")
	public WrapperResponse listGdsSpuOther(@Valid @RequestBody GdsSpuOther qry)
	{
		return WrapperResponse.success(gdsSpuOtherService.selectGdsSpuOtherPage(qry));
	}
	
	/**
	 * 新增保存
	 */
	@PostMapping("/addGdsSpuOther")
	@ApiOperation(value = "新增", notes = "新增")
	public WrapperResponse addGdsSpuOther(@Valid @RequestBody GdsSpuOther gdsSpuOther)
	{		
		return WrapperResponse.success(gdsSpuOtherService.insertGdsSpuOther(gdsSpuOther));
	}

	/**
	 * 修改保存
	 */
	@PostMapping("/editGdsSpuOther")
	@ApiOperation(value = "修改", notes = "修改")
	public WrapperResponse editSaveGdsSpuOther(@Valid @RequestBody GdsSpuOther gdsSpuOther)
	{		
		return WrapperResponse.success(gdsSpuOtherService.updateGdsSpuOther(gdsSpuOther));
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/removeGdsSpuOther/{id}")
	@ApiOperation(value = "删除", notes = "删除")
	public WrapperResponse removeGdsSpuOther(@PathVariable(value = "id") Long id)
	{		
		return WrapperResponse.success(gdsSpuOtherService.deleteGdsSpuOtherById(id));
	}
	
}
