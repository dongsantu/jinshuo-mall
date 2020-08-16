package com.jinshuo.mall.admin.web.test.ord;

import com.jinshuo.mall.admin.application.dto.qry.ord.OrdExpressCodeQry;
import com.jinshuo.mall.admin.application.service.ord.IOrdExpressCodeService;
import com.jinshuo.mall.admin.domain.ord.OrdExpressCode;
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
@RequestMapping("/v1/wx/user/ordExpressCode")
@Api(tags = "")
@Slf4j
public class OrdExpressCodeController
{

	@Autowired
	private IOrdExpressCodeService ordExpressCodeService;

	
	/**
	 * 查询列表
	 */
	@PostMapping("/listOrdExpressCode")
	@ApiOperation(value = "列表", notes = "列表")
	public WrapperResponse listOrdExpressCode(@Valid @RequestBody OrdExpressCodeQry qry)
	{
		return WrapperResponse.success(ordExpressCodeService.selectOrdExpressCodePage(qry));
	}
	
	/**
	 * 新增保存
	 */
	@PostMapping("/addOrdExpressCode")
	@ApiOperation(value = "新增", notes = "新增")
	public WrapperResponse addOrdExpressCode(@Valid @RequestBody OrdExpressCode ordExpressCode)
	{		
		return WrapperResponse.success(ordExpressCodeService.insertOrdExpressCode(ordExpressCode));
	}

	/**
	 * 修改保存
	 */
	@PostMapping("/editOrdExpressCode")
	@ApiOperation(value = "修改", notes = "修改")
	public WrapperResponse editSaveOrdExpressCode(@Valid @RequestBody OrdExpressCode ordExpressCode)
	{		
		return WrapperResponse.success(ordExpressCodeService.updateOrdExpressCode(ordExpressCode));
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/removeOrdExpressCode/{id}")
	@ApiOperation(value = "删除", notes = "删除")
	public WrapperResponse removeOrdExpressCode(@PathVariable(value = "id") Long id)
	{		
		return WrapperResponse.success(ordExpressCodeService.deleteOrdExpressCodeById(id));
	}
	
}
