package com.jinshuo.mall.admin.application.service.impl.gds;

import com.github.pagehelper.PageInfo;
import com.jinshuo.mall.admin.application.service.gds.IGdsSkuAttributeAndOptionService;
import com.jinshuo.mall.admin.domain.gds.GdsSkuAttributeAndOption;
import com.jinshuo.mall.admin.infra.mapper.gds.GdsSkuAttributeAndOptionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 *  服务层实现
 * 
 * @author dyh
 * @date 2020-08-12
 */
@Service
public class GdsSkuAttributeAndOptionServiceImpl implements IGdsSkuAttributeAndOptionService
{
	@Autowired(required = false)
	private GdsSkuAttributeAndOptionMapper gdsSkuAttributeAndOptionMapper;

	/**
     * 查询信息
     * 
     * @param id ID
     * @return 信息
     */
	public GdsSkuAttributeAndOption selectGdsSkuAttributeAndOptionById(Long id)
	{
	    return gdsSkuAttributeAndOptionMapper.selectGdsSkuAttributeAndOptionById(id);
	}
	
	/**
     * 查询列表
     * 
     * @param qry 信息
     * @return 集合
     */
	public PageInfo selectGdsSkuAttributeAndOptionPage(GdsSkuAttributeAndOption qry)
	{
        /*PageHelper.startPage(qry.getPageNum(), qry.getPageSize());
		GdsSkuAttributeAndOption gdsSkuAttributeAndOption = new GdsSkuAttributeAndOption();
        List<GdsSkuAttributeAndOption> gdsSkuAttributeAndOptions = gdsSkuAttributeAndOptionMapper.selectGdsSkuAttributeAndOptionList(gdsSkuAttributeAndOption);
        PageInfo pageInfo = new PageInfo(gdsSkuAttributeAndOptions);
	    return pageInfo;*/
		return null;
	}
	
    /**
     * 新增
     * 
     * @param gdsSkuAttributeAndOption 信息
     * @return 结果
     */
	public int insertGdsSkuAttributeAndOption(GdsSkuAttributeAndOption gdsSkuAttributeAndOption)
	{
		gdsSkuAttributeAndOption.preInsert();
	    return gdsSkuAttributeAndOptionMapper.insertGdsSkuAttributeAndOption(gdsSkuAttributeAndOption);
	}
	
	/**
     * 修改
     * 
     * @param gdsSkuAttributeAndOption 信息
     * @return 结果
     */
	public int updateGdsSkuAttributeAndOption(GdsSkuAttributeAndOption gdsSkuAttributeAndOption)
	{
	    gdsSkuAttributeAndOption.preUpdate();
	    return gdsSkuAttributeAndOptionMapper.updateGdsSkuAttributeAndOption(gdsSkuAttributeAndOption);
	}

	/**
     * 删除对象
     * 
     * @param id 需要删除的数据ID
     * @return 结果
     */
	public int deleteGdsSkuAttributeAndOptionById(Long id)
	{
		return gdsSkuAttributeAndOptionMapper.deleteGdsSkuAttributeAndOptionById(id);
	}
	
}
