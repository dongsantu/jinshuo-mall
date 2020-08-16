package com.jinshuo.mall.admin.infra.mapper.ord;

import com.jinshuo.mall.admin.domain.ord.OrdOrderSample;
import java.util.List;	

/**
 * 样品订单 数据层
 * 
 * @author dyh
 * @date 2020-08-10
 */
public interface OrdOrderSampleMapper 
{
	/**
     * 查询样品订单信息
     * 
     * @param id 样品订单ID
     * @return 样品订单信息
     */
	public OrdOrderSample selectOrdOrderSampleById(Long id);
	
	/**
     * 查询样品订单列表
     * 
     * @param ordOrderSample 样品订单信息
     * @return 样品订单集合
     */
	public List<OrdOrderSample> selectOrdOrderSampleList(OrdOrderSample ordOrderSample);
	
	/**
     * 新增样品订单
     * 
     * @param ordOrderSample 样品订单信息
     * @return 结果
     */
	public int insertOrdOrderSample(OrdOrderSample ordOrderSample);
	
	/**
     * 修改样品订单
     * 
     * @param ordOrderSample 样品订单信息
     * @return 结果
     */
	public int updateOrdOrderSample(OrdOrderSample ordOrderSample);
	
	/**
     * 删除样品订单
     * 
     * @param id 样品订单ID
     * @return 结果
     */
	public int deleteOrdOrderSampleById(Long id);
	
	/**
     * 批量删除样品订单
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteOrdOrderSampleByIds(String[] ids);
	
}