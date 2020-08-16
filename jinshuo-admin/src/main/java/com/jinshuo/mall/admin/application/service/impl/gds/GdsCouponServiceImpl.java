package com.jinshuo.mall.admin.application.service.impl.gds;

import com.github.pagehelper.PageInfo;
import com.jinshuo.mall.admin.application.service.gds.IGdsCouponService;
import com.jinshuo.mall.admin.domain.gds.GdsCoupon;
import com.jinshuo.mall.admin.infra.mapper.gds.GdsCouponMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 *  服务层实现
 * 
 * @author dyh
 * @date 2020-08-12
 */
@Service
public class GdsCouponServiceImpl implements IGdsCouponService
{
	@Autowired(required = false)
	private GdsCouponMapper gdsCouponMapper;

	/**
     * 查询信息
     * 
     * @param id ID
     * @return 信息
     */
	public GdsCoupon selectGdsCouponById(Long id)
	{
	    return gdsCouponMapper.selectGdsCouponById(id);
	}
	
	/**
     * 查询列表
     * 
     * @param qry 信息
     * @return 集合
     */
	public PageInfo selectGdsCouponPage(GdsCoupon qry)
	{
        /*PageHelper.startPage(qry.getPageNum(), qry.getPageSize());
		GdsCoupon gdsCoupon = new GdsCoupon();
        List<GdsCoupon> gdsCoupons = gdsCouponMapper.selectGdsCouponList(gdsCoupon);
        PageInfo pageInfo = new PageInfo(gdsCoupons);
	    return pageInfo;*/
		return null;
	}
	
    /**
     * 新增
     * 
     * @param gdsCoupon 信息
     * @return 结果
     */
	public int insertGdsCoupon(GdsCoupon gdsCoupon)
	{
		gdsCoupon.preInsert();
	    return gdsCouponMapper.insertGdsCoupon(gdsCoupon);
	}
	
	/**
     * 修改
     * 
     * @param gdsCoupon 信息
     * @return 结果
     */
	public int updateGdsCoupon(GdsCoupon gdsCoupon)
	{
	    gdsCoupon.preUpdate();
	    return gdsCouponMapper.updateGdsCoupon(gdsCoupon);
	}

	/**
     * 删除对象
     * 
     * @param id 需要删除的数据ID
     * @return 结果
     */
	public int deleteGdsCouponById(Long id)
	{
		return gdsCouponMapper.deleteGdsCouponById(id);
	}
	
}
