package com.jinshuo.mall.admin.infra.mapper.ord;

import com.jinshuo.mall.admin.domain.ord.OrdOrderDetail;
import java.util.List;	

/**
 * 订单详情 数据层
 * 
 * @author dyh
 * @date 2020-08-10
 */
public interface OrdOrderDetailMapper 
{
	/**
     * 查询订单详情信息
     * 
     * @param id 订单详情ID
     * @return 订单详情信息
     */
	public OrdOrderDetail selectOrdOrderDetailById(Long id);
	
	/**
     * 查询订单详情列表
     * 
     * @param ordOrderDetail 订单详情信息
     * @return 订单详情集合
     */
	public List<OrdOrderDetail> selectOrdOrderDetailList(OrdOrderDetail ordOrderDetail);
	
	/**
     * 新增订单详情
     * 
     * @param ordOrderDetail 订单详情信息
     * @return 结果
     */
	public int insertOrdOrderDetail(OrdOrderDetail ordOrderDetail);
	
	/**
     * 修改订单详情
     * 
     * @param ordOrderDetail 订单详情信息
     * @return 结果
     */
	public int updateOrdOrderDetail(OrdOrderDetail ordOrderDetail);
	
	/**
     * 删除订单详情
     * 
     * @param id 订单详情ID
     * @return 结果
     */
	public int deleteOrdOrderDetailById(Long id);
	
	/**
     * 批量删除订单详情
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteOrdOrderDetailByIds(String[] ids);
	
}