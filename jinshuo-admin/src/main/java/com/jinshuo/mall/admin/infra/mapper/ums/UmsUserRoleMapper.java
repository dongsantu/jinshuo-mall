package com.jinshuo.mall.admin.infra.mapper.ums;

import com.jinshuo.mall.admin.domain.ums.UmsUserRole;

import java.util.List;

/**
 * 系统用户角色 数据层
 * 
 * @author dyh
 * @date 2020-08-12
 */
public interface UmsUserRoleMapper 
{
	/**
     * 查询系统用户角色信息
     * 
     * @param id 系统用户角色ID
     * @return 系统用户角色信息
     */
	public UmsUserRole selectUmsUserRoleById(String id);
	
	/**
     * 查询系统用户角色列表
     * 
     * @param umsUserRole 系统用户角色信息
     * @return 系统用户角色集合
     */
	public List<UmsUserRole> selectUmsUserRoleList(UmsUserRole umsUserRole);
	
	/**
     * 新增系统用户角色
     * 
     * @param umsUserRole 系统用户角色信息
     * @return 结果
     */
	public int insertUmsUserRole(UmsUserRole umsUserRole);
	
	/**
     * 修改系统用户角色
     * 
     * @param umsUserRole 系统用户角色信息
     * @return 结果
     */
	public int updateUmsUserRole(UmsUserRole umsUserRole);
	
	/**
     * 删除系统用户角色
     * 
     * @param id 系统用户角色ID
     * @return 结果
     */
	public int deleteUmsUserRoleById(Long id);
	
	/**
     * 批量删除系统用户角色
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteUmsUserRoleByIds(String[] ids);
	
}