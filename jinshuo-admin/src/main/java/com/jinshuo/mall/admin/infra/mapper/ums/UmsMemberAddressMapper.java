package com.jinshuo.mall.admin.infra.mapper.ums;

import com.jinshuo.mall.admin.domain.ums.UmsMemberAddress;

import java.util.List;

/**
 * 会员收货地址 数据层
 * 
 * @author dyh
 * @date 2020-08-12
 */
public interface UmsMemberAddressMapper 
{
	/**
     * 查询会员收货地址信息
     * 
     * @param id 会员收货地址ID
     * @return 会员收货地址信息
     */
	public UmsMemberAddress selectUmsMemberAddressById(Long id);
	
	/**
     * 查询会员收货地址列表
     * 
     * @param umsMemberAddress 会员收货地址信息
     * @return 会员收货地址集合
     */
	public List<UmsMemberAddress> selectUmsMemberAddressList(UmsMemberAddress umsMemberAddress);
	
	/**
     * 新增会员收货地址
     * 
     * @param umsMemberAddress 会员收货地址信息
     * @return 结果
     */
	public int insertUmsMemberAddress(UmsMemberAddress umsMemberAddress);
	
	/**
     * 修改会员收货地址
     * 
     * @param umsMemberAddress 会员收货地址信息
     * @return 结果
     */
	public int updateUmsMemberAddress(UmsMemberAddress umsMemberAddress);
	
	/**
     * 删除会员收货地址
     * 
     * @param id 会员收货地址ID
     * @return 结果
     */
	public int deleteUmsMemberAddressById(Long id);
	
	/**
     * 批量删除会员收货地址
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteUmsMemberAddressByIds(String[] ids);
	
}