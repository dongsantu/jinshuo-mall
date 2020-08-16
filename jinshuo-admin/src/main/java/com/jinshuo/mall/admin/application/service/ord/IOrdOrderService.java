package com.jinshuo.mall.admin.application.service.ord;

import com.github.pagehelper.PageInfo;
import com.jinshuo.mall.admin.application.dto.qry.ord.OrdOrderQry;
import com.jinshuo.mall.admin.domain.ord.OrdOrder;

/**
 * 订单 服务层
 * 
 * @author dyh
 * @date 2020-08-10
 */
public interface IOrdOrderService 
{
	/**
     * 查询订单信息
     * 
     * @param id 订单ID
     * @return 订单信息
     */
	 OrdOrder selectOrdOrderById(Long id);
	
	/**
     * 查询订单列表
     * 
     * @param qry 订单信息
     * @return 订单集合
     */
	PageInfo selectOrdOrderPage(OrdOrderQry qry);
	
	/**
     * 新增订单
     * 
     * @param ordOrder 订单信息
     * @return 结果
     */
	 int insertOrdOrder(OrdOrder ordOrder);
	
	/**
     * 修改订单
     * 
     * @param ordOrder 订单信息
     * @return 结果
     */
	 int updateOrdOrder(OrdOrder ordOrder);
		
	/**
     * 删除订单信息
     * 
     * @param id 需要删除的数据ID
     * @return 结果
     */
	 int deleteOrdOrderById(Long id);
	
}
