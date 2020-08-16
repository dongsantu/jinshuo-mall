package com.jinshuo.mall.admin.infra.mapper.ord;

import com.jinshuo.mall.admin.domain.ord.OrdOrderAddress;
import java.util.List;	

/**
 * 订单收货地址 数据层
 * 
 * @author dyh
 * @date 2020-08-10
 */
public interface OrdOrderAddressMapper 
{
	/**
     * 查询订单收货地址信息
     * 
     * @param id 订单收货地址ID
     * @return 订单收货地址信息
     */
	public OrdOrderAddress selectOrdOrderAddressById(Long id);
	
	/**
     * 查询订单收货地址列表
     * 
     * @param ordOrderAddress 订单收货地址信息
     * @return 订单收货地址集合
     */
	public List<OrdOrderAddress> selectOrdOrderAddressList(OrdOrderAddress ordOrderAddress);
	
	/**
     * 新增订单收货地址
     * 
     * @param ordOrderAddress 订单收货地址信息
     * @return 结果
     */
	public int insertOrdOrderAddress(OrdOrderAddress ordOrderAddress);
	
	/**
     * 修改订单收货地址
     * 
     * @param ordOrderAddress 订单收货地址信息
     * @return 结果
     */
	public int updateOrdOrderAddress(OrdOrderAddress ordOrderAddress);
	
	/**
     * 删除订单收货地址
     * 
     * @param id 订单收货地址ID
     * @return 结果
     */
	public int deleteOrdOrderAddressById(Long id);
	
	/**
     * 批量删除订单收货地址
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteOrdOrderAddressByIds(String[] ids);
	
}