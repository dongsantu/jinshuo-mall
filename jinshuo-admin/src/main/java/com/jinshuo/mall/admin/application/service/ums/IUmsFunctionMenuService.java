package com.jinshuo.mall.admin.application.service.ums;

import com.github.pagehelper.PageInfo;
import com.jinshuo.mall.admin.domain.ums.UmsFunctionMenu;

/**
 * 功能菜单 服务层
 * 
 * @author dyh
 * @date 2020-08-12
 */
public interface IUmsFunctionMenuService 
{
	/**
     * 查询功能菜单信息
     * 
     * @param id 功能菜单ID
     * @return 功能菜单信息
     */
	 UmsFunctionMenu selectUmsFunctionMenuById(Long id);
	
	/**
     * 查询功能菜单列表
     * 
     * @param qry 功能菜单信息
     * @return 功能菜单集合
     */
	PageInfo selectUmsFunctionMenuPage(UmsFunctionMenu qry);
	
	/**
     * 新增功能菜单
     * 
     * @param umsFunctionMenu 功能菜单信息
     * @return 结果
     */
	 int insertUmsFunctionMenu(UmsFunctionMenu umsFunctionMenu);
	
	/**
     * 修改功能菜单
     * 
     * @param umsFunctionMenu 功能菜单信息
     * @return 结果
     */
	 int updateUmsFunctionMenu(UmsFunctionMenu umsFunctionMenu);
		
	/**
     * 删除功能菜单信息
     * 
     * @param id 需要删除的数据ID
     * @return 结果
     */
	 int deleteUmsFunctionMenuById(Long id);
	
}
