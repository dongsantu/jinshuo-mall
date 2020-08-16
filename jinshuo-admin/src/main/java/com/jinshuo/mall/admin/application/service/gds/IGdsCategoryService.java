package com.jinshuo.mall.admin.application.service.gds;

import com.github.pagehelper.PageInfo;
import com.jinshuo.mall.admin.domain.gds.GdsCategory;

/**
 *  服务层
 * 
 * @author dyh
 * @date 2020-08-12
 */
public interface IGdsCategoryService 
{
	/**
     * 查询信息
     * 
     * @param id ID
     * @return 信息
     */
	 GdsCategory selectGdsCategoryById(Long id);
	
	/**
     * 查询列表
     * 
     * @param qry 信息
     * @return 集合
     */
	PageInfo selectGdsCategoryPage(GdsCategory qry);
	
	/**
     * 新增
     * 
     * @param gdsCategory 信息
     * @return 结果
     */
	 int insertGdsCategory(GdsCategory gdsCategory);
	
	/**
     * 修改
     * 
     * @param gdsCategory 信息
     * @return 结果
     */
	 int updateGdsCategory(GdsCategory gdsCategory);
		
	/**
     * 删除信息
     * 
     * @param id 需要删除的数据ID
     * @return 结果
     */
	 int deleteGdsCategoryById(Long id);
	
}
