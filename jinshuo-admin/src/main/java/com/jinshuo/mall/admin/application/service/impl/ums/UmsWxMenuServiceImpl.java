package com.jinshuo.mall.admin.application.service.impl.ums;

import com.github.pagehelper.PageInfo;
import com.jinshuo.mall.admin.application.service.ums.IUmsWxMenuService;
import com.jinshuo.mall.admin.domain.ums.UmsWxMenu;
import com.jinshuo.mall.admin.infra.mapper.ums.UmsWxMenuMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 微信菜单 服务层实现
 * 
 * @author dyh
 * @date 2020-08-12
 */
@Service
public class UmsWxMenuServiceImpl implements IUmsWxMenuService
{
	@Autowired(required = false)
	private UmsWxMenuMapper umsWxMenuMapper;

	/**
     * 查询微信菜单信息
     * 
     * @param id 微信菜单ID
     * @return 微信菜单信息
     */
	public UmsWxMenu selectUmsWxMenuById(Long id)
	{
	    return umsWxMenuMapper.selectUmsWxMenuById(id);
	}
	
	/**
     * 查询微信菜单列表
     * 
     * @param qry 微信菜单信息
     * @return 微信菜单集合
     */
	public PageInfo selectUmsWxMenuPage(UmsWxMenu qry)
	{
        /*PageHelper.startPage(qry.getPageNum(), qry.getPageSize());
		UmsWxMenu umsWxMenu = new UmsWxMenu();
        List<UmsWxMenu> umsWxMenus = umsWxMenuMapper.selectUmsWxMenuList(umsWxMenu);
        PageInfo pageInfo = new PageInfo(umsWxMenus);
	    return pageInfo;*/
		return null;
	}
	
    /**
     * 新增微信菜单
     * 
     * @param umsWxMenu 微信菜单信息
     * @return 结果
     */
	public int insertUmsWxMenu(UmsWxMenu umsWxMenu)
	{
		umsWxMenu.preInsert();
	    return umsWxMenuMapper.insertUmsWxMenu(umsWxMenu);
	}
	
	/**
     * 修改微信菜单
     * 
     * @param umsWxMenu 微信菜单信息
     * @return 结果
     */
	public int updateUmsWxMenu(UmsWxMenu umsWxMenu)
	{
	    umsWxMenu.preUpdate();
	    return umsWxMenuMapper.updateUmsWxMenu(umsWxMenu);
	}

	/**
     * 删除微信菜单对象
     * 
     * @param id 需要删除的数据ID
     * @return 结果
     */
	public int deleteUmsWxMenuById(Long id)
	{
		return umsWxMenuMapper.deleteUmsWxMenuById(id);
	}
	
}
