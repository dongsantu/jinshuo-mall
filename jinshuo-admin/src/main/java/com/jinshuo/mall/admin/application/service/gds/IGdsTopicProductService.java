package com.jinshuo.mall.admin.application.service.gds;

import com.github.pagehelper.PageInfo;
import com.jinshuo.mall.admin.domain.gds.GdsTopicProduct;

/**
 *  服务层
 * 
 * @author dyh
 * @date 2020-08-12
 */
public interface IGdsTopicProductService 
{
	/**
     * 查询信息
     * 
     * @param id ID
     * @return 信息
     */
	 GdsTopicProduct selectGdsTopicProductById(Long id);
	
	/**
     * 查询列表
     * 
     * @param qry 信息
     * @return 集合
     */
	PageInfo selectGdsTopicProductPage(GdsTopicProduct qry);
	
	/**
     * 新增
     * 
     * @param gdsTopicProduct 信息
     * @return 结果
     */
	 int insertGdsTopicProduct(GdsTopicProduct gdsTopicProduct);
	
	/**
     * 修改
     * 
     * @param gdsTopicProduct 信息
     * @return 结果
     */
	 int updateGdsTopicProduct(GdsTopicProduct gdsTopicProduct);
		
	/**
     * 删除信息
     * 
     * @param id 需要删除的数据ID
     * @return 结果
     */
	 int deleteGdsTopicProductById(Long id);
	
}
