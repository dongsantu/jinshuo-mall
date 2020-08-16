package com.jinshuo.mall.admin.application.service.impl.ord;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jinshuo.mall.admin.application.dto.qry.ord.OrdExpressCodeQry;
import com.jinshuo.mall.admin.application.service.ord.IOrdExpressCodeService;
import com.jinshuo.mall.admin.domain.ord.OrdExpressCode;
import com.jinshuo.mall.admin.infra.mapper.ord.OrdExpressCodeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 *  服务层实现
 * 
 * @author dyh
 * @date 2020-08-10
 */
@Service
public class OrdExpressCodeServiceImpl implements IOrdExpressCodeService
{
	@Autowired(required = false)
	private OrdExpressCodeMapper ordExpressCodeMapper;

	/**
     * 查询信息
     * 
     * @param id ID
     * @return 信息
     */
	public OrdExpressCode selectOrdExpressCodeById(Long id)
	{
	    return ordExpressCodeMapper.selectOrdExpressCodeById(id);
	}
	
	/**
     * 查询列表
     * 
     * @param qry 信息
     * @return 集合
     */
	public PageInfo selectOrdExpressCodePage(OrdExpressCodeQry qry)
	{
        PageHelper.startPage(qry.getPageNum(), qry.getPageSize());
		OrdExpressCode ordExpressCode = new OrdExpressCode();
        List<OrdExpressCode> ordExpressCodes = ordExpressCodeMapper.selectOrdExpressCodeList(ordExpressCode);
        PageInfo pageInfo = new PageInfo(ordExpressCodes);
	    return pageInfo;
	}
	
    /**
     * 新增
     * 
     * @param ordExpressCode 信息
     * @return 结果
     */
	public int insertOrdExpressCode(OrdExpressCode ordExpressCode)
	{
		ordExpressCode.preInsert();
	    return ordExpressCodeMapper.insertOrdExpressCode(ordExpressCode);
	}
	
	/**
     * 修改
     * 
     * @param ordExpressCode 信息
     * @return 结果
     */
	public int updateOrdExpressCode(OrdExpressCode ordExpressCode)
	{
	    ordExpressCode.preUpdate();
	    return ordExpressCodeMapper.updateOrdExpressCode(ordExpressCode);
	}

	/**
     * 删除对象
     * 
     * @param id 需要删除的数据ID
     * @return 结果
     */
	public int deleteOrdExpressCodeById(Long id)
	{
		return ordExpressCodeMapper.deleteOrdExpressCodeById(id);
	}
	
}
