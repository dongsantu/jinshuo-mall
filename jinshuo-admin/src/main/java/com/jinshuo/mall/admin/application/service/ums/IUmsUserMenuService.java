package com.jinshuo.mall.admin.application.service.ums;

import com.github.pagehelper.PageInfo;
import com.jinshuo.mall.admin.domain.ums.UmsUserMenu;

/**
 *  服务层
 * 
 * @author dyh
 * @date 2020-08-12
 */
public interface IUmsUserMenuService 
{
	/**
     * 查询信息
     * 
     * @param id ID
     * @return 信息
     */
	 UmsUserMenu selectUmsUserMenuById(Long id);
	
	/**
     * 查询列表
     * 
     * @param qry 信息
     * @return 集合
     */
	PageInfo selectUmsUserMenuPage(UmsUserMenu qry);
	
	/**
     * 新增
     * 
     * @param umsUserMenu 信息
     * @return 结果
     */
	 int insertUmsUserMenu(UmsUserMenu umsUserMenu);
	
	/**
     * 修改
     * 
     * @param umsUserMenu 信息
     * @return 结果
     */
	 int updateUmsUserMenu(UmsUserMenu umsUserMenu);
		
	/**
     * 删除信息
     * 
     * @param id 需要删除的数据ID
     * @return 结果
     */
	 int deleteUmsUserMenuById(Long id);
	
}
