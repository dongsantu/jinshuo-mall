package com.jinshuo.mall.admin.infra.mapper.ord;

import com.jinshuo.mall.admin.domain.ord.OrdMcSetOrder;
import java.util.List;	

/**
 *  数据层
 * 
 * @author dyh
 * @date 2020-08-10
 */
public interface OrdMcSetOrderMapper 
{
	/**
     * 查询信息
     * 
     * @param id ID
     * @return 信息
     */
	public OrdMcSetOrder selectOrdMcSetOrderById(Long id);
	
	/**
     * 查询列表
     * 
     * @param ordMcSetOrder 信息
     * @return 集合
     */
	public List<OrdMcSetOrder> selectOrdMcSetOrderList(OrdMcSetOrder ordMcSetOrder);
	
	/**
     * 新增
     * 
     * @param ordMcSetOrder 信息
     * @return 结果
     */
	public int insertOrdMcSetOrder(OrdMcSetOrder ordMcSetOrder);
	
	/**
     * 修改
     * 
     * @param ordMcSetOrder 信息
     * @return 结果
     */
	public int updateOrdMcSetOrder(OrdMcSetOrder ordMcSetOrder);
	
	/**
     * 删除
     * 
     * @param id ID
     * @return 结果
     */
	public int deleteOrdMcSetOrderById(Long id);
	
	/**
     * 批量删除
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteOrdMcSetOrderByIds(String[] ids);
	
}