package com.jinshuo.mall.admin.application.service.impl.gds;

import com.github.pagehelper.PageInfo;
import com.jinshuo.mall.admin.application.service.gds.IGdsExchangeCardService;
import com.jinshuo.mall.admin.domain.gds.GdsExchangeCard;
import com.jinshuo.mall.admin.infra.mapper.gds.GdsExchangeCardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 *  服务层实现
 * 
 * @author dyh
 * @date 2020-08-12
 */
@Service
public class GdsExchangeCardServiceImpl implements IGdsExchangeCardService
{
	@Autowired(required = false)
	private GdsExchangeCardMapper gdsExchangeCardMapper;

	/**
     * 查询信息
     * 
     * @param id ID
     * @return 信息
     */
	public GdsExchangeCard selectGdsExchangeCardById(Long id)
	{
	    return gdsExchangeCardMapper.selectGdsExchangeCardById(id);
	}
	
	/**
     * 查询列表
     * 
     * @param qry 信息
     * @return 集合
     */
	public PageInfo selectGdsExchangeCardPage(GdsExchangeCard qry)
	{
        /*PageHelper.startPage(qry.getPageNum(), qry.getPageSize());
		GdsExchangeCard gdsExchangeCard = new GdsExchangeCard();
        List<GdsExchangeCard> gdsExchangeCards = gdsExchangeCardMapper.selectGdsExchangeCardList(gdsExchangeCard);
        PageInfo pageInfo = new PageInfo(gdsExchangeCards);
	    return pageInfo;*/
		return null;
	}
	
    /**
     * 新增
     * 
     * @param gdsExchangeCard 信息
     * @return 结果
     */
	public int insertGdsExchangeCard(GdsExchangeCard gdsExchangeCard)
	{
		gdsExchangeCard.preInsert();
	    return gdsExchangeCardMapper.insertGdsExchangeCard(gdsExchangeCard);
	}
	
	/**
     * 修改
     * 
     * @param gdsExchangeCard 信息
     * @return 结果
     */
	public int updateGdsExchangeCard(GdsExchangeCard gdsExchangeCard)
	{
	    gdsExchangeCard.preUpdate();
	    return gdsExchangeCardMapper.updateGdsExchangeCard(gdsExchangeCard);
	}

	/**
     * 删除对象
     * 
     * @param id 需要删除的数据ID
     * @return 结果
     */
	public int deleteGdsExchangeCardById(Long id)
	{
		return gdsExchangeCardMapper.deleteGdsExchangeCardById(id);
	}
	
}
