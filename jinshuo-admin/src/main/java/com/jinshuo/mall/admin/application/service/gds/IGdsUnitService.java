package com.jinshuo.mall.admin.application.service.gds;

import com.github.pagehelper.PageInfo;
import com.jinshuo.mall.admin.domain.gds.GdsUnit;

/**
 *  服务层
 * 
 * @author dyh
 * @date 2020-08-12
 */
public interface IGdsUnitService 
{
	/**
     * 查询信息
     * 
     * @param id ID
     * @return 信息
     */
	 GdsUnit selectGdsUnitById(Long id);
	
	/**
     * 查询列表
     * 
     * @param qry 信息
     * @return 集合
     */
	PageInfo selectGdsUnitPage(GdsUnit qry);
	
	/**
     * 新增
     * 
     * @param gdsUnit 信息
     * @return 结果
     */
	 int insertGdsUnit(GdsUnit gdsUnit);
	
	/**
     * 修改
     * 
     * @param gdsUnit 信息
     * @return 结果
     */
	 int updateGdsUnit(GdsUnit gdsUnit);
		
	/**
     * 删除信息
     * 
     * @param id 需要删除的数据ID
     * @return 结果
     */
	 int deleteGdsUnitById(Long id);
	
}
