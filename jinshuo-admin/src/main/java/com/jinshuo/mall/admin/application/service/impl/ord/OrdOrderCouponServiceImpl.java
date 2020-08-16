package com.jinshuo.mall.admin.application.service.impl.ord;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jinshuo.mall.admin.application.dto.qry.ord.OrdOrderCouponQry;
import com.jinshuo.mall.admin.application.service.ord.IOrdOrderCouponService;
import com.jinshuo.mall.admin.domain.ord.OrdOrderCoupon;
import com.jinshuo.mall.admin.infra.mapper.ord.OrdOrderCouponMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * 订单 服务层实现
 * 
 * @author dyh
 * @date 2020-08-10
 */
@Service
public class OrdOrderCouponServiceImpl implements IOrdOrderCouponService
{
	@Autowired(required = false)
	private OrdOrderCouponMapper ordOrderCouponMapper;

	/**
     * 查询订单信息
     * 
     * @param id 订单ID
     * @return 订单信息
     */
	public OrdOrderCoupon selectOrdOrderCouponById(Long id)
	{
	    return ordOrderCouponMapper.selectOrdOrderCouponById(id);
	}
	
	/**
     * 查询订单列表
     * 
     * @param qry 订单信息
     * @return 订单集合
     */
	public PageInfo selectOrdOrderCouponPage(OrdOrderCouponQry qry)
	{
        PageHelper.startPage(qry.getPageNum(), qry.getPageSize());
		OrdOrderCoupon ordOrderCoupon = new OrdOrderCoupon();
        List<OrdOrderCoupon> ordOrderCoupons = ordOrderCouponMapper.selectOrdOrderCouponList(ordOrderCoupon);
        PageInfo pageInfo = new PageInfo(ordOrderCoupons);
	    return pageInfo;
	}
	
    /**
     * 新增订单
     * 
     * @param ordOrderCoupon 订单信息
     * @return 结果
     */
	public int insertOrdOrderCoupon(OrdOrderCoupon ordOrderCoupon)
	{
		ordOrderCoupon.preInsert();
	    return ordOrderCouponMapper.insertOrdOrderCoupon(ordOrderCoupon);
	}
	
	/**
     * 修改订单
     * 
     * @param ordOrderCoupon 订单信息
     * @return 结果
     */
	public int updateOrdOrderCoupon(OrdOrderCoupon ordOrderCoupon)
	{
	    ordOrderCoupon.preUpdate();
	    return ordOrderCouponMapper.updateOrdOrderCoupon(ordOrderCoupon);
	}

	/**
     * 删除订单对象
     * 
     * @param id 需要删除的数据ID
     * @return 结果
     */
	public int deleteOrdOrderCouponById(Long id)
	{
		return ordOrderCouponMapper.deleteOrdOrderCouponById(id);
	}
	
}
