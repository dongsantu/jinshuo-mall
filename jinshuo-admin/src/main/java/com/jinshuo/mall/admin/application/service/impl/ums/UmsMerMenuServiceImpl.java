package com.jinshuo.mall.admin.application.service.impl.ums;

import com.github.pagehelper.PageInfo;
import com.jinshuo.mall.admin.application.service.ums.IUmsMerMenuService;
import com.jinshuo.mall.admin.domain.ums.UmsMerMenu;
import com.jinshuo.mall.admin.infra.mapper.ums.UmsMerMenuMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 *  服务层实现
 * 
 * @author dyh
 * @date 2020-08-12
 */
@Service
public class UmsMerMenuServiceImpl implements IUmsMerMenuService
{
	@Autowired(required = false)
	private UmsMerMenuMapper umsMerMenuMapper;

	/**
     * 查询信息
     * 
     * @param id ID
     * @return 信息
     */
	public UmsMerMenu selectUmsMerMenuById(Long id)
	{
	    return umsMerMenuMapper.selectUmsMerMenuById(id);
	}
	
	/**
     * 查询列表
     * 
     * @param qry 信息
     * @return 集合
     */
	public PageInfo selectUmsMerMenuPage(UmsMerMenu qry)
	{
        /*PageHelper.startPage(qry.getPageNum(), qry.getPageSize());
		UmsMerMenu umsMerMenu = new UmsMerMenu();
        List<UmsMerMenu> umsMerMenus = umsMerMenuMapper.selectUmsMerMenuList(umsMerMenu);
        PageInfo pageInfo = new PageInfo(umsMerMenus);
	    return pageInfo;*/
		return null;
	}
	
    /**
     * 新增
     * 
     * @param umsMerMenu 信息
     * @return 结果
     */
	public int insertUmsMerMenu(UmsMerMenu umsMerMenu)
	{
		umsMerMenu.preInsert();
	    return umsMerMenuMapper.insertUmsMerMenu(umsMerMenu);
	}
	
	/**
     * 修改
     * 
     * @param umsMerMenu 信息
     * @return 结果
     */
	public int updateUmsMerMenu(UmsMerMenu umsMerMenu)
	{
	    umsMerMenu.preUpdate();
	    return umsMerMenuMapper.updateUmsMerMenu(umsMerMenu);
	}

	/**
     * 删除对象
     * 
     * @param id 需要删除的数据ID
     * @return 结果
     */
	public int deleteUmsMerMenuById(Long id)
	{
		return umsMerMenuMapper.deleteUmsMerMenuById(id);
	}
	
}
