package com.jinshuo.mall.admin.infra.mapper.ums;

import com.jinshuo.mall.admin.domain.ums.UmsShopFunction;

import java.util.List;

/**
 *  数据层
 * 
 * @author dyh
 * @date 2020-08-12
 */
public interface UmsShopFunctionMapper 
{
	/**
     * 查询信息
     * 
     * @param id ID
     * @return 信息
     */
	public UmsShopFunction selectUmsShopFunctionById(Long id);
	
	/**
     * 查询列表
     * 
     * @param umsShopFunction 信息
     * @return 集合
     */
	public List<UmsShopFunction> selectUmsShopFunctionList(UmsShopFunction umsShopFunction);
	
	/**
     * 新增
     * 
     * @param umsShopFunction 信息
     * @return 结果
     */
	public int insertUmsShopFunction(UmsShopFunction umsShopFunction);
	
	/**
     * 修改
     * 
     * @param umsShopFunction 信息
     * @return 结果
     */
	public int updateUmsShopFunction(UmsShopFunction umsShopFunction);
	
	/**
     * 删除
     * 
     * @param id ID
     * @return 结果
     */
	public int deleteUmsShopFunctionById(Long id);
	
	/**
     * 批量删除
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteUmsShopFunctionByIds(String[] ids);
	
}