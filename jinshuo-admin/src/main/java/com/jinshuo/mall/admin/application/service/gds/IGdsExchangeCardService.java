package com.jinshuo.mall.admin.application.service.gds;

import com.github.pagehelper.PageInfo;
import com.jinshuo.mall.admin.domain.gds.GdsExchangeCard;

/**
 *  服务层
 * 
 * @author dyh
 * @date 2020-08-12
 */
public interface IGdsExchangeCardService 
{
	/**
     * 查询信息
     * 
     * @param id ID
     * @return 信息
     */
	 GdsExchangeCard selectGdsExchangeCardById(Long id);
	
	/**
     * 查询列表
     * 
     * @param qry 信息
     * @return 集合
     */
	PageInfo selectGdsExchangeCardPage(GdsExchangeCard qry);
	
	/**
     * 新增
     * 
     * @param gdsExchangeCard 信息
     * @return 结果
     */
	 int insertGdsExchangeCard(GdsExchangeCard gdsExchangeCard);
	
	/**
     * 修改
     * 
     * @param gdsExchangeCard 信息
     * @return 结果
     */
	 int updateGdsExchangeCard(GdsExchangeCard gdsExchangeCard);
		
	/**
     * 删除信息
     * 
     * @param id 需要删除的数据ID
     * @return 结果
     */
	 int deleteGdsExchangeCardById(Long id);
	
}
