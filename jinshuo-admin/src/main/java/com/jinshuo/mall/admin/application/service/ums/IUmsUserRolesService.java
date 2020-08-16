package com.jinshuo.mall.admin.application.service.ums;

import com.github.pagehelper.PageInfo;
import com.jinshuo.mall.admin.domain.ums.UmsUserRoles;

/**
 * 系统用户角色关联 服务层
 * 
 * @author dyh
 * @date 2020-08-12
 */
public interface IUmsUserRolesService 
{
	/**
     * 查询系统用户角色关联信息
     * 
     * @param id 系统用户角色关联ID
     * @return 系统用户角色关联信息
     */
	 UmsUserRoles selectUmsUserRolesById(Long id);
	
	/**
     * 查询系统用户角色关联列表
     * 
     * @param qry 系统用户角色关联信息
     * @return 系统用户角色关联集合
     */
	PageInfo selectUmsUserRolesPage(UmsUserRoles qry);
	
	/**
     * 新增系统用户角色关联
     * 
     * @param umsUserRoles 系统用户角色关联信息
     * @return 结果
     */
	 int insertUmsUserRoles(UmsUserRoles umsUserRoles);
	
	/**
     * 修改系统用户角色关联
     * 
     * @param umsUserRoles 系统用户角色关联信息
     * @return 结果
     */
	 int updateUmsUserRoles(UmsUserRoles umsUserRoles);
		
	/**
     * 删除系统用户角色关联信息
     * 
     * @param id 需要删除的数据ID
     * @return 结果
     */
	 int deleteUmsUserRolesById(Long id);
	
}
