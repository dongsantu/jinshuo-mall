package com.jinshuo.mall.admin.infra.mapper.gds;

import com.jinshuo.mall.admin.domain.gds.GdsCoupon;
import java.util.List;	

/**
 *  数据层
 * 
 * @author dyh
 * @date 2020-08-12
 */
public interface GdsCouponMapper 
{
	/**
     * 查询信息
     * 
     * @param id ID
     * @return 信息
     */
	public GdsCoupon selectGdsCouponById(Long id);
	
	/**
     * 查询列表
     * 
     * @param gdsCoupon 信息
     * @return 集合
     */
	public List<GdsCoupon> selectGdsCouponList(GdsCoupon gdsCoupon);
	
	/**
     * 新增
     * 
     * @param gdsCoupon 信息
     * @return 结果
     */
	public int insertGdsCoupon(GdsCoupon gdsCoupon);
	
	/**
     * 修改
     * 
     * @param gdsCoupon 信息
     * @return 结果
     */
	public int updateGdsCoupon(GdsCoupon gdsCoupon);
	
	/**
     * 删除
     * 
     * @param id ID
     * @return 结果
     */
	public int deleteGdsCouponById(Long id);
	
	/**
     * 批量删除
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteGdsCouponByIds(String[] ids);
	
}