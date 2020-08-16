package com.jinshuo.mall.admin.application.service.gds;

import com.github.pagehelper.PageInfo;
import com.jinshuo.mall.admin.domain.gds.GdsCouponLogs;

/**
 *  服务层
 * 
 * @author dyh
 * @date 2020-08-12
 */
public interface IGdsCouponLogsService 
{
	/**
     * 查询信息
     * 
     * @param id ID
     * @return 信息
     */
	 GdsCouponLogs selectGdsCouponLogsById(Long id);
	
	/**
     * 查询列表
     * 
     * @param qry 信息
     * @return 集合
     */
	PageInfo selectGdsCouponLogsPage(GdsCouponLogs qry);
	
	/**
     * 新增
     * 
     * @param gdsCouponLogs 信息
     * @return 结果
     */
	 int insertGdsCouponLogs(GdsCouponLogs gdsCouponLogs);
	
	/**
     * 修改
     * 
     * @param gdsCouponLogs 信息
     * @return 结果
     */
	 int updateGdsCouponLogs(GdsCouponLogs gdsCouponLogs);
		
	/**
     * 删除信息
     * 
     * @param id 需要删除的数据ID
     * @return 结果
     */
	 int deleteGdsCouponLogsById(Long id);
	
}
