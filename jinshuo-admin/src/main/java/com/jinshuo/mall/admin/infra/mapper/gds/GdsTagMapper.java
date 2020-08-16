package com.jinshuo.mall.admin.infra.mapper.gds;

import com.jinshuo.mall.admin.domain.gds.GdsTag;
import java.util.List;	

/**
 *  数据层
 * 
 * @author dyh
 * @date 2020-08-12
 */
public interface GdsTagMapper 
{
	/**
     * 查询信息
     * 
     * @param id ID
     * @return 信息
     */
	public GdsTag selectGdsTagById(Long id);
	
	/**
     * 查询列表
     * 
     * @param gdsTag 信息
     * @return 集合
     */
	public List<GdsTag> selectGdsTagList(GdsTag gdsTag);
	
	/**
     * 新增
     * 
     * @param gdsTag 信息
     * @return 结果
     */
	public int insertGdsTag(GdsTag gdsTag);
	
	/**
     * 修改
     * 
     * @param gdsTag 信息
     * @return 结果
     */
	public int updateGdsTag(GdsTag gdsTag);
	
	/**
     * 删除
     * 
     * @param id ID
     * @return 结果
     */
	public int deleteGdsTagById(Long id);
	
	/**
     * 批量删除
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteGdsTagByIds(String[] ids);
	
}