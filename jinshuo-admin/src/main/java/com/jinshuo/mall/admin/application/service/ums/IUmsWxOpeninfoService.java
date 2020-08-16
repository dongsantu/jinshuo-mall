package com.jinshuo.mall.admin.application.service.ums;

import com.github.pagehelper.PageInfo;
import com.jinshuo.mall.admin.domain.ums.UmsWxOpeninfo;

/**
 * 微信菜单 服务层
 * 
 * @author dyh
 * @date 2020-08-12
 */
public interface IUmsWxOpeninfoService 
{
	/**
     * 查询微信菜单信息
     * 
     * @param id 微信菜单ID
     * @return 微信菜单信息
     */
	 UmsWxOpeninfo selectUmsWxOpeninfoById(Long id);
	
	/**
     * 查询微信菜单列表
     * 
     * @param qry 微信菜单信息
     * @return 微信菜单集合
     */
	PageInfo selectUmsWxOpeninfoPage(UmsWxOpeninfo qry);
	
	/**
     * 新增微信菜单
     * 
     * @param umsWxOpeninfo 微信菜单信息
     * @return 结果
     */
	 int insertUmsWxOpeninfo(UmsWxOpeninfo umsWxOpeninfo);
	
	/**
     * 修改微信菜单
     * 
     * @param umsWxOpeninfo 微信菜单信息
     * @return 结果
     */
	 int updateUmsWxOpeninfo(UmsWxOpeninfo umsWxOpeninfo);
		
	/**
     * 删除微信菜单信息
     * 
     * @param id 需要删除的数据ID
     * @return 结果
     */
	 int deleteUmsWxOpeninfoById(Long id);
	
}
