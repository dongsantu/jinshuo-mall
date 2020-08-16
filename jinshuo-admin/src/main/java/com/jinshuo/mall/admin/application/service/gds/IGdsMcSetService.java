package com.jinshuo.mall.admin.application.service.gds;

import com.github.pagehelper.PageInfo;
import com.jinshuo.mall.admin.domain.gds.GdsMcSet;

/**
 *  服务层
 * 
 * @author dyh
 * @date 2020-08-12
 */
public interface IGdsMcSetService 
{
	/**
     * 查询信息
     * 
     * @param id ID
     * @return 信息
     */
	 GdsMcSet selectGdsMcSetById(Long id);
	
	/**
     * 查询列表
     * 
     * @param qry 信息
     * @return 集合
     */
	PageInfo selectGdsMcSetPage(GdsMcSet qry);
	
	/**
     * 新增
     * 
     * @param gdsMcSet 信息
     * @return 结果
     */
	 int insertGdsMcSet(GdsMcSet gdsMcSet);
	
	/**
     * 修改
     * 
     * @param gdsMcSet 信息
     * @return 结果
     */
	 int updateGdsMcSet(GdsMcSet gdsMcSet);
		
	/**
     * 删除信息
     * 
     * @param id 需要删除的数据ID
     * @return 结果
     */
	 int deleteGdsMcSetById(Long id);
	
}
