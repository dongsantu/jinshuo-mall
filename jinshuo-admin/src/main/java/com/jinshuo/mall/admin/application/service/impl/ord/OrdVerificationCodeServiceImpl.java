package com.jinshuo.mall.admin.application.service.impl.ord;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jinshuo.mall.admin.application.dto.qry.ord.OrdVerificationCodeQry;
import com.jinshuo.mall.admin.application.service.ord.IOrdVerificationCodeService;
import com.jinshuo.mall.admin.domain.ord.OrdVerificationCode;
import com.jinshuo.mall.admin.infra.mapper.ord.OrdVerificationCodeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * 订单验证码 服务层实现
 * 
 * @author dyh
 * @date 2020-08-10
 */
@Service
public class OrdVerificationCodeServiceImpl implements IOrdVerificationCodeService
{
	@Autowired(required = false)
	private OrdVerificationCodeMapper ordVerificationCodeMapper;

	/**
     * 查询订单验证码信息
     * 
     * @param id 订单验证码ID
     * @return 订单验证码信息
     */
	public OrdVerificationCode selectOrdVerificationCodeById(Long id)
	{
	    return ordVerificationCodeMapper.selectOrdVerificationCodeById(id);
	}
	
	/**
     * 查询订单验证码列表
     * 
     * @param qry 订单验证码信息
     * @return 订单验证码集合
     */
	public PageInfo selectOrdVerificationCodePage(OrdVerificationCodeQry qry)
	{
        PageHelper.startPage(qry.getPageNum(), qry.getPageSize());
		OrdVerificationCode ordVerificationCode = new OrdVerificationCode();
        List<OrdVerificationCode> ordVerificationCodes = ordVerificationCodeMapper.selectOrdVerificationCodeList(ordVerificationCode);
        PageInfo pageInfo = new PageInfo(ordVerificationCodes);
	    return pageInfo;
	}
	
    /**
     * 新增订单验证码
     * 
     * @param ordVerificationCode 订单验证码信息
     * @return 结果
     */
	public int insertOrdVerificationCode(OrdVerificationCode ordVerificationCode)
	{
		ordVerificationCode.preInsert();
	    return ordVerificationCodeMapper.insertOrdVerificationCode(ordVerificationCode);
	}
	
	/**
     * 修改订单验证码
     * 
     * @param ordVerificationCode 订单验证码信息
     * @return 结果
     */
	public int updateOrdVerificationCode(OrdVerificationCode ordVerificationCode)
	{
	    ordVerificationCode.preUpdate();
	    return ordVerificationCodeMapper.updateOrdVerificationCode(ordVerificationCode);
	}

	/**
     * 删除订单验证码对象
     * 
     * @param id 需要删除的数据ID
     * @return 结果
     */
	public int deleteOrdVerificationCodeById(Long id)
	{
		return ordVerificationCodeMapper.deleteOrdVerificationCodeById(id);
	}
	
}
