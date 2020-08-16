package com.jinshuo.mall.admin.application.service.gds;

import com.github.pagehelper.PageInfo;
import com.jinshuo.mall.admin.domain.gds.GdsSpuOther;

/**
 *  服务层
 * 
 * @author dyh
 * @date 2020-08-12
 */
public interface IGdsSpuOtherService 
{
	/**
     * 查询信息
     * 
     * @param id ID
     * @return 信息
     */
	 GdsSpuOther selectGdsSpuOtherById(Long id);
	
	/**
     * 查询列表
     * 
     * @param qry 信息
     * @return 集合
     */
	PageInfo selectGdsSpuOtherPage(GdsSpuOther qry);
	
	/**
     * 新增
     * 
     * @param gdsSpuOther 信息
     * @return 结果
     */
	 int insertGdsSpuOther(GdsSpuOther gdsSpuOther);
	
	/**
     * 修改
     * 
     * @param gdsSpuOther 信息
     * @return 结果
     */
	 int updateGdsSpuOther(GdsSpuOther gdsSpuOther);
		
	/**
     * 删除信息
     * 
     * @param id 需要删除的数据ID
     * @return 结果
     */
	 int deleteGdsSpuOtherById(Long id);
	
}
