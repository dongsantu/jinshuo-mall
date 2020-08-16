package com.jinshuo.mall.admin.application.service.ord;

import com.github.pagehelper.PageInfo;
import com.jinshuo.mall.admin.application.dto.qry.ord.OrdOrderDetailQry;
import com.jinshuo.mall.admin.domain.ord.OrdOrderDetail;

/**
 * 订单详情 服务层
 * 
 * @author dyh
 * @date 2020-08-10
 */
public interface IOrdOrderDetailService 
{
	/**
     * 查询订单详情信息
     * 
     * @param id 订单详情ID
     * @return 订单详情信息
     */
	 OrdOrderDetail selectOrdOrderDetailById(Long id);
	
	/**
     * 查询订单详情列表
     * 
     * @param qry 订单详情信息
     * @return 订单详情集合
     */
	PageInfo selectOrdOrderDetailPage(OrdOrderDetailQry qry);
	
	/**
     * 新增订单详情
     * 
     * @param ordOrderDetail 订单详情信息
     * @return 结果
     */
	 int insertOrdOrderDetail(OrdOrderDetail ordOrderDetail);
	
	/**
     * 修改订单详情
     * 
     * @param ordOrderDetail 订单详情信息
     * @return 结果
     */
	 int updateOrdOrderDetail(OrdOrderDetail ordOrderDetail);
		
	/**
     * 删除订单详情信息
     * 
     * @param id 需要删除的数据ID
     * @return 结果
     */
	 int deleteOrdOrderDetailById(Long id);
	
}
