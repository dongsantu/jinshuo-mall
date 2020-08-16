package com.jinshuo.mall.admin.application.service.impl.ums;

import com.github.pagehelper.PageInfo;
import com.jinshuo.mall.admin.application.service.ums.IUmsUserShopService;
import com.jinshuo.mall.admin.domain.ums.UmsUserShop;
import com.jinshuo.mall.admin.infra.mapper.ums.UmsUserShopMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 用户店铺关联 服务层实现
 * 
 * @author dyh
 * @date 2020-08-12
 */
@Service
public class UmsUserShopServiceImpl implements IUmsUserShopService
{
	@Autowired(required = false)
	private UmsUserShopMapper umsUserShopMapper;

	/**
     * 查询用户店铺关联信息
     * 
     * @param userId 用户店铺关联ID
     * @return 用户店铺关联信息
     */
	public UmsUserShop selectUmsUserShopById(Long userId)
	{
	    return umsUserShopMapper.selectUmsUserShopById(userId);
	}
	
	/**
     * 查询用户店铺关联列表
     * 
     * @param qry 用户店铺关联信息
     * @return 用户店铺关联集合
     */
	public PageInfo selectUmsUserShopPage(UmsUserShop qry)
	{
        /*PageHelper.startPage(qry.getPageNum(), qry.getPageSize());
		UmsUserShop umsUserShop = new UmsUserShop();
        List<UmsUserShop> umsUserShops = umsUserShopMapper.selectUmsUserShopList(umsUserShop);
        PageInfo pageInfo = new PageInfo(umsUserShops);
	    return pageInfo;*/
		return null;
	}
	
    /**
     * 新增用户店铺关联
     * 
     * @param umsUserShop 用户店铺关联信息
     * @return 结果
     */
	public int insertUmsUserShop(UmsUserShop umsUserShop)
	{
		umsUserShop.preInsert();
	    return umsUserShopMapper.insertUmsUserShop(umsUserShop);
	}
	
	/**
     * 修改用户店铺关联
     * 
     * @param umsUserShop 用户店铺关联信息
     * @return 结果
     */
	public int updateUmsUserShop(UmsUserShop umsUserShop)
	{
	    umsUserShop.preUpdate();
	    return umsUserShopMapper.updateUmsUserShop(umsUserShop);
	}

	/**
     * 删除用户店铺关联对象
     * 
     * @param id 需要删除的数据ID
     * @return 结果
     */
	public int deleteUmsUserShopById(Long id)
	{
		return umsUserShopMapper.deleteUmsUserShopById(id);
	}
	
}
