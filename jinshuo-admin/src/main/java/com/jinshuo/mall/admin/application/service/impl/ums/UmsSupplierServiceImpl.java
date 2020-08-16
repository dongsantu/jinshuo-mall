package com.jinshuo.mall.admin.application.service.impl.ums;

import com.github.pagehelper.PageInfo;
import com.jinshuo.mall.admin.application.service.ums.IUmsSupplierService;
import com.jinshuo.mall.admin.domain.ums.UmsSupplier;
import com.jinshuo.mall.admin.infra.mapper.ums.UmsSupplierMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 供应商 服务层实现
 * 
 * @author dyh
 * @date 2020-08-12
 */
@Service
public class UmsSupplierServiceImpl implements IUmsSupplierService
{
	@Autowired(required = false)
	private UmsSupplierMapper umsSupplierMapper;

	/**
     * 查询供应商信息
     * 
     * @param id 供应商ID
     * @return 供应商信息
     */
	public UmsSupplier selectUmsSupplierById(Long id)
	{
	    return umsSupplierMapper.selectUmsSupplierById(id);
	}
	
	/**
     * 查询供应商列表
     * 
     * @param qry 供应商信息
     * @return 供应商集合
     */
	public PageInfo selectUmsSupplierPage(UmsSupplier qry)
	{
        /*PageHelper.startPage(qry.getPageNum(), qry.getPageSize());
		UmsSupplier umsSupplier = new UmsSupplier();
        List<UmsSupplier> umsSuppliers = umsSupplierMapper.selectUmsSupplierList(umsSupplier);
        PageInfo pageInfo = new PageInfo(umsSuppliers);
	    return pageInfo;*/
		return null;
	}
	
    /**
     * 新增供应商
     * 
     * @param umsSupplier 供应商信息
     * @return 结果
     */
	public int insertUmsSupplier(UmsSupplier umsSupplier)
	{
		umsSupplier.preInsert();
	    return umsSupplierMapper.insertUmsSupplier(umsSupplier);
	}
	
	/**
     * 修改供应商
     * 
     * @param umsSupplier 供应商信息
     * @return 结果
     */
	public int updateUmsSupplier(UmsSupplier umsSupplier)
	{
	    umsSupplier.preUpdate();
	    return umsSupplierMapper.updateUmsSupplier(umsSupplier);
	}

	/**
     * 删除供应商对象
     * 
     * @param id 需要删除的数据ID
     * @return 结果
     */
	public int deleteUmsSupplierById(Long id)
	{
		return umsSupplierMapper.deleteUmsSupplierById(id);
	}
	
}
