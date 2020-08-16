package com.jinshuo.mall.admin.web.test.ums;

import com.jinshuo.mall.admin.application.service.ums.IUmsCommentAlbumService;
import com.jinshuo.mall.admin.domain.ums.UmsCommentAlbum;
import com.jinshuo.mall.core.response.WrapperResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 评论相册 信息操作处理
 * 
 * @author dyh
 * @date 2020-08-12
 */
@RestController
@RequestMapping("/v1/wx/user/umsCommentAlbum")
@Api(tags = "评论相册")
@Slf4j
public class UmsCommentAlbumController
{

	@Autowired
	private IUmsCommentAlbumService umsCommentAlbumService;

	
	/**
	 * 查询评论相册列表
	 */
	@PostMapping("/listUmsCommentAlbum")
	@ApiOperation(value = "评论相册列表", notes = "评论相册列表")
	public WrapperResponse listUmsCommentAlbum(@RequestBody UmsCommentAlbum qry)
	{
		return WrapperResponse.success(umsCommentAlbumService.selectUmsCommentAlbumPage(qry));
	}
	
	/**
	 * 新增保存评论相册
	 */
	@PostMapping("/addUmsCommentAlbum")
	@ApiOperation(value = "新增评论相册", notes = "新增评论相册")
	public WrapperResponse addUmsCommentAlbum(@RequestBody UmsCommentAlbum umsCommentAlbum)
	{		
		return WrapperResponse.success(umsCommentAlbumService.insertUmsCommentAlbum(umsCommentAlbum));
	}

	/**
	 * 修改保存评论相册
	 */
	@PostMapping("/editUmsCommentAlbum")
	@ApiOperation(value = "修改评论相册", notes = "修改评论相册")
	public WrapperResponse editSaveUmsCommentAlbum(@RequestBody UmsCommentAlbum umsCommentAlbum)
	{		
		return WrapperResponse.success(umsCommentAlbumService.updateUmsCommentAlbum(umsCommentAlbum));
	}
	
	/**
	 * 删除评论相册
	 */
	@PostMapping( "/removeUmsCommentAlbum/{id}")
	@ApiOperation(value = "删除评论相册", notes = "删除评论相册")
	public WrapperResponse removeUmsCommentAlbum(@PathVariable(value = "id") Long id)
	{		
		return WrapperResponse.success(umsCommentAlbumService.deleteUmsCommentAlbumById(id));
	}
	
}
