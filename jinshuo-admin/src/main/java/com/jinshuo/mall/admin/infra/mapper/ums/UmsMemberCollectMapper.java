package com.jinshuo.mall.admin.infra.mapper.ums;

import com.jinshuo.mall.admin.domain.ums.UmsMemberCollect;

import java.util.List;

/**
 * 我的收藏 数据层
 * 
 * @author dyh
 * @date 2020-08-12
 */
public interface UmsMemberCollectMapper 
{
	/**
     * 查询我的收藏信息
     * 
     * @param id 我的收藏ID
     * @return 我的收藏信息
     */
	public UmsMemberCollect selectUmsMemberCollectById(Long id);
	
	/**
     * 查询我的收藏列表
     * 
     * @param umsMemberCollect 我的收藏信息
     * @return 我的收藏集合
     */
	public List<UmsMemberCollect> selectUmsMemberCollectList(UmsMemberCollect umsMemberCollect);
	
	/**
     * 新增我的收藏
     * 
     * @param umsMemberCollect 我的收藏信息
     * @return 结果
     */
	public int insertUmsMemberCollect(UmsMemberCollect umsMemberCollect);
	
	/**
     * 修改我的收藏
     * 
     * @param umsMemberCollect 我的收藏信息
     * @return 结果
     */
	public int updateUmsMemberCollect(UmsMemberCollect umsMemberCollect);
	
	/**
     * 删除我的收藏
     * 
     * @param id 我的收藏ID
     * @return 结果
     */
	public int deleteUmsMemberCollectById(Long id);
	
	/**
     * 批量删除我的收藏
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteUmsMemberCollectByIds(String[] ids);
	
}