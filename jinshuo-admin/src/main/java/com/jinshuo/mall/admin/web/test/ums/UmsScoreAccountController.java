package com.jinshuo.mall.admin.web.test.ums;

import com.jinshuo.mall.admin.application.service.ums.IUmsScoreAccountService;
import com.jinshuo.mall.admin.domain.ums.UmsScoreAccount;
import com.jinshuo.mall.core.response.WrapperResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 会员积分账户 信息操作处理
 * 
 * @author dyh
 * @date 2020-08-12
 */
@RestController
@RequestMapping("/v1/wx/user/umsScoreAccount")
@Api(tags = "会员积分账户")
@Slf4j
public class UmsScoreAccountController
{

	@Autowired
	private IUmsScoreAccountService umsScoreAccountService;

	
	/**
	 * 查询会员积分账户列表
	 */
	@PostMapping("/listUmsScoreAccount")
	@ApiOperation(value = "会员积分账户列表", notes = "会员积分账户列表")
	public WrapperResponse listUmsScoreAccount(@RequestBody UmsScoreAccount qry)
	{
		return WrapperResponse.success(umsScoreAccountService.selectUmsScoreAccountPage(qry));
	}
	
	/**
	 * 新增保存会员积分账户
	 */
	@PostMapping("/addUmsScoreAccount")
	@ApiOperation(value = "新增会员积分账户", notes = "新增会员积分账户")
	public WrapperResponse addUmsScoreAccount(@RequestBody UmsScoreAccount umsScoreAccount)
	{		
		return WrapperResponse.success(umsScoreAccountService.insertUmsScoreAccount(umsScoreAccount));
	}

	/**
	 * 修改保存会员积分账户
	 */
	@PostMapping("/editUmsScoreAccount")
	@ApiOperation(value = "修改会员积分账户", notes = "修改会员积分账户")
	public WrapperResponse editSaveUmsScoreAccount(@RequestBody UmsScoreAccount umsScoreAccount)
	{		
		return WrapperResponse.success(umsScoreAccountService.updateUmsScoreAccount(umsScoreAccount));
	}
	
	/**
	 * 删除会员积分账户
	 */
	@PostMapping( "/removeUmsScoreAccount/{id}")
	@ApiOperation(value = "删除会员积分账户", notes = "删除会员积分账户")
	public WrapperResponse removeUmsScoreAccount(@PathVariable(value = "id") Long id)
	{		
		return WrapperResponse.success(umsScoreAccountService.deleteUmsScoreAccountById(id));
	}
	
}
