package com.jinshuo.mall.admin.infra.mapper.gds;

import com.jinshuo.mall.admin.domain.gds.GdsType;

import java.util.List;

/**
 *  数据层
 * 
 * @author dyh
 * @date 2020-08-12
 */
public interface GdsTypeMapper 
{
	/**
     * 查询信息
     * 
     * @param id ID
     * @return 信息
     */
	public GdsType selectGdsTypeById(Long id);
	
	/**
     * 查询列表
     * 
     * @param gdsType 信息
     * @return 集合
     */
	public List<GdsType> selectGdsTypeList(GdsType gdsType);
	
	/**
     * 新增
     * 
     * @param gdsType 信息
     * @return 结果
     */
	public int insertGdsType(GdsType gdsType);
	
	/**
     * 修改
     * 
     * @param gdsType 信息
     * @return 结果
     */
	public int updateGdsType(GdsType gdsType);
	
	/**
     * 删除
     * 
     * @param id ID
     * @return 结果
     */
	public int deleteGdsTypeById(Long id);
	
	/**
     * 批量删除
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteGdsTypeByIds(String[] ids);
	
}