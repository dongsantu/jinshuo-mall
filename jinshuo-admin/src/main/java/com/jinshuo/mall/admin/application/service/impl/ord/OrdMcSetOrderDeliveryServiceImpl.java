package com.jinshuo.mall.admin.application.service.impl.ord;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jinshuo.mall.admin.application.dto.qry.ord.OrdMcSetOrderDeliveryQry;
import com.jinshuo.mall.admin.application.service.ord.IOrdMcSetOrderDeliveryService;
import com.jinshuo.mall.admin.domain.ord.OrdMcSetOrderDelivery;
import com.jinshuo.mall.admin.infra.mapper.ord.OrdMcSetOrderDeliveryMapper;
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
public class OrdMcSetOrderDeliveryServiceImpl implements IOrdMcSetOrderDeliveryService
{
	@Autowired(required = false)
	private OrdMcSetOrderDeliveryMapper ordMcSetOrderDeliveryMapper;

	/**
     * 查询信息
     * 
     * @param id ID
     * @return 信息
     */
	public OrdMcSetOrderDelivery selectOrdMcSetOrderDeliveryById(Long id)
	{
	    return ordMcSetOrderDeliveryMapper.selectOrdMcSetOrderDeliveryById(id);
	}
	
	/**
     * 查询列表
     * 
     * @param qry 信息
     * @return 集合
     */
	public PageInfo selectOrdMcSetOrderDeliveryPage(OrdMcSetOrderDeliveryQry qry)
	{
        PageHelper.startPage(qry.getPageNum(), qry.getPageSize());
		OrdMcSetOrderDelivery ordMcSetOrderDelivery = new OrdMcSetOrderDelivery();
        List<OrdMcSetOrderDelivery> ordMcSetOrderDeliverys = ordMcSetOrderDeliveryMapper.selectOrdMcSetOrderDeliveryList(ordMcSetOrderDelivery);
        PageInfo pageInfo = new PageInfo(ordMcSetOrderDeliverys);
	    return pageInfo;
	}
	
    /**
     * 新增
     * 
     * @param ordMcSetOrderDelivery 信息
     * @return 结果
     */
	public int insertOrdMcSetOrderDelivery(OrdMcSetOrderDelivery ordMcSetOrderDelivery)
	{
		ordMcSetOrderDelivery.preInsert();
	    return ordMcSetOrderDeliveryMapper.insertOrdMcSetOrderDelivery(ordMcSetOrderDelivery);
	}
	
	/**
     * 修改
     * 
     * @param ordMcSetOrderDelivery 信息
     * @return 结果
     */
	public int updateOrdMcSetOrderDelivery(OrdMcSetOrderDelivery ordMcSetOrderDelivery)
	{
	    ordMcSetOrderDelivery.preUpdate();
	    return ordMcSetOrderDeliveryMapper.updateOrdMcSetOrderDelivery(ordMcSetOrderDelivery);
	}

	/**
     * 删除对象
     * 
     * @param id 需要删除的数据ID
     * @return 结果
     */
	public int deleteOrdMcSetOrderDeliveryById(Long id)
	{
		return ordMcSetOrderDeliveryMapper.deleteOrdMcSetOrderDeliveryById(id);
	}
	
}
