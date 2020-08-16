package com.jinshuo.mall.admin.application.service.gds;

import com.github.pagehelper.PageInfo;
import com.jinshuo.mall.admin.domain.gds.GdsBrand;

/**
 *  服务层
 * 
 * @author dyh
 * @date 2020-08-12
 */
public interface IGdsBrandService 
{
	/**
     * 查询信息
     * 
     * @param id ID
     * @return 信息
     */
	 GdsBrand selectGdsBrandById(Long id);
	
	/**
     * 查询列表
     * 
     * @param qry 信息
     * @return 集合
     */
	PageInfo selectGdsBrandPage(GdsBrand qry);
	
	/**
     * 新增
     * 
     * @param gdsBrand 信息
     * @return 结果
     */
	 int insertGdsBrand(GdsBrand gdsBrand);
	
	/**
     * 修改
     * 
     * @param gdsBrand 信息
     * @return 结果
     */
	 int updateGdsBrand(GdsBrand gdsBrand);
		
	/**
     * 删除信息
     * 
     * @param id 需要删除的数据ID
     * @return 结果
     */
	 int deleteGdsBrandById(Long id);
	
}
