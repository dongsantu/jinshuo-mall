package com.jinshuo.mall.admin.web.test.ord;

import com.jinshuo.mall.admin.application.dto.qry.ord.OrdOrderCouponQry;
import com.jinshuo.mall.admin.application.service.ord.IOrdOrderCouponService;
import com.jinshuo.mall.admin.domain.ord.OrdOrderCoupon;
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
@RequestMapping("/v1/wx/user/ordOrderCoupon")
@Api(tags = "订单")
@Slf4j
public class OrdOrderCouponController
{

	@Autowired
	private IOrdOrderCouponService ordOrderCouponService;

	
	/**
	 * 查询订单列表
	 */
	@PostMapping("/listOrdOrderCoupon")
	@ApiOperation(value = "订单列表", notes = "订单列表")
	public WrapperResponse listOrdOrderCoupon(@Valid @RequestBody OrdOrderCouponQry qry)
	{
		return WrapperResponse.success(ordOrderCouponService.selectOrdOrderCouponPage(qry));
	}
	
	/**
	 * 新增保存订单
	 */
	@PostMapping("/addOrdOrderCoupon")
	@ApiOperation(value = "新增订单", notes = "新增订单")
	public WrapperResponse addOrdOrderCoupon(@Valid @RequestBody OrdOrderCoupon ordOrderCoupon)
	{		
		return WrapperResponse.success(ordOrderCouponService.insertOrdOrderCoupon(ordOrderCoupon));
	}

	/**
	 * 修改保存订单
	 */
	@PostMapping("/editOrdOrderCoupon")
	@ApiOperation(value = "修改订单", notes = "修改订单")
	public WrapperResponse editSaveOrdOrderCoupon(@Valid @RequestBody OrdOrderCoupon ordOrderCoupon)
	{		
		return WrapperResponse.success(ordOrderCouponService.updateOrdOrderCoupon(ordOrderCoupon));
	}
	
	/**
	 * 删除订单
	 */
	@PostMapping( "/removeOrdOrderCoupon/{id}")
	@ApiOperation(value = "删除订单", notes = "删除订单")
	public WrapperResponse removeOrdOrderCoupon(@PathVariable(value = "id") Long id)
	{		
		return WrapperResponse.success(ordOrderCouponService.deleteOrdOrderCouponById(id));
	}
	
}
