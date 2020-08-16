package com.jinshuo.mall.admin.infra.mapper.gds;


import com.jinshuo.mall.admin.domain.gds.GdsCategory;

import java.util.List;

/**
 *  数据层
 * 
 * @author dyh
 * @date 2020-08-12
 */
public interface GdsCategoryMapper 
{
	/**
     * 查询信息
     * 
     * @param id ID
     * @return 信息
     */
	public GdsCategory selectGdsCategoryById(Long id);
	
	/**
     * 查询列表
     * 
     * @param gdsCategory 信息
     * @return 集合
     */
	public List<GdsCategory> selectGdsCategoryList(GdsCategory gdsCategory);
	
	/**
     * 新增
     * 
     * @param gdsCategory 信息
     * @return 结果
     */
	public int insertGdsCategory(GdsCategory gdsCategory);
	
	/**
     * 修改
     * 
     * @param gdsCategory 信息
     * @return 结果
     */
	public int updateGdsCategory(GdsCategory gdsCategory);
	
	/**
     * 删除
     * 
     * @param id ID
     * @return 结果
     */
	public int deleteGdsCategoryById(Long id);
	
	/**
     * 批量删除
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteGdsCategoryByIds(String[] ids);
	
}