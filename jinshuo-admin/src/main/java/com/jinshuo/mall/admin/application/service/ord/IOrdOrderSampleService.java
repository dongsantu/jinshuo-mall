package com.jinshuo.mall.admin.application.service.ord;

import com.github.pagehelper.PageInfo;
import com.jinshuo.mall.admin.application.dto.qry.ord.OrdOrderSampleQry;
import com.jinshuo.mall.admin.domain.ord.OrdOrderSample;

/**
 * 样品订单 服务层
 * 
 * @author dyh
 * @date 2020-08-10
 */
public interface IOrdOrderSampleService 
{
	/**
     * 查询样品订单信息
     * 
     * @param id 样品订单ID
     * @return 样品订单信息
     */
	 OrdOrderSample selectOrdOrderSampleById(Long id);
	
	/**
     * 查询样品订单列表
     * 
     * @param qry 样品订单信息
     * @return 样品订单集合
     */
	PageInfo selectOrdOrderSamplePage(OrdOrderSampleQry qry);
	
	/**
     * 新增样品订单
     * 
     * @param ordOrderSample 样品订单信息
     * @return 结果
     */
	 int insertOrdOrderSample(OrdOrderSample ordOrderSample);
	
	/**
     * 修改样品订单
     * 
     * @param ordOrderSample 样品订单信息
     * @return 结果
     */
	 int updateOrdOrderSample(OrdOrderSample ordOrderSample);
		
	/**
     * 删除样品订单信息
     * 
     * @param id 需要删除的数据ID
     * @return 结果
     */
	 int deleteOrdOrderSampleById(Long id);
	
}
