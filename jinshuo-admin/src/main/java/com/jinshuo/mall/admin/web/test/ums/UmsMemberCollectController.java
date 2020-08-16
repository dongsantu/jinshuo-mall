package com.jinshuo.mall.admin.web.test.ums;

import com.jinshuo.mall.admin.application.service.ums.IUmsMemberCollectService;
import com.jinshuo.mall.admin.domain.ums.UmsMemberCollect;
import com.jinshuo.mall.core.response.WrapperResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 我的收藏 信息操作处理
 * 
 * @author dyh
 * @date 2020-08-12
 */
@RestController
@RequestMapping("/v1/wx/user/umsMemberCollect")
@Api(tags = "我的收藏")
@Slf4j
public class UmsMemberCollectController
{

	@Autowired
	private IUmsMemberCollectService umsMemberCollectService;

	
	/**
	 * 查询我的收藏列表
	 */
	@PostMapping("/listUmsMemberCollect")
	@ApiOperation(value = "我的收藏列表", notes = "我的收藏列表")
	public WrapperResponse listUmsMemberCollect(@RequestBody UmsMemberCollect qry)
	{
		return WrapperResponse.success(umsMemberCollectService.selectUmsMemberCollectPage(qry));
	}
	
	/**
	 * 新增保存我的收藏
	 */
	@PostMapping("/addUmsMemberCollect")
	@ApiOperation(value = "新增我的收藏", notes = "新增我的收藏")
	public WrapperResponse addUmsMemberCollect(@RequestBody UmsMemberCollect umsMemberCollect)
	{		
		return WrapperResponse.success(umsMemberCollectService.insertUmsMemberCollect(umsMemberCollect));
	}

	/**
	 * 修改保存我的收藏
	 */
	@PostMapping("/editUmsMemberCollect")
	@ApiOperation(value = "修改我的收藏", notes = "修改我的收藏")
	public WrapperResponse editSaveUmsMemberCollect(@RequestBody UmsMemberCollect umsMemberCollect)
	{		
		return WrapperResponse.success(umsMemberCollectService.updateUmsMemberCollect(umsMemberCollect));
	}
	
	/**
	 * 删除我的收藏
	 */
	@PostMapping( "/removeUmsMemberCollect/{id}")
	@ApiOperation(value = "删除我的收藏", notes = "删除我的收藏")
	public WrapperResponse removeUmsMemberCollect(@PathVariable(value = "id") Long id)
	{		
		return WrapperResponse.success(umsMemberCollectService.deleteUmsMemberCollectById(id));
	}
	
}
