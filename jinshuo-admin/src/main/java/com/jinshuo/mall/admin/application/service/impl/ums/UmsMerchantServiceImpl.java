package com.jinshuo.mall.admin.application.service.impl.ums;

import com.github.pagehelper.PageInfo;
import com.jinshuo.mall.admin.application.service.ums.IUmsMerchantService;
import com.jinshuo.mall.admin.domain.ums.UmsMerchant;
import com.jinshuo.mall.admin.infra.mapper.ums.UmsMerchantMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 *  服务层实现
 * 
 * @author dyh
 * @date 2020-08-12
 */
@Service
public class UmsMerchantServiceImpl implements IUmsMerchantService
{
	@Autowired(required = false)
	private UmsMerchantMapper umsMerchantMapper;

	/**
     * 查询信息
     * 
     * @param id ID
     * @return 信息
     */
	public UmsMerchant selectUmsMerchantById(Long id)
	{
	    return umsMerchantMapper.selectUmsMerchantById(id);
	}
	
	/**
     * 查询列表
     * 
     * @param qry 信息
     * @return 集合
     */
	public PageInfo selectUmsMerchantPage(UmsMerchant qry)
	{
        /*PageHelper.startPage(qry.getPageNum(), qry.getPageSize());
		UmsMerchant umsMerchant = new UmsMerchant();
        List<UmsMerchant> umsMerchants = umsMerchantMapper.selectUmsMerchantList(umsMerchant);
        PageInfo pageInfo = new PageInfo(umsMerchants);
	    return pageInfo;*/
		return null;
	}
	
    /**
     * 新增
     * 
     * @param umsMerchant 信息
     * @return 结果
     */
	public int insertUmsMerchant(UmsMerchant umsMerchant)
	{
		umsMerchant.preInsert();
	    return umsMerchantMapper.insertUmsMerchant(umsMerchant);
	}
	
	/**
     * 修改
     * 
     * @param umsMerchant 信息
     * @return 结果
     */
	public int updateUmsMerchant(UmsMerchant umsMerchant)
	{
	    umsMerchant.preUpdate();
	    return umsMerchantMapper.updateUmsMerchant(umsMerchant);
	}

	/**
     * 删除对象
     * 
     * @param id 需要删除的数据ID
     * @return 结果
     */
	public int deleteUmsMerchantById(Long id)
	{
		return umsMerchantMapper.deleteUmsMerchantById(id);
	}
	
}
