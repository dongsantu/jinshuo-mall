package com.jinshuo.mall.admin.web.test.gds;

import com.jinshuo.mall.admin.application.service.gds.IGdsSkuService;
import com.jinshuo.mall.admin.domain.gds.GdsSku;
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
@RequestMapping("/v1/wx/user/gdsSku")
@Api(tags = "")
@Slf4j
public class GdsSkuController
{

	@Autowired
	private IGdsSkuService gdsSkuService;

	
	/**
	 * 查询列表
	 */
	@PostMapping("/listGdsSku")
	@ApiOperation(value = "列表", notes = "列表")
	public WrapperResponse listGdsSku(@Valid @RequestBody GdsSku qry)
	{
		return WrapperResponse.success(gdsSkuService.selectGdsSkuPage(qry));
	}
	
	/**
	 * 新增保存
	 */
	@PostMapping("/addGdsSku")
	@ApiOperation(value = "新增", notes = "新增")
	public WrapperResponse addGdsSku(@Valid @RequestBody GdsSku gdsSku)
	{		
		return WrapperResponse.success(gdsSkuService.insertGdsSku(gdsSku));
	}

	/**
	 * 修改保存
	 */
	@PostMapping("/editGdsSku")
	@ApiOperation(value = "修改", notes = "修改")
	public WrapperResponse editSaveGdsSku(@Valid @RequestBody GdsSku gdsSku)
	{		
		return WrapperResponse.success(gdsSkuService.updateGdsSku(gdsSku));
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/removeGdsSku/{id}")
	@ApiOperation(value = "删除", notes = "删除")
	public WrapperResponse removeGdsSku(@PathVariable(value = "id") Long id)
	{		
		return WrapperResponse.success(gdsSkuService.deleteGdsSkuById(id));
	}
	
}
