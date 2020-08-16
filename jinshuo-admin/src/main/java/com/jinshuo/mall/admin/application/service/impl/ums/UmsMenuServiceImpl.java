package com.jinshuo.mall.admin.application.service.impl.ums;

import com.github.pagehelper.PageInfo;
import com.jinshuo.mall.admin.application.service.ums.IUmsMenuService;
import com.jinshuo.mall.admin.domain.ums.UmsMenu;
import com.jinshuo.mall.admin.infra.mapper.ums.UmsMenuMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 *  服务层实现
 * 
 * @author dyh
 * @date 2020-08-12
 */
@Service
public class UmsMenuServiceImpl implements IUmsMenuService
{
	@Autowired(required = false)
	private UmsMenuMapper umsMenuMapper;

	/**
     * 查询信息
     * 
     * @param id ID
     * @return 信息
     */
	public UmsMenu selectUmsMenuById(Long id)
	{
	    return umsMenuMapper.selectUmsMenuById(id);
	}
	
	/**
     * 查询列表
     * 
     * @param qry 信息
     * @return 集合
     */
	public PageInfo selectUmsMenuPage(UmsMenu qry)
	{
        /*PageHelper.startPage(qry.getPageNum(), qry.getPageSize());
		UmsMenu umsMenu = new UmsMenu();
        List<UmsMenu> umsMenus = umsMenuMapper.selectUmsMenuList(umsMenu);
        PageInfo pageInfo = new PageInfo(umsMenus);
	    return pageInfo;*/
		return null;
	}
	
    /**
     * 新增
     * 
     * @param umsMenu 信息
     * @return 结果
     */
	public int insertUmsMenu(UmsMenu umsMenu)
	{
		umsMenu.preInsert();
	    return umsMenuMapper.insertUmsMenu(umsMenu);
	}
	
	/**
     * 修改
     * 
     * @param umsMenu 信息
     * @return 结果
     */
	public int updateUmsMenu(UmsMenu umsMenu)
	{
	    umsMenu.preUpdate();
	    return umsMenuMapper.updateUmsMenu(umsMenu);
	}

	/**
     * 删除对象
     * 
     * @param id 需要删除的数据ID
     * @return 结果
     */
	public int deleteUmsMenuById(Long id)
	{
		return umsMenuMapper.deleteUmsMenuById(id);
	}
	
}
