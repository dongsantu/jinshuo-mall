package com.jinshuo.mall.admin.infra.mapper.gds;

import com.jinshuo.mall.admin.domain.gds.GdsBrand;

import java.util.List;

/**
 *  数据层
 * 
 * @author dyh
 * @date 2020-08-12
 */
public interface GdsBrandMapper 
{
	/**
     * 查询信息
     * 
     * @param id ID
     * @return 信息
     */
	public GdsBrand selectGdsBrandById(Long id);
	
	/**
     * 查询列表
     * 
     * @param gdsBrand 信息
     * @return 集合
     */
	public List<GdsBrand> selectGdsBrandList(GdsBrand gdsBrand);
	
	/**
     * 新增
     * 
     * @param gdsBrand 信息
     * @return 结果
     */
	public int insertGdsBrand(GdsBrand gdsBrand);
	
	/**
     * 修改
     * 
     * @param gdsBrand 信息
     * @return 结果
     */
	public int updateGdsBrand(GdsBrand gdsBrand);
	
	/**
     * 删除
     * 
     * @param id ID
     * @return 结果
     */
	public int deleteGdsBrandById(Long id);
	
	/**
     * 批量删除
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteGdsBrandByIds(String[] ids);
	
}