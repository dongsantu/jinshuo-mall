package com.jinshuo.mall.admin.infra.mapper.gds;

import com.jinshuo.mall.admin.domain.gds.GdsMcSet;
import java.util.List;	

/**
 *  数据层
 * 
 * @author dyh
 * @date 2020-08-12
 */
public interface GdsMcSetMapper 
{
	/**
     * 查询信息
     * 
     * @param id ID
     * @return 信息
     */
	public GdsMcSet selectGdsMcSetById(Long id);
	
	/**
     * 查询列表
     * 
     * @param gdsMcSet 信息
     * @return 集合
     */
	public List<GdsMcSet> selectGdsMcSetList(GdsMcSet gdsMcSet);
	
	/**
     * 新增
     * 
     * @param gdsMcSet 信息
     * @return 结果
     */
	public int insertGdsMcSet(GdsMcSet gdsMcSet);
	
	/**
     * 修改
     * 
     * @param gdsMcSet 信息
     * @return 结果
     */
	public int updateGdsMcSet(GdsMcSet gdsMcSet);
	
	/**
     * 删除
     * 
     * @param id ID
     * @return 结果
     */
	public int deleteGdsMcSetById(Long id);
	
	/**
     * 批量删除
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteGdsMcSetByIds(String[] ids);
	
}