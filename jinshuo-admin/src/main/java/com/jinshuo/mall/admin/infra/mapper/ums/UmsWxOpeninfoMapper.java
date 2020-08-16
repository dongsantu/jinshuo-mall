package com.jinshuo.mall.admin.infra.mapper.ums;

import com.jinshuo.mall.admin.domain.ums.UmsWxOpeninfo;

import java.util.List;

/**
 * 微信菜单 数据层
 * 
 * @author dyh
 * @date 2020-08-12
 */
public interface UmsWxOpeninfoMapper 
{
	/**
     * 查询微信菜单信息
     * 
     * @param id 微信菜单ID
     * @return 微信菜单信息
     */
	public UmsWxOpeninfo selectUmsWxOpeninfoById(Long id);
	
	/**
     * 查询微信菜单列表
     * 
     * @param umsWxOpeninfo 微信菜单信息
     * @return 微信菜单集合
     */
	public List<UmsWxOpeninfo> selectUmsWxOpeninfoList(UmsWxOpeninfo umsWxOpeninfo);
	
	/**
     * 新增微信菜单
     * 
     * @param umsWxOpeninfo 微信菜单信息
     * @return 结果
     */
	public int insertUmsWxOpeninfo(UmsWxOpeninfo umsWxOpeninfo);
	
	/**
     * 修改微信菜单
     * 
     * @param umsWxOpeninfo 微信菜单信息
     * @return 结果
     */
	public int updateUmsWxOpeninfo(UmsWxOpeninfo umsWxOpeninfo);
	
	/**
     * 删除微信菜单
     * 
     * @param id 微信菜单ID
     * @return 结果
     */
	public int deleteUmsWxOpeninfoById(Long id);
	
	/**
     * 批量删除微信菜单
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteUmsWxOpeninfoByIds(String[] ids);
	
}