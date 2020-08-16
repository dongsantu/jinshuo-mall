package com.jinshuo.mall.admin.infra.mapper.ums;

import com.jinshuo.mall.admin.domain.ums.UmsSupplier;

import java.util.List;

/**
 * 供应商 数据层
 * 
 * @author dyh
 * @date 2020-08-12
 */
public interface UmsSupplierMapper 
{
	/**
     * 查询供应商信息
     * 
     * @param id 供应商ID
     * @return 供应商信息
     */
	public UmsSupplier selectUmsSupplierById(Long id);
	
	/**
     * 查询供应商列表
     * 
     * @param umsSupplier 供应商信息
     * @return 供应商集合
     */
	public List<UmsSupplier> selectUmsSupplierList(UmsSupplier umsSupplier);
	
	/**
     * 新增供应商
     * 
     * @param umsSupplier 供应商信息
     * @return 结果
     */
	public int insertUmsSupplier(UmsSupplier umsSupplier);
	
	/**
     * 修改供应商
     * 
     * @param umsSupplier 供应商信息
     * @return 结果
     */
	public int updateUmsSupplier(UmsSupplier umsSupplier);
	
	/**
     * 删除供应商
     * 
     * @param id 供应商ID
     * @return 结果
     */
	public int deleteUmsSupplierById(Long id);
	
	/**
     * 批量删除供应商
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteUmsSupplierByIds(String[] ids);
	
}