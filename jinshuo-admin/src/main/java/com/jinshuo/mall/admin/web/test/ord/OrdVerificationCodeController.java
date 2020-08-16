package com.jinshuo.mall.admin.web.test.ord;

import com.jinshuo.mall.admin.application.dto.qry.ord.OrdVerificationCodeQry;
import com.jinshuo.mall.admin.application.service.ord.IOrdVerificationCodeService;
import com.jinshuo.mall.admin.domain.ord.OrdVerificationCode;
import com.jinshuo.mall.core.response.WrapperResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * 订单验证码 信息操作处理
 * 
 * @author dyh
 * @date 2020-08-10
 */
@RestController
@RequestMapping("/v1/wx/user/ordVerificationCode")
@Api(tags = "订单验证码")
@Slf4j
public class OrdVerificationCodeController
{

	@Autowired
	private IOrdVerificationCodeService ordVerificationCodeService;

	
	/**
	 * 查询订单验证码列表
	 */
	@PostMapping("/listOrdVerificationCode")
	@ApiOperation(value = "订单验证码列表", notes = "订单验证码列表")
	public WrapperResponse listOrdVerificationCode(@Valid @RequestBody OrdVerificationCodeQry qry)
	{
		return WrapperResponse.success(ordVerificationCodeService.selectOrdVerificationCodePage(qry));
	}
	
	/**
	 * 新增保存订单验证码
	 */
	@PostMapping("/addOrdVerificationCode")
	@ApiOperation(value = "新增订单验证码", notes = "新增订单验证码")
	public WrapperResponse addOrdVerificationCode(@Valid @RequestBody OrdVerificationCode ordVerificationCode)
	{		
		return WrapperResponse.success(ordVerificationCodeService.insertOrdVerificationCode(ordVerificationCode));
	}

	/**
	 * 修改保存订单验证码
	 */
	@PostMapping("/editOrdVerificationCode")
	@ApiOperation(value = "修改订单验证码", notes = "修改订单验证码")
	public WrapperResponse editSaveOrdVerificationCode(@Valid @RequestBody OrdVerificationCode ordVerificationCode)
	{		
		return WrapperResponse.success(ordVerificationCodeService.updateOrdVerificationCode(ordVerificationCode));
	}
	
	/**
	 * 删除订单验证码
	 */
	@PostMapping( "/removeOrdVerificationCode/{id}")
	@ApiOperation(value = "删除订单验证码", notes = "删除订单验证码")
	public WrapperResponse removeOrdVerificationCode(@PathVariable(value = "id") Long id)
	{		
		return WrapperResponse.success(ordVerificationCodeService.deleteOrdVerificationCodeById(id));
	}
	
}
