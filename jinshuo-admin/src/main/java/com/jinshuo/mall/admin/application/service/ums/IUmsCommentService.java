package com.jinshuo.mall.admin.application.service.ums;

import com.github.pagehelper.PageInfo;
import com.jinshuo.mall.admin.domain.ums.UmsComment;

/**
 * 用户评论 服务层
 * 
 * @author dyh
 * @date 2020-08-12
 */
public interface IUmsCommentService 
{
	/**
     * 查询用户评论信息
     * 
     * @param id 用户评论ID
     * @return 用户评论信息
     */
	 UmsComment selectUmsCommentById(Long id);
	
	/**
     * 查询用户评论列表
     * 
     * @param qry 用户评论信息
     * @return 用户评论集合
     */
	PageInfo selectUmsCommentPage(UmsComment qry);
	
	/**
     * 新增用户评论
     * 
     * @param umsComment 用户评论信息
     * @return 结果
     */
	 int insertUmsComment(UmsComment umsComment);
	
	/**
     * 修改用户评论
     * 
     * @param umsComment 用户评论信息
     * @return 结果
     */
	 int updateUmsComment(UmsComment umsComment);
		
	/**
     * 删除用户评论信息
     * 
     * @param id 需要删除的数据ID
     * @return 结果
     */
	 int deleteUmsCommentById(Long id);
	
}
