package com.jinshuo.mall.admin.application.service.ums;

import com.github.pagehelper.PageInfo;
import com.jinshuo.mall.admin.domain.ums.UmsMemberAddress;

/**
 * 会员收货地址 服务层
 * 
 * @author dyh
 * @date 2020-08-12
 */
public interface IUmsMemberAddressService 
{
	/**
     * 查询会员收货地址信息
     * 
     * @param id 会员收货地址ID
     * @return 会员收货地址信息
     */
	 UmsMemberAddress selectUmsMemberAddressById(Long id);
	
	/**
     * 查询会员收货地址列表
     * 
     * @param qry 会员收货地址信息
     * @return 会员收货地址集合
     */
	PageInfo selectUmsMemberAddressPage(UmsMemberAddress qry);
	
	/**
     * 新增会员收货地址
     * 
     * @param umsMemberAddress 会员收货地址信息
     * @return 结果
     */
	 int insertUmsMemberAddress(UmsMemberAddress umsMemberAddress);
	
	/**
     * 修改会员收货地址
     * 
     * @param umsMemberAddress 会员收货地址信息
     * @return 结果
     */
	 int updateUmsMemberAddress(UmsMemberAddress umsMemberAddress);
		
	/**
     * 删除会员收货地址信息
     * 
     * @param id 需要删除的数据ID
     * @return 结果
     */
	 int deleteUmsMemberAddressById(Long id);
	
}
