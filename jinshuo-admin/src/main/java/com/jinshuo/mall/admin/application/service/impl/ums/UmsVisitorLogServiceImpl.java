package com.jinshuo.mall.admin.application.service.impl.ums;

import com.github.pagehelper.PageInfo;
import com.jinshuo.mall.admin.application.service.ums.IUmsVisitorLogService;
import com.jinshuo.mall.admin.domain.ums.UmsVisitorLog;
import com.jinshuo.mall.admin.infra.mapper.ums.UmsVisitorLogMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 *  服务层实现
 * 
 * @author dyh
 * @date 2020-08-12
 */
@Service
public class UmsVisitorLogServiceImpl implements IUmsVisitorLogService
{
	@Autowired(required = false)
	private UmsVisitorLogMapper umsVisitorLogMapper;

	/**
     * 查询信息
     * 
     * @param id ID
     * @return 信息
     */
	public UmsVisitorLog selectUmsVisitorLogById(Long id)
	{
	    return umsVisitorLogMapper.selectUmsVisitorLogById(id);
	}
	
	/**
     * 查询列表
     * 
     * @param qry 信息
     * @return 集合
     */
	public PageInfo selectUmsVisitorLogPage(UmsVisitorLog qry)
	{
        /*PageHelper.startPage(qry.getPageNum(), qry.getPageSize());
		UmsVisitorLog umsVisitorLog = new UmsVisitorLog();
        List<UmsVisitorLog> umsVisitorLogs = umsVisitorLogMapper.selectUmsVisitorLogList(umsVisitorLog);
        PageInfo pageInfo = new PageInfo(umsVisitorLogs);
	    return pageInfo;*/
		return null;
	}
	
    /**
     * 新增
     * 
     * @param umsVisitorLog 信息
     * @return 结果
     */
	public int insertUmsVisitorLog(UmsVisitorLog umsVisitorLog)
	{
		umsVisitorLog.preInsert();
	    return umsVisitorLogMapper.insertUmsVisitorLog(umsVisitorLog);
	}
	
	/**
     * 修改
     * 
     * @param umsVisitorLog 信息
     * @return 结果
     */
	public int updateUmsVisitorLog(UmsVisitorLog umsVisitorLog)
	{
	    umsVisitorLog.preUpdate();
	    return umsVisitorLogMapper.updateUmsVisitorLog(umsVisitorLog);
	}

	/**
     * 删除对象
     * 
     * @param id 需要删除的数据ID
     * @return 结果
     */
	public int deleteUmsVisitorLogById(Long id)
	{
		return umsVisitorLogMapper.deleteUmsVisitorLogById(id);
	}
	
}
