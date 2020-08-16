package com.jinshuo.mall.admin.web.test.gds;

import com.jinshuo.mall.admin.application.service.gds.IGdsCouponItemService;
import com.jinshuo.mall.admin.domain.gds.GdsCouponItem;
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
@RequestMapping("/v1/wx/user/gdsCouponItem")
@Api(tags = "")
@Slf4j
public class GdsCouponItemController
{

	@Autowired
	private IGdsCouponItemService gdsCouponItemService;

	
	/**
	 * 查询列表
	 */
	@PostMapping("/listGdsCouponItem")
	@ApiOperation(value = "列表", notes = "列表")
	public WrapperResponse listGdsCouponItem(@Valid @RequestBody GdsCouponItem qry)
	{
		return WrapperResponse.success(gdsCouponItemService.selectGdsCouponItemPage(qry));
	}
	
	/**
	 * 新增保存
	 */
	@PostMapping("/addGdsCouponItem")
	@ApiOperation(value = "新增", notes = "新增")
	public WrapperResponse addGdsCouponItem(@Valid @RequestBody GdsCouponItem gdsCouponItem)
	{		
		return WrapperResponse.success(gdsCouponItemService.insertGdsCouponItem(gdsCouponItem));
	}

	/**
	 * 修改保存
	 */
	@PostMapping("/editGdsCouponItem")
	@ApiOperation(value = "修改", notes = "修改")
	public WrapperResponse editSaveGdsCouponItem(@Valid @RequestBody GdsCouponItem gdsCouponItem)
	{		
		return WrapperResponse.success(gdsCouponItemService.updateGdsCouponItem(gdsCouponItem));
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/removeGdsCouponItem/{id}")
	@ApiOperation(value = "删除", notes = "删除")
	public WrapperResponse removeGdsCouponItem(@PathVariable(value = "id") Long id)
	{		
		return WrapperResponse.success(gdsCouponItemService.deleteGdsCouponItemById(id));
	}
	
}
