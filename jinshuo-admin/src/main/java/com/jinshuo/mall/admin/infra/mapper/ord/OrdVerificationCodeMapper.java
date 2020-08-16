package com.jinshuo.mall.admin.infra.mapper.ord;

import com.jinshuo.mall.admin.domain.ord.OrdVerificationCode;
import java.util.List;	

/**
 * 订单验证码 数据层
 * 
 * @author dyh
 * @date 2020-08-10
 */
public interface OrdVerificationCodeMapper 
{
	/**
     * 查询订单验证码信息
     * 
     * @param id 订单验证码ID
     * @return 订单验证码信息
     */
	public OrdVerificationCode selectOrdVerificationCodeById(Long id);
	
	/**
     * 查询订单验证码列表
     * 
     * @param ordVerificationCode 订单验证码信息
     * @return 订单验证码集合
     */
	public List<OrdVerificationCode> selectOrdVerificationCodeList(OrdVerificationCode ordVerificationCode);
	
	/**
     * 新增订单验证码
     * 
     * @param ordVerificationCode 订单验证码信息
     * @return 结果
     */
	public int insertOrdVerificationCode(OrdVerificationCode ordVerificationCode);
	
	/**
     * 修改订单验证码
     * 
     * @param ordVerificationCode 订单验证码信息
     * @return 结果
     */
	public int updateOrdVerificationCode(OrdVerificationCode ordVerificationCode);
	
	/**
     * 删除订单验证码
     * 
     * @param id 订单验证码ID
     * @return 结果
     */
	public int deleteOrdVerificationCodeById(Long id);
	
	/**
     * 批量删除订单验证码
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteOrdVerificationCodeByIds(String[] ids);
	
}