package com.jinshuo.mall.admin.infra.mapper.ums;

import com.jinshuo.mall.admin.domain.ums.UmsMerchant;

import java.util.List;

/**
 *  数据层
 * 
 * @author dyh
 * @date 2020-08-12
 */
public interface UmsMerchantMapper 
{
	/**
     * 查询信息
     * 
     * @param id ID
     * @return 信息
     */
	public UmsMerchant selectUmsMerchantById(Long id);
	
	/**
     * 查询列表
     * 
     * @param umsMerchant 信息
     * @return 集合
     */
	public List<UmsMerchant> selectUmsMerchantList(UmsMerchant umsMerchant);
	
	/**
     * 新增
     * 
     * @param umsMerchant 信息
     * @return 结果
     */
	public int insertUmsMerchant(UmsMerchant umsMerchant);
	
	/**
     * 修改
     * 
     * @param umsMerchant 信息
     * @return 结果
     */
	public int updateUmsMerchant(UmsMerchant umsMerchant);
	
	/**
     * 删除
     * 
     * @param id ID
     * @return 结果
     */
	public int deleteUmsMerchantById(Long id);
	
	/**
     * 批量删除
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteUmsMerchantByIds(String[] ids);
	
}