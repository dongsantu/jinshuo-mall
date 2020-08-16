package com.jinshuo.mall.admin.application.service.impl.ums;

import com.github.pagehelper.PageInfo;
import com.jinshuo.mall.admin.application.service.ums.IUmsMemberService;
import com.jinshuo.mall.admin.domain.ums.UmsMember;
import com.jinshuo.mall.admin.infra.mapper.ums.UmsMemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 会员 服务层实现
 * 
 * @author dyh
 * @date 2020-08-12
 */
@Service
public class UmsMemberServiceImpl implements IUmsMemberService
{
	@Autowired(required = false)
	private UmsMemberMapper umsMemberMapper;

	/**
     * 查询会员信息
     * 
     * @param id 会员ID
     * @return 会员信息
     */
	public UmsMember selectUmsMemberById(Long id)
	{
	    return umsMemberMapper.selectUmsMemberById(id);
	}
	
	/**
     * 查询会员列表
     * 
     * @param qry 会员信息
     * @return 会员集合
     */
	public PageInfo selectUmsMemberPage(UmsMember qry)
	{
        /*PageHelper.startPage(qry.getPageNum(), qry.getPageSize());
		UmsMember umsMember = new UmsMember();
        List<UmsMember> umsMembers = umsMemberMapper.selectUmsMemberList(umsMember);
        PageInfo pageInfo = new PageInfo(umsMembers);
	    return pageInfo;*/
		return null;
	}
	
    /**
     * 新增会员
     * 
     * @param umsMember 会员信息
     * @return 结果
     */
	public int insertUmsMember(UmsMember umsMember)
	{
		umsMember.preInsert();
	    return umsMemberMapper.insertUmsMember(umsMember);
	}
	
	/**
     * 修改会员
     * 
     * @param umsMember 会员信息
     * @return 结果
     */
	public int updateUmsMember(UmsMember umsMember)
	{
	    umsMember.preUpdate();
	    return umsMemberMapper.updateUmsMember(umsMember);
	}

	/**
     * 删除会员对象
     * 
     * @param id 需要删除的数据ID
     * @return 结果
     */
	public int deleteUmsMemberById(Long id)
	{
		return umsMemberMapper.deleteUmsMemberById(id);
	}
	
}
