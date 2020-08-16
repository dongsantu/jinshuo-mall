package com.jinshuo.mall.admin.infra.mapper.ums;

import com.jinshuo.mall.admin.domain.ums.UmsWxMenu;

import java.util.List;

/**
 * 微信菜单 数据层
 * 
 * @author dyh
 * @date 2020-08-12
 */
public interface UmsWxMenuMapper 
{
	/**
     * 查询微信菜单信息
     * 
     * @param id 微信菜单ID
     * @return 微信菜单信息
     */
	public UmsWxMenu selectUmsWxMenuById(Long id);
	
	/**
     * 查询微信菜单列表
     * 
     * @param umsWxMenu 微信菜单信息
     * @return 微信菜单集合
     */
	public List<UmsWxMenu> selectUmsWxMenuList(UmsWxMenu umsWxMenu);
	
	/**
     * 新增微信菜单
     * 
     * @param umsWxMenu 微信菜单信息
     * @return 结果
     */
	public int insertUmsWxMenu(UmsWxMenu umsWxMenu);
	
	/**
     * 修改微信菜单
     * 
     * @param umsWxMenu 微信菜单信息
     * @return 结果
     */
	public int updateUmsWxMenu(UmsWxMenu umsWxMenu);
	
	/**
     * 删除微信菜单
     * 
     * @param id 微信菜单ID
     * @return 结果
     */
	public int deleteUmsWxMenuById(Long id);
	
	/**
     * 批量删除微信菜单
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteUmsWxMenuByIds(String[] ids);
	
}