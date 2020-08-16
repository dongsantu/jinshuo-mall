package com.jinshuo.mall.admin.web.test.gds;

import com.jinshuo.mall.admin.application.service.gds.IGdsTopicService;
import com.jinshuo.mall.admin.domain.gds.GdsTopic;
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
@RequestMapping("/v1/wx/user/gdsTopic")
@Api(tags = "")
@Slf4j
public class GdsTopicController
{

	@Autowired
	private IGdsTopicService gdsTopicService;

	
	/**
	 * 查询列表
	 */
	@PostMapping("/listGdsTopic")
	@ApiOperation(value = "列表", notes = "列表")
	public WrapperResponse listGdsTopic(@Valid @RequestBody GdsTopic qry)
	{
		return WrapperResponse.success(gdsTopicService.selectGdsTopicPage(qry));
	}
	
	/**
	 * 新增保存
	 */
	@PostMapping("/addGdsTopic")
	@ApiOperation(value = "新增", notes = "新增")
	public WrapperResponse addGdsTopic(@Valid @RequestBody GdsTopic gdsTopic)
	{		
		return WrapperResponse.success(gdsTopicService.insertGdsTopic(gdsTopic));
	}

	/**
	 * 修改保存
	 */
	@PostMapping("/editGdsTopic")
	@ApiOperation(value = "修改", notes = "修改")
	public WrapperResponse editSaveGdsTopic(@Valid @RequestBody GdsTopic gdsTopic)
	{		
		return WrapperResponse.success(gdsTopicService.updateGdsTopic(gdsTopic));
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/removeGdsTopic/{id}")
	@ApiOperation(value = "删除", notes = "删除")
	public WrapperResponse removeGdsTopic(@PathVariable(value = "id") Long id)
	{		
		return WrapperResponse.success(gdsTopicService.deleteGdsTopicById(id));
	}
	
}
