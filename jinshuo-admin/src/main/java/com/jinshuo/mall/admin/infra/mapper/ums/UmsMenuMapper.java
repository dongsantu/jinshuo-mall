package com.jinshuo.mall.admin.infra.mapper.ums;

import com.jinshuo.mall.admin.domain.ums.UmsMenu;

import java.util.List;

/**
 *  数据层
 * 
 * @author dyh
 * @date 2020-08-12
 */
public interface UmsMenuMapper 
{
	/**
     * 查询信息
     * 
     * @param id ID
     * @return 信息
     */
	public UmsMenu selectUmsMenuById(Long id);
	
	/**
     * 查询列表
     * 
     * @param umsMenu 信息
     * @return 集合
     */
	public List<UmsMenu> selectUmsMenuList(UmsMenu umsMenu);
	
	/**
     * 新增
     * 
     * @param umsMenu 信息
     * @return 结果
     */
	public int insertUmsMenu(UmsMenu umsMenu);
	
	/**
     * 修改
     * 
     * @param umsMenu 信息
     * @return 结果
     */
	public int updateUmsMenu(UmsMenu umsMenu);
	
	/**
     * 删除
     * 
     * @param id ID
     * @return 结果
     */
	public int deleteUmsMenuById(Long id);
	
	/**
     * 批量删除
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteUmsMenuByIds(String[] ids);
	
}