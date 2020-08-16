package com.jinshuo.mall.admin.application.service.gds;

import com.github.pagehelper.PageInfo;
import com.jinshuo.mall.admin.domain.gds.GdsCity;

/**
 *  服务层
 * 
 * @author dyh
 * @date 2020-08-12
 */
public interface IGdsCityService 
{
	/**
     * 查询信息
     * 
     * @param id ID
     * @return 信息
     */
	 GdsCity selectGdsCityById(Long id);
	
	/**
     * 查询列表
     * 
     * @param qry 信息
     * @return 集合
     */
	PageInfo selectGdsCityPage(GdsCity qry);
	
	/**
     * 新增
     * 
     * @param gdsCity 信息
     * @return 结果
     */
	 int insertGdsCity(GdsCity gdsCity);
	
	/**
     * 修改
     * 
     * @param gdsCity 信息
     * @return 结果
     */
	 int updateGdsCity(GdsCity gdsCity);
		
	/**
     * 删除信息
     * 
     * @param id 需要删除的数据ID
     * @return 结果
     */
	 int deleteGdsCityById(Long id);
	
}
