package com.jinshuo.mall.admin.infra.mapper.ums;

import com.jinshuo.mall.admin.domain.ums.UmsMerMenu;

import java.util.List;

/**
 *  数据层
 * 
 * @author dyh
 * @date 2020-08-12
 */
public interface UmsMerMenuMapper 
{
	/**
     * 查询信息
     * 
     * @param id ID
     * @return 信息
     */
	public UmsMerMenu selectUmsMerMenuById(Long id);
	
	/**
     * 查询列表
     * 
     * @param umsMerMenu 信息
     * @return 集合
     */
	public List<UmsMerMenu> selectUmsMerMenuList(UmsMerMenu umsMerMenu);
	
	/**
     * 新增
     * 
     * @param umsMerMenu 信息
     * @return 结果
     */
	public int insertUmsMerMenu(UmsMerMenu umsMerMenu);
	
	/**
     * 修改
     * 
     * @param umsMerMenu 信息
     * @return 结果
     */
	public int updateUmsMerMenu(UmsMerMenu umsMerMenu);
	
	/**
     * 删除
     * 
     * @param id ID
     * @return 结果
     */
	public int deleteUmsMerMenuById(Long id);
	
	/**
     * 批量删除
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteUmsMerMenuByIds(String[] ids);
	
}