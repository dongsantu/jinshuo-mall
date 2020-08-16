package com.jinshuo.mall.admin.application.service.ord;

import com.github.pagehelper.PageInfo;
import com.jinshuo.mall.admin.application.dto.qry.ord.OrdMcSetOrderQry;
import com.jinshuo.mall.admin.domain.ord.OrdMcSetOrder;

/**
 *  服务层
 * 
 * @author dyh
 * @date 2020-08-10
 */
public interface IOrdMcSetOrderService 
{
	/**
     * 查询信息
     * 
     * @param id ID
     * @return 信息
     */
	 OrdMcSetOrder selectOrdMcSetOrderById(Long id);
	
	/**
     * 查询列表
     * 
     * @param qry 信息
     * @return 集合
     */
	PageInfo selectOrdMcSetOrderPage(OrdMcSetOrderQry qry);
	
	/**
     * 新增
     * 
     * @param ordMcSetOrder 信息
     * @return 结果
     */
	 int insertOrdMcSetOrder(OrdMcSetOrder ordMcSetOrder);
	
	/**
     * 修改
     * 
     * @param ordMcSetOrder 信息
     * @return 结果
     */
	 int updateOrdMcSetOrder(OrdMcSetOrder ordMcSetOrder);
		
	/**
     * 删除信息
     * 
     * @param id 需要删除的数据ID
     * @return 结果
     */
	 int deleteOrdMcSetOrderById(Long id);
	
}
