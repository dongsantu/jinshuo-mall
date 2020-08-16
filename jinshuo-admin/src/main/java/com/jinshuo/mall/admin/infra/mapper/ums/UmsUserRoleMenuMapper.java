package com.jinshuo.mall.admin.infra.mapper.ums;

import com.jinshuo.mall.admin.domain.ums.UmsUserRoleMenu;

import java.util.List;

/**
 * 角色菜单 数据层
 * 
 * @author dyh
 * @date 2020-08-12
 */
public interface UmsUserRoleMenuMapper 
{
	/**
     * 查询角色菜单信息
     * 
     * @param id 角色菜单ID
     * @return 角色菜单信息
     */
	public UmsUserRoleMenu selectUmsUserRoleMenuById(Long id);
	
	/**
     * 查询角色菜单列表
     * 
     * @param umsUserRoleMenu 角色菜单信息
     * @return 角色菜单集合
     */
	public List<UmsUserRoleMenu> selectUmsUserRoleMenuList(UmsUserRoleMenu umsUserRoleMenu);
	
	/**
     * 新增角色菜单
     * 
     * @param umsUserRoleMenu 角色菜单信息
     * @return 结果
     */
	public int insertUmsUserRoleMenu(UmsUserRoleMenu umsUserRoleMenu);
	
	/**
     * 修改角色菜单
     * 
     * @param umsUserRoleMenu 角色菜单信息
     * @return 结果
     */
	public int updateUmsUserRoleMenu(UmsUserRoleMenu umsUserRoleMenu);
	
	/**
     * 删除角色菜单
     * 
     * @param id 角色菜单ID
     * @return 结果
     */
	public int deleteUmsUserRoleMenuById(Long id);
	
	/**
     * 批量删除角色菜单
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteUmsUserRoleMenuByIds(String[] ids);
	
}