package com.jinshuo.mall.admin.infra.mapper.ord;

import com.jinshuo.mall.admin.domain.ord.OrdCartItem;
import java.util.List;	

/**
 *  数据层
 * 
 * @author dyh
 * @date 2020-08-10
 */
public interface OrdCartItemMapper 
{
	/**
     * 查询信息
     * 
     * @param id ID
     * @return 信息
     */
	public OrdCartItem selectOrdCartItemById(Long id);
	
	/**
     * 查询列表
     * 
     * @param ordCartItem 信息
     * @return 集合
     */
	public List<OrdCartItem> selectOrdCartItemList(OrdCartItem ordCartItem);
	
	/**
     * 新增
     * 
     * @param ordCartItem 信息
     * @return 结果
     */
	public int insertOrdCartItem(OrdCartItem ordCartItem);
	
	/**
     * 修改
     * 
     * @param ordCartItem 信息
     * @return 结果
     */
	public int updateOrdCartItem(OrdCartItem ordCartItem);
	
	/**
     * 删除
     * 
     * @param id ID
     * @return 结果
     */
	public int deleteOrdCartItemById(Long id);
	
	/**
     * 批量删除
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteOrdCartItemByIds(String[] ids);
	
}