package com.jinshuo.mall.admin.application.service.impl.ord;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jinshuo.mall.admin.application.dto.qry.ord.OrdCartItemQry;
import com.jinshuo.mall.admin.application.service.ord.IOrdCartItemService;
import com.jinshuo.mall.admin.domain.ord.OrdCartItem;
import com.jinshuo.mall.admin.infra.mapper.ord.OrdCartItemMapper;
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
public class OrdCartItemServiceImpl implements IOrdCartItemService
{
	@Autowired(required = false)
	private OrdCartItemMapper ordCartItemMapper;

	/**
     * 查询信息
     * 
     * @param id ID
     * @return 信息
     */
	public OrdCartItem selectOrdCartItemById(Long id)
	{
	    return ordCartItemMapper.selectOrdCartItemById(id);
	}
	
	/**
     * 查询列表
     * 
     * @param qry 信息
     * @return 集合
     */
	public PageInfo selectOrdCartItemPage(OrdCartItemQry qry)
	{
        PageHelper.startPage(qry.getPageNum(), qry.getPageSize());
		OrdCartItem ordCartItem = new OrdCartItem();
        List<OrdCartItem> ordCartItems = ordCartItemMapper.selectOrdCartItemList(ordCartItem);
        PageInfo pageInfo = new PageInfo(ordCartItems);
	    return pageInfo;
	}
	
    /**
     * 新增
     * 
     * @param ordCartItem 信息
     * @return 结果
     */
	public int insertOrdCartItem(OrdCartItem ordCartItem)
	{
		ordCartItem.preInsert();
	    return ordCartItemMapper.insertOrdCartItem(ordCartItem);
	}
	
	/**
     * 修改
     * 
     * @param ordCartItem 信息
     * @return 结果
     */
	public int updateOrdCartItem(OrdCartItem ordCartItem)
	{
	    ordCartItem.preUpdate();
	    return ordCartItemMapper.updateOrdCartItem(ordCartItem);
	}

	/**
     * 删除对象
     * 
     * @param id 需要删除的数据ID
     * @return 结果
     */
	public int deleteOrdCartItemById(Long id)
	{
		return ordCartItemMapper.deleteOrdCartItemById(id);
	}
	
}
