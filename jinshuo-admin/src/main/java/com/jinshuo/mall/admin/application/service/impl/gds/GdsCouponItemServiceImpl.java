package com.jinshuo.mall.admin.application.service.impl.gds;

import com.github.pagehelper.PageInfo;
import com.jinshuo.mall.admin.application.service.gds.IGdsCouponItemService;
import com.jinshuo.mall.admin.domain.gds.GdsCouponItem;
import com.jinshuo.mall.admin.infra.mapper.gds.GdsCouponItemMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 *  服务层实现
 * 
 * @author dyh
 * @date 2020-08-12
 */
@Service
public class GdsCouponItemServiceImpl implements IGdsCouponItemService
{
	@Autowired(required = false)
	private GdsCouponItemMapper gdsCouponItemMapper;

	/**
     * 查询信息
     * 
     * @param id ID
     * @return 信息
     */
	public GdsCouponItem selectGdsCouponItemById(Long id)
	{
	    return gdsCouponItemMapper.selectGdsCouponItemById(id);
	}
	
	/**
     * 查询列表
     * 
     * @param qry 信息
     * @return 集合
     */
	public PageInfo selectGdsCouponItemPage(GdsCouponItem qry)
	{
        /*PageHelper.startPage(qry.getPageNum(), qry.getPageSize());
		GdsCouponItem gdsCouponItem = new GdsCouponItem();
        List<GdsCouponItem> gdsCouponItems = gdsCouponItemMapper.selectGdsCouponItemList(gdsCouponItem);
        PageInfo pageInfo = new PageInfo(gdsCouponItems);
	    return pageInfo;*/
		return null;
	}
	
    /**
     * 新增
     * 
     * @param gdsCouponItem 信息
     * @return 结果
     */
	public int insertGdsCouponItem(GdsCouponItem gdsCouponItem)
	{
		gdsCouponItem.preInsert();
	    return gdsCouponItemMapper.insertGdsCouponItem(gdsCouponItem);
	}
	
	/**
     * 修改
     * 
     * @param gdsCouponItem 信息
     * @return 结果
     */
	public int updateGdsCouponItem(GdsCouponItem gdsCouponItem)
	{
	    gdsCouponItem.preUpdate();
	    return gdsCouponItemMapper.updateGdsCouponItem(gdsCouponItem);
	}

	/**
     * 删除对象
     * 
     * @param id 需要删除的数据ID
     * @return 结果
     */
	public int deleteGdsCouponItemById(Long id)
	{
		return gdsCouponItemMapper.deleteGdsCouponItemById(id);
	}
	
}
