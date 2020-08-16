package com.jinshuo.mall.admin.application.service.impl.ums;

import com.github.pagehelper.PageInfo;
import com.jinshuo.mall.admin.application.service.ums.IUmsUserService;
import com.jinshuo.mall.admin.domain.ums.UmsUser;
import com.jinshuo.mall.admin.infra.mapper.ums.UmsUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 用户账户 服务层实现
 * 
 * @author dyh
 * @date 2020-08-12
 */
@Service
public class UmsUserServiceImpl implements IUmsUserService
{
	@Autowired(required = false)
	private UmsUserMapper umsUserMapper;

	/**
     * 查询用户账户信息
     * 
     * @param id 用户账户ID
     * @return 用户账户信息
     */
	public UmsUser selectUmsUserById(Long id)
	{
	    return umsUserMapper.selectUmsUserById(id);
	}
	
	/**
     * 查询用户账户列表
     * 
     * @param qry 用户账户信息
     * @return 用户账户集合
     */
	public PageInfo selectUmsUserPage(UmsUser qry)
	{
        /*PageHelper.startPage(qry.getPageNum(), qry.getPageSize());
		UmsUser umsUser = new UmsUser();
        List<UmsUser> umsUsers = umsUserMapper.selectUmsUserList(umsUser);
        PageInfo pageInfo = new PageInfo(umsUsers);
	    return pageInfo;*/
		return null;
	}
	
    /**
     * 新增用户账户
     * 
     * @param umsUser 用户账户信息
     * @return 结果
     */
	public int insertUmsUser(UmsUser umsUser)
	{
		umsUser.preInsert();
	    return umsUserMapper.insertUmsUser(umsUser);
	}
	
	/**
     * 修改用户账户
     * 
     * @param umsUser 用户账户信息
     * @return 结果
     */
	public int updateUmsUser(UmsUser umsUser)
	{
	    umsUser.preUpdate();
	    return umsUserMapper.updateUmsUser(umsUser);
	}

	/**
     * 删除用户账户对象
     * 
     * @param id 需要删除的数据ID
     * @return 结果
     */
	public int deleteUmsUserById(Long id)
	{
		return umsUserMapper.deleteUmsUserById(id);
	}
	
}
