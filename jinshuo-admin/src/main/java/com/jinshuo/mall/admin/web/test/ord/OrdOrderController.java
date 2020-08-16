package com.jinshuo.mall.admin.web.test.ord;

import com.jinshuo.mall.admin.application.dto.qry.ord.OrdOrderQry;
import com.jinshuo.mall.admin.application.service.ord.IOrdOrderService;
import com.jinshuo.mall.admin.domain.ord.OrdOrder;
import com.jinshuo.mall.core.response.WrapperResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * 订单 信息操作处理
 * 
 * @author dyh
 * @date 2020-08-10
 */
@RestController
@RequestMapping("/v1/wx/user/ordOrder")
@Api(tags = "订单")
@Slf4j
public class OrdOrderController
{

	@Autowired
	private IOrdOrderService ordOrderService;

	
	/**
	 * 查询订单列表
	 */
	@PostMapping("/listOrdOrder")
	@ApiOperation(value = "订单列表", notes = "订单列表")
	public WrapperResponse listOrdOrder(@Valid @RequestBody OrdOrderQry qry)
	{
		return WrapperResponse.success(ordOrderService.selectOrdOrderPage(qry));
	}
	
	/**
	 * 新增保存订单
	 */
	@PostMapping("/addOrdOrder")
	@ApiOperation(value = "新增订单", notes = "新增订单")
	public WrapperResponse addOrdOrder(@Valid @RequestBody OrdOrder ordOrder)
	{		
		return WrapperResponse.success(ordOrderService.insertOrdOrder(ordOrder));
	}

	/**
	 * 修改保存订单
	 */
	@PostMapping("/editOrdOrder")
	@ApiOperation(value = "修改订单", notes = "修改订单")
	public WrapperResponse editSaveOrdOrder(@Valid @RequestBody OrdOrder ordOrder)
	{		
		return WrapperResponse.success(ordOrderService.updateOrdOrder(ordOrder));
	}
	
	/**
	 * 删除订单
	 */
	@PostMapping( "/removeOrdOrder/{id}")
	@ApiOperation(value = "删除订单", notes = "删除订单")
	public WrapperResponse removeOrdOrder(@PathVariable(value = "id") Long id)
	{		
		return WrapperResponse.success(ordOrderService.deleteOrdOrderById(id));
	}
	
}
