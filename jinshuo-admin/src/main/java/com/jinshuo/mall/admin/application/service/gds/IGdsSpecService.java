package com.jinshuo.mall.admin.application.service.gds;

import com.github.pagehelper.PageInfo;
import com.jinshuo.mall.admin.domain.gds.GdsSpec;

/**
 *  服务层
 * 
 * @author dyh
 * @date 2020-08-12
 */
public interface IGdsSpecService 
{
	/**
     * 查询信息
     * 
     * @param id ID
     * @return 信息
     */
	 GdsSpec selectGdsSpecById(Long id);
	
	/**
     * 查询列表
     * 
     * @param qry 信息
     * @return 集合
     */
	PageInfo selectGdsSpecPage(GdsSpec qry);
	
	/**
     * 新增
     * 
     * @param gdsSpec 信息
     * @return 结果
     */
	 int insertGdsSpec(GdsSpec gdsSpec);
	
	/**
     * 修改
     * 
     * @param gdsSpec 信息
     * @return 结果
     */
	 int updateGdsSpec(GdsSpec gdsSpec);
		
	/**
     * 删除信息
     * 
     * @param id 需要删除的数据ID
     * @return 结果
     */
	 int deleteGdsSpecById(Long id);
	
}
