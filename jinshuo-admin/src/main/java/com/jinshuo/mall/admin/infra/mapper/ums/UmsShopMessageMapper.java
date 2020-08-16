package com.jinshuo.mall.admin.infra.mapper.ums;

import com.jinshuo.mall.admin.domain.ums.UmsShopMessage;

import java.util.List;

/**
 *  数据层
 * 
 * @author dyh
 * @date 2020-08-12
 */
public interface UmsShopMessageMapper 
{
	/**
     * 查询信息
     * 
     * @param id ID
     * @return 信息
     */
	public UmsShopMessage selectUmsShopMessageById(Long id);
	
	/**
     * 查询列表
     * 
     * @param umsShopMessage 信息
     * @return 集合
     */
	public List<UmsShopMessage> selectUmsShopMessageList(UmsShopMessage umsShopMessage);
	
	/**
     * 新增
     * 
     * @param umsShopMessage 信息
     * @return 结果
     */
	public int insertUmsShopMessage(UmsShopMessage umsShopMessage);
	
	/**
     * 修改
     * 
     * @param umsShopMessage 信息
     * @return 结果
     */
	public int updateUmsShopMessage(UmsShopMessage umsShopMessage);
	
	/**
     * 删除
     * 
     * @param id ID
     * @return 结果
     */
	public int deleteUmsShopMessageById(Long id);
	
	/**
     * 批量删除
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteUmsShopMessageByIds(String[] ids);
	
}