package com.jinshuo.mall.admin.application.service.impl.ums;

import com.github.pagehelper.PageInfo;
import com.jinshuo.mall.admin.application.service.ums.IUmsWxTemplateService;
import com.jinshuo.mall.admin.domain.ums.UmsWxTemplate;
import com.jinshuo.mall.admin.infra.mapper.ums.UmsWxTemplateMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 微信配置 服务层实现
 * 
 * @author dyh
 * @date 2020-08-12
 */
@Service
public class UmsWxTemplateServiceImpl implements IUmsWxTemplateService
{
	@Autowired(required = false)
	private UmsWxTemplateMapper umsWxTemplateMapper;

	/**
     * 查询微信配置信息
     * 
     * @param id 微信配置ID
     * @return 微信配置信息
     */
	public UmsWxTemplate selectUmsWxTemplateById(Long id)
	{
	    return umsWxTemplateMapper.selectUmsWxTemplateById(id);
	}
	
	/**
     * 查询微信配置列表
     * 
     * @param qry 微信配置信息
     * @return 微信配置集合
     */
	public PageInfo selectUmsWxTemplatePage(UmsWxTemplate qry)
	{
        /*PageHelper.startPage(qry.getPageNum(), qry.getPageSize());
		UmsWxTemplate umsWxTemplate = new UmsWxTemplate();
        List<UmsWxTemplate> umsWxTemplates = umsWxTemplateMapper.selectUmsWxTemplateList(umsWxTemplate);
        PageInfo pageInfo = new PageInfo(umsWxTemplates);
	    return pageInfo;*/
		return null;
	}
	
    /**
     * 新增微信配置
     * 
     * @param umsWxTemplate 微信配置信息
     * @return 结果
     */
	public int insertUmsWxTemplate(UmsWxTemplate umsWxTemplate)
	{
		umsWxTemplate.preInsert();
	    return umsWxTemplateMapper.insertUmsWxTemplate(umsWxTemplate);
	}
	
	/**
     * 修改微信配置
     * 
     * @param umsWxTemplate 微信配置信息
     * @return 结果
     */
	public int updateUmsWxTemplate(UmsWxTemplate umsWxTemplate)
	{
	    umsWxTemplate.preUpdate();
	    return umsWxTemplateMapper.updateUmsWxTemplate(umsWxTemplate);
	}

	/**
     * 删除微信配置对象
     * 
     * @param id 需要删除的数据ID
     * @return 结果
     */
	public int deleteUmsWxTemplateById(Long id)
	{
		return umsWxTemplateMapper.deleteUmsWxTemplateById(id);
	}
	
}
