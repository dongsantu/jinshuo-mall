package com.jinshuo.mall.admin.web.test.ord;

import com.jinshuo.mall.admin.application.dto.qry.ord.OrdMcSetOrderDeliveryQry;
import com.jinshuo.mall.admin.application.service.ord.IOrdMcSetOrderDeliveryService;
import com.jinshuo.mall.admin.domain.ord.OrdMcSetOrderDelivery;
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
@RequestMapping("/v1/wx/user/ordMcSetOrderDelivery")
@Api(tags = "")
@Slf4j
public class OrdMcSetOrderDeliveryController
{

	@Autowired
	private IOrdMcSetOrderDeliveryService ordMcSetOrderDeliveryService;

	
	/**
	 * 查询列表
	 */
	@PostMapping("/listOrdMcSetOrderDelivery")
	@ApiOperation(value = "列表", notes = "列表")
	public WrapperResponse listOrdMcSetOrderDelivery(@Valid @RequestBody OrdMcSetOrderDeliveryQry qry)
	{
		return WrapperResponse.success(ordMcSetOrderDeliveryService.selectOrdMcSetOrderDeliveryPage(qry));
	}
	
	/**
	 * 新增保存
	 */
	@PostMapping("/addOrdMcSetOrderDelivery")
	@ApiOperation(value = "新增", notes = "新增")
	public WrapperResponse addOrdMcSetOrderDelivery(@Valid @RequestBody OrdMcSetOrderDelivery ordMcSetOrderDelivery)
	{		
		return WrapperResponse.success(ordMcSetOrderDeliveryService.insertOrdMcSetOrderDelivery(ordMcSetOrderDelivery));
	}

	/**
	 * 修改保存
	 */
	@PostMapping("/editOrdMcSetOrderDelivery")
	@ApiOperation(value = "修改", notes = "修改")
	public WrapperResponse editSaveOrdMcSetOrderDelivery(@Valid @RequestBody OrdMcSetOrderDelivery ordMcSetOrderDelivery)
	{		
		return WrapperResponse.success(ordMcSetOrderDeliveryService.updateOrdMcSetOrderDelivery(ordMcSetOrderDelivery));
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/removeOrdMcSetOrderDelivery/{id}")
	@ApiOperation(value = "删除", notes = "删除")
	public WrapperResponse removeOrdMcSetOrderDelivery(@PathVariable(value = "id") Long id)
	{		
		return WrapperResponse.success(ordMcSetOrderDeliveryService.deleteOrdMcSetOrderDeliveryById(id));
	}
	
}
