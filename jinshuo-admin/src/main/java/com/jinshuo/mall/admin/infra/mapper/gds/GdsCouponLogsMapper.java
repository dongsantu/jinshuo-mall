package com.jinshuo.mall.admin.infra.mapper.gds;

import com.jinshuo.mall.admin.domain.gds.GdsCouponLogs;
import java.util.List;	

/**
 *  数据层
 * 
 * @author dyh
 * @date 2020-08-12
 */
public interface GdsCouponLogsMapper 
{
	/**
     * 查询信息
     * 
     * @param id ID
     * @return 信息
     */
	public GdsCouponLogs selectGdsCouponLogsById(Long id);
	
	/**
     * 查询列表
     * 
     * @param gdsCouponLogs 信息
     * @return 集合
     */
	public List<GdsCouponLogs> selectGdsCouponLogsList(GdsCouponLogs gdsCouponLogs);
	
	/**
     * 新增
     * 
     * @param gdsCouponLogs 信息
     * @return 结果
     */
	public int insertGdsCouponLogs(GdsCouponLogs gdsCouponLogs);
	
	/**
     * 修改
     * 
     * @param gdsCouponLogs 信息
     * @return 结果
     */
	public int updateGdsCouponLogs(GdsCouponLogs gdsCouponLogs);
	
	/**
     * 删除
     * 
     * @param id ID
     * @return 结果
     */
	public int deleteGdsCouponLogsById(Long id);
	
	/**
     * 批量删除
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteGdsCouponLogsByIds(String[] ids);
	
}