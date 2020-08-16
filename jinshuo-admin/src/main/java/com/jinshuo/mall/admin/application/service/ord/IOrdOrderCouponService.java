package com.jinshuo.mall.admin.application.service.ord;

import com.github.pagehelper.PageInfo;
import com.jinshuo.mall.admin.application.dto.qry.ord.OrdOrderCouponQry;
import com.jinshuo.mall.admin.domain.ord.OrdOrderCoupon;

/**
 * 订单 服务层
 * 
 * @author dyh
 * @date 2020-08-10
 */
public interface IOrdOrderCouponService 
{
	/**
     * 查询订单信息
     * 
     * @param id 订单ID
     * @return 订单信息
     */
	 OrdOrderCoupon selectOrdOrderCouponById(Long id);
	
	/**
     * 查询订单列表
     * 
     * @param qry 订单信息
     * @return 订单集合
     */
	PageInfo selectOrdOrderCouponPage(OrdOrderCouponQry qry);
	
	/**
     * 新增订单
     * 
     * @param ordOrderCoupon 订单信息
     * @return 结果
     */
	 int insertOrdOrderCoupon(OrdOrderCoupon ordOrderCoupon);
	
	/**
     * 修改订单
     * 
     * @param ordOrderCoupon 订单信息
     * @return 结果
     */
	 int updateOrdOrderCoupon(OrdOrderCoupon ordOrderCoupon);
		
	/**
     * 删除订单信息
     * 
     * @param id 需要删除的数据ID
     * @return 结果
     */
	 int deleteOrdOrderCouponById(Long id);
	
}
