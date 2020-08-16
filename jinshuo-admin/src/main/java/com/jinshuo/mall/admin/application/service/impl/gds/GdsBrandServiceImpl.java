package com.jinshuo.mall.admin.application.service.impl.gds;

import com.github.pagehelper.PageInfo;
import com.jinshuo.mall.admin.application.service.gds.IGdsBrandService;
import com.jinshuo.mall.admin.domain.gds.GdsBrand;
import com.jinshuo.mall.admin.infra.mapper.gds.GdsBrandMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 *  服务层实现
 * 
 * @author dyh
 * @date 2020-08-12
 */
@Service
public class GdsBrandServiceImpl implements IGdsBrandService
{
	@Autowired(required = false)
	private GdsBrandMapper gdsBrandMapper;

	/**
     * 查询信息
     * 
     * @param id ID
     * @return 信息
     */
	public GdsBrand selectGdsBrandById(Long id)
	{
	    return gdsBrandMapper.selectGdsBrandById(id);
	}
	
	/**
     * 查询列表
     * 
     * @param qry 信息
     * @return 集合
     */
	public PageInfo selectGdsBrandPage(GdsBrand qry)
	{
        /*PageHelper.startPage(qry.getPageNum(), qry.getPageSize());
		GdsBrand gdsBrand = new GdsBrand();
        List<GdsBrand> gdsBrands = gdsBrandMapper.selectGdsBrandList(gdsBrand);
        PageInfo pageInfo = new PageInfo(gdsBrands);
	    return pageInfo;*/
		return null;
	}
	
    /**
     * 新增
     * 
     * @param gdsBrand 信息
     * @return 结果
     */
	public int insertGdsBrand(GdsBrand gdsBrand)
	{
		gdsBrand.preInsert();
	    return gdsBrandMapper.insertGdsBrand(gdsBrand);
	}
	
	/**
     * 修改
     * 
     * @param gdsBrand 信息
     * @return 结果
     */
	public int updateGdsBrand(GdsBrand gdsBrand)
	{
	    gdsBrand.preUpdate();
	    return gdsBrandMapper.updateGdsBrand(gdsBrand);
	}

	/**
     * 删除对象
     * 
     * @param id 需要删除的数据ID
     * @return 结果
     */
	public int deleteGdsBrandById(Long id)
	{
		return gdsBrandMapper.deleteGdsBrandById(id);
	}
	
}
