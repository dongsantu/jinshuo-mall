package com.jinshuo.mall.admin.infra.mapper.gds;

import com.jinshuo.mall.admin.domain.gds.GdsTopicProduct;
import java.util.List;	

/**
 *  数据层
 * 
 * @author dyh
 * @date 2020-08-12
 */
public interface GdsTopicProductMapper 
{
	/**
     * 查询信息
     * 
     * @param id ID
     * @return 信息
     */
	public GdsTopicProduct selectGdsTopicProductById(Long id);
	
	/**
     * 查询列表
     * 
     * @param gdsTopicProduct 信息
     * @return 集合
     */
	public List<GdsTopicProduct> selectGdsTopicProductList(GdsTopicProduct gdsTopicProduct);
	
	/**
     * 新增
     * 
     * @param gdsTopicProduct 信息
     * @return 结果
     */
	public int insertGdsTopicProduct(GdsTopicProduct gdsTopicProduct);
	
	/**
     * 修改
     * 
     * @param gdsTopicProduct 信息
     * @return 结果
     */
	public int updateGdsTopicProduct(GdsTopicProduct gdsTopicProduct);
	
	/**
     * 删除
     * 
     * @param id ID
     * @return 结果
     */
	public int deleteGdsTopicProductById(Long id);
	
	/**
     * 批量删除
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteGdsTopicProductByIds(String[] ids);
	
}