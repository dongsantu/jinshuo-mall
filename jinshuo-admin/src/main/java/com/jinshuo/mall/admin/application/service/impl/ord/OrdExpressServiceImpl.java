package com.jinshuo.mall.admin.application.service.impl.ord;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jinshuo.mall.admin.application.dto.qry.ord.OrdExpressQry;
import com.jinshuo.mall.admin.application.service.ord.IOrdExpressService;
import com.jinshuo.mall.admin.domain.ord.OrdExpress;
import com.jinshuo.mall.admin.infra.mapper.ord.OrdExpressMapper;
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
public class OrdExpressServiceImpl implements IOrdExpressService
{
	@Autowired(required = false)
	private OrdExpressMapper ordExpressMapper;

	/**
     * 查询信息
     * 
     * @param id ID
     * @return 信息
     */
	public OrdExpress selectOrdExpressById(Long id)
	{
	    return ordExpressMapper.selectOrdExpressById(id);
	}
	
	/**
     * 查询列表
     * 
     * @param qry 信息
     * @return 集合
     */
	public PageInfo selectOrdExpressPage(OrdExpressQry qry)
	{
        PageHelper.startPage(qry.getPageNum(), qry.getPageSize());
		OrdExpress ordExpress = new OrdExpress();
        List<OrdExpress> ordExpresss = ordExpressMapper.selectOrdExpressList(ordExpress);
        PageInfo pageInfo = new PageInfo(ordExpresss);
	    return pageInfo;
	}
	
    /**
     * 新增
     * 
     * @param ordExpress 信息
     * @return 结果
     */
	public int insertOrdExpress(OrdExpress ordExpress)
	{
		ordExpress.preInsert();
	    return ordExpressMapper.insertOrdExpress(ordExpress);
	}
	
	/**
     * 修改
     * 
     * @param ordExpress 信息
     * @return 结果
     */
	public int updateOrdExpress(OrdExpress ordExpress)
	{
	    ordExpress.preUpdate();
	    return ordExpressMapper.updateOrdExpress(ordExpress);
	}

	/**
     * 删除对象
     * 
     * @param id 需要删除的数据ID
     * @return 结果
     */
	public int deleteOrdExpressById(Long id)
	{
		return ordExpressMapper.deleteOrdExpressById(id);
	}
	
}
