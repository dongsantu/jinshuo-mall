package com.jinshuo.mall.admin.infra.mapper.ums;

import com.jinshuo.mall.admin.domain.ums.UmsComment;

import java.util.List;

/**
 * 用户评论 数据层
 * 
 * @author dyh
 * @date 2020-08-12
 */
public interface UmsCommentMapper 
{
	/**
     * 查询用户评论信息
     * 
     * @param id 用户评论ID
     * @return 用户评论信息
     */
	public UmsComment selectUmsCommentById(Long id);
	
	/**
     * 查询用户评论列表
     * 
     * @param umsComment 用户评论信息
     * @return 用户评论集合
     */
	public List<UmsComment> selectUmsCommentList(UmsComment umsComment);
	
	/**
     * 新增用户评论
     * 
     * @param umsComment 用户评论信息
     * @return 结果
     */
	public int insertUmsComment(UmsComment umsComment);
	
	/**
     * 修改用户评论
     * 
     * @param umsComment 用户评论信息
     * @return 结果
     */
	public int updateUmsComment(UmsComment umsComment);
	
	/**
     * 删除用户评论
     * 
     * @param id 用户评论ID
     * @return 结果
     */
	public int deleteUmsCommentById(Long id);
	
	/**
     * 批量删除用户评论
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteUmsCommentByIds(String[] ids);
	
}