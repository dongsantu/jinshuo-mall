package com.jinshuo.mall.admin.application.service.ums;

import com.github.pagehelper.PageInfo;
import com.jinshuo.mall.admin.domain.ums.UmsMember;

/**
 * 会员 服务层
 * 
 * @author dyh
 * @date 2020-08-12
 */
public interface IUmsMemberService 
{
	/**
     * 查询会员信息
     * 
     * @param id 会员ID
     * @return 会员信息
     */
	 UmsMember selectUmsMemberById(Long id);
	
	/**
     * 查询会员列表
     * 
     * @param qry 会员信息
     * @return 会员集合
     */
	PageInfo selectUmsMemberPage(UmsMember qry);
	
	/**
     * 新增会员
     * 
     * @param umsMember 会员信息
     * @return 结果
     */
	 int insertUmsMember(UmsMember umsMember);
	
	/**
     * 修改会员
     * 
     * @param umsMember 会员信息
     * @return 结果
     */
	 int updateUmsMember(UmsMember umsMember);
		
	/**
     * 删除会员信息
     * 
     * @param id 需要删除的数据ID
     * @return 结果
     */
	 int deleteUmsMemberById(Long id);
	
}
