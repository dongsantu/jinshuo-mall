package com.jinshuo.mall.admin.application.service.impl.ums;

import com.github.pagehelper.PageInfo;
import com.jinshuo.mall.admin.application.service.ums.IUmsShopWxconfigService;
import com.jinshuo.mall.admin.domain.ums.UmsShopWxconfig;
import com.jinshuo.mall.admin.infra.mapper.ums.UmsShopWxconfigMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 微信配置 服务层实现
 * 
 * @author dyh
 * @date 2020-08-12
 */
@Service
public class UmsShopWxconfigServiceImpl implements IUmsShopWxconfigService
{
	@Autowired(required = false)
	private UmsShopWxconfigMapper umsShopWxconfigMapper;

	/**
     * 查询微信配置信息
     * 
     * @param id 微信配置ID
     * @return 微信配置信息
     */
	public UmsShopWxconfig selectUmsShopWxconfigById(Long id)
	{
	    return umsShopWxconfigMapper.selectUmsShopWxconfigById(id);
	}
	
	/**
     * 查询微信配置列表
     * 
     * @param qry 微信配置信息
     * @return 微信配置集合
     */
	public PageInfo selectUmsShopWxconfigPage(UmsShopWxconfig qry)
	{
        /*PageHelper.startPage(qry.getPageNum(), qry.getPageSize());
		UmsShopWxconfig umsShopWxconfig = new UmsShopWxconfig();
        List<UmsShopWxconfig> umsShopWxconfigs = umsShopWxconfigMapper.selectUmsShopWxconfigList(umsShopWxconfig);
        PageInfo pageInfo = new PageInfo(umsShopWxconfigs);
	    return pageInfo;*/
		return null;
	}
	
    /**
     * 新增微信配置
     * 
     * @param umsShopWxconfig 微信配置信息
     * @return 结果
     */
	public int insertUmsShopWxconfig(UmsShopWxconfig umsShopWxconfig)
	{
		umsShopWxconfig.preInsert();
	    return umsShopWxconfigMapper.insertUmsShopWxconfig(umsShopWxconfig);
	}
	
	/**
     * 修改微信配置
     * 
     * @param umsShopWxconfig 微信配置信息
     * @return 结果
     */
	public int updateUmsShopWxconfig(UmsShopWxconfig umsShopWxconfig)
	{
	    umsShopWxconfig.preUpdate();
	    return umsShopWxconfigMapper.updateUmsShopWxconfig(umsShopWxconfig);
	}

	/**
     * 删除微信配置对象
     * 
     * @param id 需要删除的数据ID
     * @return 结果
     */
	public int deleteUmsShopWxconfigById(Long id)
	{
		return umsShopWxconfigMapper.deleteUmsShopWxconfigById(id);
	}
	
}
