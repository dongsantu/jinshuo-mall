package com.jinshuo.mall.admin.web.test.ums;

import com.jinshuo.mall.admin.application.service.ums.IUmsSupplierService;
import com.jinshuo.mall.admin.domain.ums.UmsSupplier;
import com.jinshuo.mall.core.response.WrapperResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 供应商 信息操作处理
 * 
 * @author dyh
 * @date 2020-08-12
 */
@RestController
@RequestMapping("/v1/wx/user/umsSupplier")
@Api(tags = "供应商")
@Slf4j
public class UmsSupplierController
{

	@Autowired
	private IUmsSupplierService umsSupplierService;

	
	/**
	 * 查询供应商列表
	 */
	@PostMapping("/listUmsSupplier")
	@ApiOperation(value = "供应商列表", notes = "供应商列表")
	public WrapperResponse listUmsSupplier(@RequestBody UmsSupplier qry)
	{
		return WrapperResponse.success(umsSupplierService.selectUmsSupplierPage(qry));
	}
	
	/**
	 * 新增保存供应商
	 */
	@PostMapping("/addUmsSupplier")
	@ApiOperation(value = "新增供应商", notes = "新增供应商")
	public WrapperResponse addUmsSupplier(@RequestBody UmsSupplier umsSupplier)
	{		
		return WrapperResponse.success(umsSupplierService.insertUmsSupplier(umsSupplier));
	}

	/**
	 * 修改保存供应商
	 */
	@PostMapping("/editUmsSupplier")
	@ApiOperation(value = "修改供应商", notes = "修改供应商")
	public WrapperResponse editSaveUmsSupplier(@RequestBody UmsSupplier umsSupplier)
	{		
		return WrapperResponse.success(umsSupplierService.updateUmsSupplier(umsSupplier));
	}
	
	/**
	 * 删除供应商
	 */
	@PostMapping( "/removeUmsSupplier/{id}")
	@ApiOperation(value = "删除供应商", notes = "删除供应商")
	public WrapperResponse removeUmsSupplier(@PathVariable(value = "id") Long id)
	{		
		return WrapperResponse.success(umsSupplierService.deleteUmsSupplierById(id));
	}
	
}
