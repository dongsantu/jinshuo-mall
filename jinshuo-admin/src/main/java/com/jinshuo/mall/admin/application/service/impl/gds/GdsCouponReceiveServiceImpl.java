package com.jinshuo.mall.admin.application.service.impl.gds;

import com.github.pagehelper.PageInfo;
import com.jinshuo.mall.admin.application.service.gds.IGdsCouponReceiveService;
import com.jinshuo.mall.admin.domain.gds.GdsCouponReceive;
import com.jinshuo.mall.admin.infra.mapper.gds.GdsCouponReceiveMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 *  服务层实现
 * 
 * @author dyh
 * @date 2020-08-12
 */
@Service
public class GdsCouponReceiveServiceImpl implements IGdsCouponReceiveService
{
	@Autowired(required = false)
	private GdsCouponReceiveMapper gdsCouponReceiveMapper;

	/**
     * 查询信息
     * 
     * @param id ID
     * @return 信息
     */
	public GdsCouponReceive selectGdsCouponReceiveById(Long id)
	{
	    return gdsCouponReceiveMapper.selectGdsCouponReceiveById(id);
	}
	
	/**
     * 查询列表
     * 
     * @param qry 信息
     * @return 集合
     */
	public PageInfo selectGdsCouponReceivePage(GdsCouponReceive qry)
	{
        /*PageHelper.startPage(qry.getPageNum(), qry.getPageSize());
		GdsCouponReceive gdsCouponReceive = new GdsCouponReceive();
        List<GdsCouponReceive> gdsCouponReceives = gdsCouponReceiveMapper.selectGdsCouponReceiveList(gdsCouponReceive);
        PageInfo pageInfo = new PageInfo(gdsCouponReceives);
	    return pageInfo;*/
		return null;
	}
	
    /**
     * 新增
     * 
     * @param gdsCouponReceive 信息
     * @return 结果
     */
	public int insertGdsCouponReceive(GdsCouponReceive gdsCouponReceive)
	{
		gdsCouponReceive.preInsert();
	    return gdsCouponReceiveMapper.insertGdsCouponReceive(gdsCouponReceive);
	}
	
	/**
     * 修改
     * 
     * @param gdsCouponReceive 信息
     * @return 结果
     */
	public int updateGdsCouponReceive(GdsCouponReceive gdsCouponReceive)
	{
	    gdsCouponReceive.preUpdate();
	    return gdsCouponReceiveMapper.updateGdsCouponReceive(gdsCouponReceive);
	}

	/**
     * 删除对象
     * 
     * @param id 需要删除的数据ID
     * @return 结果
     */
	public int deleteGdsCouponReceiveById(Long id)
	{
		return gdsCouponReceiveMapper.deleteGdsCouponReceiveById(id);
	}
	
}
