package com.jinshuo.mall.admin.web.test.gds;

import com.jinshuo.mall.admin.application.service.gds.IGdsAlbumService;
import com.jinshuo.mall.admin.domain.gds.GdsAlbum;
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
@RequestMapping("/v1/wx/user/gdsAlbum")
@Api(tags = "")
@Slf4j
public class GdsAlbumController
{

	@Autowired
	private IGdsAlbumService gdsAlbumService;

	
	/**
	 * 查询列表
	 */
	@PostMapping("/listGdsAlbum")
	@ApiOperation(value = "列表", notes = "列表")
	public WrapperResponse listGdsAlbum(@Valid @RequestBody GdsAlbum qry)
	{
		return WrapperResponse.success(gdsAlbumService.selectGdsAlbumPage(qry));
	}
	
	/**
	 * 新增保存
	 */
	@PostMapping("/addGdsAlbum")
	@ApiOperation(value = "新增", notes = "新增")
	public WrapperResponse addGdsAlbum(@Valid @RequestBody GdsAlbum gdsAlbum)
	{		
		return WrapperResponse.success(gdsAlbumService.insertGdsAlbum(gdsAlbum));
	}

	/**
	 * 修改保存
	 */
	@PostMapping("/editGdsAlbum")
	@ApiOperation(value = "修改", notes = "修改")
	public WrapperResponse editSaveGdsAlbum(@Valid @RequestBody GdsAlbum gdsAlbum)
	{		
		return WrapperResponse.success(gdsAlbumService.updateGdsAlbum(gdsAlbum));
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/removeGdsAlbum/{id}")
	@ApiOperation(value = "删除", notes = "删除")
	public WrapperResponse removeGdsAlbum(@PathVariable(value = "id") Long id)
	{		
		return WrapperResponse.success(gdsAlbumService.deleteGdsAlbumById(id));
	}
	
}
