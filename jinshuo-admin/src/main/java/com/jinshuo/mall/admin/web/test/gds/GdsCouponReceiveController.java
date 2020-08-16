package com.jinshuo.mall.admin.web.test.gds;

import com.jinshuo.mall.admin.application.service.gds.IGdsCouponReceiveService;
import com.jinshuo.mall.admin.domain.gds.GdsCouponReceive;
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
 * @date 2020-08-12
 */
@RestController
@RequestMapping("/v1/wx/user/gdsCouponReceive")
@Api(tags = "")
@Slf4j
public class GdsCouponReceiveController
{

	@Autowired
	private IGdsCouponReceiveService gdsCouponReceiveService;

	
	/**
	 * 查询列表
	 */
	@PostMapping("/listGdsCouponReceive")
	@ApiOperation(value = "列表", notes = "列表")
	public WrapperResponse listGdsCouponReceive(@Valid @RequestBody GdsCouponReceive qry)
	{
		return WrapperResponse.success(gdsCouponReceiveService.selectGdsCouponReceivePage(qry));
	}
	
	/**
	 * 新增保存
	 */
	@PostMapping("/addGdsCouponReceive")
	@ApiOperation(value = "新增", notes = "新增")
	public WrapperResponse addGdsCouponReceive(@Valid @RequestBody GdsCouponReceive gdsCouponReceive)
	{		
		return WrapperResponse.success(gdsCouponReceiveService.insertGdsCouponReceive(gdsCouponReceive));
	}

	/**
	 * 修改保存
	 */
	@PostMapping("/editGdsCouponReceive")
	@ApiOperation(value = "修改", notes = "修改")
	public WrapperResponse editSaveGdsCouponReceive(@Valid @RequestBody GdsCouponReceive gdsCouponReceive)
	{		
		return WrapperResponse.success(gdsCouponReceiveService.updateGdsCouponReceive(gdsCouponReceive));
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/removeGdsCouponReceive/{id}")
	@ApiOperation(value = "删除", notes = "删除")
	public WrapperResponse removeGdsCouponReceive(@PathVariable(value = "id") Long id)
	{		
		return WrapperResponse.success(gdsCouponReceiveService.deleteGdsCouponReceiveById(id));
	}
	
}
