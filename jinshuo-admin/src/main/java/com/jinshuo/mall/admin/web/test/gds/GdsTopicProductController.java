package com.jinshuo.mall.admin.web.test.gds;

import com.jinshuo.mall.admin.application.service.gds.IGdsTopicProductService;
import com.jinshuo.mall.admin.domain.gds.GdsTopicProduct;
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
@RequestMapping("/v1/wx/user/gdsTopicProduct")
@Api(tags = "")
@Slf4j
public class GdsTopicProductController
{

	@Autowired
	private IGdsTopicProductService gdsTopicProductService;

	
	/**
	 * 查询列表
	 */
	@PostMapping("/listGdsTopicProduct")
	@ApiOperation(value = "列表", notes = "列表")
	public WrapperResponse listGdsTopicProduct(@Valid @RequestBody GdsTopicProduct qry)
	{
		return WrapperResponse.success(gdsTopicProductService.selectGdsTopicProductPage(qry));
	}
	
	/**
	 * 新增保存
	 */
	@PostMapping("/addGdsTopicProduct")
	@ApiOperation(value = "新增", notes = "新增")
	public WrapperResponse addGdsTopicProduct(@Valid @RequestBody GdsTopicProduct gdsTopicProduct)
	{		
		return WrapperResponse.success(gdsTopicProductService.insertGdsTopicProduct(gdsTopicProduct));
	}

	/**
	 * 修改保存
	 */
	@PostMapping("/editGdsTopicProduct")
	@ApiOperation(value = "修改", notes = "修改")
	public WrapperResponse editSaveGdsTopicProduct(@Valid @RequestBody GdsTopicProduct gdsTopicProduct)
	{		
		return WrapperResponse.success(gdsTopicProductService.updateGdsTopicProduct(gdsTopicProduct));
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/removeGdsTopicProduct/{id}")
	@ApiOperation(value = "删除", notes = "删除")
	public WrapperResponse removeGdsTopicProduct(@PathVariable(value = "id") Long id)
	{		
		return WrapperResponse.success(gdsTopicProductService.deleteGdsTopicProductById(id));
	}
	
}
