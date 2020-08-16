package com.jinshuo.mall.admin.application.service.impl.gds;

import com.github.pagehelper.PageInfo;
import com.jinshuo.mall.admin.application.service.gds.IGdsCouponLogsService;
import com.jinshuo.mall.admin.domain.gds.GdsCouponLogs;
import com.jinshuo.mall.admin.infra.mapper.gds.GdsCouponLogsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 *  服务层实现
 * 
 * @author dyh
 * @date 2020-08-12
 */
@Service
public class GdsCouponLogsServiceImpl implements IGdsCouponLogsService
{
	@Autowired(required = false)
	private GdsCouponLogsMapper gdsCouponLogsMapper;

	/**
     * 查询信息
     * 
     * @param id ID
     * @return 信息
     */
	public GdsCouponLogs selectGdsCouponLogsById(Long id)
	{
	    return gdsCouponLogsMapper.selectGdsCouponLogsById(id);
	}
	
	/**
     * 查询列表
     * 
     * @param qry 信息
     * @return 集合
     */
	public PageInfo selectGdsCouponLogsPage(GdsCouponLogs qry)
	{
        /*PageHelper.startPage(qry.getPageNum(), qry.getPageSize());
		GdsCouponLogs gdsCouponLogs = new GdsCouponLogs();
        List<GdsCouponLogs> gdsCouponLogss = gdsCouponLogsMapper.selectGdsCouponLogsList(gdsCouponLogs);
        PageInfo pageInfo = new PageInfo(gdsCouponLogss);
	    return pageInfo;*/
		return null;
	}
	
    /**
     * 新增
     * 
     * @param gdsCouponLogs 信息
     * @return 结果
     */
	public int insertGdsCouponLogs(GdsCouponLogs gdsCouponLogs)
	{
		gdsCouponLogs.preInsert();
	    return gdsCouponLogsMapper.insertGdsCouponLogs(gdsCouponLogs);
	}
	
	/**
     * 修改
     * 
     * @param gdsCouponLogs 信息
     * @return 结果
     */
	public int updateGdsCouponLogs(GdsCouponLogs gdsCouponLogs)
	{
	    gdsCouponLogs.preUpdate();
	    return gdsCouponLogsMapper.updateGdsCouponLogs(gdsCouponLogs);
	}

	/**
     * 删除对象
     * 
     * @param id 需要删除的数据ID
     * @return 结果
     */
	public int deleteGdsCouponLogsById(Long id)
	{
		return gdsCouponLogsMapper.deleteGdsCouponLogsById(id);
	}
	
}
