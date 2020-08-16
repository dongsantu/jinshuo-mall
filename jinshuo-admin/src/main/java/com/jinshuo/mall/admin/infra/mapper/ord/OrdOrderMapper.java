package com.jinshuo.mall.admin.infra.mapper.ord;

import com.jinshuo.mall.admin.domain.ord.OrdOrder;
import java.util.List;	

/**
 * 订单 数据层
 * 
 * @author dyh
 * @date 2020-08-10
 */
public interface OrdOrderMapper 
{
	/**
     * 查询订单信息
     * 
     * @param id 订单ID
     * @return 订单信息
     */
	public OrdOrder selectOrdOrderById(Long id);
	
	/**
     * 查询订单列表
     * 
     * @param ordOrder 订单信息
     * @return 订单集合
     */
	public List<OrdOrder> selectOrdOrderList(OrdOrder ordOrder);
	
	/**
     * 新增订单
     * 
     * @param ordOrder 订单信息
     * @return 结果
     */
	public int insertOrdOrder(OrdOrder ordOrder);
	
	/**
     * 修改订单
     * 
     * @param ordOrder 订单信息
     * @return 结果
     */
	public int updateOrdOrder(OrdOrder ordOrder);
	
	/**
     * 删除订单
     * 
     * @param id 订单ID
     * @return 结果
     */
	public int deleteOrdOrderById(Long id);
	
	/**
     * 批量删除订单
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteOrdOrderByIds(String[] ids);
	
}