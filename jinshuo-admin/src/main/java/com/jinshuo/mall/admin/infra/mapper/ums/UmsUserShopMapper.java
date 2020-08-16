package com.jinshuo.mall.admin.infra.mapper.ums;

import com.jinshuo.mall.admin.domain.ums.UmsUserShop;

import java.util.List;

/**
 * 用户店铺关联 数据层
 * 
 * @author dyh
 * @date 2020-08-12
 */
public interface UmsUserShopMapper 
{
	/**
     * 查询用户店铺关联信息
     * 
     * @param userId 用户店铺关联ID
     * @return 用户店铺关联信息
     */
	public UmsUserShop selectUmsUserShopById(Long userId);
	
	/**
     * 查询用户店铺关联列表
     * 
     * @param umsUserShop 用户店铺关联信息
     * @return 用户店铺关联集合
     */
	public List<UmsUserShop> selectUmsUserShopList(UmsUserShop umsUserShop);
	
	/**
     * 新增用户店铺关联
     * 
     * @param umsUserShop 用户店铺关联信息
     * @return 结果
     */
	public int insertUmsUserShop(UmsUserShop umsUserShop);
	
	/**
     * 修改用户店铺关联
     * 
     * @param umsUserShop 用户店铺关联信息
     * @return 结果
     */
	public int updateUmsUserShop(UmsUserShop umsUserShop);
	
	/**
     * 删除用户店铺关联
     * 
     * @param userId 用户店铺关联ID
     * @return 结果
     */
	public int deleteUmsUserShopById(Long userId);
	
	/**
     * 批量删除用户店铺关联
     * 
     * @param userIds 需要删除的数据ID
     * @return 结果
     */
	public int deleteUmsUserShopByIds(String[] userIds);
	
}