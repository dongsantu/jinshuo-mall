package com.jinshuo.mall.admin.infra.mapper.gds;

import com.jinshuo.mall.admin.domain.gds.GdsSku;
import java.util.List;	

/**
 *  数据层
 * 
 * @author dyh
 * @date 2020-08-12
 */
public interface GdsSkuMapper 
{
	/**
     * 查询信息
     * 
     * @param id ID
     * @return 信息
     */
	public GdsSku selectGdsSkuById(Long id);
	
	/**
     * 查询列表
     * 
     * @param gdsSku 信息
     * @return 集合
     */
	public List<GdsSku> selectGdsSkuList(GdsSku gdsSku);
	
	/**
     * 新增
     * 
     * @param gdsSku 信息
     * @return 结果
     */
	public int insertGdsSku(GdsSku gdsSku);
	
	/**
     * 修改
     * 
     * @param gdsSku 信息
     * @return 结果
     */
	public int updateGdsSku(GdsSku gdsSku);
	
	/**
     * 删除
     * 
     * @param id ID
     * @return 结果
     */
	public int deleteGdsSkuById(Long id);
	
	/**
     * 批量删除
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteGdsSkuByIds(String[] ids);
	
}