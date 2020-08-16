package com.jinshuo.mall.admin.application.service.impl.ums;

import com.github.pagehelper.PageInfo;
import com.jinshuo.mall.admin.application.service.ums.IUmsFunctionMenuService;
import com.jinshuo.mall.admin.domain.ums.UmsFunctionMenu;
import com.jinshuo.mall.admin.infra.mapper.ums.UmsFunctionMenuMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 功能菜单 服务层实现
 * 
 * @author dyh
 * @date 2020-08-12
 */
@Service
public class UmsFunctionMenuServiceImpl implements IUmsFunctionMenuService
{
	@Autowired(required = false)
	private UmsFunctionMenuMapper umsFunctionMenuMapper;

	/**
     * 查询功能菜单信息
     * 
     * @param id 功能菜单ID
     * @return 功能菜单信息
     */
	public UmsFunctionMenu selectUmsFunctionMenuById(Long id)
	{
	    return umsFunctionMenuMapper.selectUmsFunctionMenuById(id);
	}
	
	/**
     * 查询功能菜单列表
     * 
     * @param qry 功能菜单信息
     * @return 功能菜单集合
     */
	public PageInfo selectUmsFunctionMenuPage(UmsFunctionMenu qry)
	{
        /*PageHelper.startPage(qry.getPageNum(), qry.getPageSize());
		UmsFunctionMenu umsFunctionMenu = new UmsFunctionMenu();
        List<UmsFunctionMenu> umsFunctionMenus = umsFunctionMenuMapper.selectUmsFunctionMenuList(umsFunctionMenu);
        PageInfo pageInfo = new PageInfo(umsFunctionMenus);
	    return pageInfo;*/
		return null;
	}
	
    /**
     * 新增功能菜单
     * 
     * @param umsFunctionMenu 功能菜单信息
     * @return 结果
     */
	public int insertUmsFunctionMenu(UmsFunctionMenu umsFunctionMenu)
	{
		umsFunctionMenu.preInsert();
	    return umsFunctionMenuMapper.insertUmsFunctionMenu(umsFunctionMenu);
	}
	
	/**
     * 修改功能菜单
     * 
     * @param umsFunctionMenu 功能菜单信息
     * @return 结果
     */
	public int updateUmsFunctionMenu(UmsFunctionMenu umsFunctionMenu)
	{
	    umsFunctionMenu.preUpdate();
	    return umsFunctionMenuMapper.updateUmsFunctionMenu(umsFunctionMenu);
	}

	/**
     * 删除功能菜单对象
     * 
     * @param id 需要删除的数据ID
     * @return 结果
     */
	public int deleteUmsFunctionMenuById(Long id)
	{
		return umsFunctionMenuMapper.deleteUmsFunctionMenuById(id);
	}
	
}
