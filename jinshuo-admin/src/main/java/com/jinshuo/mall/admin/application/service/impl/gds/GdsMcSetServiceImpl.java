package com.jinshuo.mall.admin.application.service.impl.gds;

import com.github.pagehelper.PageInfo;
import com.jinshuo.mall.admin.application.service.gds.IGdsMcSetService;
import com.jinshuo.mall.admin.domain.gds.GdsMcSet;
import com.jinshuo.mall.admin.infra.mapper.gds.GdsMcSetMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 *  服务层实现
 * 
 * @author dyh
 * @date 2020-08-12
 */
@Service
public class GdsMcSetServiceImpl implements IGdsMcSetService
{
	@Autowired(required = false)
	private GdsMcSetMapper gdsMcSetMapper;

	/**
     * 查询信息
     * 
     * @param id ID
     * @return 信息
     */
	public GdsMcSet selectGdsMcSetById(Long id)
	{
	    return gdsMcSetMapper.selectGdsMcSetById(id);
	}
	
	/**
     * 查询列表
     * 
     * @param qry 信息
     * @return 集合
     */
	public PageInfo selectGdsMcSetPage(GdsMcSet qry)
	{
        /*PageHelper.startPage(qry.getPageNum(), qry.getPageSize());
		GdsMcSet gdsMcSet = new GdsMcSet();
        List<GdsMcSet> gdsMcSets = gdsMcSetMapper.selectGdsMcSetList(gdsMcSet);
        PageInfo pageInfo = new PageInfo(gdsMcSets);
	    return pageInfo;*/
		return null;
	}
	
    /**
     * 新增
     * 
     * @param gdsMcSet 信息
     * @return 结果
     */
	public int insertGdsMcSet(GdsMcSet gdsMcSet)
	{
		gdsMcSet.preInsert();
	    return gdsMcSetMapper.insertGdsMcSet(gdsMcSet);
	}
	
	/**
     * 修改
     * 
     * @param gdsMcSet 信息
     * @return 结果
     */
	public int updateGdsMcSet(GdsMcSet gdsMcSet)
	{
	    gdsMcSet.preUpdate();
	    return gdsMcSetMapper.updateGdsMcSet(gdsMcSet);
	}

	/**
     * 删除对象
     * 
     * @param id 需要删除的数据ID
     * @return 结果
     */
	public int deleteGdsMcSetById(Long id)
	{
		return gdsMcSetMapper.deleteGdsMcSetById(id);
	}
	
}
