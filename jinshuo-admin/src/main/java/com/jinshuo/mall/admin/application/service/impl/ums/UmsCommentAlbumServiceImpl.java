package com.jinshuo.mall.admin.application.service.impl.ums;

import com.github.pagehelper.PageInfo;
import com.jinshuo.mall.admin.application.service.ums.IUmsCommentAlbumService;
import com.jinshuo.mall.admin.domain.ums.UmsCommentAlbum;
import com.jinshuo.mall.admin.infra.mapper.ums.UmsCommentAlbumMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 评论相册 服务层实现
 * 
 * @author dyh
 * @date 2020-08-12
 */
@Service
public class UmsCommentAlbumServiceImpl implements IUmsCommentAlbumService
{
	@Autowired(required = false)
	private UmsCommentAlbumMapper umsCommentAlbumMapper;

	/**
     * 查询评论相册信息
     * 
     * @param id 评论相册ID
     * @return 评论相册信息
     */
	public UmsCommentAlbum selectUmsCommentAlbumById(Long id)
	{
	    return umsCommentAlbumMapper.selectUmsCommentAlbumById(id);
	}
	
	/**
     * 查询评论相册列表
     * 
     * @param qry 评论相册信息
     * @return 评论相册集合
     */
	public PageInfo selectUmsCommentAlbumPage(UmsCommentAlbum qry)
	{
        /*PageHelper.startPage(qry.getPageNum(), qry.getPageSize());
		UmsCommentAlbum umsCommentAlbum = new UmsCommentAlbum();
        List<UmsCommentAlbum> umsCommentAlbums = umsCommentAlbumMapper.selectUmsCommentAlbumList(umsCommentAlbum);
        PageInfo pageInfo = new PageInfo(umsCommentAlbums);
	    return pageInfo;*/
		return null;
	}
	
    /**
     * 新增评论相册
     * 
     * @param umsCommentAlbum 评论相册信息
     * @return 结果
     */
	public int insertUmsCommentAlbum(UmsCommentAlbum umsCommentAlbum)
	{
		umsCommentAlbum.preInsert();
	    return umsCommentAlbumMapper.insertUmsCommentAlbum(umsCommentAlbum);
	}
	
	/**
     * 修改评论相册
     * 
     * @param umsCommentAlbum 评论相册信息
     * @return 结果
     */
	public int updateUmsCommentAlbum(UmsCommentAlbum umsCommentAlbum)
	{
	    umsCommentAlbum.preUpdate();
	    return umsCommentAlbumMapper.updateUmsCommentAlbum(umsCommentAlbum);
	}

	/**
     * 删除评论相册对象
     * 
     * @param id 需要删除的数据ID
     * @return 结果
     */
	public int deleteUmsCommentAlbumById(Long id)
	{
		return umsCommentAlbumMapper.deleteUmsCommentAlbumById(id);
	}
	
}
