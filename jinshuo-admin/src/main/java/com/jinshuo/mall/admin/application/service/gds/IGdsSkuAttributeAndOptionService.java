package com.jinshuo.mall.admin.application.service.gds;

import com.github.pagehelper.PageInfo;
import com.jinshuo.mall.admin.domain.gds.GdsSkuAttributeAndOption;

/**
 *  服务层
 * 
 * @author dyh
 * @date 2020-08-12
 */
public interface IGdsSkuAttributeAndOptionService 
{
	/**
     * 查询信息
     * 
     * @param id ID
     * @return 信息
     */
	 GdsSkuAttributeAndOption selectGdsSkuAttributeAndOptionById(Long id);
	
	/**
     * 查询列表
     * 
     * @param qry 信息
     * @return 集合
     */
	PageInfo selectGdsSkuAttributeAndOptionPage(GdsSkuAttributeAndOption qry);
	
	/**
     * 新增
     * 
     * @param gdsSkuAttributeAndOption 信息
     * @return 结果
     */
	 int insertGdsSkuAttributeAndOption(GdsSkuAttributeAndOption gdsSkuAttributeAndOption);
	
	/**
     * 修改
     * 
     * @param gdsSkuAttributeAndOption 信息
     * @return 结果
     */
	 int updateGdsSkuAttributeAndOption(GdsSkuAttributeAndOption gdsSkuAttributeAndOption);
		
	/**
     * 删除信息
     * 
     * @param id 需要删除的数据ID
     * @return 结果
     */
	 int deleteGdsSkuAttributeAndOptionById(Long id);
	
}
