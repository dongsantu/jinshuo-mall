package com.jinshuo.mall.admin.infra.mapper.ums;


import com.jinshuo.mall.admin.domain.ums.UmsCommentAlbum;

import java.util.List;

/**
 * 评论相册 数据层
 * 
 * @author dyh
 * @date 2020-08-12
 */
public interface UmsCommentAlbumMapper 
{
	/**
     * 查询评论相册信息
     * 
     * @param id 评论相册ID
     * @return 评论相册信息
     */
	public UmsCommentAlbum selectUmsCommentAlbumById(Long id);
	
	/**
     * 查询评论相册列表
     * 
     * @param umsCommentAlbum 评论相册信息
     * @return 评论相册集合
     */
	public List<UmsCommentAlbum> selectUmsCommentAlbumList(UmsCommentAlbum umsCommentAlbum);
	
	/**
     * 新增评论相册
     * 
     * @param umsCommentAlbum 评论相册信息
     * @return 结果
     */
	public int insertUmsCommentAlbum(UmsCommentAlbum umsCommentAlbum);
	
	/**
     * 修改评论相册
     * 
     * @param umsCommentAlbum 评论相册信息
     * @return 结果
     */
	public int updateUmsCommentAlbum(UmsCommentAlbum umsCommentAlbum);
	
	/**
     * 删除评论相册
     * 
     * @param id 评论相册ID
     * @return 结果
     */
	public int deleteUmsCommentAlbumById(Long id);
	
	/**
     * 批量删除评论相册
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteUmsCommentAlbumByIds(String[] ids);
	
}