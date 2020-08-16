package com.jinshuo.mall.admin.application.service.impl.ord;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jinshuo.mall.admin.application.dto.qry.ord.OrdOrderQry;
import com.jinshuo.mall.admin.application.service.ord.IOrdOrderService;
import com.jinshuo.mall.admin.domain.ord.OrdOrder;
import com.jinshuo.mall.admin.infra.mapper.ord.OrdOrderMapper;
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
public class OrdOrderServiceImpl implements IOrdOrderService
{
	@Autowired(required = false)
	private OrdOrderMapper ordOrderMapper;

	/**
     * 查询订单信息
     * 
     * @param id 订单ID
     * @return 订单信息
     */
	public OrdOrder selectOrdOrderById(Long id)
	{
	    return ordOrderMapper.selectOrdOrderById(id);
	}
	
	/**
     * 查询订单列表
     * 
     * @param qry 订单信息
     * @return 订单集合
     */
	public PageInfo selectOrdOrderPage(OrdOrderQry qry)
	{
        PageHelper.startPage(qry.getPageNum(), qry.getPageSize());
		OrdOrder ordOrder = new OrdOrder();
        List<OrdOrder> ordOrders = ordOrderMapper.selectOrdOrderList(ordOrder);
        PageInfo pageInfo = new PageInfo(ordOrders);
	    return pageInfo;
	}
	
    /**
     * 新增订单
     * 
     * @param ordOrder 订单信息
     * @return 结果
     */
	public int insertOrdOrder(OrdOrder ordOrder)
	{
		ordOrder.preInsert();
	    return ordOrderMapper.insertOrdOrder(ordOrder);
	}
	
	/**
     * 修改订单
     * 
     * @param ordOrder 订单信息
     * @return 结果
     */
	public int updateOrdOrder(OrdOrder ordOrder)
	{
	    ordOrder.preUpdate();
	    return ordOrderMapper.updateOrdOrder(ordOrder);
	}

	/**
     * 删除订单对象
     * 
     * @param id 需要删除的数据ID
     * @return 结果
     */
	public int deleteOrdOrderById(Long id)
	{
		return ordOrderMapper.deleteOrdOrderById(id);
	}
	
}
