package com.jinshuo.mall.admin.infra.mapper.gds;

import com.jinshuo.mall.admin.domain.gds.GdsExchange;
import java.util.List;	

/**
 *  数据层
 * 
 * @author dyh
 * @date 2020-08-12
 */
public interface GdsExchangeMapper 
{
	/**
     * 查询信息
     * 
     * @param id ID
     * @return 信息
     */
	public GdsExchange selectGdsExchangeById(Long id);
	
	/**
     * 查询列表
     * 
     * @param gdsExchange 信息
     * @return 集合
     */
	public List<GdsExchange> selectGdsExchangeList(GdsExchange gdsExchange);
	
	/**
     * 新增
     * 
     * @param gdsExchange 信息
     * @return 结果
     */
	public int insertGdsExchange(GdsExchange gdsExchange);
	
	/**
     * 修改
     * 
     * @param gdsExchange 信息
     * @return 结果
     */
	public int updateGdsExchange(GdsExchange gdsExchange);
	
	/**
     * 删除
     * 
     * @param id ID
     * @return 结果
     */
	public int deleteGdsExchangeById(Long id);
	
	/**
     * 批量删除
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteGdsExchangeByIds(String[] ids);
	
}