package com.jinshuo.mall.admin.application.service.gds;

import com.github.pagehelper.PageInfo;
import com.jinshuo.mall.admin.domain.gds.GdsCoupon;

/**
 *  服务层
 * 
 * @author dyh
 * @date 2020-08-12
 */
public interface IGdsCouponService 
{
	/**
     * 查询信息
     * 
     * @param id ID
     * @return 信息
     */
	 GdsCoupon selectGdsCouponById(Long id);
	
	/**
     * 查询列表
     * 
     * @param qry 信息
     * @return 集合
     */
	PageInfo selectGdsCouponPage(GdsCoupon qry);
	
	/**
     * 新增
     * 
     * @param gdsCoupon 信息
     * @return 结果
     */
	 int insertGdsCoupon(GdsCoupon gdsCoupon);
	
	/**
     * 修改
     * 
     * @param gdsCoupon 信息
     * @return 结果
     */
	 int updateGdsCoupon(GdsCoupon gdsCoupon);
		
	/**
     * 删除信息
     * 
     * @param id 需要删除的数据ID
     * @return 结果
     */
	 int deleteGdsCouponById(Long id);
	
}
