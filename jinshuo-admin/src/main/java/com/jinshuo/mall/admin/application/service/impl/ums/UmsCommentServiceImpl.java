package com.jinshuo.mall.admin.application.service.impl.ums;

import com.github.pagehelper.PageInfo;
import com.jinshuo.mall.admin.application.service.ums.IUmsCommentService;
import com.jinshuo.mall.admin.domain.ums.UmsComment;
import com.jinshuo.mall.admin.infra.mapper.ums.UmsCommentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 用户评论 服务层实现
 * 
 * @author dyh
 * @date 2020-08-12
 */
@Service
public class UmsCommentServiceImpl implements IUmsCommentService
{
	@Autowired(required = false)
	private UmsCommentMapper umsCommentMapper;

	/**
     * 查询用户评论信息
     * 
     * @param id 用户评论ID
     * @return 用户评论信息
     */
	public UmsComment selectUmsCommentById(Long id)
	{
	    return umsCommentMapper.selectUmsCommentById(id);
	}
	
	/**
     * 查询用户评论列表
     * 
     * @param qry 用户评论信息
     * @return 用户评论集合
     */
	public PageInfo selectUmsCommentPage(UmsComment qry)
	{
        /*PageHelper.startPage(qry.getPageNum(), qry.getPageSize());
		UmsComment umsComment = new UmsComment();
        List<UmsComment> umsComments = umsCommentMapper.selectUmsCommentList(umsComment);
        PageInfo pageInfo = new PageInfo(umsComments);
	    return pageInfo;*/
		return null;
	}
	
    /**
     * 新增用户评论
     * 
     * @param umsComment 用户评论信息
     * @return 结果
     */
	public int insertUmsComment(UmsComment umsComment)
	{
		umsComment.preInsert();
	    return umsCommentMapper.insertUmsComment(umsComment);
	}
	
	/**
     * 修改用户评论
     * 
     * @param umsComment 用户评论信息
     * @return 结果
     */
	public int updateUmsComment(UmsComment umsComment)
	{
	    umsComment.preUpdate();
	    return umsCommentMapper.updateUmsComment(umsComment);
	}

	/**
     * 删除用户评论对象
     * 
     * @param id 需要删除的数据ID
     * @return 结果
     */
	public int deleteUmsCommentById(Long id)
	{
		return umsCommentMapper.deleteUmsCommentById(id);
	}
	
}
