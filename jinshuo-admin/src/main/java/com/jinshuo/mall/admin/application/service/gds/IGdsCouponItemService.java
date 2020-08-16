package com.jinshuo.mall.admin.application.service.gds;

import com.github.pagehelper.PageInfo;
import com.jinshuo.mall.admin.domain.gds.GdsCouponItem;

/**
 *  服务层
 * 
 * @author dyh
 * @date 2020-08-12
 */
public interface IGdsCouponItemService 
{
	/**
     * 查询信息
     * 
     * @param id ID
     * @return 信息
     */
	 GdsCouponItem selectGdsCouponItemById(Long id);
	
	/**
     * 查询列表
     * 
     * @param qry 信息
     * @return 集合
     */
	PageInfo selectGdsCouponItemPage(GdsCouponItem qry);
	
	/**
     * 新增
     * 
     * @param gdsCouponItem 信息
     * @return 结果
     */
	 int insertGdsCouponItem(GdsCouponItem gdsCouponItem);
	
	/**
     * 修改
     * 
     * @param gdsCouponItem 信息
     * @return 结果
     */
	 int updateGdsCouponItem(GdsCouponItem gdsCouponItem);
		
	/**
     * 删除信息
     * 
     * @param id 需要删除的数据ID
     * @return 结果
     */
	 int deleteGdsCouponItemById(Long id);
	
}
