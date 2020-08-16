package com.jinshuo.mall.admin.web.test.ord;

import com.jinshuo.mall.admin.application.dto.qry.ord.OrdOrderDetailQry;
import com.jinshuo.mall.admin.application.service.ord.IOrdOrderDetailService;
import com.jinshuo.mall.admin.domain.ord.OrdOrderDetail;
import com.jinshuo.mall.core.response.WrapperResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * 订单详情 信息操作处理
 * 
 * @author dyh
 * @date 2020-08-10
 */
@RestController
@RequestMapping("/v1/wx/user/ordOrderDetail")
@Api(tags = "订单详情")
@Slf4j
public class OrdOrderDetailController
{

	@Autowired
	private IOrdOrderDetailService ordOrderDetailService;

	
	/**
	 * 查询订单详情列表
	 */
	@PostMapping("/listOrdOrderDetail")
	@ApiOperation(value = "订单详情列表", notes = "订单详情列表")
	public WrapperResponse listOrdOrderDetail(@Valid @RequestBody OrdOrderDetailQry qry)
	{
		return WrapperResponse.success(ordOrderDetailService.selectOrdOrderDetailPage(qry));
	}
	
	/**
	 * 新增保存订单详情
	 */
	@PostMapping("/addOrdOrderDetail")
	@ApiOperation(value = "新增订单详情", notes = "新增订单详情")
	public WrapperResponse addOrdOrderDetail(@Valid @RequestBody OrdOrderDetail ordOrderDetail)
	{		
		return WrapperResponse.success(ordOrderDetailService.insertOrdOrderDetail(ordOrderDetail));
	}

	/**
	 * 修改保存订单详情
	 */
	@PostMapping("/editOrdOrderDetail")
	@ApiOperation(value = "修改订单详情", notes = "修改订单详情")
	public WrapperResponse editSaveOrdOrderDetail(@Valid @RequestBody OrdOrderDetail ordOrderDetail)
	{		
		return WrapperResponse.success(ordOrderDetailService.updateOrdOrderDetail(ordOrderDetail));
	}
	
	/**
	 * 删除订单详情
	 */
	@PostMapping( "/removeOrdOrderDetail/{id}")
	@ApiOperation(value = "删除订单详情", notes = "删除订单详情")
	public WrapperResponse removeOrdOrderDetail(@PathVariable(value = "id") Long id)
	{		
		return WrapperResponse.success(ordOrderDetailService.deleteOrdOrderDetailById(id));
	}
	
}
