package com.jinshuo.mall.admin.application.service.ums;

import com.github.pagehelper.PageInfo;
import com.jinshuo.mall.admin.domain.ums.UmsUserShop;

/**
 * 用户店铺关联 服务层
 * 
 * @author dyh
 * @date 2020-08-12
 */
public interface IUmsUserShopService 
{
	/**
     * 查询用户店铺关联信息
     * 
     * @param userId 用户店铺关联ID
     * @return 用户店铺关联信息
     */
	 UmsUserShop selectUmsUserShopById(Long userId);
	
	/**
     * 查询用户店铺关联列表
     * 
     * @param qry 用户店铺关联信息
     * @return 用户店铺关联集合
     */
	PageInfo selectUmsUserShopPage(UmsUserShop qry);
	
	/**
     * 新增用户店铺关联
     * 
     * @param umsUserShop 用户店铺关联信息
     * @return 结果
     */
	 int insertUmsUserShop(UmsUserShop umsUserShop);
	
	/**
     * 修改用户店铺关联
     * 
     * @param umsUserShop 用户店铺关联信息
     * @return 结果
     */
	 int updateUmsUserShop(UmsUserShop umsUserShop);
		
	/**
     * 删除用户店铺关联信息
     * 
     * @param id 需要删除的数据ID
     * @return 结果
     */
	 int deleteUmsUserShopById(Long id);
	
}
