package com.jinshuo.mall.admin.application.service.impl.ord;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jinshuo.mall.admin.application.dto.qry.ord.OrdOrderSampleQry;
import com.jinshuo.mall.admin.application.service.ord.IOrdOrderSampleService;
import com.jinshuo.mall.admin.domain.ord.OrdOrderSample;
import com.jinshuo.mall.admin.infra.mapper.ord.OrdOrderSampleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * 样品订单 服务层实现
 * 
 * @author dyh
 * @date 2020-08-10
 */
@Service
public class OrdOrderSampleServiceImpl implements IOrdOrderSampleService
{
	@Autowired(required = false)
	private OrdOrderSampleMapper ordOrderSampleMapper;

	/**
     * 查询样品订单信息
     * 
     * @param id 样品订单ID
     * @return 样品订单信息
     */
	public OrdOrderSample selectOrdOrderSampleById(Long id)
	{
	    return ordOrderSampleMapper.selectOrdOrderSampleById(id);
	}
	
	/**
     * 查询样品订单列表
     * 
     * @param qry 样品订单信息
     * @return 样品订单集合
     */
	public PageInfo selectOrdOrderSamplePage(OrdOrderSampleQry qry)
	{
        PageHelper.startPage(qry.getPageNum(), qry.getPageSize());
		OrdOrderSample ordOrderSample = new OrdOrderSample();
        List<OrdOrderSample> ordOrderSamples = ordOrderSampleMapper.selectOrdOrderSampleList(ordOrderSample);
        PageInfo pageInfo = new PageInfo(ordOrderSamples);
	    return pageInfo;
	}
	
    /**
     * 新增样品订单
     * 
     * @param ordOrderSample 样品订单信息
     * @return 结果
     */
	public int insertOrdOrderSample(OrdOrderSample ordOrderSample)
	{
		ordOrderSample.preInsert();
	    return ordOrderSampleMapper.insertOrdOrderSample(ordOrderSample);
	}
	
	/**
     * 修改样品订单
     * 
     * @param ordOrderSample 样品订单信息
     * @return 结果
     */
	public int updateOrdOrderSample(OrdOrderSample ordOrderSample)
	{
	    ordOrderSample.preUpdate();
	    return ordOrderSampleMapper.updateOrdOrderSample(ordOrderSample);
	}

	/**
     * 删除样品订单对象
     * 
     * @param id 需要删除的数据ID
     * @return 结果
     */
	public int deleteOrdOrderSampleById(Long id)
	{
		return ordOrderSampleMapper.deleteOrdOrderSampleById(id);
	}
	
}
