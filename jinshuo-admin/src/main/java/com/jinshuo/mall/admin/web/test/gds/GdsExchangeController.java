package com.jinshuo.mall.admin.web.test.gds;

import com.jinshuo.mall.admin.application.service.gds.IGdsExchangeService;
import com.jinshuo.mall.admin.domain.gds.GdsExchange;
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
@RequestMapping("/v1/wx/user/gdsExchange")
@Api(tags = "")
@Slf4j
public class GdsExchangeController
{

	@Autowired
	private IGdsExchangeService gdsExchangeService;

	
	/**
	 * 查询列表
	 */
	@PostMapping("/listGdsExchange")
	@ApiOperation(value = "列表", notes = "列表")
	public WrapperResponse listGdsExchange(@Valid @RequestBody GdsExchange qry)
	{
		return WrapperResponse.success(gdsExchangeService.selectGdsExchangePage(qry));
	}
	
	/**
	 * 新增保存
	 */
	@PostMapping("/addGdsExchange")
	@ApiOperation(value = "新增", notes = "新增")
	public WrapperResponse addGdsExchange(@Valid @RequestBody GdsExchange gdsExchange)
	{		
		return WrapperResponse.success(gdsExchangeService.insertGdsExchange(gdsExchange));
	}

	/**
	 * 修改保存
	 */
	@PostMapping("/editGdsExchange")
	@ApiOperation(value = "修改", notes = "修改")
	public WrapperResponse editSaveGdsExchange(@Valid @RequestBody GdsExchange gdsExchange)
	{		
		return WrapperResponse.success(gdsExchangeService.updateGdsExchange(gdsExchange));
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/removeGdsExchange/{id}")
	@ApiOperation(value = "删除", notes = "删除")
	public WrapperResponse removeGdsExchange(@PathVariable(value = "id") Long id)
	{		
		return WrapperResponse.success(gdsExchangeService.deleteGdsExchangeById(id));
	}
	
}
