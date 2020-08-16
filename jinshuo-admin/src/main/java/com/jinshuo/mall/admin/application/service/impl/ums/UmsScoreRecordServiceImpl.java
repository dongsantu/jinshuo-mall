package com.jinshuo.mall.admin.application.service.impl.ums;

import com.github.pagehelper.PageInfo;
import com.jinshuo.mall.admin.application.service.ums.IUmsScoreRecordService;
import com.jinshuo.mall.admin.domain.ums.UmsScoreRecord;
import com.jinshuo.mall.admin.infra.mapper.ums.UmsScoreRecordMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 积分流水 服务层实现
 * 
 * @author dyh
 * @date 2020-08-12
 */
@Service
public class UmsScoreRecordServiceImpl implements IUmsScoreRecordService
{
	@Autowired(required = false)
	private UmsScoreRecordMapper umsScoreRecordMapper;

	/**
     * 查询积分流水信息
     * 
     * @param id 积分流水ID
     * @return 积分流水信息
     */
	public UmsScoreRecord selectUmsScoreRecordById(Long id)
	{
	    return umsScoreRecordMapper.selectUmsScoreRecordById(id);
	}
	
	/**
     * 查询积分流水列表
     * 
     * @param qry 积分流水信息
     * @return 积分流水集合
     */
	public PageInfo selectUmsScoreRecordPage(UmsScoreRecord qry)
	{
        /*PageHelper.startPage(qry.getPageNum(), qry.getPageSize());
		UmsScoreRecord umsScoreRecord = new UmsScoreRecord();
        List<UmsScoreRecord> umsScoreRecords = umsScoreRecordMapper.selectUmsScoreRecordList(umsScoreRecord);
        PageInfo pageInfo = new PageInfo(umsScoreRecords);
	    return pageInfo;*/
		return null;
	}
	
    /**
     * 新增积分流水
     * 
     * @param umsScoreRecord 积分流水信息
     * @return 结果
     */
	public int insertUmsScoreRecord(UmsScoreRecord umsScoreRecord)
	{
		umsScoreRecord.preInsert();
	    return umsScoreRecordMapper.insertUmsScoreRecord(umsScoreRecord);
	}
	
	/**
     * 修改积分流水
     * 
     * @param umsScoreRecord 积分流水信息
     * @return 结果
     */
	public int updateUmsScoreRecord(UmsScoreRecord umsScoreRecord)
	{
	    umsScoreRecord.preUpdate();
	    return umsScoreRecordMapper.updateUmsScoreRecord(umsScoreRecord);
	}

	/**
     * 删除积分流水对象
     * 
     * @param id 需要删除的数据ID
     * @return 结果
     */
	public int deleteUmsScoreRecordById(Long id)
	{
		return umsScoreRecordMapper.deleteUmsScoreRecordById(id);
	}
	
}
