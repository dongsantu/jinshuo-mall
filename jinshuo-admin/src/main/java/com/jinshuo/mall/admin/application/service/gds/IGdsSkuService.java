package com.jinshuo.mall.admin.application.service.gds;

import com.github.pagehelper.PageInfo;
import com.jinshuo.mall.admin.domain.gds.GdsSku;

/**
 *  服务层
 * 
 * @author dyh
 * @date 2020-08-12
 */
public interface IGdsSkuService 
{
	/**
     * 查询信息
     * 
     * @param id ID
     * @return 信息
     */
	 GdsSku selectGdsSkuById(Long id);
	
	/**
     * 查询列表
     * 
     * @param qry 信息
     * @return 集合
     */
	PageInfo selectGdsSkuPage(GdsSku qry);
	
	/**
     * 新增
     * 
     * @param gdsSku 信息
     * @return 结果
     */
	 int insertGdsSku(GdsSku gdsSku);
	
	/**
     * 修改
     * 
     * @param gdsSku 信息
     * @return 结果
     */
	 int updateGdsSku(GdsSku gdsSku);
		
	/**
     * 删除信息
     * 
     * @param id 需要删除的数据ID
     * @return 结果
     */
	 int deleteGdsSkuById(Long id);
	
}
