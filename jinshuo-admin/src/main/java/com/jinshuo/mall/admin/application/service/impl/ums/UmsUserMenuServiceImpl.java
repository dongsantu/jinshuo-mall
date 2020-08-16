package com.jinshuo.mall.admin.application.service.impl.ums;

import com.github.pagehelper.PageInfo;
import com.jinshuo.mall.admin.application.service.ums.IUmsUserMenuService;
import com.jinshuo.mall.admin.domain.ums.UmsUserMenu;
import com.jinshuo.mall.admin.infra.mapper.ums.UmsUserMenuMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 *  服务层实现
 * 
 * @author dyh
 * @date 2020-08-12
 */
@Service
public class UmsUserMenuServiceImpl implements IUmsUserMenuService
{
	@Autowired(required = false)
	private UmsUserMenuMapper umsUserMenuMapper;

	/**
     * 查询信息
     * 
     * @param id ID
     * @return 信息
     */
	public UmsUserMenu selectUmsUserMenuById(Long id)
	{
	    return umsUserMenuMapper.selectUmsUserMenuById(id);
	}
	
	/**
     * 查询列表
     * 
     * @param qry 信息
     * @return 集合
     */
	public PageInfo selectUmsUserMenuPage(UmsUserMenu qry)
	{
        /*PageHelper.startPage(qry.getPageNum(), qry.getPageSize());
		UmsUserMenu umsUserMenu = new UmsUserMenu();
        List<UmsUserMenu> umsUserMenus = umsUserMenuMapper.selectUmsUserMenuList(umsUserMenu);
        PageInfo pageInfo = new PageInfo(umsUserMenus);
	    return pageInfo;*/
		return null;
	}
	
    /**
     * 新增
     * 
     * @param umsUserMenu 信息
     * @return 结果
     */
	public int insertUmsUserMenu(UmsUserMenu umsUserMenu)
	{
		umsUserMenu.preInsert();
	    return umsUserMenuMapper.insertUmsUserMenu(umsUserMenu);
	}
	
	/**
     * 修改
     * 
     * @param umsUserMenu 信息
     * @return 结果
     */
	public int updateUmsUserMenu(UmsUserMenu umsUserMenu)
	{
	    umsUserMenu.preUpdate();
	    return umsUserMenuMapper.updateUmsUserMenu(umsUserMenu);
	}

	/**
     * 删除对象
     * 
     * @param id 需要删除的数据ID
     * @return 结果
     */
	public int deleteUmsUserMenuById(Long id)
	{
		return umsUserMenuMapper.deleteUmsUserMenuById(id);
	}
	
}
