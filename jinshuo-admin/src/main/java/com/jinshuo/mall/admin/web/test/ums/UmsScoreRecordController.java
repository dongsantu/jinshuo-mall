package com.jinshuo.mall.admin.web.test.ums;

import com.jinshuo.mall.admin.application.service.ums.IUmsScoreRecordService;
import com.jinshuo.mall.admin.domain.ums.UmsScoreRecord;
import com.jinshuo.mall.core.response.WrapperResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 积分流水 信息操作处理
 * 
 * @author dyh
 * @date 2020-08-12
 */
@RestController
@RequestMapping("/v1/wx/user/umsScoreRecord")
@Api(tags = "积分流水")
@Slf4j
public class UmsScoreRecordController
{

	@Autowired
	private IUmsScoreRecordService umsScoreRecordService;

	
	/**
	 * 查询积分流水列表
	 */
	@PostMapping("/listUmsScoreRecord")
	@ApiOperation(value = "积分流水列表", notes = "积分流水列表")
	public WrapperResponse listUmsScoreRecord(@RequestBody UmsScoreRecord qry)
	{
		return WrapperResponse.success(umsScoreRecordService.selectUmsScoreRecordPage(qry));
	}
	
	/**
	 * 新增保存积分流水
	 */
	@PostMapping("/addUmsScoreRecord")
	@ApiOperation(value = "新增积分流水", notes = "新增积分流水")
	public WrapperResponse addUmsScoreRecord(@RequestBody UmsScoreRecord umsScoreRecord)
	{		
		return WrapperResponse.success(umsScoreRecordService.insertUmsScoreRecord(umsScoreRecord));
	}

	/**
	 * 修改保存积分流水
	 */
	@PostMapping("/editUmsScoreRecord")
	@ApiOperation(value = "修改积分流水", notes = "修改积分流水")
	public WrapperResponse editSaveUmsScoreRecord(@RequestBody UmsScoreRecord umsScoreRecord)
	{		
		return WrapperResponse.success(umsScoreRecordService.updateUmsScoreRecord(umsScoreRecord));
	}
	
	/**
	 * 删除积分流水
	 */
	@PostMapping( "/removeUmsScoreRecord/{id}")
	@ApiOperation(value = "删除积分流水", notes = "删除积分流水")
	public WrapperResponse removeUmsScoreRecord(@PathVariable(value = "id") Long id)
	{		
		return WrapperResponse.success(umsScoreRecordService.deleteUmsScoreRecordById(id));
	}
	
}
