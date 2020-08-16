package com.jinshuo.mall.admin.infra.mapper.gds;

import com.jinshuo.mall.admin.domain.gds.GdsSpec;
import java.util.List;	

/**
 *  数据层
 * 
 * @author dyh
 * @date 2020-08-12
 */
public interface GdsSpecMapper 
{
	/**
     * 查询信息
     * 
     * @param id ID
     * @return 信息
     */
	public GdsSpec selectGdsSpecById(Long id);
	
	/**
     * 查询列表
     * 
     * @param gdsSpec 信息
     * @return 集合
     */
	public List<GdsSpec> selectGdsSpecList(GdsSpec gdsSpec);
	
	/**
     * 新增
     * 
     * @param gdsSpec 信息
     * @return 结果
     */
	public int insertGdsSpec(GdsSpec gdsSpec);
	
	/**
     * 修改
     * 
     * @param gdsSpec 信息
     * @return 结果
     */
	public int updateGdsSpec(GdsSpec gdsSpec);
	
	/**
     * 删除
     * 
     * @param id ID
     * @return 结果
     */
	public int deleteGdsSpecById(Long id);
	
	/**
     * 批量删除
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteGdsSpecByIds(String[] ids);
	
}