package com.jinshuo.mall.admin.application.service.impl.gds;

import com.github.pagehelper.PageInfo;
import com.jinshuo.mall.admin.application.service.gds.IGdsCategoryService;
import com.jinshuo.mall.admin.domain.gds.GdsCategory;
import com.jinshuo.mall.admin.infra.mapper.gds.GdsCategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 *  服务层实现
 * 
 * @author dyh
 * @date 2020-08-12
 */
@Service
public class GdsCategoryServiceImpl implements IGdsCategoryService
{
	@Autowired(required = false)
	private GdsCategoryMapper gdsCategoryMapper;

	/**
     * 查询信息
     * 
     * @param id ID
     * @return 信息
     */
	public GdsCategory selectGdsCategoryById(Long id)
	{
	    return gdsCategoryMapper.selectGdsCategoryById(id);
	}
	
	/**
     * 查询列表
     * 
     * @param qry 信息
     * @return 集合
     */
	public PageInfo selectGdsCategoryPage(GdsCategory qry)
	{
        /*PageHelper.startPage(qry.getPageNum(), qry.getPageSize());
		GdsCategory gdsCategory = new GdsCategory();
        List<GdsCategory> gdsCategorys = gdsCategoryMapper.selectGdsCategoryList(gdsCategory);
        PageInfo pageInfo = new PageInfo(gdsCategorys);
	    return pageInfo;*/
		return null;
	}
	
    /**
     * 新增
     * 
     * @param gdsCategory 信息
     * @return 结果
     */
	public int insertGdsCategory(GdsCategory gdsCategory)
	{
		gdsCategory.preInsert();
	    return gdsCategoryMapper.insertGdsCategory(gdsCategory);
	}
	
	/**
     * 修改
     * 
     * @param gdsCategory 信息
     * @return 结果
     */
	public int updateGdsCategory(GdsCategory gdsCategory)
	{
	    gdsCategory.preUpdate();
	    return gdsCategoryMapper.updateGdsCategory(gdsCategory);
	}

	/**
     * 删除对象
     * 
     * @param id 需要删除的数据ID
     * @return 结果
     */
	public int deleteGdsCategoryById(Long id)
	{
		return gdsCategoryMapper.deleteGdsCategoryById(id);
	}
	
}
