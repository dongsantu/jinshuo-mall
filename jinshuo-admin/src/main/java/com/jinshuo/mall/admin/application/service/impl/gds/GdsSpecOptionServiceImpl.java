package com.jinshuo.mall.admin.application.service.impl.gds;

import com.github.pagehelper.PageInfo;
import com.jinshuo.mall.admin.application.service.gds.IGdsSpecOptionService;
import com.jinshuo.mall.admin.domain.gds.GdsSpecOption;
import com.jinshuo.mall.admin.infra.mapper.gds.GdsSpecOptionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 *  服务层实现
 * 
 * @author dyh
 * @date 2020-08-12
 */
@Service
public class GdsSpecOptionServiceImpl implements IGdsSpecOptionService
{
	@Autowired(required = false)
	private GdsSpecOptionMapper gdsSpecOptionMapper;

	/**
     * 查询信息
     * 
     * @param id ID
     * @return 信息
     */
	public GdsSpecOption selectGdsSpecOptionById(Long id)
	{
	    return gdsSpecOptionMapper.selectGdsSpecOptionById(id);
	}
	
	/**
     * 查询列表
     * 
     * @param qry 信息
     * @return 集合
     */
	public PageInfo selectGdsSpecOptionPage(GdsSpecOption qry)
	{
        /*PageHelper.startPage(qry.getPageNum(), qry.getPageSize());
		GdsSpecOption gdsSpecOption = new GdsSpecOption();
        List<GdsSpecOption> gdsSpecOptions = gdsSpecOptionMapper.selectGdsSpecOptionList(gdsSpecOption);
        PageInfo pageInfo = new PageInfo(gdsSpecOptions);
	    return pageInfo;*/
		return null;
	}
	
    /**
     * 新增
     * 
     * @param gdsSpecOption 信息
     * @return 结果
     */
	public int insertGdsSpecOption(GdsSpecOption gdsSpecOption)
	{
		gdsSpecOption.preInsert();
	    return gdsSpecOptionMapper.insertGdsSpecOption(gdsSpecOption);
	}
	
	/**
     * 修改
     * 
     * @param gdsSpecOption 信息
     * @return 结果
     */
	public int updateGdsSpecOption(GdsSpecOption gdsSpecOption)
	{
	    gdsSpecOption.preUpdate();
	    return gdsSpecOptionMapper.updateGdsSpecOption(gdsSpecOption);
	}

	/**
     * 删除对象
     * 
     * @param id 需要删除的数据ID
     * @return 结果
     */
	public int deleteGdsSpecOptionById(Long id)
	{
		return gdsSpecOptionMapper.deleteGdsSpecOptionById(id);
	}
	
}
