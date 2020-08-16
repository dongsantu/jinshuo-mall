package com.jinshuo.mall.admin.infra.mapper.gds;

import com.jinshuo.mall.admin.domain.gds.GdsExchangeCard;
import java.util.List;	

/**
 *  数据层
 * 
 * @author dyh
 * @date 2020-08-12
 */
public interface GdsExchangeCardMapper 
{
	/**
     * 查询信息
     * 
     * @param id ID
     * @return 信息
     */
	public GdsExchangeCard selectGdsExchangeCardById(Long id);
	
	/**
     * 查询列表
     * 
     * @param gdsExchangeCard 信息
     * @return 集合
     */
	public List<GdsExchangeCard> selectGdsExchangeCardList(GdsExchangeCard gdsExchangeCard);
	
	/**
     * 新增
     * 
     * @param gdsExchangeCard 信息
     * @return 结果
     */
	public int insertGdsExchangeCard(GdsExchangeCard gdsExchangeCard);
	
	/**
     * 修改
     * 
     * @param gdsExchangeCard 信息
     * @return 结果
     */
	public int updateGdsExchangeCard(GdsExchangeCard gdsExchangeCard);
	
	/**
     * 删除
     * 
     * @param id ID
     * @return 结果
     */
	public int deleteGdsExchangeCardById(Long id);
	
	/**
     * 批量删除
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteGdsExchangeCardByIds(String[] ids);
	
}