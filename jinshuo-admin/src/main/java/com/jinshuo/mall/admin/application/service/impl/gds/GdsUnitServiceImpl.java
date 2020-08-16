package com.jinshuo.mall.admin.application.service.impl.gds;

import com.github.pagehelper.PageInfo;
import com.jinshuo.mall.admin.application.service.gds.IGdsUnitService;
import com.jinshuo.mall.admin.domain.gds.GdsUnit;
import com.jinshuo.mall.admin.infra.mapper.gds.GdsUnitMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 *  服务层实现
 * 
 * @author dyh
 * @date 2020-08-12
 */
@Service
public class GdsUnitServiceImpl implements IGdsUnitService
{
	@Autowired(required = false)
	private GdsUnitMapper gdsUnitMapper;

	/**
     * 查询信息
     * 
     * @param id ID
     * @return 信息
     */
	public GdsUnit selectGdsUnitById(Long id)
	{
	    return gdsUnitMapper.selectGdsUnitById(id);
	}
	
	/**
     * 查询列表
     * 
     * @param qry 信息
     * @return 集合
     */
	public PageInfo selectGdsUnitPage(GdsUnit qry)
	{
        /*PageHelper.startPage(qry.getPageNum(), qry.getPageSize());
		GdsUnit gdsUnit = new GdsUnit();
        List<GdsUnit> gdsUnits = gdsUnitMapper.selectGdsUnitList(gdsUnit);
        PageInfo pageInfo = new PageInfo(gdsUnits);
	    return pageInfo;*/
		return null;
	}
	
    /**
     * 新增
     * 
     * @param gdsUnit 信息
     * @return 结果
     */
	public int insertGdsUnit(GdsUnit gdsUnit)
	{
		gdsUnit.preInsert();
	    return gdsUnitMapper.insertGdsUnit(gdsUnit);
	}
	
	/**
     * 修改
     * 
     * @param gdsUnit 信息
     * @return 结果
     */
	public int updateGdsUnit(GdsUnit gdsUnit)
	{
	    gdsUnit.preUpdate();
	    return gdsUnitMapper.updateGdsUnit(gdsUnit);
	}

	/**
     * 删除对象
     * 
     * @param id 需要删除的数据ID
     * @return 结果
     */
	public int deleteGdsUnitById(Long id)
	{
		return gdsUnitMapper.deleteGdsUnitById(id);
	}
	
}
