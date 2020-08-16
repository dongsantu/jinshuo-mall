package com.jinshuo.mall.admin.infra.mapper.gds;

import com.jinshuo.mall.admin.domain.gds.GdsSpuOther;
import java.util.List;	

/**
 *  数据层
 * 
 * @author dyh
 * @date 2020-08-12
 */
public interface GdsSpuOtherMapper 
{
	/**
     * 查询信息
     * 
     * @param id ID
     * @return 信息
     */
	public GdsSpuOther selectGdsSpuOtherById(Long id);
	
	/**
     * 查询列表
     * 
     * @param gdsSpuOther 信息
     * @return 集合
     */
	public List<GdsSpuOther> selectGdsSpuOtherList(GdsSpuOther gdsSpuOther);
	
	/**
     * 新增
     * 
     * @param gdsSpuOther 信息
     * @return 结果
     */
	public int insertGdsSpuOther(GdsSpuOther gdsSpuOther);
	
	/**
     * 修改
     * 
     * @param gdsSpuOther 信息
     * @return 结果
     */
	public int updateGdsSpuOther(GdsSpuOther gdsSpuOther);
	
	/**
     * 删除
     * 
     * @param id ID
     * @return 结果
     */
	public int deleteGdsSpuOtherById(Long id);
	
	/**
     * 批量删除
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteGdsSpuOtherByIds(String[] ids);
	
}