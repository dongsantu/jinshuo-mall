package com.jinshuo.mall.admin.infra.mapper.ums;

import com.jinshuo.mall.admin.domain.ums.UmsScoreRecord;

import java.util.List;

/**
 * 积分流水 数据层
 * 
 * @author dyh
 * @date 2020-08-12
 */
public interface UmsScoreRecordMapper 
{
	/**
     * 查询积分流水信息
     * 
     * @param id 积分流水ID
     * @return 积分流水信息
     */
	public UmsScoreRecord selectUmsScoreRecordById(Long id);
	
	/**
     * 查询积分流水列表
     * 
     * @param umsScoreRecord 积分流水信息
     * @return 积分流水集合
     */
	public List<UmsScoreRecord> selectUmsScoreRecordList(UmsScoreRecord umsScoreRecord);
	
	/**
     * 新增积分流水
     * 
     * @param umsScoreRecord 积分流水信息
     * @return 结果
     */
	public int insertUmsScoreRecord(UmsScoreRecord umsScoreRecord);
	
	/**
     * 修改积分流水
     * 
     * @param umsScoreRecord 积分流水信息
     * @return 结果
     */
	public int updateUmsScoreRecord(UmsScoreRecord umsScoreRecord);
	
	/**
     * 删除积分流水
     * 
     * @param id 积分流水ID
     * @return 结果
     */
	public int deleteUmsScoreRecordById(Long id);
	
	/**
     * 批量删除积分流水
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteUmsScoreRecordByIds(String[] ids);
	
}