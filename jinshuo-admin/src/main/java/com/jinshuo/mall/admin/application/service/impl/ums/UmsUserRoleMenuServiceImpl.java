package com.jinshuo.mall.admin.application.service.impl.ums;

import com.github.pagehelper.PageInfo;
import com.jinshuo.mall.admin.application.service.ums.IUmsUserRoleMenuService;
import com.jinshuo.mall.admin.domain.ums.UmsUserRoleMenu;
import com.jinshuo.mall.admin.infra.mapper.ums.UmsUserRoleMenuMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 角色菜单 服务层实现
 * 
 * @author dyh
 * @date 2020-08-12
 */
@Service
public class UmsUserRoleMenuServiceImpl implements IUmsUserRoleMenuService
{
	@Autowired(required = false)
	private UmsUserRoleMenuMapper umsUserRoleMenuMapper;

	/**
     * 查询角色菜单信息
     * 
     * @param id 角色菜单ID
     * @return 角色菜单信息
     */
	public UmsUserRoleMenu selectUmsUserRoleMenuById(Long id)
	{
	    return umsUserRoleMenuMapper.selectUmsUserRoleMenuById(id);
	}
	
	/**
     * 查询角色菜单列表
     * 
     * @param qry 角色菜单信息
     * @return 角色菜单集合
     */
	public PageInfo selectUmsUserRoleMenuPage(UmsUserRoleMenu qry)
	{
        /*PageHelper.startPage(qry.getPageNum(), qry.getPageSize());
		UmsUserRoleMenu umsUserRoleMenu = new UmsUserRoleMenu();
        List<UmsUserRoleMenu> umsUserRoleMenus = umsUserRoleMenuMapper.selectUmsUserRoleMenuList(umsUserRoleMenu);
        PageInfo pageInfo = new PageInfo(umsUserRoleMenus);
	    return pageInfo;*/
		return null;
	}
	
    /**
     * 新增角色菜单
     * 
     * @param umsUserRoleMenu 角色菜单信息
     * @return 结果
     */
	public int insertUmsUserRoleMenu(UmsUserRoleMenu umsUserRoleMenu)
	{
		umsUserRoleMenu.preInsert();
	    return umsUserRoleMenuMapper.insertUmsUserRoleMenu(umsUserRoleMenu);
	}
	
	/**
     * 修改角色菜单
     * 
     * @param umsUserRoleMenu 角色菜单信息
     * @return 结果
     */
	public int updateUmsUserRoleMenu(UmsUserRoleMenu umsUserRoleMenu)
	{
	    umsUserRoleMenu.preUpdate();
	    return umsUserRoleMenuMapper.updateUmsUserRoleMenu(umsUserRoleMenu);
	}

	/**
     * 删除角色菜单对象
     * 
     * @param id 需要删除的数据ID
     * @return 结果
     */
	public int deleteUmsUserRoleMenuById(Long id)
	{
		return umsUserRoleMenuMapper.deleteUmsUserRoleMenuById(id);
	}
	
}
