package com.jinshuo.mall.admin.web.test.ord;

import com.jinshuo.mall.admin.application.dto.qry.ord.OrdOrderSampleQry;
import com.jinshuo.mall.admin.application.service.ord.IOrdOrderSampleService;
import com.jinshuo.mall.admin.domain.ord.OrdOrderSample;
import com.jinshuo.mall.core.response.WrapperResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * 样品订单 信息操作处理
 * 
 * @author dyh
 * @date 2020-08-10
 */
@RestController
@RequestMapping("/v1/wx/user/ordOrderSample")
@Api(tags = "样品订单")
@Slf4j
public class OrdOrderSampleController
{

	@Autowired
	private IOrdOrderSampleService ordOrderSampleService;

	
	/**
	 * 查询样品订单列表
	 */
	@PostMapping("/listOrdOrderSample")
	@ApiOperation(value = "样品订单列表", notes = "样品订单列表")
	public WrapperResponse listOrdOrderSample(@Valid @RequestBody OrdOrderSampleQry qry)
	{
		return WrapperResponse.success(ordOrderSampleService.selectOrdOrderSamplePage(qry));
	}
	
	/**
	 * 新增保存样品订单
	 */
	@PostMapping("/addOrdOrderSample")
	@ApiOperation(value = "新增样品订单", notes = "新增样品订单")
	public WrapperResponse addOrdOrderSample(@Valid @RequestBody OrdOrderSample ordOrderSample)
	{		
		return WrapperResponse.success(ordOrderSampleService.insertOrdOrderSample(ordOrderSample));
	}

	/**
	 * 修改保存样品订单
	 */
	@PostMapping("/editOrdOrderSample")
	@ApiOperation(value = "修改样品订单", notes = "修改样品订单")
	public WrapperResponse editSaveOrdOrderSample(@Valid @RequestBody OrdOrderSample ordOrderSample)
	{		
		return WrapperResponse.success(ordOrderSampleService.updateOrdOrderSample(ordOrderSample));
	}
	
	/**
	 * 删除样品订单
	 */
	@PostMapping( "/removeOrdOrderSample/{id}")
	@ApiOperation(value = "删除样品订单", notes = "删除样品订单")
	public WrapperResponse removeOrdOrderSample(@PathVariable(value = "id") Long id)
	{		
		return WrapperResponse.success(ordOrderSampleService.deleteOrdOrderSampleById(id));
	}
	
}
