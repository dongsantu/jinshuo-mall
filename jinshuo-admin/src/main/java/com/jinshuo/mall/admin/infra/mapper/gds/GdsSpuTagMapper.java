package com.jinshuo.mall.admin.infra.mapper.gds;

import com.jinshuo.mall.admin.domain.gds.GdsSpuTag;
import java.util.List;	

/**
 *  数据层
 * 
 * @author dyh
 * @date 2020-08-12
 */
public interface GdsSpuTagMapper 
{
	/**
     * 查询信息
     * 
     * @param id ID
     * @return 信息
     */
	public GdsSpuTag selectGdsSpuTagById(Long id);
	
	/**
     * 查询列表
     * 
     * @param gdsSpuTag 信息
     * @return 集合
     */
	public List<GdsSpuTag> selectGdsSpuTagList(GdsSpuTag gdsSpuTag);
	
	/**
     * 新增
     * 
     * @param gdsSpuTag 信息
     * @return 结果
     */
	public int insertGdsSpuTag(GdsSpuTag gdsSpuTag);
	
	/**
     * 修改
     * 
     * @param gdsSpuTag 信息
     * @return 结果
     */
	public int updateGdsSpuTag(GdsSpuTag gdsSpuTag);
	
	/**
     * 删除
     * 
     * @param id ID
     * @return 结果
     */
	public int deleteGdsSpuTagById(Long id);
	
	/**
     * 批量删除
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteGdsSpuTagByIds(String[] ids);
	
}