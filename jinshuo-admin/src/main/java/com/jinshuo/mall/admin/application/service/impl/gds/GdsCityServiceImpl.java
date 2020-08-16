package com.jinshuo.mall.admin.application.service.impl.gds;

import com.github.pagehelper.PageInfo;
import com.jinshuo.mall.admin.application.service.gds.IGdsCityService;
import com.jinshuo.mall.admin.domain.gds.GdsCity;
import com.jinshuo.mall.admin.infra.mapper.gds.GdsCityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 *  服务层实现
 * 
 * @author dyh
 * @date 2020-08-12
 */
@Service
public class GdsCityServiceImpl implements IGdsCityService
{
	@Autowired(required = false)
	private GdsCityMapper gdsCityMapper;

	/**
     * 查询信息
     * 
     * @param id ID
     * @return 信息
     */
	public GdsCity selectGdsCityById(Long id)
	{
	    return gdsCityMapper.selectGdsCityById(id);
	}
	
	/**
     * 查询列表
     * 
     * @param qry 信息
     * @return 集合
     */
	public PageInfo selectGdsCityPage(GdsCity qry)
	{
        /*PageHelper.startPage(qry.getPageNum(), qry.getPageSize());
		GdsCity gdsCity = new GdsCity();
        List<GdsCity> gdsCitys = gdsCityMapper.selectGdsCityList(gdsCity);
        PageInfo pageInfo = new PageInfo(gdsCitys);
	    return pageInfo;*/
		return null;
	}
	
    /**
     * 新增
     * 
     * @param gdsCity 信息
     * @return 结果
     */
	public int insertGdsCity(GdsCity gdsCity)
	{
		gdsCity.preInsert();
	    return gdsCityMapper.insertGdsCity(gdsCity);
	}
	
	/**
     * 修改
     * 
     * @param gdsCity 信息
     * @return 结果
     */
	public int updateGdsCity(GdsCity gdsCity)
	{
	    gdsCity.preUpdate();
	    return gdsCityMapper.updateGdsCity(gdsCity);
	}

	/**
     * 删除对象
     * 
     * @param id 需要删除的数据ID
     * @return 结果
     */
	public int deleteGdsCityById(Long id)
	{
		return gdsCityMapper.deleteGdsCityById(id);
	}
	
}
