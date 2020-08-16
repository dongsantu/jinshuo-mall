package com.jinshuo.mall.admin.infra.mapper.ums;

import com.jinshuo.mall.admin.domain.ums.UmsFunction;

import java.util.List;

/**
 * 用户店铺关联 数据层
 * 
 * @author dyh
 * @date 2020-08-12
 */
public interface UmsFunctionMapper 
{
	/**
     * 查询用户店铺关联信息
     * 
     * @param id 用户店铺关联ID
     * @return 用户店铺关联信息
     */
	public UmsFunction selectUmsFunctionById(Long id);
	
	/**
     * 查询用户店铺关联列表
     * 
     * @param umsFunction 用户店铺关联信息
     * @return 用户店铺关联集合
     */
	public List<UmsFunction> selectUmsFunctionList(UmsFunction umsFunction);
	
	/**
     * 新增用户店铺关联
     * 
     * @param umsFunction 用户店铺关联信息
     * @return 结果
     */
	public int insertUmsFunction(UmsFunction umsFunction);
	
	/**
     * 修改用户店铺关联
     * 
     * @param umsFunction 用户店铺关联信息
     * @return 结果
     */
	public int updateUmsFunction(UmsFunction umsFunction);
	
	/**
     * 删除用户店铺关联
     * 
     * @param id 用户店铺关联ID
     * @return 结果
     */
	public int deleteUmsFunctionById(Long id);
	
	/**
     * 批量删除用户店铺关联
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteUmsFunctionByIds(String[] ids);
	
}