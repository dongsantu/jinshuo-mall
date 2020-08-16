package com.jinshuo.mall.admin.infra.mapper.ums;

import com.jinshuo.mall.admin.domain.ums.UmsVisitorLog;

import java.util.List;

/**
 *  数据层
 * 
 * @author dyh
 * @date 2020-08-12
 */
public interface UmsVisitorLogMapper 
{
	/**
     * 查询信息
     * 
     * @param id ID
     * @return 信息
     */
	public UmsVisitorLog selectUmsVisitorLogById(Long id);
	
	/**
     * 查询列表
     * 
     * @param umsVisitorLog 信息
     * @return 集合
     */
	public List<UmsVisitorLog> selectUmsVisitorLogList(UmsVisitorLog umsVisitorLog);
	
	/**
     * 新增
     * 
     * @param umsVisitorLog 信息
     * @return 结果
     */
	public int insertUmsVisitorLog(UmsVisitorLog umsVisitorLog);
	
	/**
     * 修改
     * 
     * @param umsVisitorLog 信息
     * @return 结果
     */
	public int updateUmsVisitorLog(UmsVisitorLog umsVisitorLog);
	
	/**
     * 删除
     * 
     * @param id ID
     * @return 结果
     */
	public int deleteUmsVisitorLogById(Long id);
	
	/**
     * 批量删除
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteUmsVisitorLogByIds(String[] ids);
	
}