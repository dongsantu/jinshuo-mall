package com.jinshuo.mall.admin.web.test.ord;

import com.jinshuo.mall.admin.application.dto.qry.ord.OrdOrderAddressQry;
import com.jinshuo.mall.admin.application.service.ord.IOrdOrderAddressService;
import com.jinshuo.mall.admin.domain.ord.OrdOrderAddress;
import com.jinshuo.mall.core.response.WrapperResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * 订单收货地址 信息操作处理
 * 
 * @author dyh
 * @date 2020-08-10
 */
@RestController
@RequestMapping("/v1/wx/user/ordOrderAddress")
@Api(tags = "订单收货地址")
@Slf4j
public class OrdOrderAddressController
{

	@Autowired
	private IOrdOrderAddressService ordOrderAddressService;

	
	/**
	 * 查询订单收货地址列表
	 */
	@PostMapping("/listOrdOrderAddress")
	@ApiOperation(value = "订单收货地址列表", notes = "订单收货地址列表")
	public WrapperResponse listOrdOrderAddress(@Valid @RequestBody OrdOrderAddressQry qry)
	{
		return WrapperResponse.success(ordOrderAddressService.selectOrdOrderAddressPage(qry));
	}
	
	/**
	 * 新增保存订单收货地址
	 */
	@PostMapping("/addOrdOrderAddress")
	@ApiOperation(value = "新增订单收货地址", notes = "新增订单收货地址")
	public WrapperResponse addOrdOrderAddress(@Valid @RequestBody OrdOrderAddress ordOrderAddress)
	{		
		return WrapperResponse.success(ordOrderAddressService.insertOrdOrderAddress(ordOrderAddress));
	}

	/**
	 * 修改保存订单收货地址
	 */
	@PostMapping("/editOrdOrderAddress")
	@ApiOperation(value = "修改订单收货地址", notes = "修改订单收货地址")
	public WrapperResponse editSaveOrdOrderAddress(@Valid @RequestBody OrdOrderAddress ordOrderAddress)
	{		
		return WrapperResponse.success(ordOrderAddressService.updateOrdOrderAddress(ordOrderAddress));
	}
	
	/**
	 * 删除订单收货地址
	 */
	@PostMapping( "/removeOrdOrderAddress/{id}")
	@ApiOperation(value = "删除订单收货地址", notes = "删除订单收货地址")
	public WrapperResponse removeOrdOrderAddress(@PathVariable(value = "id") Long id)
	{		
		return WrapperResponse.success(ordOrderAddressService.deleteOrdOrderAddressById(id));
	}
	
}
