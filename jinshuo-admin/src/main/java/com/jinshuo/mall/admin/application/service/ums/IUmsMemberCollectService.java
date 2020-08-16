package com.jinshuo.mall.admin.application.service.ums;

import com.github.pagehelper.PageInfo;
import com.jinshuo.mall.admin.domain.ums.UmsMemberCollect;

/**
 * 我的收藏 服务层
 * 
 * @author dyh
 * @date 2020-08-12
 */
public interface IUmsMemberCollectService 
{
	/**
     * 查询我的收藏信息
     * 
     * @param id 我的收藏ID
     * @return 我的收藏信息
     */
	 UmsMemberCollect selectUmsMemberCollectById(Long id);
	
	/**
     * 查询我的收藏列表
     * 
     * @param qry 我的收藏信息
     * @return 我的收藏集合
     */
	PageInfo selectUmsMemberCollectPage(UmsMemberCollect qry);
	
	/**
     * 新增我的收藏
     * 
     * @param umsMemberCollect 我的收藏信息
     * @return 结果
     */
	 int insertUmsMemberCollect(UmsMemberCollect umsMemberCollect);
	
	/**
     * 修改我的收藏
     * 
     * @param umsMemberCollect 我的收藏信息
     * @return 结果
     */
	 int updateUmsMemberCollect(UmsMemberCollect umsMemberCollect);
		
	/**
     * 删除我的收藏信息
     * 
     * @param id 需要删除的数据ID
     * @return 结果
     */
	 int deleteUmsMemberCollectById(Long id);
	
}
