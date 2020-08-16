package com.jinshuo.mall.admin.infra.mapper.ums;

import com.jinshuo.mall.admin.domain.ums.UmsScoreAccount;

import java.util.List;

/**
 * 会员积分账户 数据层
 * 
 * @author dyh
 * @date 2020-08-12
 */
public interface UmsScoreAccountMapper 
{
	/**
     * 查询会员积分账户信息
     * 
     * @param id 会员积分账户ID
     * @return 会员积分账户信息
     */
	public UmsScoreAccount selectUmsScoreAccountById(Long id);
	
	/**
     * 查询会员积分账户列表
     * 
     * @param umsScoreAccount 会员积分账户信息
     * @return 会员积分账户集合
     */
	public List<UmsScoreAccount> selectUmsScoreAccountList(UmsScoreAccount umsScoreAccount);
	
	/**
     * 新增会员积分账户
     * 
     * @param umsScoreAccount 会员积分账户信息
     * @return 结果
     */
	public int insertUmsScoreAccount(UmsScoreAccount umsScoreAccount);
	
	/**
     * 修改会员积分账户
     * 
     * @param umsScoreAccount 会员积分账户信息
     * @return 结果
     */
	public int updateUmsScoreAccount(UmsScoreAccount umsScoreAccount);
	
	/**
     * 删除会员积分账户
     * 
     * @param id 会员积分账户ID
     * @return 结果
     */
	public int deleteUmsScoreAccountById(Long id);
	
	/**
     * 批量删除会员积分账户
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteUmsScoreAccountByIds(String[] ids);
	
}