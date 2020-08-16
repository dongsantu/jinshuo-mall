package com.jinshuo.mall.admin.application.service.ord;

import com.github.pagehelper.PageInfo;
import com.jinshuo.mall.admin.application.dto.qry.ord.OrdCartQry;
import com.jinshuo.mall.admin.domain.ord.OrdCart;

/**
 *  服务层
 * 
 * @author dyh
 * @date 2020-08-10
 */
public interface IOrdCartService 
{
	/**
     * 查询信息
     * 
     * @param id ID
     * @return 信息
     */
	 OrdCart selectOrdCartById(Long id);
	
	/**
     * 查询列表
     * 
     * @param qry 信息
     * @return 集合
     */
	PageInfo selectOrdCartPage(OrdCartQry qry);
	
	/**
     * 新增
     * 
     * @param ordCart 信息
     * @return 结果
     */
	 int insertOrdCart(OrdCart ordCart);
	
	/**
     * 修改
     * 
     * @param ordCart 信息
     * @return 结果
     */
	 int updateOrdCart(OrdCart ordCart);
		
	/**
     * 删除信息
     * 
     * @param id 需要删除的数据ID
     * @return 结果
     */
	 int deleteOrdCartById(Long id);
	
}
