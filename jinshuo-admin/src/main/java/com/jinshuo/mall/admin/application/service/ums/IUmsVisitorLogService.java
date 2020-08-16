package com.jinshuo.mall.admin.application.service.ums;

import com.github.pagehelper.PageInfo;
import com.jinshuo.mall.admin.domain.ums.UmsVisitorLog;

/**
 *  服务层
 * 
 * @author dyh
 * @date 2020-08-12
 */
public interface IUmsVisitorLogService 
{
	/**
     * 查询信息
     * 
     * @param id ID
     * @return 信息
     */
	 UmsVisitorLog selectUmsVisitorLogById(Long id);
	
	/**
     * 查询列表
     * 
     * @param qry 信息
     * @return 集合
     */
	PageInfo selectUmsVisitorLogPage(UmsVisitorLog qry);
	
	/**
     * 新增
     * 
     * @param umsVisitorLog 信息
     * @return 结果
     */
	 int insertUmsVisitorLog(UmsVisitorLog umsVisitorLog);
	
	/**
     * 修改
     * 
     * @param umsVisitorLog 信息
     * @return 结果
     */
	 int updateUmsVisitorLog(UmsVisitorLog umsVisitorLog);
		
	/**
     * 删除信息
     * 
     * @param id 需要删除的数据ID
     * @return 结果
     */
	 int deleteUmsVisitorLogById(Long id);
	
}
