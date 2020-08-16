package com.jinshuo.mall.admin.application.service.impl.ums;

import com.github.pagehelper.PageInfo;
import com.jinshuo.mall.admin.application.service.ums.IUmsUserRolesService;
import com.jinshuo.mall.admin.domain.ums.UmsUserRoles;
import com.jinshuo.mall.admin.infra.mapper.ums.UmsUserRolesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 系统用户角色关联 服务层实现
 * 
 * @author dyh
 * @date 2020-08-12
 */
@Service
public class UmsUserRolesServiceImpl implements IUmsUserRolesService
{
	@Autowired(required = false)
	private UmsUserRolesMapper umsUserRolesMapper;

	/**
     * 查询系统用户角色关联信息
     * 
     * @param id 系统用户角色关联ID
     * @return 系统用户角色关联信息
     */
	public UmsUserRoles selectUmsUserRolesById(Long id)
	{
	    return umsUserRolesMapper.selectUmsUserRolesById(id);
	}
	
	/**
     * 查询系统用户角色关联列表
     * 
     * @param qry 系统用户角色关联信息
     * @return 系统用户角色关联集合
     */
	public PageInfo selectUmsUserRolesPage(UmsUserRoles qry)
	{
        /*PageHelper.startPage(qry.getPageNum(), qry.getPageSize());
		UmsUserRoles umsUserRoles = new UmsUserRoles();
        List<UmsUserRoles> umsUserRoless = umsUserRolesMapper.selectUmsUserRolesList(umsUserRoles);
        PageInfo pageInfo = new PageInfo(umsUserRoless);
	    return pageInfo;*/
		return null;
	}
	
    /**
     * 新增系统用户角色关联
     * 
     * @param umsUserRoles 系统用户角色关联信息
     * @return 结果
     */
	public int insertUmsUserRoles(UmsUserRoles umsUserRoles)
	{
		umsUserRoles.preInsert();
	    return umsUserRolesMapper.insertUmsUserRoles(umsUserRoles);
	}
	
	/**
     * 修改系统用户角色关联
     * 
     * @param umsUserRoles 系统用户角色关联信息
     * @return 结果
     */
	public int updateUmsUserRoles(UmsUserRoles umsUserRoles)
	{
	    umsUserRoles.preUpdate();
	    return umsUserRolesMapper.updateUmsUserRoles(umsUserRoles);
	}

	/**
     * 删除系统用户角色关联对象
     * 
     * @param id 需要删除的数据ID
     * @return 结果
     */
	public int deleteUmsUserRolesById(Long id)
	{
		return umsUserRolesMapper.deleteUmsUserRolesById(id);
	}
	
}
