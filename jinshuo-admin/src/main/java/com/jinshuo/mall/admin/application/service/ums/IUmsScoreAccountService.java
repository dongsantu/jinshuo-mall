package com.jinshuo.mall.admin.application.service.ums;

import com.github.pagehelper.PageInfo;
import com.jinshuo.mall.admin.domain.ums.UmsScoreAccount;

/**
 * 会员积分账户 服务层
 * 
 * @author dyh
 * @date 2020-08-12
 */
public interface IUmsScoreAccountService 
{
	/**
     * 查询会员积分账户信息
     * 
     * @param id 会员积分账户ID
     * @return 会员积分账户信息
     */
	 UmsScoreAccount selectUmsScoreAccountById(Long id);
	
	/**
     * 查询会员积分账户列表
     * 
     * @param qry 会员积分账户信息
     * @return 会员积分账户集合
     */
	PageInfo selectUmsScoreAccountPage(UmsScoreAccount qry);
	
	/**
     * 新增会员积分账户
     * 
     * @param umsScoreAccount 会员积分账户信息
     * @return 结果
     */
	 int insertUmsScoreAccount(UmsScoreAccount umsScoreAccount);
	
	/**
     * 修改会员积分账户
     * 
     * @param umsScoreAccount 会员积分账户信息
     * @return 结果
     */
	 int updateUmsScoreAccount(UmsScoreAccount umsScoreAccount);
		
	/**
     * 删除会员积分账户信息
     * 
     * @param id 需要删除的数据ID
     * @return 结果
     */
	 int deleteUmsScoreAccountById(Long id);
	
}
