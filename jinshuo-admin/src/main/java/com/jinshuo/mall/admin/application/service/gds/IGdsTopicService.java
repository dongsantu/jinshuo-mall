package com.jinshuo.mall.admin.application.service.gds;

import com.github.pagehelper.PageInfo;
import com.jinshuo.mall.admin.domain.gds.GdsTopic;

/**
 *  服务层
 * 
 * @author dyh
 * @date 2020-08-12
 */
public interface IGdsTopicService 
{
	/**
     * 查询信息
     * 
     * @param id ID
     * @return 信息
     */
	 GdsTopic selectGdsTopicById(Long id);
	
	/**
     * 查询列表
     * 
     * @param qry 信息
     * @return 集合
     */
	PageInfo selectGdsTopicPage(GdsTopic qry);
	
	/**
     * 新增
     * 
     * @param gdsTopic 信息
     * @return 结果
     */
	 int insertGdsTopic(GdsTopic gdsTopic);
	
	/**
     * 修改
     * 
     * @param gdsTopic 信息
     * @return 结果
     */
	 int updateGdsTopic(GdsTopic gdsTopic);
		
	/**
     * 删除信息
     * 
     * @param id 需要删除的数据ID
     * @return 结果
     */
	 int deleteGdsTopicById(Long id);
	
}
