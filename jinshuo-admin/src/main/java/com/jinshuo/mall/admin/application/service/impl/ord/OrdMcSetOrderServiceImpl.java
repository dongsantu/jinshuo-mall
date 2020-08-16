package com.jinshuo.mall.admin.application.service.impl.ord;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jinshuo.mall.admin.application.dto.qry.ord.OrdMcSetOrderQry;
import com.jinshuo.mall.admin.application.service.ord.IOrdMcSetOrderService;
import com.jinshuo.mall.admin.domain.ord.OrdMcSetOrder;
import com.jinshuo.mall.admin.infra.mapper.ord.OrdMcSetOrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 *  服务层实现
 * 
 * @author dyh
 * @date 2020-08-10
 */
@Service
public class OrdMcSetOrderServiceImpl implements IOrdMcSetOrderService
{
	@Autowired(required = false)
	private OrdMcSetOrderMapper ordMcSetOrderMapper;

	/**
     * 查询信息
     * 
     * @param id ID
     * @return 信息
     */
	public OrdMcSetOrder selectOrdMcSetOrderById(Long id)
	{
	    return ordMcSetOrderMapper.selectOrdMcSetOrderById(id);
	}
	
	/**
     * 查询列表
     * 
     * @param qry 信息
     * @return 集合
     */
	public PageInfo selectOrdMcSetOrderPage(OrdMcSetOrderQry qry)
	{
        PageHelper.startPage(qry.getPageNum(), qry.getPageSize());
		OrdMcSetOrder ordMcSetOrder = new OrdMcSetOrder();
        List<OrdMcSetOrder> ordMcSetOrders = ordMcSetOrderMapper.selectOrdMcSetOrderList(ordMcSetOrder);
        PageInfo pageInfo = new PageInfo(ordMcSetOrders);
	    return pageInfo;
	}
	
    /**
     * 新增
     * 
     * @param ordMcSetOrder 信息
     * @return 结果
     */
	public int insertOrdMcSetOrder(OrdMcSetOrder ordMcSetOrder)
	{
		ordMcSetOrder.preInsert();
	    return ordMcSetOrderMapper.insertOrdMcSetOrder(ordMcSetOrder);
	}
	
	/**
     * 修改
     * 
     * @param ordMcSetOrder 信息
     * @return 结果
     */
	public int updateOrdMcSetOrder(OrdMcSetOrder ordMcSetOrder)
	{
	    ordMcSetOrder.preUpdate();
	    return ordMcSetOrderMapper.updateOrdMcSetOrder(ordMcSetOrder);
	}

	/**
     * 删除对象
     * 
     * @param id 需要删除的数据ID
     * @return 结果
     */
	public int deleteOrdMcSetOrderById(Long id)
	{
		return ordMcSetOrderMapper.deleteOrdMcSetOrderById(id);
	}
	
}
