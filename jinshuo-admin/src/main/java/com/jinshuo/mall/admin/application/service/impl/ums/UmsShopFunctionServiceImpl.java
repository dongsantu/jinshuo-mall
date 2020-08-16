package com.jinshuo.mall.admin.application.service.impl.ums;

import com.github.pagehelper.PageInfo;
import com.jinshuo.mall.admin.application.service.ums.IUmsShopFunctionService;
import com.jinshuo.mall.admin.domain.ums.UmsShopFunction;
import com.jinshuo.mall.admin.infra.mapper.ums.UmsShopFunctionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 *  服务层实现
 * 
 * @author dyh
 * @date 2020-08-12
 */
@Service
public class UmsShopFunctionServiceImpl implements IUmsShopFunctionService
{
	@Autowired(required = false)
	private UmsShopFunctionMapper umsShopFunctionMapper;

	/**
     * 查询信息
     * 
     * @param id ID
     * @return 信息
     */
	public UmsShopFunction selectUmsShopFunctionById(Long id)
	{
	    return umsShopFunctionMapper.selectUmsShopFunctionById(id);
	}
	
	/**
     * 查询列表
     * 
     * @param qry 信息
     * @return 集合
     */
	public PageInfo selectUmsShopFunctionPage(UmsShopFunction qry)
	{
        /*PageHelper.startPage(qry.getPageNum(), qry.getPageSize());
		UmsShopFunction umsShopFunction = new UmsShopFunction();
        List<UmsShopFunction> umsShopFunctions = umsShopFunctionMapper.selectUmsShopFunctionList(umsShopFunction);
        PageInfo pageInfo = new PageInfo(umsShopFunctions);
	    return pageInfo;*/
		return null;
	}
	
    /**
     * 新增
     * 
     * @param umsShopFunction 信息
     * @return 结果
     */
	public int insertUmsShopFunction(UmsShopFunction umsShopFunction)
	{
		umsShopFunction.preInsert();
	    return umsShopFunctionMapper.insertUmsShopFunction(umsShopFunction);
	}
	
	/**
     * 修改
     * 
     * @param umsShopFunction 信息
     * @return 结果
     */
	public int updateUmsShopFunction(UmsShopFunction umsShopFunction)
	{
	    umsShopFunction.preUpdate();
	    return umsShopFunctionMapper.updateUmsShopFunction(umsShopFunction);
	}

	/**
     * 删除对象
     * 
     * @param id 需要删除的数据ID
     * @return 结果
     */
	public int deleteUmsShopFunctionById(Long id)
	{
		return umsShopFunctionMapper.deleteUmsShopFunctionById(id);
	}
	
}
