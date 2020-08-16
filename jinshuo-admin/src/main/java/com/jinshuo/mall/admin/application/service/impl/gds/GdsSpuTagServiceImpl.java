package com.jinshuo.mall.admin.application.service.impl.gds;

import com.github.pagehelper.PageInfo;
import com.jinshuo.mall.admin.application.service.gds.IGdsSpuTagService;
import com.jinshuo.mall.admin.domain.gds.GdsSpuTag;
import com.jinshuo.mall.admin.infra.mapper.gds.GdsSpuTagMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 *  服务层实现
 * 
 * @author dyh
 * @date 2020-08-12
 */
@Service
public class GdsSpuTagServiceImpl implements IGdsSpuTagService
{
	@Autowired(required = false)
	private GdsSpuTagMapper gdsSpuTagMapper;

	/**
     * 查询信息
     * 
     * @param id ID
     * @return 信息
     */
	public GdsSpuTag selectGdsSpuTagById(Long id)
	{
	    return gdsSpuTagMapper.selectGdsSpuTagById(id);
	}
	
	/**
     * 查询列表
     * 
     * @param qry 信息
     * @return 集合
     */
	public PageInfo selectGdsSpuTagPage(GdsSpuTag qry)
	{
        /*PageHelper.startPage(qry.getPageNum(), qry.getPageSize());
		GdsSpuTag gdsSpuTag = new GdsSpuTag();
        List<GdsSpuTag> gdsSpuTags = gdsSpuTagMapper.selectGdsSpuTagList(gdsSpuTag);
        PageInfo pageInfo = new PageInfo(gdsSpuTags);
	    return pageInfo;*/
		return null;
	}
	
    /**
     * 新增
     * 
     * @param gdsSpuTag 信息
     * @return 结果
     */
	public int insertGdsSpuTag(GdsSpuTag gdsSpuTag)
	{
		gdsSpuTag.preInsert();
	    return gdsSpuTagMapper.insertGdsSpuTag(gdsSpuTag);
	}
	
	/**
     * 修改
     * 
     * @param gdsSpuTag 信息
     * @return 结果
     */
	public int updateGdsSpuTag(GdsSpuTag gdsSpuTag)
	{
	    gdsSpuTag.preUpdate();
	    return gdsSpuTagMapper.updateGdsSpuTag(gdsSpuTag);
	}

	/**
     * 删除对象
     * 
     * @param id 需要删除的数据ID
     * @return 结果
     */
	public int deleteGdsSpuTagById(Long id)
	{
		return gdsSpuTagMapper.deleteGdsSpuTagById(id);
	}
	
}
