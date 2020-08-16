package com.jinshuo.mall.admin.infra.mapper.gds;

import com.jinshuo.mall.admin.domain.gds.GdsCouponReceive;
import java.util.List;	

/**
 *  数据层
 * 
 * @author dyh
 * @date 2020-08-12
 */
public interface GdsCouponReceiveMapper 
{
	/**
     * 查询信息
     * 
     * @param id ID
     * @return 信息
     */
	public GdsCouponReceive selectGdsCouponReceiveById(Long id);
	
	/**
     * 查询列表
     * 
     * @param gdsCouponReceive 信息
     * @return 集合
     */
	public List<GdsCouponReceive> selectGdsCouponReceiveList(GdsCouponReceive gdsCouponReceive);
	
	/**
     * 新增
     * 
     * @param gdsCouponReceive 信息
     * @return 结果
     */
	public int insertGdsCouponReceive(GdsCouponReceive gdsCouponReceive);
	
	/**
     * 修改
     * 
     * @param gdsCouponReceive 信息
     * @return 结果
     */
	public int updateGdsCouponReceive(GdsCouponReceive gdsCouponReceive);
	
	/**
     * 删除
     * 
     * @param id ID
     * @return 结果
     */
	public int deleteGdsCouponReceiveById(Long id);
	
	/**
     * 批量删除
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteGdsCouponReceiveByIds(String[] ids);
	
}