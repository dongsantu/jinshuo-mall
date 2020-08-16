package com.jinshuo.mall.admin.web.test.ums;

import com.jinshuo.mall.admin.application.service.ums.IUmsVisitorLogService;
import com.jinshuo.mall.admin.domain.ums.UmsVisitorLog;
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
@RequestMapping("/v1/wx/user/umsVisitorLog")
@Api(tags = "")
@Slf4j
public class UmsVisitorLogController
{

	@Autowired
	private IUmsVisitorLogService umsVisitorLogService;

	
	/**
	 * 查询列表
	 */
	@PostMapping("/listUmsVisitorLog")
	@ApiOperation(value = "列表", notes = "列表")
	public WrapperResponse listUmsVisitorLog(@RequestBody UmsVisitorLog qry)
	{
		return WrapperResponse.success(umsVisitorLogService.selectUmsVisitorLogPage(qry));
	}
	
	/**
	 * 新增保存
	 */
	@PostMapping("/addUmsVisitorLog")
	@ApiOperation(value = "新增", notes = "新增")
	public WrapperResponse addUmsVisitorLog(@RequestBody UmsVisitorLog umsVisitorLog)
	{		
		return WrapperResponse.success(umsVisitorLogService.insertUmsVisitorLog(umsVisitorLog));
	}

	/**
	 * 修改保存
	 */
	@PostMapping("/editUmsVisitorLog")
	@ApiOperation(value = "修改", notes = "修改")
	public WrapperResponse editSaveUmsVisitorLog(@RequestBody UmsVisitorLog umsVisitorLog)
	{		
		return WrapperResponse.success(umsVisitorLogService.updateUmsVisitorLog(umsVisitorLog));
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/removeUmsVisitorLog/{id}")
	@ApiOperation(value = "删除", notes = "删除")
	public WrapperResponse removeUmsVisitorLog(@PathVariable(value = "id") Long id)
	{		
		return WrapperResponse.success(umsVisitorLogService.deleteUmsVisitorLogById(id));
	}
	
}
