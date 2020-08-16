package com.jinshuo.mall.admin.application.service.gds;

import com.github.pagehelper.PageInfo;
import com.jinshuo.mall.admin.domain.gds.GdsGroup;

/**
 *  服务层
 * 
 * @author dyh
 * @date 2020-08-12
 */
public interface IGdsGroupService 
{
	/**
     * 查询信息
     * 
     * @param id ID
     * @return 信息
     */
	 GdsGroup selectGdsGroupById(Long id);
	
	/**
     * 查询列表
     * 
     * @param qry 信息
     * @return 集合
     */
	PageInfo selectGdsGroupPage(GdsGroup qry);
	
	/**
     * 新增
     * 
     * @param gdsGroup 信息
     * @return 结果
     */
	 int insertGdsGroup(GdsGroup gdsGroup);
	
	/**
     * 修改
     * 
     * @param gdsGroup 信息
     * @return 结果
     */
	 int updateGdsGroup(GdsGroup gdsGroup);
		
	/**
     * 删除信息
     * 
     * @param id 需要删除的数据ID
     * @return 结果
     */
	 int deleteGdsGroupById(Long id);
	
}
