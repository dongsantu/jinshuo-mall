package com.jinshuo.mall.admin.application.service.ums;

import com.github.pagehelper.PageInfo;
import com.jinshuo.mall.admin.domain.ums.UmsUserRoleMenu;

/**
 * 角色菜单 服务层
 * 
 * @author dyh
 * @date 2020-08-12
 */
public interface IUmsUserRoleMenuService 
{
	/**
     * 查询角色菜单信息
     * 
     * @param id 角色菜单ID
     * @return 角色菜单信息
     */
	 UmsUserRoleMenu selectUmsUserRoleMenuById(Long id);
	
	/**
     * 查询角色菜单列表
     * 
     * @param qry 角色菜单信息
     * @return 角色菜单集合
     */
	PageInfo selectUmsUserRoleMenuPage(UmsUserRoleMenu qry);
	
	/**
     * 新增角色菜单
     * 
     * @param umsUserRoleMenu 角色菜单信息
     * @return 结果
     */
	 int insertUmsUserRoleMenu(UmsUserRoleMenu umsUserRoleMenu);
	
	/**
     * 修改角色菜单
     * 
     * @param umsUserRoleMenu 角色菜单信息
     * @return 结果
     */
	 int updateUmsUserRoleMenu(UmsUserRoleMenu umsUserRoleMenu);
		
	/**
     * 删除角色菜单信息
     * 
     * @param id 需要删除的数据ID
     * @return 结果
     */
	 int deleteUmsUserRoleMenuById(Long id);
	
}
