package com.jinshuo.mall.admin.infra.mapper.ord;

import com.jinshuo.mall.admin.domain.ord.OrdVerificationCodeLog;

import java.util.List;

/**
 * 订单验证码 数据层
 * 
 * @author dyh
 * @date 2020-08-12
 */
public interface OrdVerificationCodeLogMapper 
{
	/**
     * 查询订单验证码信息
     * 
     * @param id 订单验证码ID
     * @return 订单验证码信息
     */
	public OrdVerificationCodeLog selectOrdVerificationCodeLogById(Long id);
	
	/**
     * 查询订单验证码列表
     * 
     * @param ordVerificationCodeLog 订单验证码信息
     * @return 订单验证码集合
     */
	public List<OrdVerificationCodeLog> selectOrdVerificationCodeLogList(OrdVerificationCodeLog ordVerificationCodeLog);
	
	/**
     * 新增订单验证码
     * 
     * @param ordVerificationCodeLog 订单验证码信息
     * @return 结果
     */
	public int insertOrdVerificationCodeLog(OrdVerificationCodeLog ordVerificationCodeLog);
	
	/**
     * 修改订单验证码
     * 
     * @param ordVerificationCodeLog 订单验证码信息
     * @return 结果
     */
	public int updateOrdVerificationCodeLog(OrdVerificationCodeLog ordVerificationCodeLog);
	
	/**
     * 删除订单验证码
     * 
     * @param id 订单验证码ID
     * @return 结果
     */
	public int deleteOrdVerificationCodeLogById(Long id);
	
	/**
     * 批量删除订单验证码
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteOrdVerificationCodeLogByIds(String[] ids);
	
}