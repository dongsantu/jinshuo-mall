package com.jinshuo.mall.admin.application.service.impl.gds;

import com.github.pagehelper.PageInfo;
import com.jinshuo.mall.admin.application.service.gds.IGdsSpecService;
import com.jinshuo.mall.admin.domain.gds.GdsSpec;
import com.jinshuo.mall.admin.infra.mapper.gds.GdsSpecMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 *  服务层实现
 * 
 * @author dyh
 * @date 2020-08-12
 */
@Service
public class GdsSpecServiceImpl implements IGdsSpecService
{
	@Autowired(required = false)
	private GdsSpecMapper gdsSpecMapper;

	/**
     * 查询信息
     * 
     * @param id ID
     * @return 信息
     */
	public GdsSpec selectGdsSpecById(Long id)
	{
	    return gdsSpecMapper.selectGdsSpecById(id);
	}
	
	/**
     * 查询列表
     * 
     * @param qry 信息
     * @return 集合
     */
	public PageInfo selectGdsSpecPage(GdsSpec qry)
	{
        /*PageHelper.startPage(qry.getPageNum(), qry.getPageSize());
		GdsSpec gdsSpec = new GdsSpec();
        List<GdsSpec> gdsSpecs = gdsSpecMapper.selectGdsSpecList(gdsSpec);
        PageInfo pageInfo = new PageInfo(gdsSpecs);
	    return pageInfo;*/
		return null;
	}
	
    /**
     * 新增
     * 
     * @param gdsSpec 信息
     * @return 结果
     */
	public int insertGdsSpec(GdsSpec gdsSpec)
	{
		gdsSpec.preInsert();
	    return gdsSpecMapper.insertGdsSpec(gdsSpec);
	}
	
	/**
     * 修改
     * 
     * @param gdsSpec 信息
     * @return 结果
     */
	public int updateGdsSpec(GdsSpec gdsSpec)
	{
	    gdsSpec.preUpdate();
	    return gdsSpecMapper.updateGdsSpec(gdsSpec);
	}

	/**
     * 删除对象
     * 
     * @param id 需要删除的数据ID
     * @return 结果
     */
	public int deleteGdsSpecById(Long id)
	{
		return gdsSpecMapper.deleteGdsSpecById(id);
	}
	
}
