package com.jinshuo.mall.admin.application.service.impl.gds;

import com.github.pagehelper.PageInfo;
import com.jinshuo.mall.admin.application.service.gds.IGdsTopicProductService;
import com.jinshuo.mall.admin.domain.gds.GdsTopicProduct;
import com.jinshuo.mall.admin.infra.mapper.gds.GdsTopicProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 *  服务层实现
 * 
 * @author dyh
 * @date 2020-08-12
 */
@Service
public class GdsTopicProductServiceImpl implements IGdsTopicProductService
{
	@Autowired(required = false)
	private GdsTopicProductMapper gdsTopicProductMapper;

	/**
     * 查询信息
     * 
     * @param id ID
     * @return 信息
     */
	public GdsTopicProduct selectGdsTopicProductById(Long id)
	{
	    return gdsTopicProductMapper.selectGdsTopicProductById(id);
	}
	
	/**
     * 查询列表
     * 
     * @param qry 信息
     * @return 集合
     */
	public PageInfo selectGdsTopicProductPage(GdsTopicProduct qry)
	{
        /*PageHelper.startPage(qry.getPageNum(), qry.getPageSize());
		GdsTopicProduct gdsTopicProduct = new GdsTopicProduct();
        List<GdsTopicProduct> gdsTopicProducts = gdsTopicProductMapper.selectGdsTopicProductList(gdsTopicProduct);
        PageInfo pageInfo = new PageInfo(gdsTopicProducts);
	    return pageInfo;*/
		return null;
	}
	
    /**
     * 新增
     * 
     * @param gdsTopicProduct 信息
     * @return 结果
     */
	public int insertGdsTopicProduct(GdsTopicProduct gdsTopicProduct)
	{
		gdsTopicProduct.preInsert();
	    return gdsTopicProductMapper.insertGdsTopicProduct(gdsTopicProduct);
	}
	
	/**
     * 修改
     * 
     * @param gdsTopicProduct 信息
     * @return 结果
     */
	public int updateGdsTopicProduct(GdsTopicProduct gdsTopicProduct)
	{
	    gdsTopicProduct.preUpdate();
	    return gdsTopicProductMapper.updateGdsTopicProduct(gdsTopicProduct);
	}

	/**
     * 删除对象
     * 
     * @param id 需要删除的数据ID
     * @return 结果
     */
	public int deleteGdsTopicProductById(Long id)
	{
		return gdsTopicProductMapper.deleteGdsTopicProductById(id);
	}
	
}
