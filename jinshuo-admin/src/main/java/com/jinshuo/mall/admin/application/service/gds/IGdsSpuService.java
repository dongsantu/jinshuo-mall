package com.jinshuo.mall.admin.application.service.gds;

import com.github.pagehelper.PageInfo;
import com.jinshuo.mall.admin.application.dto.qry.gds.GdsSpuQry;
import com.jinshuo.mall.admin.domain.gds.GdsSpu;

/**
 *  服务层
 * 
 * @author dyh
 * @date 2020-08-12
 */
public interface IGdsSpuService 
{
	/**
     * 查询信息
     * 
     * @param id ID
     * @return 信息
     */
	 GdsSpu selectGdsSpuById(Long id);
	
	/**
     * 查询列表
     * 
     * @param qry 信息
     * @return 集合
     */
	PageInfo selectGdsSpuPage(GdsSpuQry qry);
	
	/**
     * 新增
     * 
     * @param gdsSpu 信息
     * @return 结果
     */
	 int insertGdsSpu(GdsSpu gdsSpu);
	
	/**
     * 修改
     * 
     * @param gdsSpu 信息
     * @return 结果
     */
	 int updateGdsSpu(GdsSpu gdsSpu);
		
	/**
     * 删除信息
     * 
     * @param id 需要删除的数据ID
     * @return 结果
     */
	 int deleteGdsSpuById(Long id);
	
}
