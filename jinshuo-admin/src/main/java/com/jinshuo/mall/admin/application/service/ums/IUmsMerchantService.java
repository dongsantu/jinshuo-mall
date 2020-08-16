package com.jinshuo.mall.admin.application.service.ums;

import com.github.pagehelper.PageInfo;
import com.jinshuo.mall.admin.domain.ums.UmsMerchant;

/**
 *  服务层
 * 
 * @author dyh
 * @date 2020-08-12
 */
public interface IUmsMerchantService 
{
	/**
     * 查询信息
     * 
     * @param id ID
     * @return 信息
     */
	 UmsMerchant selectUmsMerchantById(Long id);
	
	/**
     * 查询列表
     * 
     * @param qry 信息
     * @return 集合
     */
	PageInfo selectUmsMerchantPage(UmsMerchant qry);
	
	/**
     * 新增
     * 
     * @param umsMerchant 信息
     * @return 结果
     */
	 int insertUmsMerchant(UmsMerchant umsMerchant);
	
	/**
     * 修改
     * 
     * @param umsMerchant 信息
     * @return 结果
     */
	 int updateUmsMerchant(UmsMerchant umsMerchant);
		
	/**
     * 删除信息
     * 
     * @param id 需要删除的数据ID
     * @return 结果
     */
	 int deleteUmsMerchantById(Long id);
	
}
