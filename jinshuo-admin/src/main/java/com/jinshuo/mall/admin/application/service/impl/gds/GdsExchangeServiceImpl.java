package com.jinshuo.mall.admin.application.service.impl.gds;

import com.github.pagehelper.PageInfo;
import com.jinshuo.mall.admin.application.service.gds.IGdsExchangeService;
import com.jinshuo.mall.admin.domain.gds.GdsExchange;
import com.jinshuo.mall.admin.infra.mapper.gds.GdsExchangeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 *  服务层实现
 * 
 * @author dyh
 * @date 2020-08-12
 */
@Service
public class GdsExchangeServiceImpl implements IGdsExchangeService
{
	@Autowired(required = false)
	private GdsExchangeMapper gdsExchangeMapper;

	/**
     * 查询信息
     * 
     * @param id ID
     * @return 信息
     */
	public GdsExchange selectGdsExchangeById(Long id)
	{
	    return gdsExchangeMapper.selectGdsExchangeById(id);
	}
	
	/**
     * 查询列表
     * 
     * @param qry 信息
     * @return 集合
     */
	public PageInfo selectGdsExchangePage(GdsExchange qry)
	{
        /*PageHelper.startPage(qry.getPageNum(), qry.getPageSize());
		GdsExchange gdsExchange = new GdsExchange();
        List<GdsExchange> gdsExchanges = gdsExchangeMapper.selectGdsExchangeList(gdsExchange);
        PageInfo pageInfo = new PageInfo(gdsExchanges);
	    return pageInfo;*/
		return null;
	}
	
    /**
     * 新增
     * 
     * @param gdsExchange 信息
     * @return 结果
     */
	public int insertGdsExchange(GdsExchange gdsExchange)
	{
		gdsExchange.preInsert();
	    return gdsExchangeMapper.insertGdsExchange(gdsExchange);
	}
	
	/**
     * 修改
     * 
     * @param gdsExchange 信息
     * @return 结果
     */
	public int updateGdsExchange(GdsExchange gdsExchange)
	{
	    gdsExchange.preUpdate();
	    return gdsExchangeMapper.updateGdsExchange(gdsExchange);
	}

	/**
     * 删除对象
     * 
     * @param id 需要删除的数据ID
     * @return 结果
     */
	public int deleteGdsExchangeById(Long id)
	{
		return gdsExchangeMapper.deleteGdsExchangeById(id);
	}
	
}
