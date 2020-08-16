package com.jinshuo.mall.admin.infra.mapper.gds;

import com.jinshuo.mall.admin.domain.gds.GdsSpecOption;
import java.util.List;	

/**
 *  数据层
 * 
 * @author dyh
 * @date 2020-08-12
 */
public interface GdsSpecOptionMapper 
{
	/**
     * 查询信息
     * 
     * @param id ID
     * @return 信息
     */
	public GdsSpecOption selectGdsSpecOptionById(Long id);
	
	/**
     * 查询列表
     * 
     * @param gdsSpecOption 信息
     * @return 集合
     */
	public List<GdsSpecOption> selectGdsSpecOptionList(GdsSpecOption gdsSpecOption);
	
	/**
     * 新增
     * 
     * @param gdsSpecOption 信息
     * @return 结果
     */
	public int insertGdsSpecOption(GdsSpecOption gdsSpecOption);
	
	/**
     * 修改
     * 
     * @param gdsSpecOption 信息
     * @return 结果
     */
	public int updateGdsSpecOption(GdsSpecOption gdsSpecOption);
	
	/**
     * 删除
     * 
     * @param id ID
     * @return 结果
     */
	public int deleteGdsSpecOptionById(Long id);
	
	/**
     * 批量删除
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteGdsSpecOptionByIds(String[] ids);
	
}