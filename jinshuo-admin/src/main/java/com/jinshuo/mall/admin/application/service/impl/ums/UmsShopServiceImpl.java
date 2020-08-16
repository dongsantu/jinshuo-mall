package com.jinshuo.mall.admin.application.service.impl.ums;

import com.github.pagehelper.PageInfo;
import com.jinshuo.mall.admin.application.service.ums.IUmsShopService;
import com.jinshuo.mall.admin.domain.ums.UmsShop;
import com.jinshuo.mall.admin.infra.mapper.ums.UmsShopMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 *  服务层实现
 * 
 * @author dyh
 * @date 2020-08-12
 */
@Service
public class UmsShopServiceImpl implements IUmsShopService
{
	@Autowired(required = false)
	private UmsShopMapper umsShopMapper;

	/**
     * 查询信息
     * 
     * @param id ID
     * @return 信息
     */
	public UmsShop selectUmsShopById(Long id)
	{
	    return umsShopMapper.selectUmsShopById(id);
	}
	
	/**
     * 查询列表
     * 
     * @param qry 信息
     * @return 集合
     */
	public PageInfo selectUmsShopPage(UmsShop qry)
	{
        /*PageHelper.startPage(qry.getPageNum(), qry.getPageSize());
		UmsShop umsShop = new UmsShop();
        List<UmsShop> umsShops = umsShopMapper.selectUmsShopList(umsShop);
        PageInfo pageInfo = new PageInfo(umsShops);
	    return pageInfo;*/
		return null;
	}
	
    /**
     * 新增
     * 
     * @param umsShop 信息
     * @return 结果
     */
	public int insertUmsShop(UmsShop umsShop)
	{
		umsShop.preInsert();
	    return umsShopMapper.insertUmsShop(umsShop);
	}
	
	/**
     * 修改
     * 
     * @param umsShop 信息
     * @return 结果
     */
	public int updateUmsShop(UmsShop umsShop)
	{
	    umsShop.preUpdate();
	    return umsShopMapper.updateUmsShop(umsShop);
	}

	/**
     * 删除对象
     * 
     * @param id 需要删除的数据ID
     * @return 结果
     */
	public int deleteUmsShopById(Long id)
	{
		return umsShopMapper.deleteUmsShopById(id);
	}
	
}
