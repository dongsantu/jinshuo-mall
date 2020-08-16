package com.jinshuo.mall.admin.infra.mapper.gds;

import com.jinshuo.mall.admin.domain.gds.GdsCouponItem;
import java.util.List;

/**
 *  数据层
 * 
 * @author dyh
 * @date 2020-08-12
 */
public interface GdsCouponItemMapper 
{
	/**
     * 查询信息
     * 
     * @param id ID
     * @return 信息
     */
	public GdsCouponItem selectGdsCouponItemById(Long id);
	
	/**
     * 查询列表
     * 
     * @param gdsCouponItem 信息
     * @return 集合
     */
	public List<GdsCouponItem> selectGdsCouponItemList(GdsCouponItem gdsCouponItem);
	
	/**
     * 新增
     * 
     * @param gdsCouponItem 信息
     * @return 结果
     */
	public int insertGdsCouponItem(GdsCouponItem gdsCouponItem);
	
	/**
     * 修改
     * 
     * @param gdsCouponItem 信息
     * @return 结果
     */
	public int updateGdsCouponItem(GdsCouponItem gdsCouponItem);
	
	/**
     * 删除
     * 
     * @param id ID
     * @return 结果
     */
	public int deleteGdsCouponItemById(Long id);
	
	/**
     * 批量删除
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteGdsCouponItemByIds(String[] ids);
	
}