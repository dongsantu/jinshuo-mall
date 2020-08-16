package com.jinshuo.mall.admin.infra.mapper.gds;

import com.jinshuo.mall.admin.domain.gds.GdsGroup;
import java.util.List;	

/**
 *  数据层
 * 
 * @author dyh
 * @date 2020-08-12
 */
public interface GdsGroupMapper 
{
	/**
     * 查询信息
     * 
     * @param id ID
     * @return 信息
     */
	public GdsGroup selectGdsGroupById(Long id);
	
	/**
     * 查询列表
     * 
     * @param gdsGroup 信息
     * @return 集合
     */
	public List<GdsGroup> selectGdsGroupList(GdsGroup gdsGroup);
	
	/**
     * 新增
     * 
     * @param gdsGroup 信息
     * @return 结果
     */
	public int insertGdsGroup(GdsGroup gdsGroup);
	
	/**
     * 修改
     * 
     * @param gdsGroup 信息
     * @return 结果
     */
	public int updateGdsGroup(GdsGroup gdsGroup);
	
	/**
     * 删除
     * 
     * @param id ID
     * @return 结果
     */
	public int deleteGdsGroupById(Long id);
	
	/**
     * 批量删除
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteGdsGroupByIds(String[] ids);
	
}