package com.jinshuo.mall.admin.application.service.ums;

import com.github.pagehelper.PageInfo;
import com.jinshuo.mall.admin.domain.ums.UmsWxTemplate;

/**
 * 微信配置 服务层
 * 
 * @author dyh
 * @date 2020-08-12
 */
public interface IUmsWxTemplateService 
{
	/**
     * 查询微信配置信息
     * 
     * @param id 微信配置ID
     * @return 微信配置信息
     */
	 UmsWxTemplate selectUmsWxTemplateById(Long id);
	
	/**
     * 查询微信配置列表
     * 
     * @param qry 微信配置信息
     * @return 微信配置集合
     */
	PageInfo selectUmsWxTemplatePage(UmsWxTemplate qry);
	
	/**
     * 新增微信配置
     * 
     * @param umsWxTemplate 微信配置信息
     * @return 结果
     */
	 int insertUmsWxTemplate(UmsWxTemplate umsWxTemplate);
	
	/**
     * 修改微信配置
     * 
     * @param umsWxTemplate 微信配置信息
     * @return 结果
     */
	 int updateUmsWxTemplate(UmsWxTemplate umsWxTemplate);
		
	/**
     * 删除微信配置信息
     * 
     * @param id 需要删除的数据ID
     * @return 结果
     */
	 int deleteUmsWxTemplateById(Long id);
	
}
