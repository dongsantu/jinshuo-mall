package com.jinshuo.mall.admin.application.service.impl.ums;

import com.github.pagehelper.PageInfo;
import com.jinshuo.mall.admin.application.service.ums.IUmsMemberAddressService;
import com.jinshuo.mall.admin.domain.ums.UmsMemberAddress;
import com.jinshuo.mall.admin.infra.mapper.ums.UmsMemberAddressMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 会员收货地址 服务层实现
 * 
 * @author dyh
 * @date 2020-08-12
 */
@Service
public class UmsMemberAddressServiceImpl implements IUmsMemberAddressService
{
	@Autowired(required = false)
	private UmsMemberAddressMapper umsMemberAddressMapper;

	/**
     * 查询会员收货地址信息
     * 
     * @param id 会员收货地址ID
     * @return 会员收货地址信息
     */
	public UmsMemberAddress selectUmsMemberAddressById(Long id)
	{
	    return umsMemberAddressMapper.selectUmsMemberAddressById(id);
	}
	
	/**
     * 查询会员收货地址列表
     * 
     * @param qry 会员收货地址信息
     * @return 会员收货地址集合
     */
	public PageInfo selectUmsMemberAddressPage(UmsMemberAddress qry)
	{
        /*PageHelper.startPage(qry.getPageNum(), qry.getPageSize());
		UmsMemberAddress umsMemberAddress = new UmsMemberAddress();
        List<UmsMemberAddress> umsMemberAddresss = umsMemberAddressMapper.selectUmsMemberAddressList(umsMemberAddress);
        PageInfo pageInfo = new PageInfo(umsMemberAddresss);
	    return pageInfo;*/
		return null;
	}
	
    /**
     * 新增会员收货地址
     * 
     * @param umsMemberAddress 会员收货地址信息
     * @return 结果
     */
	public int insertUmsMemberAddress(UmsMemberAddress umsMemberAddress)
	{
		umsMemberAddress.preInsert();
	    return umsMemberAddressMapper.insertUmsMemberAddress(umsMemberAddress);
	}
	
	/**
     * 修改会员收货地址
     * 
     * @param umsMemberAddress 会员收货地址信息
     * @return 结果
     */
	public int updateUmsMemberAddress(UmsMemberAddress umsMemberAddress)
	{
	    umsMemberAddress.preUpdate();
	    return umsMemberAddressMapper.updateUmsMemberAddress(umsMemberAddress);
	}

	/**
     * 删除会员收货地址对象
     * 
     * @param id 需要删除的数据ID
     * @return 结果
     */
	public int deleteUmsMemberAddressById(Long id)
	{
		return umsMemberAddressMapper.deleteUmsMemberAddressById(id);
	}
	
}
