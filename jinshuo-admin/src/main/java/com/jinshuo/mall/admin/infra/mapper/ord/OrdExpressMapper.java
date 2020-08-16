package com.jinshuo.mall.admin.infra.mapper.ord;

import com.jinshuo.mall.admin.domain.ord.OrdExpress;
import java.util.List;	

/**
 *  数据层
 * 
 * @author dyh
 * @date 2020-08-10
 */
public interface OrdExpressMapper 
{
	/**
     * 查询信息
     * 
     * @param id ID
     * @return 信息
     */
	public OrdExpress selectOrdExpressById(Long id);
	
	/**
     * 查询列表
     * 
     * @param ordExpress 信息
     * @return 集合
     */
	public List<OrdExpress> selectOrdExpressList(OrdExpress ordExpress);
	
	/**
     * 新增
     * 
     * @param ordExpress 信息
     * @return 结果
     */
	public int insertOrdExpress(OrdExpress ordExpress);
	
	/**
     * 修改
     * 
     * @param ordExpress 信息
     * @return 结果
     */
	public int updateOrdExpress(OrdExpress ordExpress);
	
	/**
     * 删除
     * 
     * @param id ID
     * @return 结果
     */
	public int deleteOrdExpressById(Long id);
	
	/**
     * 批量删除
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteOrdExpressByIds(String[] ids);
	
}