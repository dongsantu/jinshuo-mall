package com.jinshuo.mall.admin.application.service.gds;

import com.github.pagehelper.PageInfo;
import com.jinshuo.mall.admin.domain.gds.GdsAlbum;

/**
 *  服务层
 * 
 * @author dyh
 * @date 2020-08-12
 */
public interface IGdsAlbumService 
{
	/**
     * 查询信息
     * 
     * @param id ID
     * @return 信息
     */
	 GdsAlbum selectGdsAlbumById(Long id);
	
	/**
     * 查询列表
     * 
     * @param qry 信息
     * @return 集合
     */
	PageInfo selectGdsAlbumPage(GdsAlbum qry);
	
	/**
     * 新增
     * 
     * @param gdsAlbum 信息
     * @return 结果
     */
	 int insertGdsAlbum(GdsAlbum gdsAlbum);
	
	/**
     * 修改
     * 
     * @param gdsAlbum 信息
     * @return 结果
     */
	 int updateGdsAlbum(GdsAlbum gdsAlbum);
		
	/**
     * 删除信息
     * 
     * @param id 需要删除的数据ID
     * @return 结果
     */
	 int deleteGdsAlbumById(Long id);
	
}
