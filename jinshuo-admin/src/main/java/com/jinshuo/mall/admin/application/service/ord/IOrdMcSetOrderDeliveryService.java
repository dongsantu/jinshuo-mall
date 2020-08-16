package com.jinshuo.mall.admin.application.service.ord;

import com.github.pagehelper.PageInfo;
import com.jinshuo.mall.admin.application.dto.qry.ord.OrdMcSetOrderDeliveryQry;
import com.jinshuo.mall.admin.domain.ord.OrdMcSetOrderDelivery;

/**
 *  服务层
 * 
 * @author dyh
 * @date 2020-08-10
 */
public interface IOrdMcSetOrderDeliveryService 
{
	/**
     * 查询信息
     * 
     * @param id ID
     * @return 信息
     */
	 OrdMcSetOrderDelivery selectOrdMcSetOrderDeliveryById(Long id);
	
	/**
     * 查询列表
     * 
     * @param qry 信息
     * @return 集合
     */
	PageInfo selectOrdMcSetOrderDeliveryPage(OrdMcSetOrderDeliveryQry qry);
	
	/**
     * 新增
     * 
     * @param ordMcSetOrderDelivery 信息
     * @return 结果
     */
	 int insertOrdMcSetOrderDelivery(OrdMcSetOrderDelivery ordMcSetOrderDelivery);
	
	/**
     * 修改
     * 
     * @param ordMcSetOrderDelivery 信息
     * @return 结果
     */
	 int updateOrdMcSetOrderDelivery(OrdMcSetOrderDelivery ordMcSetOrderDelivery);
		
	/**
     * 删除信息
     * 
     * @param id 需要删除的数据ID
     * @return 结果
     */
	 int deleteOrdMcSetOrderDeliveryById(Long id);
	
}
