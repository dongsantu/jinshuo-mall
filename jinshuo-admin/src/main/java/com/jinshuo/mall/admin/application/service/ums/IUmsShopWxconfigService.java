package com.jinshuo.mall.admin.application.service.ums;

import com.github.pagehelper.PageInfo;
import com.jinshuo.mall.admin.domain.ums.UmsShopWxconfig;

/**
 * 微信配置 服务层
 * 
 * @author dyh
 * @date 2020-08-12
 */
public interface IUmsShopWxconfigService 
{
	/**
     * 查询微信配置信息
     * 
     * @param id 微信配置ID
     * @return 微信配置信息
     */
	 UmsShopWxconfig selectUmsShopWxconfigById(Long id);
	
	/**
     * 查询微信配置列表
     * 
     * @param qry 微信配置信息
     * @return 微信配置集合
     */
	PageInfo selectUmsShopWxconfigPage(UmsShopWxconfig qry);
	
	/**
     * 新增微信配置
     * 
     * @param umsShopWxconfig 微信配置信息
     * @return 结果
     */
	 int insertUmsShopWxconfig(UmsShopWxconfig umsShopWxconfig);
	
	/**
     * 修改微信配置
     * 
     * @param umsShopWxconfig 微信配置信息
     * @return 结果
     */
	 int updateUmsShopWxconfig(UmsShopWxconfig umsShopWxconfig);
		
	/**
     * 删除微信配置信息
     * 
     * @param id 需要删除的数据ID
     * @return 结果
     */
	 int deleteUmsShopWxconfigById(Long id);
	
}
