package com.jinshuo.mall.admin.application.service.impl.ums;

import com.github.pagehelper.PageInfo;
import com.jinshuo.mall.admin.application.service.ums.IUmsMemberWxService;
import com.jinshuo.mall.admin.domain.ums.UmsMemberWx;
import com.jinshuo.mall.admin.infra.mapper.ums.UmsMemberWxMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 微信账户 服务层实现
 * 
 * @author dyh
 * @date 2020-08-12
 */
@Service
public class UmsMemberWxServiceImpl implements IUmsMemberWxService
{
	@Autowired(required = false)
	private UmsMemberWxMapper umsMemberWxMapper;

	/**
     * 查询微信账户信息
     * 
     * @param id 微信账户ID
     * @return 微信账户信息
     */
	public UmsMemberWx selectUmsMemberWxById(Long id)
	{
	    return umsMemberWxMapper.selectUmsMemberWxById(id);
	}
	
	/**
     * 查询微信账户列表
     * 
     * @param qry 微信账户信息
     * @return 微信账户集合
     */
	public PageInfo selectUmsMemberWxPage(UmsMemberWx qry)
	{
        /*PageHelper.startPage(qry.getPageNum(), qry.getPageSize());
		UmsMemberWx umsMemberWx = new UmsMemberWx();
        List<UmsMemberWx> umsMemberWxs = umsMemberWxMapper.selectUmsMemberWxList(umsMemberWx);
        PageInfo pageInfo = new PageInfo(umsMemberWxs);
	    return pageInfo;*/
		return null;
	}
	
    /**
     * 新增微信账户
     * 
     * @param umsMemberWx 微信账户信息
     * @return 结果
     */
	public int insertUmsMemberWx(UmsMemberWx umsMemberWx)
	{
		umsMemberWx.preInsert();
	    return umsMemberWxMapper.insertUmsMemberWx(umsMemberWx);
	}
	
	/**
     * 修改微信账户
     * 
     * @param umsMemberWx 微信账户信息
     * @return 结果
     */
	public int updateUmsMemberWx(UmsMemberWx umsMemberWx)
	{
	    umsMemberWx.preUpdate();
	    return umsMemberWxMapper.updateUmsMemberWx(umsMemberWx);
	}

	/**
     * 删除微信账户对象
     * 
     * @param id 需要删除的数据ID
     * @return 结果
     */
	public int deleteUmsMemberWxById(Long id)
	{
		return umsMemberWxMapper.deleteUmsMemberWxById(id);
	}
	
}
