package com.jinshuo.mall.admin.infra.mapper.ums;

import com.jinshuo.mall.admin.domain.ums.UmsShop;

import java.util.List;

/**
 *  数据层
 * 
 * @author dyh
 * @date 2020-08-12
 */
public interface UmsShopMapper 
{
	/**
     * 查询信息
     * 
     * @param id ID
     * @return 信息
     */
	public UmsShop selectUmsShopById(Long id);
	
	/**
     * 查询列表
     * 
     * @param umsShop 信息
     * @return 集合
     */
	public List<UmsShop> selectUmsShopList(UmsShop umsShop);
	
	/**
     * 新增
     * 
     * @param umsShop 信息
     * @return 结果
     */
	public int insertUmsShop(UmsShop umsShop);
	
	/**
     * 修改
     * 
     * @param umsShop 信息
     * @return 结果
     */
	public int updateUmsShop(UmsShop umsShop);
	
	/**
     * 删除
     * 
     * @param id ID
     * @return 结果
     */
	public int deleteUmsShopById(Long id);
	
	/**
     * 批量删除
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteUmsShopByIds(String[] ids);
	
}