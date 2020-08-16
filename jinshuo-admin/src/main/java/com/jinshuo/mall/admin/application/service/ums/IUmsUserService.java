package com.jinshuo.mall.admin.application.service.ums;

import com.github.pagehelper.PageInfo;
import com.jinshuo.mall.admin.domain.ums.UmsUser;

/**
 * 用户账户 服务层
 * 
 * @author dyh
 * @date 2020-08-12
 */
public interface IUmsUserService 
{
	/**
     * 查询用户账户信息
     * 
     * @param id 用户账户ID
     * @return 用户账户信息
     */
	 UmsUser selectUmsUserById(Long id);
	
	/**
     * 查询用户账户列表
     * 
     * @param qry 用户账户信息
     * @return 用户账户集合
     */
	PageInfo selectUmsUserPage(UmsUser qry);
	
	/**
     * 新增用户账户
     * 
     * @param umsUser 用户账户信息
     * @return 结果
     */
	 int insertUmsUser(UmsUser umsUser);
	
	/**
     * 修改用户账户
     * 
     * @param umsUser 用户账户信息
     * @return 结果
     */
	 int updateUmsUser(UmsUser umsUser);
		
	/**
     * 删除用户账户信息
     * 
     * @param id 需要删除的数据ID
     * @return 结果
     */
	 int deleteUmsUserById(Long id);
	
}
