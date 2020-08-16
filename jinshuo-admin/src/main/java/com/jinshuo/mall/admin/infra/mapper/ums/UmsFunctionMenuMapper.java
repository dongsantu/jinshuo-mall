package com.jinshuo.mall.admin.infra.mapper.ums;

import com.jinshuo.mall.admin.domain.ums.UmsFunctionMenu;

import java.util.List;

/**
 * 功能菜单 数据层
 * 
 * @author dyh
 * @date 2020-08-12
 */
public interface UmsFunctionMenuMapper 
{
	/**
     * 查询功能菜单信息
     * 
     * @param id 功能菜单ID
     * @return 功能菜单信息
     */
	public UmsFunctionMenu selectUmsFunctionMenuById(Long id);
	
	/**
     * 查询功能菜单列表
     * 
     * @param umsFunctionMenu 功能菜单信息
     * @return 功能菜单集合
     */
	public List<UmsFunctionMenu> selectUmsFunctionMenuList(UmsFunctionMenu umsFunctionMenu);
	
	/**
     * 新增功能菜单
     * 
     * @param umsFunctionMenu 功能菜单信息
     * @return 结果
     */
	public int insertUmsFunctionMenu(UmsFunctionMenu umsFunctionMenu);
	
	/**
     * 修改功能菜单
     * 
     * @param umsFunctionMenu 功能菜单信息
     * @return 结果
     */
	public int updateUmsFunctionMenu(UmsFunctionMenu umsFunctionMenu);
	
	/**
     * 删除功能菜单
     * 
     * @param id 功能菜单ID
     * @return 结果
     */
	public int deleteUmsFunctionMenuById(Long id);
	
	/**
     * 批量删除功能菜单
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteUmsFunctionMenuByIds(String[] ids);
	
}