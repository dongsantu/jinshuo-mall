package com.jinshuo.mall.admin.application.service.impl.ums;

import com.github.pagehelper.PageInfo;
import com.jinshuo.mall.admin.application.service.ums.IUmsScoreAccountService;
import com.jinshuo.mall.admin.domain.ums.UmsScoreAccount;
import com.jinshuo.mall.admin.infra.mapper.ums.UmsScoreAccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 会员积分账户 服务层实现
 * 
 * @author dyh
 * @date 2020-08-12
 */
@Service
public class UmsScoreAccountServiceImpl implements IUmsScoreAccountService
{
	@Autowired(required = false)
	private UmsScoreAccountMapper umsScoreAccountMapper;

	/**
     * 查询会员积分账户信息
     * 
     * @param id 会员积分账户ID
     * @return 会员积分账户信息
     */
	public UmsScoreAccount selectUmsScoreAccountById(Long id)
	{
	    return umsScoreAccountMapper.selectUmsScoreAccountById(id);
	}
	
	/**
     * 查询会员积分账户列表
     * 
     * @param qry 会员积分账户信息
     * @return 会员积分账户集合
     */
	public PageInfo selectUmsScoreAccountPage(UmsScoreAccount qry)
	{
        /*PageHelper.startPage(qry.getPageNum(), qry.getPageSize());
		UmsScoreAccount umsScoreAccount = new UmsScoreAccount();
        List<UmsScoreAccount> umsScoreAccounts = umsScoreAccountMapper.selectUmsScoreAccountList(umsScoreAccount);
        PageInfo pageInfo = new PageInfo(umsScoreAccounts);
	    return pageInfo;*/
		return null;
	}
	
    /**
     * 新增会员积分账户
     * 
     * @param umsScoreAccount 会员积分账户信息
     * @return 结果
     */
	public int insertUmsScoreAccount(UmsScoreAccount umsScoreAccount)
	{
		umsScoreAccount.preInsert();
	    return umsScoreAccountMapper.insertUmsScoreAccount(umsScoreAccount);
	}
	
	/**
     * 修改会员积分账户
     * 
     * @param umsScoreAccount 会员积分账户信息
     * @return 结果
     */
	public int updateUmsScoreAccount(UmsScoreAccount umsScoreAccount)
	{
	    umsScoreAccount.preUpdate();
	    return umsScoreAccountMapper.updateUmsScoreAccount(umsScoreAccount);
	}

	/**
     * 删除会员积分账户对象
     * 
     * @param id 需要删除的数据ID
     * @return 结果
     */
	public int deleteUmsScoreAccountById(Long id)
	{
		return umsScoreAccountMapper.deleteUmsScoreAccountById(id);
	}
	
}
