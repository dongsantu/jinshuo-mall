package com.jinshuo.mall.admin.infra.mapper.ums;

import com.jinshuo.mall.admin.domain.ums.UmsMemberWx;

import java.util.List;

/**
 * 微信账户 数据层
 * 
 * @author dyh
 * @date 2020-08-12
 */
public interface UmsMemberWxMapper 
{
	/**
     * 查询微信账户信息
     * 
     * @param id 微信账户ID
     * @return 微信账户信息
     */
	public UmsMemberWx selectUmsMemberWxById(Long id);
	
	/**
     * 查询微信账户列表
     * 
     * @param umsMemberWx 微信账户信息
     * @return 微信账户集合
     */
	public List<UmsMemberWx> selectUmsMemberWxList(UmsMemberWx umsMemberWx);
	
	/**
     * 新增微信账户
     * 
     * @param umsMemberWx 微信账户信息
     * @return 结果
     */
	public int insertUmsMemberWx(UmsMemberWx umsMemberWx);
	
	/**
     * 修改微信账户
     * 
     * @param umsMemberWx 微信账户信息
     * @return 结果
     */
	public int updateUmsMemberWx(UmsMemberWx umsMemberWx);
	
	/**
     * 删除微信账户
     * 
     * @param id 微信账户ID
     * @return 结果
     */
	public int deleteUmsMemberWxById(Long id);
	
	/**
     * 批量删除微信账户
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteUmsMemberWxByIds(String[] ids);
	
}