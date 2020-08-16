package com.jinshuo.mall.admin.application.service.gds;

import com.github.pagehelper.PageInfo;
import com.jinshuo.mall.admin.domain.gds.GdsSpuTag;

/**
 *  服务层
 * 
 * @author dyh
 * @date 2020-08-12
 */
public interface IGdsSpuTagService 
{
	/**
     * 查询信息
     * 
     * @param id ID
     * @return 信息
     */
	 GdsSpuTag selectGdsSpuTagById(Long id);
	
	/**
     * 查询列表
     * 
     * @param qry 信息
     * @return 集合
     */
	PageInfo selectGdsSpuTagPage(GdsSpuTag qry);
	
	/**
     * 新增
     * 
     * @param gdsSpuTag 信息
     * @return 结果
     */
	 int insertGdsSpuTag(GdsSpuTag gdsSpuTag);
	
	/**
     * 修改
     * 
     * @param gdsSpuTag 信息
     * @return 结果
     */
	 int updateGdsSpuTag(GdsSpuTag gdsSpuTag);
		
	/**
     * 删除信息
     * 
     * @param id 需要删除的数据ID
     * @return 结果
     */
	 int deleteGdsSpuTagById(Long id);
	
}
