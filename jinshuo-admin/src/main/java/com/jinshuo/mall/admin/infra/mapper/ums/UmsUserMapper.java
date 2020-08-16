package com.jinshuo.mall.admin.infra.mapper.ums;

import com.jinshuo.mall.admin.domain.ums.UmsUser;

import java.util.List;

/**
 * 用户账户 数据层
 * 
 * @author dyh
 * @date 2020-08-12
 */
public interface UmsUserMapper 
{
	/**
     * 查询用户账户信息
     * 
     * @param id 用户账户ID
     * @return 用户账户信息
     */
	public UmsUser selectUmsUserById(Long id);
	
	/**
     * 查询用户账户列表
     * 
     * @param umsUser 用户账户信息
     * @return 用户账户集合
     */
	public List<UmsUser> selectUmsUserList(UmsUser umsUser);
	
	/**
     * 新增用户账户
     * 
     * @param umsUser 用户账户信息
     * @return 结果
     */
	public int insertUmsUser(UmsUser umsUser);
	
	/**
     * 修改用户账户
     * 
     * @param umsUser 用户账户信息
     * @return 结果
     */
	public int updateUmsUser(UmsUser umsUser);
	
	/**
     * 删除用户账户
     * 
     * @param id 用户账户ID
     * @return 结果
     */
	public int deleteUmsUserById(Long id);
	
	/**
     * 批量删除用户账户
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteUmsUserByIds(String[] ids);
	
}