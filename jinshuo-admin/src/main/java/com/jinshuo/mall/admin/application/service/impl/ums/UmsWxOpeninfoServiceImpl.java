package com.jinshuo.mall.admin.application.service.impl.ums;

import com.github.pagehelper.PageInfo;
import com.jinshuo.mall.admin.application.service.ums.IUmsWxOpeninfoService;
import com.jinshuo.mall.admin.domain.ums.UmsWxOpeninfo;
import com.jinshuo.mall.admin.infra.mapper.ums.UmsWxOpeninfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 微信菜单 服务层实现
 * 
 * @author dyh
 * @date 2020-08-12
 */
@Service
public class UmsWxOpeninfoServiceImpl implements IUmsWxOpeninfoService
{
	@Autowired(required = false)
	private UmsWxOpeninfoMapper umsWxOpeninfoMapper;

	/**
     * 查询微信菜单信息
     * 
     * @param id 微信菜单ID
     * @return 微信菜单信息
     */
	public UmsWxOpeninfo selectUmsWxOpeninfoById(Long id)
	{
	    return umsWxOpeninfoMapper.selectUmsWxOpeninfoById(id);
	}
	
	/**
     * 查询微信菜单列表
     * 
     * @param qry 微信菜单信息
     * @return 微信菜单集合
     */
	public PageInfo selectUmsWxOpeninfoPage(UmsWxOpeninfo qry)
	{
        /*PageHelper.startPage(qry.getPageNum(), qry.getPageSize());
		UmsWxOpeninfo umsWxOpeninfo = new UmsWxOpeninfo();
        List<UmsWxOpeninfo> umsWxOpeninfos = umsWxOpeninfoMapper.selectUmsWxOpeninfoList(umsWxOpeninfo);
        PageInfo pageInfo = new PageInfo(umsWxOpeninfos);
	    return pageInfo;*/
		return null;
	}
	
    /**
     * 新增微信菜单
     * 
     * @param umsWxOpeninfo 微信菜单信息
     * @return 结果
     */
	public int insertUmsWxOpeninfo(UmsWxOpeninfo umsWxOpeninfo)
	{
		umsWxOpeninfo.preInsert();
	    return umsWxOpeninfoMapper.insertUmsWxOpeninfo(umsWxOpeninfo);
	}
	
	/**
     * 修改微信菜单
     * 
     * @param umsWxOpeninfo 微信菜单信息
     * @return 结果
     */
	public int updateUmsWxOpeninfo(UmsWxOpeninfo umsWxOpeninfo)
	{
	    umsWxOpeninfo.preUpdate();
	    return umsWxOpeninfoMapper.updateUmsWxOpeninfo(umsWxOpeninfo);
	}

	/**
     * 删除微信菜单对象
     * 
     * @param id 需要删除的数据ID
     * @return 结果
     */
	public int deleteUmsWxOpeninfoById(Long id)
	{
		return umsWxOpeninfoMapper.deleteUmsWxOpeninfoById(id);
	}
	
}
