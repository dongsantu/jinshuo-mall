package com.jinshuo.mall.admin.application.service.ums;

import com.github.pagehelper.PageInfo;
import com.jinshuo.mall.admin.domain.ums.UmsMenu;

/**
 *  服务层
 * 
 * @author dyh
 * @date 2020-08-12
 */
public interface IUmsMenuService 
{
	/**
     * 查询信息
     * 
     * @param id ID
     * @return 信息
     */
	 UmsMenu selectUmsMenuById(Long id);
	
	/**
     * 查询列表
     * 
     * @param qry 信息
     * @return 集合
     */
	PageInfo selectUmsMenuPage(UmsMenu qry);
	
	/**
     * 新增
     * 
     * @param umsMenu 信息
     * @return 结果
     */
	 int insertUmsMenu(UmsMenu umsMenu);
	
	/**
     * 修改
     * 
     * @param umsMenu 信息
     * @return 结果
     */
	 int updateUmsMenu(UmsMenu umsMenu);
		
	/**
     * 删除信息
     * 
     * @param id 需要删除的数据ID
     * @return 结果
     */
	 int deleteUmsMenuById(Long id);
	
}
