package com.jinshuo.mall.admin.application.service.ums;

import com.github.pagehelper.PageInfo;
import com.jinshuo.mall.admin.domain.ums.UmsMemberWx;

/**
 * 微信账户 服务层
 * 
 * @author dyh
 * @date 2020-08-12
 */
public interface IUmsMemberWxService 
{
	/**
     * 查询微信账户信息
     * 
     * @param id 微信账户ID
     * @return 微信账户信息
     */
	 UmsMemberWx selectUmsMemberWxById(Long id);
	
	/**
     * 查询微信账户列表
     * 
     * @param qry 微信账户信息
     * @return 微信账户集合
     */
	PageInfo selectUmsMemberWxPage(UmsMemberWx qry);
	
	/**
     * 新增微信账户
     * 
     * @param umsMemberWx 微信账户信息
     * @return 结果
     */
	 int insertUmsMemberWx(UmsMemberWx umsMemberWx);
	
	/**
     * 修改微信账户
     * 
     * @param umsMemberWx 微信账户信息
     * @return 结果
     */
	 int updateUmsMemberWx(UmsMemberWx umsMemberWx);
		
	/**
     * 删除微信账户信息
     * 
     * @param id 需要删除的数据ID
     * @return 结果
     */
	 int deleteUmsMemberWxById(Long id);
	
}
