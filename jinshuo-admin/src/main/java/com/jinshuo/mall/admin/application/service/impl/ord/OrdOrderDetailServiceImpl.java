package com.jinshuo.mall.admin.application.service.impl.ord;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jinshuo.mall.admin.application.dto.qry.ord.OrdOrderDetailQry;
import com.jinshuo.mall.admin.application.service.ord.IOrdOrderDetailService;
import com.jinshuo.mall.admin.domain.ord.OrdOrderDetail;
import com.jinshuo.mall.admin.infra.mapper.ord.OrdOrderDetailMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * 订单详情 服务层实现
 *
 * @author dyh
 * @date 2020-08-10
 */
@Service
public class OrdOrderDetailServiceImpl implements IOrdOrderDetailService {
    @Autowired(required = false)
    private OrdOrderDetailMapper ordOrderDetailMapper;

    /**
     * 查询订单详情信息
     *
     * @param id 订单详情ID
     * @return 订单详情信息
     */
    public OrdOrderDetail selectOrdOrderDetailById(Long id) {
        return ordOrderDetailMapper.selectOrdOrderDetailById(id);
    }

    /**
     * 查询订单详情列表
     *
     * @param qry 订单详情信息
     * @return 订单详情集合
     */
    public PageInfo selectOrdOrderDetailPage(OrdOrderDetailQry qry) {
        PageHelper.startPage(qry.getPageNum(), qry.getPageSize());
        OrdOrderDetail ordOrderDetail = new OrdOrderDetail();
        List<OrdOrderDetail> ordOrderDetails = ordOrderDetailMapper.selectOrdOrderDetailList(ordOrderDetail);
        PageInfo pageInfo = new PageInfo(ordOrderDetails);
        return pageInfo;
    }

    /**
     * 新增订单详情
     *
     * @param ordOrderDetail 订单详情信息
     * @return 结果
     */
    public int insertOrdOrderDetail(OrdOrderDetail ordOrderDetail) {
        ordOrderDetail.preInsert();
        return ordOrderDetailMapper.insertOrdOrderDetail(ordOrderDetail);
    }

    /**
     * 修改订单详情
     *
     * @param ordOrderDetail 订单详情信息
     * @return 结果
     */
    public int updateOrdOrderDetail(OrdOrderDetail ordOrderDetail) {
        ordOrderDetail.preUpdate();
        return ordOrderDetailMapper.updateOrdOrderDetail(ordOrderDetail);
    }

    /**
     * 删除订单详情对象
     *
     * @param id 需要删除的数据ID
     * @return 结果
     */
    public int deleteOrdOrderDetailById(Long id) {
        return ordOrderDetailMapper.deleteOrdOrderDetailById(id);
    }

}
