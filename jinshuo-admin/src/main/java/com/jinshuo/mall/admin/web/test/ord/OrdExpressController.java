package com.jinshuo.mall.admin.web.test.ord;

import com.jinshuo.mall.admin.application.dto.qry.ord.OrdExpressQry;
import com.jinshuo.mall.admin.application.service.ord.IOrdExpressService;
import com.jinshuo.mall.admin.domain.ord.OrdExpress;
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
@RequestMapping("/v1/wx/user/ordExpress")
@Api(tags = "")
@Slf4j
public class OrdExpressController
{

	@Autowired
	private IOrdExpressService ordExpressService;

	
	/**
	 * 查询列表
	 */
	@PostMapping("/listOrdExpress")
	@ApiOperation(value = "列表", notes = "列表")
	public WrapperResponse listOrdExpress(@Valid @RequestBody OrdExpressQry qry)
	{
		return WrapperResponse.success(ordExpressService.selectOrdExpressPage(qry));
	}
	
	/**
	 * 新增保存
	 */
	@PostMapping("/addOrdExpress")
	@ApiOperation(value = "新增", notes = "新增")
	public WrapperResponse addOrdExpress(@Valid @RequestBody OrdExpress ordExpress)
	{		
		return WrapperResponse.success(ordExpressService.insertOrdExpress(ordExpress));
	}

	/**
	 * 修改保存
	 */
	@PostMapping("/editOrdExpress")
	@ApiOperation(value = "修改", notes = "修改")
	public WrapperResponse editSaveOrdExpress(@Valid @RequestBody OrdExpress ordExpress)
	{		
		return WrapperResponse.success(ordExpressService.updateOrdExpress(ordExpress));
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/removeOrdExpress/{id}")
	@ApiOperation(value = "删除", notes = "删除")
	public WrapperResponse removeOrdExpress(@PathVariable(value = "id") Long id)
	{		
		return WrapperResponse.success(ordExpressService.deleteOrdExpressById(id));
	}
	
}
