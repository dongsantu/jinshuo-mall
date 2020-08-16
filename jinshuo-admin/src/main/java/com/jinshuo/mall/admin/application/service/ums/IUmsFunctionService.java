package com.jinshuo.mall.admin.application.service.ums;

import com.github.pagehelper.PageInfo;
import com.jinshuo.mall.admin.domain.ums.UmsFunction;

/**
 * 用户店铺关联 服务层
 * 
 * @author dyh
 * @date 2020-08-12
 */
public interface IUmsFunctionService 
{
	/**
     * 查询用户店铺关联信息
     * 
     * @param id 用户店铺关联ID
     * @return 用户店铺关联信息
     */
	 UmsFunction selectUmsFunctionById(Long id);
	
	/**
     * 查询用户店铺关联列表
     * 
     * @param qry 用户店铺关联信息
     * @return 用户店铺关联集合
     */
	PageInfo selectUmsFunctionPage(UmsFunction qry);
	
	/**
     * 新增用户店铺关联
     * 
     * @param umsFunction 用户店铺关联信息
     * @return 结果
     */
	 int insertUmsFunction(UmsFunction umsFunction);
	
	/**
     * 修改用户店铺关联
     * 
     * @param umsFunction 用户店铺关联信息
     * @return 结果
     */
	 int updateUmsFunction(UmsFunction umsFunction);
		
	/**
     * 删除用户店铺关联信息
     * 
     * @param id 需要删除的数据ID
     * @return 结果
     */
	 int deleteUmsFunctionById(Long id);
	
}
