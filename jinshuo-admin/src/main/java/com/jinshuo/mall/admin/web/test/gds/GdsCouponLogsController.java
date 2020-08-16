package com.jinshuo.mall.admin.web.test.gds;

import com.jinshuo.mall.admin.application.service.gds.IGdsCouponLogsService;
import com.jinshuo.mall.admin.domain.gds.GdsCouponLogs;
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
@RequestMapping("/v1/wx/user/gdsCouponLogs")
@Api(tags = "")
@Slf4j
public class GdsCouponLogsController
{

	@Autowired
	private IGdsCouponLogsService gdsCouponLogsService;

	
	/**
	 * 查询列表
	 */
	@PostMapping("/listGdsCouponLogs")
	@ApiOperation(value = "列表", notes = "列表")
	public WrapperResponse listGdsCouponLogs(@Valid @RequestBody GdsCouponLogs qry)
	{
		return WrapperResponse.success(gdsCouponLogsService.selectGdsCouponLogsPage(qry));
	}
	
	/**
	 * 新增保存
	 */
	@PostMapping("/addGdsCouponLogs")
	@ApiOperation(value = "新增", notes = "新增")
	public WrapperResponse addGdsCouponLogs(@Valid @RequestBody GdsCouponLogs gdsCouponLogs)
	{		
		return WrapperResponse.success(gdsCouponLogsService.insertGdsCouponLogs(gdsCouponLogs));
	}

	/**
	 * 修改保存
	 */
	@PostMapping("/editGdsCouponLogs")
	@ApiOperation(value = "修改", notes = "修改")
	public WrapperResponse editSaveGdsCouponLogs(@Valid @RequestBody GdsCouponLogs gdsCouponLogs)
	{		
		return WrapperResponse.success(gdsCouponLogsService.updateGdsCouponLogs(gdsCouponLogs));
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/removeGdsCouponLogs/{id}")
	@ApiOperation(value = "删除", notes = "删除")
	public WrapperResponse removeGdsCouponLogs(@PathVariable(value = "id") Long id)
	{		
		return WrapperResponse.success(gdsCouponLogsService.deleteGdsCouponLogsById(id));
	}
	
}
