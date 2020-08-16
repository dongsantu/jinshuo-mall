package com.jinshuo.mall.admin.application.service.ums;

import com.github.pagehelper.PageInfo;
import com.jinshuo.mall.admin.domain.ums.UmsMerMenu;

/**
 *  服务层
 * 
 * @author dyh
 * @date 2020-08-12
 */
public interface IUmsMerMenuService 
{
	/**
     * 查询信息
     * 
     * @param id ID
     * @return 信息
     */
	 UmsMerMenu selectUmsMerMenuById(Long id);
	
	/**
     * 查询列表
     * 
     * @param qry 信息
     * @return 集合
     */
	PageInfo selectUmsMerMenuPage(UmsMerMenu qry);
	
	/**
     * 新增
     * 
     * @param umsMerMenu 信息
     * @return 结果
     */
	 int insertUmsMerMenu(UmsMerMenu umsMerMenu);
	
	/**
     * 修改
     * 
     * @param umsMerMenu 信息
     * @return 结果
     */
	 int updateUmsMerMenu(UmsMerMenu umsMerMenu);
		
	/**
     * 删除信息
     * 
     * @param id 需要删除的数据ID
     * @return 结果
     */
	 int deleteUmsMerMenuById(Long id);
	
}
