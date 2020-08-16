package com.jinshuo.mall.admin.application.service.ums;

import com.github.pagehelper.PageInfo;
import com.jinshuo.mall.admin.domain.ums.UmsUserRole;

/**
 * 系统用户角色 服务层
 * 
 * @author dyh
 * @date 2020-08-12
 */
public interface IUmsUserRoleService 
{
	/**
     * 查询系统用户角色信息
     * 
     * @param id 系统用户角色ID
     * @return 系统用户角色信息
     */
	 UmsUserRole selectUmsUserRoleById(String id);
	
	/**
     * 查询系统用户角色列表
     * 
     * @param qry 系统用户角色信息
     * @return 系统用户角色集合
     */
	PageInfo selectUmsUserRolePage(UmsUserRole qry);
	
	/**
     * 新增系统用户角色
     * 
     * @param umsUserRole 系统用户角色信息
     * @return 结果
     */
	 int insertUmsUserRole(UmsUserRole umsUserRole);
	
	/**
     * 修改系统用户角色
     * 
     * @param umsUserRole 系统用户角色信息
     * @return 结果
     */
	 int updateUmsUserRole(UmsUserRole umsUserRole);
		
	/**
     * 删除系统用户角色信息
     * 
     * @param id 需要删除的数据ID
     * @return 结果
     */
	 int deleteUmsUserRoleById(Long id);
	
}
