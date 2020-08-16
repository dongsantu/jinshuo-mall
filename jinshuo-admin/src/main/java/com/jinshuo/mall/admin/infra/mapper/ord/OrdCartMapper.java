package com.jinshuo.mall.admin.infra.mapper.ord;

import com.jinshuo.mall.admin.domain.ord.OrdCart;
import java.util.List;	

/**
 *  数据层
 * 
 * @author dyh
 * @date 2020-08-10
 */
public interface OrdCartMapper 
{
	/**
     * 查询信息
     * 
     * @param id ID
     * @return 信息
     */
	public OrdCart selectOrdCartById(Long id);
	
	/**
     * 查询列表
     * 
     * @param ordCart 信息
     * @return 集合
     */
	public List<OrdCart> selectOrdCartList(OrdCart ordCart);
	
	/**
     * 新增
     * 
     * @param ordCart 信息
     * @return 结果
     */
	public int insertOrdCart(OrdCart ordCart);
	
	/**
     * 修改
     * 
     * @param ordCart 信息
     * @return 结果
     */
	public int updateOrdCart(OrdCart ordCart);
	
	/**
     * 删除
     * 
     * @param id ID
     * @return 结果
     */
	public int deleteOrdCartById(Long id);
	
	/**
     * 批量删除
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteOrdCartByIds(String[] ids);
	
}