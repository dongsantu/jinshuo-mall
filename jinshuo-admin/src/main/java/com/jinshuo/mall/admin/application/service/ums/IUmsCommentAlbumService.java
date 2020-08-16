package com.jinshuo.mall.admin.application.service.ums;

import com.github.pagehelper.PageInfo;
import com.jinshuo.mall.admin.domain.ums.UmsCommentAlbum;

/**
 * 评论相册 服务层
 * 
 * @author dyh
 * @date 2020-08-12
 */
public interface IUmsCommentAlbumService 
{
	/**
     * 查询评论相册信息
     * 
     * @param id 评论相册ID
     * @return 评论相册信息
     */
	 UmsCommentAlbum selectUmsCommentAlbumById(Long id);
	
	/**
     * 查询评论相册列表
     * 
     * @param qry 评论相册信息
     * @return 评论相册集合
     */
	PageInfo selectUmsCommentAlbumPage(UmsCommentAlbum qry);
	
	/**
     * 新增评论相册
     * 
     * @param umsCommentAlbum 评论相册信息
     * @return 结果
     */
	 int insertUmsCommentAlbum(UmsCommentAlbum umsCommentAlbum);
	
	/**
     * 修改评论相册
     * 
     * @param umsCommentAlbum 评论相册信息
     * @return 结果
     */
	 int updateUmsCommentAlbum(UmsCommentAlbum umsCommentAlbum);
		
	/**
     * 删除评论相册信息
     * 
     * @param id 需要删除的数据ID
     * @return 结果
     */
	 int deleteUmsCommentAlbumById(Long id);
	
}
