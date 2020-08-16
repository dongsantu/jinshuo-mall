package com.jinshuo.mall.admin.application.service.ums;

import com.github.pagehelper.PageInfo;
import com.jinshuo.mall.admin.domain.ums.UmsWxMenu;

/**
 * 微信菜单 服务层
 * 
 * @author dyh
 * @date 2020-08-12
 */
public interface IUmsWxMenuService 
{
	/**
     * 查询微信菜单信息
     * 
     * @param id 微信菜单ID
     * @return 微信菜单信息
     */
	 UmsWxMenu selectUmsWxMenuById(Long id);
	
	/**
     * 查询微信菜单列表
     * 
     * @param qry 微信菜单信息
     * @return 微信菜单集合
     */
	PageInfo selectUmsWxMenuPage(UmsWxMenu qry);
	
	/**
     * 新增微信菜单
     * 
     * @param umsWxMenu 微信菜单信息
     * @return 结果
     */
	 int insertUmsWxMenu(UmsWxMenu umsWxMenu);
	
	/**
     * 修改微信菜单
     * 
     * @param umsWxMenu 微信菜单信息
     * @return 结果
     */
	 int updateUmsWxMenu(UmsWxMenu umsWxMenu);
		
	/**
     * 删除微信菜单信息
     * 
     * @param id 需要删除的数据ID
     * @return 结果
     */
	 int deleteUmsWxMenuById(Long id);
	
}
