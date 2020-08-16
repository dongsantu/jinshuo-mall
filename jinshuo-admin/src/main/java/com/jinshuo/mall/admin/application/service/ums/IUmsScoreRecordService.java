package com.jinshuo.mall.admin.application.service.ums;

import com.github.pagehelper.PageInfo;
import com.jinshuo.mall.admin.domain.ums.UmsScoreRecord;

/**
 * 积分流水 服务层
 * 
 * @author dyh
 * @date 2020-08-12
 */
public interface IUmsScoreRecordService 
{
	/**
     * 查询积分流水信息
     * 
     * @param id 积分流水ID
     * @return 积分流水信息
     */
	 UmsScoreRecord selectUmsScoreRecordById(Long id);
	
	/**
     * 查询积分流水列表
     * 
     * @param qry 积分流水信息
     * @return 积分流水集合
     */
	PageInfo selectUmsScoreRecordPage(UmsScoreRecord qry);
	
	/**
     * 新增积分流水
     * 
     * @param umsScoreRecord 积分流水信息
     * @return 结果
     */
	 int insertUmsScoreRecord(UmsScoreRecord umsScoreRecord);
	
	/**
     * 修改积分流水
     * 
     * @param umsScoreRecord 积分流水信息
     * @return 结果
     */
	 int updateUmsScoreRecord(UmsScoreRecord umsScoreRecord);
		
	/**
     * 删除积分流水信息
     * 
     * @param id 需要删除的数据ID
     * @return 结果
     */
	 int deleteUmsScoreRecordById(Long id);
	
}
