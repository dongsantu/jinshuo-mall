package com.jinshuo.mall.admin.web.test.ums;

import com.jinshuo.mall.admin.application.service.ums.IUmsMemberAddressService;
import com.jinshuo.mall.admin.domain.ums.UmsMemberAddress;
import com.jinshuo.mall.core.response.WrapperResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 会员收货地址 信息操作处理
 * 
 * @author dyh
 * @date 2020-08-12
 */
@RestController
@RequestMapping("/v1/wx/user/umsMemberAddress")
@Api(tags = "会员收货地址")
@Slf4j
public class UmsMemberAddressController
{

	@Autowired
	private IUmsMemberAddressService umsMemberAddressService;

	
	/**
	 * 查询会员收货地址列表
	 */
	@PostMapping("/listUmsMemberAddress")
	@ApiOperation(value = "会员收货地址列表", notes = "会员收货地址列表")
	public WrapperResponse listUmsMemberAddress(@RequestBody UmsMemberAddress qry)
	{
		return WrapperResponse.success(umsMemberAddressService.selectUmsMemberAddressPage(qry));
	}
	
	/**
	 * 新增保存会员收货地址
	 */
	@PostMapping("/addUmsMemberAddress")
	@ApiOperation(value = "新增会员收货地址", notes = "新增会员收货地址")
	public WrapperResponse addUmsMemberAddress(@RequestBody UmsMemberAddress umsMemberAddress)
	{		
		return WrapperResponse.success(umsMemberAddressService.insertUmsMemberAddress(umsMemberAddress));
	}

	/**
	 * 修改保存会员收货地址
	 */
	@PostMapping("/editUmsMemberAddress")
	@ApiOperation(value = "修改会员收货地址", notes = "修改会员收货地址")
	public WrapperResponse editSaveUmsMemberAddress(@RequestBody UmsMemberAddress umsMemberAddress)
	{		
		return WrapperResponse.success(umsMemberAddressService.updateUmsMemberAddress(umsMemberAddress));
	}
	
	/**
	 * 删除会员收货地址
	 */
	@PostMapping( "/removeUmsMemberAddress/{id}")
	@ApiOperation(value = "删除会员收货地址", notes = "删除会员收货地址")
	public WrapperResponse removeUmsMemberAddress(@PathVariable(value = "id") Long id)
	{		
		return WrapperResponse.success(umsMemberAddressService.deleteUmsMemberAddressById(id));
	}
	
}
