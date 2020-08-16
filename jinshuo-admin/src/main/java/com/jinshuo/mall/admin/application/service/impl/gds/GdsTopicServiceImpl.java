package com.jinshuo.mall.admin.application.service.impl.gds;

import com.github.pagehelper.PageInfo;
import com.jinshuo.mall.admin.application.service.gds.IGdsTopicService;
import com.jinshuo.mall.admin.domain.gds.GdsTopic;
import com.jinshuo.mall.admin.infra.mapper.gds.GdsTopicMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 *  服务层实现
 * 
 * @author dyh
 * @date 2020-08-12
 */
@Service
public class GdsTopicServiceImpl implements IGdsTopicService
{
	@Autowired(required = false)
	private GdsTopicMapper gdsTopicMapper;

	/**
     * 查询信息
     * 
     * @param id ID
     * @return 信息
     */
	public GdsTopic selectGdsTopicById(Long id)
	{
	    return gdsTopicMapper.selectGdsTopicById(id);
	}
	
	/**
     * 查询列表
     * 
     * @param qry 信息
     * @return 集合
     */
	public PageInfo selectGdsTopicPage(GdsTopic qry)
	{
        /*PageHelper.startPage(qry.getPageNum(), qry.getPageSize());
		GdsTopic gdsTopic = new GdsTopic();
        List<GdsTopic> gdsTopics = gdsTopicMapper.selectGdsTopicList(gdsTopic);
        PageInfo pageInfo = new PageInfo(gdsTopics);
	    return pageInfo;*/
		return null;
	}
	
    /**
     * 新增
     * 
     * @param gdsTopic 信息
     * @return 结果
     */
	public int insertGdsTopic(GdsTopic gdsTopic)
	{
		gdsTopic.preInsert();
	    return gdsTopicMapper.insertGdsTopic(gdsTopic);
	}
	
	/**
     * 修改
     * 
     * @param gdsTopic 信息
     * @return 结果
     */
	public int updateGdsTopic(GdsTopic gdsTopic)
	{
	    gdsTopic.preUpdate();
	    return gdsTopicMapper.updateGdsTopic(gdsTopic);
	}

	/**
     * 删除对象
     * 
     * @param id 需要删除的数据ID
     * @return 结果
     */
	public int deleteGdsTopicById(Long id)
	{
		return gdsTopicMapper.deleteGdsTopicById(id);
	}
	
}
