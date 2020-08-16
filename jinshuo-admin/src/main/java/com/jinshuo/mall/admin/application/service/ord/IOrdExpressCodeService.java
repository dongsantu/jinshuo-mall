package com.jinshuo.mall.admin.application.service.ord;

import com.github.pagehelper.PageInfo;
import com.jinshuo.mall.admin.application.dto.qry.ord.OrdExpressCodeQry;
import com.jinshuo.mall.admin.domain.ord.OrdExpressCode;

/**
 *  服务层
 * 
 * @author dyh
 * @date 2020-08-10
 */
public interface IOrdExpressCodeService 
{
	/**
     * 查询信息
     * 
     * @param id ID
     * @return 信息
     */
	 OrdExpressCode selectOrdExpressCodeById(Long id);
	
	/**
     * 查询列表
     * 
     * @param qry 信息
     * @return 集合
     */
	PageInfo selectOrdExpressCodePage(OrdExpressCodeQry qry);
	
	/**
     * 新增
     * 
     * @param ordExpressCode 信息
     * @return 结果
     */
	 int insertOrdExpressCode(OrdExpressCode ordExpressCode);
	
	/**
     * 修改
     * 
     * @param ordExpressCode 信息
     * @return 结果
     */
	 int updateOrdExpressCode(OrdExpressCode ordExpressCode);
		
	/**
     * 删除信息
     * 
     * @param id 需要删除的数据ID
     * @return 结果
     */
	 int deleteOrdExpressCodeById(Long id);
	
}
