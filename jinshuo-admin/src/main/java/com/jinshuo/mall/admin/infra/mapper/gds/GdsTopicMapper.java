package com.jinshuo.mall.admin.infra.mapper.gds;

import com.jinshuo.mall.admin.domain.gds.GdsTopic;
import java.util.List;	

/**
 *  数据层
 * 
 * @author dyh
 * @date 2020-08-12
 */
public interface GdsTopicMapper 
{
	/**
     * 查询信息
     * 
     * @param id ID
     * @return 信息
     */
	public GdsTopic selectGdsTopicById(Long id);
	
	/**
     * 查询列表
     * 
     * @param gdsTopic 信息
     * @return 集合
     */
	public List<GdsTopic> selectGdsTopicList(GdsTopic gdsTopic);
	
	/**
     * 新增
     * 
     * @param gdsTopic 信息
     * @return 结果
     */
	public int insertGdsTopic(GdsTopic gdsTopic);
	
	/**
     * 修改
     * 
     * @param gdsTopic 信息
     * @return 结果
     */
	public int updateGdsTopic(GdsTopic gdsTopic);
	
	/**
     * 删除
     * 
     * @param id ID
     * @return 结果
     */
	public int deleteGdsTopicById(Long id);
	
	/**
     * 批量删除
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteGdsTopicByIds(String[] ids);
	
}