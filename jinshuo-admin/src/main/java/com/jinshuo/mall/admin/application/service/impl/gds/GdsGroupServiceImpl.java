package com.jinshuo.mall.admin.application.service.impl.gds;

import com.github.pagehelper.PageInfo;
import com.jinshuo.mall.admin.application.service.gds.IGdsGroupService;
import com.jinshuo.mall.admin.domain.gds.GdsGroup;
import com.jinshuo.mall.admin.infra.mapper.gds.GdsGroupMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 *  服务层实现
 * 
 * @author dyh
 * @date 2020-08-12
 */
@Service
public class GdsGroupServiceImpl implements IGdsGroupService
{
	@Autowired(required = false)
	private GdsGroupMapper gdsGroupMapper;

	/**
     * 查询信息
     * 
     * @param id ID
     * @return 信息
     */
	public GdsGroup selectGdsGroupById(Long id)
	{
	    return gdsGroupMapper.selectGdsGroupById(id);
	}
	
	/**
     * 查询列表
     * 
     * @param qry 信息
     * @return 集合
     */
	public PageInfo selectGdsGroupPage(GdsGroup qry)
	{
        /*PageHelper.startPage(qry.getPageNum(), qry.getPageSize());
		GdsGroup gdsGroup = new GdsGroup();
        List<GdsGroup> gdsGroups = gdsGroupMapper.selectGdsGroupList(gdsGroup);
        PageInfo pageInfo = new PageInfo(gdsGroups);
	    return pageInfo;*/
		return null;
	}
	
    /**
     * 新增
     * 
     * @param gdsGroup 信息
     * @return 结果
     */
	public int insertGdsGroup(GdsGroup gdsGroup)
	{
		gdsGroup.preInsert();
	    return gdsGroupMapper.insertGdsGroup(gdsGroup);
	}
	
	/**
     * 修改
     * 
     * @param gdsGroup 信息
     * @return 结果
     */
	public int updateGdsGroup(GdsGroup gdsGroup)
	{
	    gdsGroup.preUpdate();
	    return gdsGroupMapper.updateGdsGroup(gdsGroup);
	}

	/**
     * 删除对象
     * 
     * @param id 需要删除的数据ID
     * @return 结果
     */
	public int deleteGdsGroupById(Long id)
	{
		return gdsGroupMapper.deleteGdsGroupById(id);
	}
	
}
