package com.jinshuo.mall.admin.application.service.impl.ums;

import com.github.pagehelper.PageInfo;
import com.jinshuo.mall.admin.application.service.ums.IUmsFunctionService;
import com.jinshuo.mall.admin.domain.ums.UmsFunction;
import com.jinshuo.mall.admin.infra.mapper.ums.UmsFunctionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 用户店铺关联 服务层实现
 * 
 * @author dyh
 * @date 2020-08-12
 */
@Service
public class UmsFunctionServiceImpl implements IUmsFunctionService
{
	@Autowired(required = false)
	private UmsFunctionMapper umsFunctionMapper;

	/**
     * 查询用户店铺关联信息
     * 
     * @param id 用户店铺关联ID
     * @return 用户店铺关联信息
     */
	public UmsFunction selectUmsFunctionById(Long id)
	{
	    return umsFunctionMapper.selectUmsFunctionById(id);
	}
	
	/**
     * 查询用户店铺关联列表
     * 
     * @param qry 用户店铺关联信息
     * @return 用户店铺关联集合
     */
	public PageInfo selectUmsFunctionPage(UmsFunction qry)
	{
        /*PageHelper.startPage(qry.getPageNum(), qry.getPageSize());
		UmsFunction umsFunction = new UmsFunction();
        List<UmsFunction> umsFunctions = umsFunctionMapper.selectUmsFunctionList(umsFunction);
        PageInfo pageInfo = new PageInfo(umsFunctions);
	    return pageInfo;*/
		return null;
	}
	
    /**
     * 新增用户店铺关联
     * 
     * @param umsFunction 用户店铺关联信息
     * @return 结果
     */
	public int insertUmsFunction(UmsFunction umsFunction)
	{
		umsFunction.preInsert();
	    return umsFunctionMapper.insertUmsFunction(umsFunction);
	}
	
	/**
     * 修改用户店铺关联
     * 
     * @param umsFunction 用户店铺关联信息
     * @return 结果
     */
	public int updateUmsFunction(UmsFunction umsFunction)
	{
	    umsFunction.preUpdate();
	    return umsFunctionMapper.updateUmsFunction(umsFunction);
	}

	/**
     * 删除用户店铺关联对象
     * 
     * @param id 需要删除的数据ID
     * @return 结果
     */
	public int deleteUmsFunctionById(Long id)
	{
		return umsFunctionMapper.deleteUmsFunctionById(id);
	}
	
}
