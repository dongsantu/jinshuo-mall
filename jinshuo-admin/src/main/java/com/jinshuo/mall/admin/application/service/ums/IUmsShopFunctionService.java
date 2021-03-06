package com.jinshuo.mall.admin.application.service.ums;

import com.github.pagehelper.PageInfo;
import com.jinshuo.mall.admin.domain.ums.UmsShopFunction;

/**
 *  服务层
 * 
 * @author dyh
 * @date 2020-08-12
 */
public interface IUmsShopFunctionService 
{
	/**
     * 查询信息
     * 
     * @param id ID
     * @return 信息
     */
	 UmsShopFunction selectUmsShopFunctionById(Long id);
	
	/**
     * 查询列表
     * 
     * @param qry 信息
     * @return 集合
     */
	PageInfo selectUmsShopFunctionPage(UmsShopFunction qry);
	
	/**
     * 新增
     * 
     * @param umsShopFunction 信息
     * @return 结果
     */
	 int insertUmsShopFunction(UmsShopFunction umsShopFunction);
	
	/**
     * 修改
     * 
     * @param umsShopFunction 信息
     * @return 结果
     */
	 int updateUmsShopFunction(UmsShopFunction umsShopFunction);
		
	/**
     * 删除信息
     * 
     * @param id 需要删除的数据ID
     * @return 结果
     */
	 int deleteUmsShopFunctionById(Long id);
	
}
