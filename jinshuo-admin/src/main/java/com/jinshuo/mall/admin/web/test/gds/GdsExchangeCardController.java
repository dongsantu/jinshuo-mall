package com.jinshuo.mall.admin.web.test.gds;

import com.jinshuo.mall.admin.application.service.gds.IGdsExchangeCardService;
import com.jinshuo.mall.admin.domain.gds.GdsExchangeCard;
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
@RequestMapping("/v1/wx/user/gdsExchangeCard")
@Api(tags = "")
@Slf4j
public class GdsExchangeCardController
{

	@Autowired
	private IGdsExchangeCardService gdsExchangeCardService;

	
	/**
	 * 查询列表
	 */
	@PostMapping("/listGdsExchangeCard")
	@ApiOperation(value = "列表", notes = "列表")
	public WrapperResponse listGdsExchangeCard(@Valid @RequestBody GdsExchangeCard qry)
	{
		return WrapperResponse.success(gdsExchangeCardService.selectGdsExchangeCardPage(qry));
	}
	
	/**
	 * 新增保存
	 */
	@PostMapping("/addGdsExchangeCard")
	@ApiOperation(value = "新增", notes = "新增")
	public WrapperResponse addGdsExchangeCard(@Valid @RequestBody GdsExchangeCard gdsExchangeCard)
	{		
		return WrapperResponse.success(gdsExchangeCardService.insertGdsExchangeCard(gdsExchangeCard));
	}

	/**
	 * 修改保存
	 */
	@PostMapping("/editGdsExchangeCard")
	@ApiOperation(value = "修改", notes = "修改")
	public WrapperResponse editSaveGdsExchangeCard(@Valid @RequestBody GdsExchangeCard gdsExchangeCard)
	{		
		return WrapperResponse.success(gdsExchangeCardService.updateGdsExchangeCard(gdsExchangeCard));
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/removeGdsExchangeCard/{id}")
	@ApiOperation(value = "删除", notes = "删除")
	public WrapperResponse removeGdsExchangeCard(@PathVariable(value = "id") Long id)
	{		
		return WrapperResponse.success(gdsExchangeCardService.deleteGdsExchangeCardById(id));
	}
	
}
