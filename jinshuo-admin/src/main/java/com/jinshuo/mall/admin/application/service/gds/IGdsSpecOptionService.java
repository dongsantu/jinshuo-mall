package com.jinshuo.mall.admin.application.service.gds;

import com.github.pagehelper.PageInfo;
import com.jinshuo.mall.admin.domain.gds.GdsSpecOption;

/**
 *  服务层
 * 
 * @author dyh
 * @date 2020-08-12
 */
public interface IGdsSpecOptionService 
{
	/**
     * 查询信息
     * 
     * @param id ID
     * @return 信息
     */
	 GdsSpecOption selectGdsSpecOptionById(Long id);
	
	/**
     * 查询列表
     * 
     * @param qry 信息
     * @return 集合
     */
	PageInfo selectGdsSpecOptionPage(GdsSpecOption qry);
	
	/**
     * 新增
     * 
     * @param gdsSpecOption 信息
     * @return 结果
     */
	 int insertGdsSpecOption(GdsSpecOption gdsSpecOption);
	
	/**
     * 修改
     * 
     * @param gdsSpecOption 信息
     * @return 结果
     */
	 int updateGdsSpecOption(GdsSpecOption gdsSpecOption);
		
	/**
     * 删除信息
     * 
     * @param id 需要删除的数据ID
     * @return 结果
     */
	 int deleteGdsSpecOptionById(Long id);
	
}
