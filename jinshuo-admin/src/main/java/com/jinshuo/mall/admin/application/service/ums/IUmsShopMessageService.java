package com.jinshuo.mall.admin.application.service.ums;

import com.github.pagehelper.PageInfo;
import com.jinshuo.mall.admin.domain.ums.UmsShopMessage;

/**
 *  服务层
 * 
 * @author dyh
 * @date 2020-08-12
 */
public interface IUmsShopMessageService 
{
	/**
     * 查询信息
     * 
     * @param id ID
     * @return 信息
     */
	 UmsShopMessage selectUmsShopMessageById(Long id);
	
	/**
     * 查询列表
     * 
     * @param qry 信息
     * @return 集合
     */
	PageInfo selectUmsShopMessagePage(UmsShopMessage qry);
	
	/**
     * 新增
     * 
     * @param umsShopMessage 信息
     * @return 结果
     */
	 int insertUmsShopMessage(UmsShopMessage umsShopMessage);
	
	/**
     * 修改
     * 
     * @param umsShopMessage 信息
     * @return 结果
     */
	 int updateUmsShopMessage(UmsShopMessage umsShopMessage);
		
	/**
     * 删除信息
     * 
     * @param id 需要删除的数据ID
     * @return 结果
     */
	 int deleteUmsShopMessageById(Long id);
	
}
