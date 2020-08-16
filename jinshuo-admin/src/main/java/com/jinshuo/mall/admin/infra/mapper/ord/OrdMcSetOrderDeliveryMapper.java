package com.jinshuo.mall.admin.infra.mapper.ord;

import com.jinshuo.mall.admin.domain.ord.OrdMcSetOrderDelivery;
import java.util.List;	

/**
 *  数据层
 * 
 * @author dyh
 * @date 2020-08-10
 */
public interface OrdMcSetOrderDeliveryMapper 
{
	/**
     * 查询信息
     * 
     * @param id ID
     * @return 信息
     */
	public OrdMcSetOrderDelivery selectOrdMcSetOrderDeliveryById(Long id);
	
	/**
     * 查询列表
     * 
     * @param ordMcSetOrderDelivery 信息
     * @return 集合
     */
	public List<OrdMcSetOrderDelivery> selectOrdMcSetOrderDeliveryList(OrdMcSetOrderDelivery ordMcSetOrderDelivery);
	
	/**
     * 新增
     * 
     * @param ordMcSetOrderDelivery 信息
     * @return 结果
     */
	public int insertOrdMcSetOrderDelivery(OrdMcSetOrderDelivery ordMcSetOrderDelivery);
	
	/**
     * 修改
     * 
     * @param ordMcSetOrderDelivery 信息
     * @return 结果
     */
	public int updateOrdMcSetOrderDelivery(OrdMcSetOrderDelivery ordMcSetOrderDelivery);
	
	/**
     * 删除
     * 
     * @param id ID
     * @return 结果
     */
	public int deleteOrdMcSetOrderDeliveryById(Long id);
	
	/**
     * 批量删除
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteOrdMcSetOrderDeliveryByIds(String[] ids);
	
}