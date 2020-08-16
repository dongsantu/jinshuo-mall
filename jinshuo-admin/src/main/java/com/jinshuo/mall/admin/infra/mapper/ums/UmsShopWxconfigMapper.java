package com.jinshuo.mall.admin.infra.mapper.ums;

import com.jinshuo.mall.admin.domain.ums.UmsShopWxconfig;

import java.util.List;

/**
 * 微信配置 数据层
 * 
 * @author dyh
 * @date 2020-08-12
 */
public interface UmsShopWxconfigMapper 
{
	/**
     * 查询微信配置信息
     * 
     * @param id 微信配置ID
     * @return 微信配置信息
     */
	public UmsShopWxconfig selectUmsShopWxconfigById(Long id);
	
	/**
     * 查询微信配置列表
     * 
     * @param umsShopWxconfig 微信配置信息
     * @return 微信配置集合
     */
	public List<UmsShopWxconfig> selectUmsShopWxconfigList(UmsShopWxconfig umsShopWxconfig);
	
	/**
     * 新增微信配置
     * 
     * @param umsShopWxconfig 微信配置信息
     * @return 结果
     */
	public int insertUmsShopWxconfig(UmsShopWxconfig umsShopWxconfig);
	
	/**
     * 修改微信配置
     * 
     * @param umsShopWxconfig 微信配置信息
     * @return 结果
     */
	public int updateUmsShopWxconfig(UmsShopWxconfig umsShopWxconfig);
	
	/**
     * 删除微信配置
     * 
     * @param id 微信配置ID
     * @return 结果
     */
	public int deleteUmsShopWxconfigById(Long id);
	
	/**
     * 批量删除微信配置
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteUmsShopWxconfigByIds(String[] ids);
	
}