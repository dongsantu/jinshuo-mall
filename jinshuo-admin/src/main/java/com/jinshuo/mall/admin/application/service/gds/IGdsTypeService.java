package com.jinshuo.mall.admin.application.service.gds;

import com.github.pagehelper.PageInfo;
import com.jinshuo.mall.admin.domain.gds.GdsType;

/**
 *  服务层
 * 
 * @author dyh
 * @date 2020-08-12
 */
public interface IGdsTypeService 
{
	/**
     * 查询信息
     * 
     * @param id ID
     * @return 信息
     */
	 GdsType selectGdsTypeById(Long id);
	
	/**
     * 查询列表
     * 
     * @param qry 信息
     * @return 集合
     */
	PageInfo selectGdsTypePage(GdsType qry);
	
	/**
     * 新增
     * 
     * @param gdsType 信息
     * @return 结果
     */
	 int insertGdsType(GdsType gdsType);
	
	/**
     * 修改
     * 
     * @param gdsType 信息
     * @return 结果
     */
	 int updateGdsType(GdsType gdsType);
		
	/**
     * 删除信息
     * 
     * @param id 需要删除的数据ID
     * @return 结果
     */
	 int deleteGdsTypeById(Long id);
	
}
