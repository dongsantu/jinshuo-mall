package com.jinshuo.mall.admin.application.service.impl.gds;

import com.github.pagehelper.PageInfo;
import com.jinshuo.mall.admin.application.service.gds.IGdsTagService;
import com.jinshuo.mall.admin.domain.gds.GdsTag;
import com.jinshuo.mall.admin.infra.mapper.gds.GdsTagMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 *  服务层实现
 * 
 * @author dyh
 * @date 2020-08-12
 */
@Service
public class GdsTagServiceImpl implements IGdsTagService
{
	@Autowired(required = false)
	private GdsTagMapper gdsTagMapper;

	/**
     * 查询信息
     * 
     * @param id ID
     * @return 信息
     */
	public GdsTag selectGdsTagById(Long id)
	{
	    return gdsTagMapper.selectGdsTagById(id);
	}
	
	/**
     * 查询列表
     * 
     * @param qry 信息
     * @return 集合
     */
	public PageInfo selectGdsTagPage(GdsTag qry)
	{
        /*PageHelper.startPage(qry.getPageNum(), qry.getPageSize());
		GdsTag gdsTag = new GdsTag();
        List<GdsTag> gdsTags = gdsTagMapper.selectGdsTagList(gdsTag);
        PageInfo pageInfo = new PageInfo(gdsTags);
	    return pageInfo;*/
		return null;
	}
	
    /**
     * 新增
     * 
     * @param gdsTag 信息
     * @return 结果
     */
	public int insertGdsTag(GdsTag gdsTag)
	{
		gdsTag.preInsert();
	    return gdsTagMapper.insertGdsTag(gdsTag);
	}
	
	/**
     * 修改
     * 
     * @param gdsTag 信息
     * @return 结果
     */
	public int updateGdsTag(GdsTag gdsTag)
	{
	    gdsTag.preUpdate();
	    return gdsTagMapper.updateGdsTag(gdsTag);
	}

	/**
     * 删除对象
     * 
     * @param id 需要删除的数据ID
     * @return 结果
     */
	public int deleteGdsTagById(Long id)
	{
		return gdsTagMapper.deleteGdsTagById(id);
	}
	
}
