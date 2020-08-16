package com.jinshuo.mall.admin.application.service.ord;

import com.github.pagehelper.PageInfo;
import com.jinshuo.mall.admin.application.dto.qry.ord.OrdOrderAddressQry;
import com.jinshuo.mall.admin.domain.ord.OrdOrderAddress;

/**
 * 订单收货地址 服务层
 * 
 * @author dyh
 * @date 2020-08-10
 */
public interface IOrdOrderAddressService 
{
	/**
     * 查询订单收货地址信息
     * 
     * @param id 订单收货地址ID
     * @return 订单收货地址信息
     */
	 OrdOrderAddress selectOrdOrderAddressById(Long id);
	
	/**
     * 查询订单收货地址列表
     * 
     * @param qry 订单收货地址信息
     * @return 订单收货地址集合
     */
	PageInfo selectOrdOrderAddressPage(OrdOrderAddressQry qry);
	
	/**
     * 新增订单收货地址
     * 
     * @param ordOrderAddress 订单收货地址信息
     * @return 结果
     */
	 int insertOrdOrderAddress(OrdOrderAddress ordOrderAddress);
	
	/**
     * 修改订单收货地址
     * 
     * @param ordOrderAddress 订单收货地址信息
     * @return 结果
     */
	 int updateOrdOrderAddress(OrdOrderAddress ordOrderAddress);
		
	/**
     * 删除订单收货地址信息
     * 
     * @param id 需要删除的数据ID
     * @return 结果
     */
	 int deleteOrdOrderAddressById(Long id);
	
}
