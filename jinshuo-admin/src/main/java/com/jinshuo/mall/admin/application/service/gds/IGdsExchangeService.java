package com.jinshuo.mall.admin.application.service.gds;

import com.github.pagehelper.PageInfo;
import com.jinshuo.mall.admin.domain.gds.GdsExchange;

/**
 *  服务层
 * 
 * @author dyh
 * @date 2020-08-12
 */
public interface IGdsExchangeService 
{
	/**
     * 查询信息
     * 
     * @param id ID
     * @return 信息
     */
	 GdsExchange selectGdsExchangeById(Long id);
	
	/**
     * 查询列表
     * 
     * @param qry 信息
     * @return 集合
     */
	PageInfo selectGdsExchangePage(GdsExchange qry);
	
	/**
     * 新增
     * 
     * @param gdsExchange 信息
     * @return 结果
     */
	 int insertGdsExchange(GdsExchange gdsExchange);
	
	/**
     * 修改
     * 
     * @param gdsExchange 信息
     * @return 结果
     */
	 int updateGdsExchange(GdsExchange gdsExchange);
		
	/**
     * 删除信息
     * 
     * @param id 需要删除的数据ID
     * @return 结果
     */
	 int deleteGdsExchangeById(Long id);
	
}
