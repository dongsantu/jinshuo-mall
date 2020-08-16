package com.jinshuo.mall.admin.web.test.ums;

import com.jinshuo.mall.admin.application.service.ums.IUmsUserService;
import com.jinshuo.mall.admin.domain.ums.UmsUser;
import com.jinshuo.mall.core.response.WrapperResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 用户账户 信息操作处理
 * 
 * @author dyh
 * @date 2020-08-12
 */
@RestController
@RequestMapping("/v1/wx/user/umsUser")
@Api(tags = "用户账户")
@Slf4j
public class UmsUserController
{

	@Autowired
	private IUmsUserService umsUserService;

	
	/**
	 * 查询用户账户列表
	 */
	@PostMapping("/listUmsUser")
	@ApiOperation(value = "用户账户列表", notes = "用户账户列表")
	public WrapperResponse listUmsUser(@RequestBody UmsUser qry)
	{
		return WrapperResponse.success(umsUserService.selectUmsUserPage(qry));
	}
	
	/**
	 * 新增保存用户账户
	 */
	@PostMapping("/addUmsUser")
	@ApiOperation(value = "新增用户账户", notes = "新增用户账户")
	public WrapperResponse addUmsUser(@RequestBody UmsUser umsUser)
	{		
		return WrapperResponse.success(umsUserService.insertUmsUser(umsUser));
	}

	/**
	 * 修改保存用户账户
	 */
	@PostMapping("/editUmsUser")
	@ApiOperation(value = "修改用户账户", notes = "修改用户账户")
	public WrapperResponse editSaveUmsUser(@RequestBody UmsUser umsUser)
	{		
		return WrapperResponse.success(umsUserService.updateUmsUser(umsUser));
	}
	
	/**
	 * 删除用户账户
	 */
	@PostMapping( "/removeUmsUser/{id}")
	@ApiOperation(value = "删除用户账户", notes = "删除用户账户")
	public WrapperResponse removeUmsUser(@PathVariable(value = "id") Long id)
	{		
		return WrapperResponse.success(umsUserService.deleteUmsUserById(id));
	}
	
}
