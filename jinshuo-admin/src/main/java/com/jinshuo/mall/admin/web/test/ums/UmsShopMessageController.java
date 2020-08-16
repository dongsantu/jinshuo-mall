package com.jinshuo.mall.admin.web.test.ums;

import com.jinshuo.mall.admin.application.service.ums.IUmsShopMessageService;
import com.jinshuo.mall.admin.domain.ums.UmsShopMessage;
import com.jinshuo.mall.core.response.WrapperResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 *  信息操作处理
 * 
 * @author dyh
 * @date 2020-08-12
 */
@RestController
@RequestMapping("/v1/wx/user/umsShopMessage")
@Api(tags = "")
@Slf4j
public class UmsShopMessageController
{

	@Autowired
	private IUmsShopMessageService umsShopMessageService;

	
	/**
	 * 查询列表
	 */
	@PostMapping("/listUmsShopMessage")
	@ApiOperation(value = "列表", notes = "列表")
	public WrapperResponse listUmsShopMessage(@RequestBody UmsShopMessage qry)
	{
		return WrapperResponse.success(umsShopMessageService.selectUmsShopMessagePage(qry));
	}
	
	/**
	 * 新增保存
	 */
	@PostMapping("/addUmsShopMessage")
	@ApiOperation(value = "新增", notes = "新增")
	public WrapperResponse addUmsShopMessage(@RequestBody UmsShopMessage umsShopMessage)
	{		
		return WrapperResponse.success(umsShopMessageService.insertUmsShopMessage(umsShopMessage));
	}

	/**
	 * 修改保存
	 */
	@PostMapping("/editUmsShopMessage")
	@ApiOperation(value = "修改", notes = "修改")
	public WrapperResponse editSaveUmsShopMessage(@RequestBody UmsShopMessage umsShopMessage)
	{		
		return WrapperResponse.success(umsShopMessageService.updateUmsShopMessage(umsShopMessage));
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/removeUmsShopMessage/{id}")
	@ApiOperation(value = "删除", notes = "删除")
	public WrapperResponse removeUmsShopMessage(@PathVariable(value = "id") Long id)
	{		
		return WrapperResponse.success(umsShopMessageService.deleteUmsShopMessageById(id));
	}
	
}
