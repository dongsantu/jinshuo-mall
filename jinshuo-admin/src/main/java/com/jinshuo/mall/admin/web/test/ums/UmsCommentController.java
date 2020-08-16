package com.jinshuo.mall.admin.web.test.ums;

import com.jinshuo.mall.admin.application.service.ums.IUmsCommentService;
import com.jinshuo.mall.admin.domain.ums.UmsComment;
import com.jinshuo.mall.core.response.WrapperResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 用户评论 信息操作处理
 * 
 * @author dyh
 * @date 2020-08-12
 */
@RestController
@RequestMapping("/v1/wx/user/umsComment")
@Api(tags = "用户评论")
@Slf4j
public class UmsCommentController
{

	@Autowired
	private IUmsCommentService umsCommentService;

	
	/**
	 * 查询用户评论列表
	 */
	@PostMapping("/listUmsComment")
	@ApiOperation(value = "用户评论列表", notes = "用户评论列表")
	public WrapperResponse listUmsComment(@RequestBody UmsComment qry)
	{
		return WrapperResponse.success(umsCommentService.selectUmsCommentPage(qry));
	}
	
	/**
	 * 新增保存用户评论
	 */
	@PostMapping("/addUmsComment")
	@ApiOperation(value = "新增用户评论", notes = "新增用户评论")
	public WrapperResponse addUmsComment(@RequestBody UmsComment umsComment)
	{		
		return WrapperResponse.success(umsCommentService.insertUmsComment(umsComment));
	}

	/**
	 * 修改保存用户评论
	 */
	@PostMapping("/editUmsComment")
	@ApiOperation(value = "修改用户评论", notes = "修改用户评论")
	public WrapperResponse editSaveUmsComment(@RequestBody UmsComment umsComment)
	{		
		return WrapperResponse.success(umsCommentService.updateUmsComment(umsComment));
	}
	
	/**
	 * 删除用户评论
	 */
	@PostMapping( "/removeUmsComment/{id}")
	@ApiOperation(value = "删除用户评论", notes = "删除用户评论")
	public WrapperResponse removeUmsComment(@PathVariable(value = "id") Long id)
	{		
		return WrapperResponse.success(umsCommentService.deleteUmsCommentById(id));
	}
	
}
