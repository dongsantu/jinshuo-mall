package com.jinshuo.mall.admin.application.service.impl.ums;

import com.github.pagehelper.PageInfo;
import com.jinshuo.mall.admin.application.service.ums.IUmsUserRoleService;
import com.jinshuo.mall.admin.domain.ums.UmsUserRole;
import com.jinshuo.mall.admin.infra.mapper.ums.UmsUserRoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 系统用户角色 服务层实现
 * 
 * @author dyh
 * @date 2020-08-12
 */
@Service
public class UmsUserRoleServiceImpl implements IUmsUserRoleService
{
	@Autowired(required = false)
	private UmsUserRoleMapper umsUserRoleMapper;

	/**
     * 查询系统用户角色信息
     * 
     * @param id 系统用户角色ID
     * @return 系统用户角色信息
     */
	public UmsUserRole selectUmsUserRoleById(String id)
	{
	    return umsUserRoleMapper.selectUmsUserRoleById(id);
	}
	
	/**
     * 查询系统用户角色列表
     * 
     * @param qry 系统用户角色信息
     * @return 系统用户角色集合
     */
	public PageInfo selectUmsUserRolePage(UmsUserRole qry)
	{
        /*PageHelper.startPage(qry.getPageNum(), qry.getPageSize());
		UmsUserRole umsUserRole = new UmsUserRole();
        List<UmsUserRole> umsUserRoles = umsUserRoleMapper.selectUmsUserRoleList(umsUserRole);
        PageInfo pageInfo = new PageInfo(umsUserRoles);
	    return pageInfo;*/
		return null;
	}
	
    /**
     * 新增系统用户角色
     * 
     * @param umsUserRole 系统用户角色信息
     * @return 结果
     */
	public int insertUmsUserRole(UmsUserRole umsUserRole)
	{
		umsUserRole.preInsert();
	    return umsUserRoleMapper.insertUmsUserRole(umsUserRole);
	}
	
	/**
     * 修改系统用户角色
     * 
     * @param umsUserRole 系统用户角色信息
     * @return 结果
     */
	public int updateUmsUserRole(UmsUserRole umsUserRole)
	{
	    umsUserRole.preUpdate();
	    return umsUserRoleMapper.updateUmsUserRole(umsUserRole);
	}

	/**
     * 删除系统用户角色对象
     * 
     * @param id 需要删除的数据ID
     * @return 结果
     */
	public int deleteUmsUserRoleById(Long id)
	{
		return umsUserRoleMapper.deleteUmsUserRoleById(id);
	}
	
}
