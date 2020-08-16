package com.jinshuo.mall.admin.web.test.ums;

import com.jinshuo.mall.admin.application.service.ums.IUmsMemberService;
import com.jinshuo.mall.admin.domain.ums.UmsMember;
import com.jinshuo.mall.core.response.WrapperResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 会员 信息操作处理
 * 
 * @author dyh
 * @date 2020-08-12
 */
@RestController
@RequestMapping("/v1/wx/user/umsMember")
@Api(tags = "会员")
@Slf4j
public class UmsMemberController
{

	@Autowired
	private IUmsMemberService umsMemberService;

	
	/**
	 * 查询会员列表
	 */
	@PostMapping("/listUmsMember")
	@ApiOperation(value = "会员列表", notes = "会员列表")
	public WrapperResponse listUmsMember(@RequestBody UmsMember qry)
	{
		return WrapperResponse.success(umsMemberService.selectUmsMemberPage(qry));
	}
	
	/**
	 * 新增保存会员
	 */
	@PostMapping("/addUmsMember")
	@ApiOperation(value = "新增会员", notes = "新增会员")
	public WrapperResponse addUmsMember(@RequestBody UmsMember umsMember)
	{		
		return WrapperResponse.success(umsMemberService.insertUmsMember(umsMember));
	}

	/**
	 * 修改保存会员
	 */
	@PostMapping("/editUmsMember")
	@ApiOperation(value = "修改会员", notes = "修改会员")
	public WrapperResponse editSaveUmsMember(@RequestBody UmsMember umsMember)
	{		
		return WrapperResponse.success(umsMemberService.updateUmsMember(umsMember));
	}
	
	/**
	 * 删除会员
	 */
	@PostMapping( "/removeUmsMember/{id}")
	@ApiOperation(value = "删除会员", notes = "删除会员")
	public WrapperResponse removeUmsMember(@PathVariable(value = "id") Long id)
	{		
		return WrapperResponse.success(umsMemberService.deleteUmsMemberById(id));
	}
	
}
