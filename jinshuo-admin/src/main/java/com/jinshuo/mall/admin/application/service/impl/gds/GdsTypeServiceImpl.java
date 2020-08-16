package com.jinshuo.mall.admin.application.service.impl.gds;

import com.github.pagehelper.PageInfo;
import com.jinshuo.mall.admin.application.service.gds.IGdsTypeService;
import com.jinshuo.mall.admin.domain.gds.GdsType;
import com.jinshuo.mall.admin.infra.mapper.gds.GdsTypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 *  服务层实现
 * 
 * @author dyh
 * @date 2020-08-12
 */
@Service
public class GdsTypeServiceImpl implements IGdsTypeService
{
	@Autowired(required = false)
	private GdsTypeMapper gdsTypeMapper;

	/**
     * 查询信息
     * 
     * @param id ID
     * @return 信息
     */
	public GdsType selectGdsTypeById(Long id)
	{
	    return gdsTypeMapper.selectGdsTypeById(id);
	}
	
	/**
     * 查询列表
     * 
     * @param qry 信息
     * @return 集合
     */
	public PageInfo selectGdsTypePage(GdsType qry)
	{
        /*PageHelper.startPage(qry.getPageNum(), qry.getPageSize());
		GdsType gdsType = new GdsType();
        List<GdsType> gdsTypes = gdsTypeMapper.selectGdsTypeList(gdsType);
        PageInfo pageInfo = new PageInfo(gdsTypes);
	    return pageInfo;*/
		return null;
	}
	
    /**
     * 新增
     * 
     * @param gdsType 信息
     * @return 结果
     */
	public int insertGdsType(GdsType gdsType)
	{
		gdsType.preInsert();
	    return gdsTypeMapper.insertGdsType(gdsType);
	}
	
	/**
     * 修改
     * 
     * @param gdsType 信息
     * @return 结果
     */
	public int updateGdsType(GdsType gdsType)
	{
	    gdsType.preUpdate();
	    return gdsTypeMapper.updateGdsType(gdsType);
	}

	/**
     * 删除对象
     * 
     * @param id 需要删除的数据ID
     * @return 结果
     */
	public int deleteGdsTypeById(Long id)
	{
		return gdsTypeMapper.deleteGdsTypeById(id);
	}
	
}
