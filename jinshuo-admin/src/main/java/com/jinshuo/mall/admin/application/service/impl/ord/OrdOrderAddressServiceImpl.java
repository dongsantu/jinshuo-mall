package com.jinshuo.mall.admin.application.service.impl.ord;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jinshuo.mall.admin.application.dto.qry.ord.OrdOrderAddressQry;
import com.jinshuo.mall.admin.application.service.ord.IOrdOrderAddressService;
import com.jinshuo.mall.admin.domain.ord.OrdOrderAddress;
import com.jinshuo.mall.admin.infra.mapper.ord.OrdOrderAddressMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * 订单收货地址 服务层实现
 * 
 * @author dyh
 * @date 2020-08-10
 */
@Service
public class OrdOrderAddressServiceImpl implements IOrdOrderAddressService
{
	@Autowired(required = false)
	private OrdOrderAddressMapper ordOrderAddressMapper;

	/**
     * 查询订单收货地址信息
     * 
     * @param id 订单收货地址ID
     * @return 订单收货地址信息
     */
	public OrdOrderAddress selectOrdOrderAddressById(Long id)
	{
	    return ordOrderAddressMapper.selectOrdOrderAddressById(id);
	}
	
	/**
     * 查询订单收货地址列表
     * 
     * @param qry 订单收货地址信息
     * @return 订单收货地址集合
     */
	public PageInfo selectOrdOrderAddressPage(OrdOrderAddressQry qry)
	{
        PageHelper.startPage(qry.getPageNum(), qry.getPageSize());
		OrdOrderAddress ordOrderAddress = new OrdOrderAddress();
        List<OrdOrderAddress> ordOrderAddresss = ordOrderAddressMapper.selectOrdOrderAddressList(ordOrderAddress);
        PageInfo pageInfo = new PageInfo(ordOrderAddresss);
	    return pageInfo;
	}
	
    /**
     * 新增订单收货地址
     * 
     * @param ordOrderAddress 订单收货地址信息
     * @return 结果
     */
	public int insertOrdOrderAddress(OrdOrderAddress ordOrderAddress)
	{
		ordOrderAddress.preInsert();
	    return ordOrderAddressMapper.insertOrdOrderAddress(ordOrderAddress);
	}
	
	/**
     * 修改订单收货地址
     * 
     * @param ordOrderAddress 订单收货地址信息
     * @return 结果
     */
	public int updateOrdOrderAddress(OrdOrderAddress ordOrderAddress)
	{
	    ordOrderAddress.preUpdate();
	    return ordOrderAddressMapper.updateOrdOrderAddress(ordOrderAddress);
	}

	/**
     * 删除订单收货地址对象
     * 
     * @param id 需要删除的数据ID
     * @return 结果
     */
	public int deleteOrdOrderAddressById(Long id)
	{
		return ordOrderAddressMapper.deleteOrdOrderAddressById(id);
	}
	
}
