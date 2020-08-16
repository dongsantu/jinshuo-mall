package com.jinshuo.mall.admin.web.test.ord;

import com.jinshuo.mall.admin.application.dto.qry.ord.OrdMcSetOrderQry;
import com.jinshuo.mall.admin.application.service.ord.IOrdMcSetOrderService;
import com.jinshuo.mall.admin.domain.ord.OrdMcSetOrder;
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
@RequestMapping("/v1/wx/user/ordMcSetOrder")
@Api(tags = "")
@Slf4j
public class OrdMcSetOrderController
{

	@Autowired
	private IOrdMcSetOrderService ordMcSetOrderService;

	
	/**
	 * 查询列表
	 */
	@PostMapping("/listOrdMcSetOrder")
	@ApiOperation(value = "列表", notes = "列表")
	public WrapperResponse listOrdMcSetOrder(@Valid @RequestBody OrdMcSetOrderQry qry)
	{
		return WrapperResponse.success(ordMcSetOrderService.selectOrdMcSetOrderPage(qry));
	}
	
	/**
	 * 新增保存
	 */
	@PostMapping("/addOrdMcSetOrder")
	@ApiOperation(value = "新增", notes = "新增")
	public WrapperResponse addOrdMcSetOrder(@Valid @RequestBody OrdMcSetOrder ordMcSetOrder)
	{		
		return WrapperResponse.success(ordMcSetOrderService.insertOrdMcSetOrder(ordMcSetOrder));
	}

	/**
	 * 修改保存
	 */
	@PostMapping("/editOrdMcSetOrder")
	@ApiOperation(value = "修改", notes = "修改")
	public WrapperResponse editSaveOrdMcSetOrder(@Valid @RequestBody OrdMcSetOrder ordMcSetOrder)
	{		
		return WrapperResponse.success(ordMcSetOrderService.updateOrdMcSetOrder(ordMcSetOrder));
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/removeOrdMcSetOrder/{id}")
	@ApiOperation(value = "删除", notes = "删除")
	public WrapperResponse removeOrdMcSetOrder(@PathVariable(value = "id") Long id)
	{		
		return WrapperResponse.success(ordMcSetOrderService.deleteOrdMcSetOrderById(id));
	}
	
}
