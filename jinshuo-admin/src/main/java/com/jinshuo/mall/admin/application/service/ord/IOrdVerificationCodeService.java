package com.jinshuo.mall.admin.application.service.ord;

import com.github.pagehelper.PageInfo;
import com.jinshuo.mall.admin.application.dto.qry.ord.OrdVerificationCodeQry;
import com.jinshuo.mall.admin.domain.ord.OrdVerificationCode;

/**
 * 订单验证码 服务层
 * 
 * @author dyh
 * @date 2020-08-10
 */
public interface IOrdVerificationCodeService 
{
	/**
     * 查询订单验证码信息
     * 
     * @param id 订单验证码ID
     * @return 订单验证码信息
     */
	 OrdVerificationCode selectOrdVerificationCodeById(Long id);
	
	/**
     * 查询订单验证码列表
     * 
     * @param qry 订单验证码信息
     * @return 订单验证码集合
     */
	PageInfo selectOrdVerificationCodePage(OrdVerificationCodeQry qry);
	
	/**
     * 新增订单验证码
     * 
     * @param ordVerificationCode 订单验证码信息
     * @return 结果
     */
	 int insertOrdVerificationCode(OrdVerificationCode ordVerificationCode);
	
	/**
     * 修改订单验证码
     * 
     * @param ordVerificationCode 订单验证码信息
     * @return 结果
     */
	 int updateOrdVerificationCode(OrdVerificationCode ordVerificationCode);
		
	/**
     * 删除订单验证码信息
     * 
     * @param id 需要删除的数据ID
     * @return 结果
     */
	 int deleteOrdVerificationCodeById(Long id);
	
}
