package com.jinshuo.mall.admin.infra.mapper.ums;

import com.jinshuo.mall.admin.domain.ums.UmsUserMenu;

import java.util.List;

/**
 *  数据层
 * 
 * @author dyh
 * @date 2020-08-12
 */
public interface UmsUserMenuMapper 
{
	/**
     * 查询信息
     * 
     * @param id ID
     * @return 信息
     */
	public UmsUserMenu selectUmsUserMenuById(Long id);
	
	/**
     * 查询列表
     * 
     * @param umsUserMenu 信息
     * @return 集合
     */
	public List<UmsUserMenu> selectUmsUserMenuList(UmsUserMenu umsUserMenu);
	
	/**
     * 新增
     * 
     * @param umsUserMenu 信息
     * @return 结果
     */
	public int insertUmsUserMenu(UmsUserMenu umsUserMenu);
	
	/**
     * 修改
     * 
     * @param umsUserMenu 信息
     * @return 结果
     */
	public int updateUmsUserMenu(UmsUserMenu umsUserMenu);
	
	/**
     * 删除
     * 
     * @param id ID
     * @return 结果
     */
	public int deleteUmsUserMenuById(Long id);
	
	/**
     * 批量删除
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteUmsUserMenuByIds(String[] ids);
	
}