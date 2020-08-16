package com.jinshuo.mall.admin.web.test.ord;

import com.jinshuo.mall.admin.application.dto.qry.ord.OrdCartItemQry;
import com.jinshuo.mall.admin.application.service.ord.IOrdCartItemService;
import com.jinshuo.mall.admin.domain.ord.OrdCartItem;
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
 * @date 2020-08-10
 */
@RestController
@RequestMapping("/v1/wx/user/ordCartItem")
@Api(tags = "")
@Slf4j
public class OrdCartItemController
{

	@Autowired
	private IOrdCartItemService ordCartItemService;

	
	/**
	 * 查询列表
	 */
	@PostMapping("/listOrdCartItem")
	@ApiOperation(value = "列表", notes = "列表")
	public WrapperResponse listOrdCartItem(@Valid @RequestBody OrdCartItemQry qry)
	{
		return WrapperResponse.success(ordCartItemService.selectOrdCartItemPage(qry));
	}
	
	/**
	 * 新增保存
	 */
	@PostMapping("/addOrdCartItem")
	@ApiOperation(value = "新增", notes = "新增")
	public WrapperResponse addOrdCartItem(@Valid @RequestBody OrdCartItem ordCartItem)
	{		
		return WrapperResponse.success(ordCartItemService.insertOrdCartItem(ordCartItem));
	}

	/**
	 * 修改保存
	 */
	@PostMapping("/editOrdCartItem")
	@ApiOperation(value = "修改", notes = "修改")
	public WrapperResponse editSaveOrdCartItem(@Valid @RequestBody OrdCartItem ordCartItem)
	{		
		return WrapperResponse.success(ordCartItemService.updateOrdCartItem(ordCartItem));
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/removeOrdCartItem/{id}")
	@ApiOperation(value = "删除", notes = "删除")
	public WrapperResponse removeOrdCartItem(@PathVariable(value = "id") Long id)
	{		
		return WrapperResponse.success(ordCartItemService.deleteOrdCartItemById(id));
	}
	
}
