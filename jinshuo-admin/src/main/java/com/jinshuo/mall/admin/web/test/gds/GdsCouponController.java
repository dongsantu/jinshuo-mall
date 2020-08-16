package com.jinshuo.mall.admin.web.test.gds;

import com.jinshuo.mall.admin.application.service.gds.IGdsCouponService;
import com.jinshuo.mall.admin.domain.gds.GdsCoupon;
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
@RequestMapping("/v1/wx/user/gdsCoupon")
@Api(tags = "")
@Slf4j
public class GdsCouponController
{

	@Autowired
	private IGdsCouponService gdsCouponService;

	
	/**
	 * 查询列表
	 */
	@PostMapping("/listGdsCoupon")
	@ApiOperation(value = "列表", notes = "列表")
	public WrapperResponse listGdsCoupon(@Valid @RequestBody GdsCoupon qry)
	{
		return WrapperResponse.success(gdsCouponService.selectGdsCouponPage(qry));
	}
	
	/**
	 * 新增保存
	 */
	@PostMapping("/addGdsCoupon")
	@ApiOperation(value = "新增", notes = "新增")
	public WrapperResponse addGdsCoupon(@Valid @RequestBody GdsCoupon gdsCoupon)
	{		
		return WrapperResponse.success(gdsCouponService.insertGdsCoupon(gdsCoupon));
	}

	/**
	 * 修改保存
	 */
	@PostMapping("/editGdsCoupon")
	@ApiOperation(value = "修改", notes = "修改")
	public WrapperResponse editSaveGdsCoupon(@Valid @RequestBody GdsCoupon gdsCoupon)
	{		
		return WrapperResponse.success(gdsCouponService.updateGdsCoupon(gdsCoupon));
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/removeGdsCoupon/{id}")
	@ApiOperation(value = "删除", notes = "删除")
	public WrapperResponse removeGdsCoupon(@PathVariable(value = "id") Long id)
	{		
		return WrapperResponse.success(gdsCouponService.deleteGdsCouponById(id));
	}
	
}
