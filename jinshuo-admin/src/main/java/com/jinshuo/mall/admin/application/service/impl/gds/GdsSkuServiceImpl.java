package com.jinshuo.mall.admin.application.service.impl.gds;

import com.github.pagehelper.PageInfo;
import com.jinshuo.mall.admin.application.service.gds.IGdsSkuService;
import com.jinshuo.mall.admin.domain.gds.GdsSku;
import com.jinshuo.mall.admin.infra.mapper.gds.GdsSkuMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 *  服务层实现
 * 
 * @author dyh
 * @date 2020-08-12
 */
@Service
public class GdsSkuServiceImpl implements IGdsSkuService
{
	@Autowired(required = false)
	private GdsSkuMapper gdsSkuMapper;

	/**
     * 查询信息
     * 
     * @param id ID
     * @return 信息
     */
	public GdsSku selectGdsSkuById(Long id)
	{
	    return gdsSkuMapper.selectGdsSkuById(id);
	}
	
	/**
     * 查询列表
     * 
     * @param qry 信息
     * @return 集合
     */
	public PageInfo selectGdsSkuPage(GdsSku qry)
	{
        /*PageHelper.startPage(qry.getPageNum(), qry.getPageSize());
		GdsSku gdsSku = new GdsSku();
        List<GdsSku> gdsSkus = gdsSkuMapper.selectGdsSkuList(gdsSku);
        PageInfo pageInfo = new PageInfo(gdsSkus);
	    return pageInfo;*/
		return null;
	}
	
    /**
     * 新增
     * 
     * @param gdsSku 信息
     * @return 结果
     */
	public int insertGdsSku(GdsSku gdsSku)
	{
		gdsSku.preInsert();
	    return gdsSkuMapper.insertGdsSku(gdsSku);
	}
	
	/**
     * 修改
     * 
     * @param gdsSku 信息
     * @return 结果
     */
	public int updateGdsSku(GdsSku gdsSku)
	{
	    gdsSku.preUpdate();
	    return gdsSkuMapper.updateGdsSku(gdsSku);
	}

	/**
     * 删除对象
     * 
     * @param id 需要删除的数据ID
     * @return 结果
     */
	public int deleteGdsSkuById(Long id)
	{
		return gdsSkuMapper.deleteGdsSkuById(id);
	}
	
}
