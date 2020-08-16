package com.jinshuo.mall.admin.web.test.ord;

import com.jinshuo.mall.admin.application.dto.qry.ord.OrdCartQry;
import com.jinshuo.mall.admin.application.service.ord.IOrdCartService;
import com.jinshuo.mall.admin.domain.ord.OrdCart;
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
@RequestMapping("/v1/wx/user/ordCart")
@Api(tags = "")
@Slf4j
public class OrdCartController
{

	@Autowired
	private IOrdCartService ordCartService;

	
	/**
	 * 查询列表
	 */
	@PostMapping("/listOrdCart")
	@ApiOperation(value = "列表", notes = "列表")
	public WrapperResponse listOrdCart(@Valid @RequestBody OrdCartQry qry)
	{
		return WrapperResponse.success(ordCartService.selectOrdCartPage(qry));
	}
	
	/**
	 * 新增保存
	 */
	@PostMapping("/addOrdCart")
	@ApiOperation(value = "新增", notes = "新增")
	public WrapperResponse addOrdCart(@Valid @RequestBody OrdCart ordCart)
	{		
		return WrapperResponse.success(ordCartService.insertOrdCart(ordCart));
	}

	/**
	 * 修改保存
	 */
	@PostMapping("/editOrdCart")
	@ApiOperation(value = "修改", notes = "修改")
	public WrapperResponse editSaveOrdCart(@Valid @RequestBody OrdCart ordCart)
	{		
		return WrapperResponse.success(ordCartService.updateOrdCart(ordCart));
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/removeOrdCart/{id}")
	@ApiOperation(value = "删除", notes = "删除")
	public WrapperResponse removeOrdCart(@PathVariable(value = "id") Long id)
	{		
		return WrapperResponse.success(ordCartService.deleteOrdCartById(id));
	}
	
}
