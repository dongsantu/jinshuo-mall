package com.jinshuo.mall.admin.infra.mapper.gds;

import com.jinshuo.mall.admin.domain.gds.GdsAlbum;

import java.util.List;

/**
 *  数据层
 * 
 * @author dyh
 * @date 2020-08-12
 */
public interface GdsAlbumMapper 
{
	/**
     * 查询信息
     * 
     * @param id ID
     * @return 信息
     */
	public GdsAlbum selectGdsAlbumById(Long id);
	
	/**
     * 查询列表
     * 
     * @param gdsAlbum 信息
     * @return 集合
     */
	public List<GdsAlbum> selectGdsAlbumList(GdsAlbum gdsAlbum);
	
	/**
     * 新增
     * 
     * @param gdsAlbum 信息
     * @return 结果
     */
	public int insertGdsAlbum(GdsAlbum gdsAlbum);
	
	/**
     * 修改
     * 
     * @param gdsAlbum 信息
     * @return 结果
     */
	public int updateGdsAlbum(GdsAlbum gdsAlbum);
	
	/**
     * 删除
     * 
     * @param id ID
     * @return 结果
     */
	public int deleteGdsAlbumById(Long id);
	
	/**
     * 批量删除
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteGdsAlbumByIds(String[] ids);
	
}