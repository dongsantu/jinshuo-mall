package com.jinshuo.mall.admin.infra.mapper.gds;

import com.jinshuo.mall.admin.domain.gds.GdsUnit;

import java.util.List;

/**
 *  数据层
 * 
 * @author dyh
 * @date 2020-08-12
 */
public interface GdsUnitMapper 
{
	/**
     * 查询信息
     * 
     * @param id ID
     * @return 信息
     */
	public GdsUnit selectGdsUnitById(Long id);
	
	/**
     * 查询列表
     * 
     * @param gdsUnit 信息
     * @return 集合
     */
	public List<GdsUnit> selectGdsUnitList(GdsUnit gdsUnit);
	
	/**
     * 新增
     * 
     * @param gdsUnit 信息
     * @return 结果
     */
	public int insertGdsUnit(GdsUnit gdsUnit);
	
	/**
     * 修改
     * 
     * @param gdsUnit 信息
     * @return 结果
     */
	public int updateGdsUnit(GdsUnit gdsUnit);
	
	/**
     * 删除
     * 
     * @param id ID
     * @return 结果
     */
	public int deleteGdsUnitById(Long id);
	
	/**
     * 批量删除
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteGdsUnitByIds(String[] ids);
	
}