package com.jinshuo.mall.admin.infra.mapper.ord;

import com.jinshuo.mall.admin.domain.ord.OrdExpressCode;
import java.util.List;	

/**
 *  数据层
 * 
 * @author dyh
 * @date 2020-08-10
 */
public interface OrdExpressCodeMapper 
{
	/**
     * 查询信息
     * 
     * @param id ID
     * @return 信息
     */
	public OrdExpressCode selectOrdExpressCodeById(Long id);
	
	/**
     * 查询列表
     * 
     * @param ordExpressCode 信息
     * @return 集合
     */
	public List<OrdExpressCode> selectOrdExpressCodeList(OrdExpressCode ordExpressCode);
	
	/**
     * 新增
     * 
     * @param ordExpressCode 信息
     * @return 结果
     */
	public int insertOrdExpressCode(OrdExpressCode ordExpressCode);
	
	/**
     * 修改
     * 
     * @param ordExpressCode 信息
     * @return 结果
     */
	public int updateOrdExpressCode(OrdExpressCode ordExpressCode);
	
	/**
     * 删除
     * 
     * @param id ID
     * @return 结果
     */
	public int deleteOrdExpressCodeById(Long id);
	
	/**
     * 批量删除
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteOrdExpressCodeByIds(String[] ids);
	
}