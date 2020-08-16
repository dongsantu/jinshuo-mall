package com.jinshuo.mall.admin.application.service.ord;

import com.github.pagehelper.PageInfo;
import com.jinshuo.mall.admin.application.dto.qry.ord.OrdCartItemQry;
import com.jinshuo.mall.admin.domain.ord.OrdCartItem;

/**
 *  服务层
 * 
 * @author dyh
 * @date 2020-08-10
 */
public interface IOrdCartItemService 
{
	/**
     * 查询信息
     * 
     * @param id ID
     * @return 信息
     */
	 OrdCartItem selectOrdCartItemById(Long id);
	
	/**
     * 查询列表
     * 
     * @param qry 信息
     * @return 集合
     */
	PageInfo selectOrdCartItemPage(OrdCartItemQry qry);
	
	/**
     * 新增
     * 
     * @param ordCartItem 信息
     * @return 结果
     */
	 int insertOrdCartItem(OrdCartItem ordCartItem);
	
	/**
     * 修改
     * 
     * @param ordCartItem 信息
     * @return 结果
     */
	 int updateOrdCartItem(OrdCartItem ordCartItem);
		
	/**
     * 删除信息
     * 
     * @param id 需要删除的数据ID
     * @return 结果
     */
	 int deleteOrdCartItemById(Long id);
	
}
