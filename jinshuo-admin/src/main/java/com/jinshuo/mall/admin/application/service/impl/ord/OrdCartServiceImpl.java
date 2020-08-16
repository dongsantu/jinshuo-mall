package com.jinshuo.mall.admin.application.service.impl.ord;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jinshuo.mall.admin.application.dto.qry.ord.OrdCartQry;
import com.jinshuo.mall.admin.application.service.ord.IOrdCartService;
import com.jinshuo.mall.admin.domain.ord.OrdCart;
import com.jinshuo.mall.admin.infra.mapper.ord.OrdCartMapper;
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
public class OrdCartServiceImpl implements IOrdCartService
{
	@Autowired(required = false)
	private OrdCartMapper ordCartMapper;

	/**
     * 查询信息
     * 
     * @param id ID
     * @return 信息
     */
	public OrdCart selectOrdCartById(Long id)
	{
	    return ordCartMapper.selectOrdCartById(id);
	}
	
	/**
     * 查询列表
     * 
     * @param qry 信息
     * @return 集合
     */
	public PageInfo selectOrdCartPage(OrdCartQry qry)
	{
        PageHelper.startPage(qry.getPageNum(), qry.getPageSize());
		OrdCart ordCart = new OrdCart();
        List<OrdCart> ordCarts = ordCartMapper.selectOrdCartList(ordCart);
        PageInfo pageInfo = new PageInfo(ordCarts);
	    return pageInfo;
	}
	
    /**
     * 新增
     * 
     * @param ordCart 信息
     * @return 结果
     */
	public int insertOrdCart(OrdCart ordCart)
	{
		ordCart.preInsert();
	    return ordCartMapper.insertOrdCart(ordCart);
	}
	
	/**
     * 修改
     * 
     * @param ordCart 信息
     * @return 结果
     */
	public int updateOrdCart(OrdCart ordCart)
	{
	    ordCart.preUpdate();
	    return ordCartMapper.updateOrdCart(ordCart);
	}

	/**
     * 删除对象
     * 
     * @param id 需要删除的数据ID
     * @return 结果
     */
	public int deleteOrdCartById(Long id)
	{
		return ordCartMapper.deleteOrdCartById(id);
	}
	
}
