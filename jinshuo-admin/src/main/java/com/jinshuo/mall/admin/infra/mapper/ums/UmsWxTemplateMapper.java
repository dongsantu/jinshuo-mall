package com.jinshuo.mall.admin.infra.mapper.ums;

import com.jinshuo.mall.admin.domain.ums.UmsWxTemplate;

import java.util.List;

/**
 * 微信配置 数据层
 * 
 * @author dyh
 * @date 2020-08-12
 */
public interface UmsWxTemplateMapper 
{
	/**
     * 查询微信配置信息
     * 
     * @param id 微信配置ID
     * @return 微信配置信息
     */
	public UmsWxTemplate selectUmsWxTemplateById(Long id);
	
	/**
     * 查询微信配置列表
     * 
     * @param umsWxTemplate 微信配置信息
     * @return 微信配置集合
     */
	public List<UmsWxTemplate> selectUmsWxTemplateList(UmsWxTemplate umsWxTemplate);
	
	/**
     * 新增微信配置
     * 
     * @param umsWxTemplate 微信配置信息
     * @return 结果
     */
	public int insertUmsWxTemplate(UmsWxTemplate umsWxTemplate);
	
	/**
     * 修改微信配置
     * 
     * @param umsWxTemplate 微信配置信息
     * @return 结果
     */
	public int updateUmsWxTemplate(UmsWxTemplate umsWxTemplate);
	
	/**
     * 删除微信配置
     * 
     * @param id 微信配置ID
     * @return 结果
     */
	public int deleteUmsWxTemplateById(Long id);
	
	/**
     * 批量删除微信配置
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteUmsWxTemplateByIds(String[] ids);
	
}