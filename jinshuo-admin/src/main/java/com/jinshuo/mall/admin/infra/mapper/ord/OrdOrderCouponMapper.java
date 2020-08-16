package com.jinshuo.mall.admin.infra.mapper.ord;

import com.jinshuo.mall.admin.domain.ord.OrdOrderCoupon;
import java.util.List;	

/**
 * 订单 数据层
 * 
 * @author dyh
 * @date 2020-08-10
 */
public interface OrdOrderCouponMapper 
{
	/**
     * 查询订单信息
     * 
     * @param id 订单ID
     * @return 订单信息
     */
	public OrdOrderCoupon selectOrdOrderCouponById(Long id);
	
	/**
     * 查询订单列表
     * 
     * @param ordOrderCoupon 订单信息
     * @return 订单集合
     */
	public List<OrdOrderCoupon> selectOrdOrderCouponList(OrdOrderCoupon ordOrderCoupon);
	
	/**
     * 新增订单
     * 
     * @param ordOrderCoupon 订单信息
     * @return 结果
     */
	public int insertOrdOrderCoupon(OrdOrderCoupon ordOrderCoupon);
	
	/**
     * 修改订单
     * 
     * @param ordOrderCoupon 订单信息
     * @return 结果
     */
	public int updateOrdOrderCoupon(OrdOrderCoupon ordOrderCoupon);
	
	/**
     * 删除订单
     * 
     * @param id 订单ID
     * @return 结果
     */
	public int deleteOrdOrderCouponById(Long id);
	
	/**
     * 批量删除订单
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteOrdOrderCouponByIds(String[] ids);
	
}