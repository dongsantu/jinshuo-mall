package com.jinshuo.mall.admin.application.service.ord;

import com.github.pagehelper.PageInfo;
import com.jinshuo.mall.admin.application.dto.qry.ord.OrdExpressQry;
import com.jinshuo.mall.admin.domain.ord.OrdExpress;

/**
 *  服务层
 * 
 * @author dyh
 * @date 2020-08-10
 */
public interface IOrdExpressService 
{
	/**
     * 查询信息
     * 
     * @param id ID
     * @return 信息
     */
	 OrdExpress selectOrdExpressById(Long id);
	
	/**
     * 查询列表
     * 
     * @param qry 信息
     * @return 集合
     */
	PageInfo selectOrdExpressPage(OrdExpressQry qry);
	
	/**
     * 新增
     * 
     * @param ordExpress 信息
     * @return 结果
     */
	 int insertOrdExpress(OrdExpress ordExpress);
	
	/**
     * 修改
     * 
     * @param ordExpress 信息
     * @return 结果
     */
	 int updateOrdExpress(OrdExpress ordExpress);
		
	/**
     * 删除信息
     * 
     * @param id 需要删除的数据ID
     * @return 结果
     */
	 int deleteOrdExpressById(Long id);
	
}
