package com.jinshuo.mall.admin.infra.mapper.ums;

import com.jinshuo.mall.admin.domain.ums.UmsUserRoles;

import java.util.List;

/**
 * 系统用户角色关联 数据层
 * 
 * @author dyh
 * @date 2020-08-12
 */
public interface UmsUserRolesMapper 
{
	/**
     * 查询系统用户角色关联信息
     * 
     * @param id 系统用户角色关联ID
     * @return 系统用户角色关联信息
     */
	public UmsUserRoles selectUmsUserRolesById(Long id);
	
	/**
     * 查询系统用户角色关联列表
     * 
     * @param umsUserRoles 系统用户角色关联信息
     * @return 系统用户角色关联集合
     */
	public List<UmsUserRoles> selectUmsUserRolesList(UmsUserRoles umsUserRoles);
	
	/**
     * 新增系统用户角色关联
     * 
     * @param umsUserRoles 系统用户角色关联信息
     * @return 结果
     */
	public int insertUmsUserRoles(UmsUserRoles umsUserRoles);
	
	/**
     * 修改系统用户角色关联
     * 
     * @param umsUserRoles 系统用户角色关联信息
     * @return 结果
     */
	public int updateUmsUserRoles(UmsUserRoles umsUserRoles);
	
	/**
     * 删除系统用户角色关联
     * 
     * @param id 系统用户角色关联ID
     * @return 结果
     */
	public int deleteUmsUserRolesById(Long id);
	
	/**
     * 批量删除系统用户角色关联
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteUmsUserRolesByIds(String[] ids);
	
}