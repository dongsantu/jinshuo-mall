package com.jinshuo.mall.admin.application.service.gds;

import com.github.pagehelper.PageInfo;
import com.jinshuo.mall.admin.domain.gds.GdsTag;

/**
 *  服务层
 * 
 * @author dyh
 * @date 2020-08-12
 */
public interface IGdsTagService 
{
	/**
     * 查询信息
     * 
     * @param id ID
     * @return 信息
     */
	 GdsTag selectGdsTagById(Long id);
	
	/**
     * 查询列表
     * 
     * @param qry 信息
     * @return 集合
     */
	PageInfo selectGdsTagPage(GdsTag qry);
	
	/**
     * 新增
     * 
     * @param gdsTag 信息
     * @return 结果
     */
	 int insertGdsTag(GdsTag gdsTag);
	
	/**
     * 修改
     * 
     * @param gdsTag 信息
     * @return 结果
     */
	 int updateGdsTag(GdsTag gdsTag);
		
	/**
     * 删除信息
     * 
     * @param id 需要删除的数据ID
     * @return 结果
     */
	 int deleteGdsTagById(Long id);
	
}
