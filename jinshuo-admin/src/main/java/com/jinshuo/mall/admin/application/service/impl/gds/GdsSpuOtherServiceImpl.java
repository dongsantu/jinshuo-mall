package com.jinshuo.mall.admin.application.service.impl.gds;

import com.github.pagehelper.PageInfo;
import com.jinshuo.mall.admin.application.service.gds.IGdsSpuOtherService;
import com.jinshuo.mall.admin.domain.gds.GdsSpuOther;
import com.jinshuo.mall.admin.infra.mapper.gds.GdsSpuOtherMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 *  服务层实现
 * 
 * @author dyh
 * @date 2020-08-12
 */
@Service
public class GdsSpuOtherServiceImpl implements IGdsSpuOtherService
{
	@Autowired(required = false)
	private GdsSpuOtherMapper gdsSpuOtherMapper;

	/**
     * 查询信息
     * 
     * @param id ID
     * @return 信息
     */
	public GdsSpuOther selectGdsSpuOtherById(Long id)
	{
	    return gdsSpuOtherMapper.selectGdsSpuOtherById(id);
	}
	
	/**
     * 查询列表
     * 
     * @param qry 信息
     * @return 集合
     */
	public PageInfo selectGdsSpuOtherPage(GdsSpuOther qry)
	{
        /*PageHelper.startPage(qry.getPageNum(), qry.getPageSize());
		GdsSpuOther gdsSpuOther = new GdsSpuOther();
        List<GdsSpuOther> gdsSpuOthers = gdsSpuOtherMapper.selectGdsSpuOtherList(gdsSpuOther);
        PageInfo pageInfo = new PageInfo(gdsSpuOthers);
	    return pageInfo;*/
		return null;
	}
	
    /**
     * 新增
     * 
     * @param gdsSpuOther 信息
     * @return 结果
     */
	public int insertGdsSpuOther(GdsSpuOther gdsSpuOther)
	{
		gdsSpuOther.preInsert();
	    return gdsSpuOtherMapper.insertGdsSpuOther(gdsSpuOther);
	}
	
	/**
     * 修改
     * 
     * @param gdsSpuOther 信息
     * @return 结果
     */
	public int updateGdsSpuOther(GdsSpuOther gdsSpuOther)
	{
	    gdsSpuOther.preUpdate();
	    return gdsSpuOtherMapper.updateGdsSpuOther(gdsSpuOther);
	}

	/**
     * 删除对象
     * 
     * @param id 需要删除的数据ID
     * @return 结果
     */
	public int deleteGdsSpuOtherById(Long id)
	{
		return gdsSpuOtherMapper.deleteGdsSpuOtherById(id);
	}
	
}
