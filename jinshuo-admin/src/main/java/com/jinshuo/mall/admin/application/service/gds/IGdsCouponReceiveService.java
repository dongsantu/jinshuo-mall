package com.jinshuo.mall.admin.application.service.gds;

import com.github.pagehelper.PageInfo;
import com.jinshuo.mall.admin.domain.gds.GdsCouponReceive;

/**
 *  服务层
 * 
 * @author dyh
 * @date 2020-08-12
 */
public interface IGdsCouponReceiveService 
{
	/**
     * 查询信息
     * 
     * @param id ID
     * @return 信息
     */
	 GdsCouponReceive selectGdsCouponReceiveById(Long id);
	
	/**
     * 查询列表
     * 
     * @param qry 信息
     * @return 集合
     */
	PageInfo selectGdsCouponReceivePage(GdsCouponReceive qry);
	
	/**
     * 新增
     * 
     * @param gdsCouponReceive 信息
     * @return 结果
     */
	 int insertGdsCouponReceive(GdsCouponReceive gdsCouponReceive);
	
	/**
     * 修改
     * 
     * @param gdsCouponReceive 信息
     * @return 结果
     */
	 int updateGdsCouponReceive(GdsCouponReceive gdsCouponReceive);
		
	/**
     * 删除信息
     * 
     * @param id 需要删除的数据ID
     * @return 结果
     */
	 int deleteGdsCouponReceiveById(Long id);
	
}
