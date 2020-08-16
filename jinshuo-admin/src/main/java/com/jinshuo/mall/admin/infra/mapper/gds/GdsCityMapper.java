package com.jinshuo.mall.admin.infra.mapper.gds;

import com.jinshuo.mall.admin.domain.gds.GdsCity;

import java.util.List;

/**
 *  数据层
 * 
 * @author dyh
 * @date 2020-08-12
 */
public interface GdsCityMapper 
{
	/**
     * 查询信息
     * 
     * @param id ID
     * @return 信息
     */
	public GdsCity selectGdsCityById(Long id);
	
	/**
     * 查询列表
     * 
     * @param gdsCity 信息
     * @return 集合
     */
	public List<GdsCity> selectGdsCityList(GdsCity gdsCity);
	
	/**
     * 新增
     * 
     * @param gdsCity 信息
     * @return 结果
     */
	public int insertGdsCity(GdsCity gdsCity);
	
	/**
     * 修改
     * 
     * @param gdsCity 信息
     * @return 结果
     */
	public int updateGdsCity(GdsCity gdsCity);
	
	/**
     * 删除
     * 
     * @param id ID
     * @return 结果
     */
	public int deleteGdsCityById(Long id);
	
	/**
     * 批量删除
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteGdsCityByIds(String[] ids);
	
}