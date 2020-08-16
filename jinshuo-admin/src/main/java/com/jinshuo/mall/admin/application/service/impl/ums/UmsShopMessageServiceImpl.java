package com.jinshuo.mall.admin.application.service.impl.ums;

import com.github.pagehelper.PageInfo;
import com.jinshuo.mall.admin.application.service.ums.IUmsShopMessageService;
import com.jinshuo.mall.admin.domain.ums.UmsShopMessage;
import com.jinshuo.mall.admin.infra.mapper.ums.UmsShopMessageMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 *  服务层实现
 * 
 * @author dyh
 * @date 2020-08-12
 */
@Service
public class UmsShopMessageServiceImpl implements IUmsShopMessageService
{
	@Autowired(required = false)
	private UmsShopMessageMapper umsShopMessageMapper;

	/**
     * 查询信息
     * 
     * @param id ID
     * @return 信息
     */
	public UmsShopMessage selectUmsShopMessageById(Long id)
	{
	    return umsShopMessageMapper.selectUmsShopMessageById(id);
	}
	
	/**
     * 查询列表
     * 
     * @param qry 信息
     * @return 集合
     */
	public PageInfo selectUmsShopMessagePage(UmsShopMessage qry)
	{
        /*PageHelper.startPage(qry.getPageNum(), qry.getPageSize());
		UmsShopMessage umsShopMessage = new UmsShopMessage();
        List<UmsShopMessage> umsShopMessages = umsShopMessageMapper.selectUmsShopMessageList(umsShopMessage);
        PageInfo pageInfo = new PageInfo(umsShopMessages);
	    return pageInfo;*/
		return null;
	}
	
    /**
     * 新增
     * 
     * @param umsShopMessage 信息
     * @return 结果
     */
	public int insertUmsShopMessage(UmsShopMessage umsShopMessage)
	{
		umsShopMessage.preInsert();
	    return umsShopMessageMapper.insertUmsShopMessage(umsShopMessage);
	}
	
	/**
     * 修改
     * 
     * @param umsShopMessage 信息
     * @return 结果
     */
	public int updateUmsShopMessage(UmsShopMessage umsShopMessage)
	{
	    umsShopMessage.preUpdate();
	    return umsShopMessageMapper.updateUmsShopMessage(umsShopMessage);
	}

	/**
     * 删除对象
     * 
     * @param id 需要删除的数据ID
     * @return 结果
     */
	public int deleteUmsShopMessageById(Long id)
	{
		return umsShopMessageMapper.deleteUmsShopMessageById(id);
	}
	
}
