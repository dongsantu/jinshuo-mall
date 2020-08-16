package com.jinshuo.mall.admin.application.service.ums;

import com.github.pagehelper.PageInfo;
import com.jinshuo.mall.admin.domain.ums.UmsShop;

/**
 *  服务层
 * 
 * @author dyh
 * @date 2020-08-12
 */
public interface IUmsShopService 
{
	/**
     * 查询信息
     * 
     * @param id ID
     * @return 信息
     */
	 UmsShop selectUmsShopById(Long id);
	
	/**
     * 查询列表
     * 
     * @param qry 信息
     * @return 集合
     */
	PageInfo selectUmsShopPage(UmsShop qry);
	
	/**
     * 新增
     * 
     * @param umsShop 信息
     * @return 结果
     */
	 int insertUmsShop(UmsShop umsShop);
	
	/**
     * 修改
     * 
     * @param umsShop 信息
     * @return 结果
     */
	 int updateUmsShop(UmsShop umsShop);
		
	/**
     * 删除信息
     * 
     * @param id 需要删除的数据ID
     * @return 结果
     */
	 int deleteUmsShopById(Long id);
	
}
