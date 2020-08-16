package com.jinshuo.mall.admin.application.service.ums;

import com.github.pagehelper.PageInfo;
import com.jinshuo.mall.admin.domain.ums.UmsSupplier;

/**
 * 供应商 服务层
 * 
 * @author dyh
 * @date 2020-08-12
 */
public interface IUmsSupplierService 
{
	/**
     * 查询供应商信息
     * 
     * @param id 供应商ID
     * @return 供应商信息
     */
	 UmsSupplier selectUmsSupplierById(Long id);
	
	/**
     * 查询供应商列表
     * 
     * @param qry 供应商信息
     * @return 供应商集合
     */
	PageInfo selectUmsSupplierPage(UmsSupplier qry);
	
	/**
     * 新增供应商
     * 
     * @param umsSupplier 供应商信息
     * @return 结果
     */
	 int insertUmsSupplier(UmsSupplier umsSupplier);
	
	/**
     * 修改供应商
     * 
     * @param umsSupplier 供应商信息
     * @return 结果
     */
	 int updateUmsSupplier(UmsSupplier umsSupplier);
		
	/**
     * 删除供应商信息
     * 
     * @param id 需要删除的数据ID
     * @return 结果
     */
	 int deleteUmsSupplierById(Long id);
	
}
