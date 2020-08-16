package com.jinshuo.mall.admin.application.service.impl.ums;

import com.github.pagehelper.PageInfo;
import com.jinshuo.mall.admin.application.service.ums.IUmsMemberCollectService;
import com.jinshuo.mall.admin.domain.ums.UmsMemberCollect;
import com.jinshuo.mall.admin.infra.mapper.ums.UmsMemberCollectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 我的收藏 服务层实现
 * 
 * @author dyh
 * @date 2020-08-12
 */
@Service
public class UmsMemberCollectServiceImpl implements IUmsMemberCollectService
{
	@Autowired(required = false)
	private UmsMemberCollectMapper umsMemberCollectMapper;

	/**
     * 查询我的收藏信息
     * 
     * @param id 我的收藏ID
     * @return 我的收藏信息
     */
	public UmsMemberCollect selectUmsMemberCollectById(Long id)
	{
	    return umsMemberCollectMapper.selectUmsMemberCollectById(id);
	}
	
	/**
     * 查询我的收藏列表
     * 
     * @param qry 我的收藏信息
     * @return 我的收藏集合
     */
	public PageInfo selectUmsMemberCollectPage(UmsMemberCollect qry)
	{
        /*PageHelper.startPage(qry.getPageNum(), qry.getPageSize());
		UmsMemberCollect umsMemberCollect = new UmsMemberCollect();
        List<UmsMemberCollect> umsMemberCollects = umsMemberCollectMapper.selectUmsMemberCollectList(umsMemberCollect);
        PageInfo pageInfo = new PageInfo(umsMemberCollects);
	    return pageInfo;*/
		return null;
	}
	
    /**
     * 新增我的收藏
     * 
     * @param umsMemberCollect 我的收藏信息
     * @return 结果
     */
	public int insertUmsMemberCollect(UmsMemberCollect umsMemberCollect)
	{
		umsMemberCollect.preInsert();
	    return umsMemberCollectMapper.insertUmsMemberCollect(umsMemberCollect);
	}
	
	/**
     * 修改我的收藏
     * 
     * @param umsMemberCollect 我的收藏信息
     * @return 结果
     */
	public int updateUmsMemberCollect(UmsMemberCollect umsMemberCollect)
	{
	    umsMemberCollect.preUpdate();
	    return umsMemberCollectMapper.updateUmsMemberCollect(umsMemberCollect);
	}

	/**
     * 删除我的收藏对象
     * 
     * @param id 需要删除的数据ID
     * @return 结果
     */
	public int deleteUmsMemberCollectById(Long id)
	{
		return umsMemberCollectMapper.deleteUmsMemberCollectById(id);
	}
	
}
