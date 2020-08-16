package com.jinshuo.mall.admin.infra.mapper.gds;

import com.jinshuo.mall.admin.domain.gds.GdsSkuAttributeAndOption;
import java.util.List;	

/**
 *  数据层
 * 
 * @author dyh
 * @date 2020-08-12
 */
public interface GdsSkuAttributeAndOptionMapper 
{
	/**
     * 查询信息
     * 
     * @param id ID
     * @return 信息
     */
	public GdsSkuAttributeAndOption selectGdsSkuAttributeAndOptionById(Long id);
	
	/**
     * 查询列表
     * 
     * @param gdsSkuAttributeAndOption 信息
     * @return 集合
     */
	public List<GdsSkuAttributeAndOption> selectGdsSkuAttributeAndOptionList(GdsSkuAttributeAndOption gdsSkuAttributeAndOption);
	
	/**
     * 新增
     * 
     * @param gdsSkuAttributeAndOption 信息
     * @return 结果
     */
	public int insertGdsSkuAttributeAndOption(GdsSkuAttributeAndOption gdsSkuAttributeAndOption);
	
	/**
     * 修改
     * 
     * @param gdsSkuAttributeAndOption 信息
     * @return 结果
     */
	public int updateGdsSkuAttributeAndOption(GdsSkuAttributeAndOption gdsSkuAttributeAndOption);
	
	/**
     * 删除
     * 
     * @param id ID
     * @return 结果
     */
	public int deleteGdsSkuAttributeAndOptionById(Long id);
	
	/**
     * 批量删除
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteGdsSkuAttributeAndOptionByIds(String[] ids);
	
}