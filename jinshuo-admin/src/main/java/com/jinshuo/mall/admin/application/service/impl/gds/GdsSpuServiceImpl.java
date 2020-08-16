package com.jinshuo.mall.admin.application.service.impl.gds;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jinshuo.mall.admin.application.dto.assermbler.GdsSpuAssermbler;
import com.jinshuo.mall.admin.application.dto.qry.gds.GdsSpuQry;
import com.jinshuo.mall.admin.application.dto.vo.gds.GdsSpuFrontVo;
import com.jinshuo.mall.admin.application.service.gds.IGdsSpuService;
import com.jinshuo.mall.admin.domain.gds.GdsSpu;
import com.jinshuo.mall.admin.infra.mapper.gds.GdsSpuMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


/**
 * 服务层实现
 *
 * @author dyh
 * @date 2020-08-12
 */
@Slf4j
@Service
public class GdsSpuServiceImpl implements IGdsSpuService {
    @Autowired(required = false)
    private GdsSpuMapper gdsSpuMapper;

    /**
     * 查询信息
     *
     * @param id ID
     * @return 信息
     */
    public GdsSpu selectGdsSpuById(Long id) {
        return gdsSpuMapper.selectGdsSpuById(id);
    }

    /**
     * 前端查询查询产品列表
     *
     * @param qry 信息
     * @return 集合
     */
    public PageInfo selectGdsSpuPage(GdsSpuQry qry) {
        log.info(" ----->>>>>>>> selectGdsSpuPage,前端查询订单信息，入参->{}: ", qry);
        PageHelper.startPage(qry.getPageNum(), qry.getPageSize());
        List<GdsSpu> gdsSpus = gdsSpuMapper.selectListByFront(qry);
        PageInfo pageInfo = new PageInfo(gdsSpus);
        List<GdsSpuFrontVo> vos = gdsSpus.stream().map(gdsSpu -> GdsSpuAssermbler.assGdsSpuFrontVo(gdsSpu)).collect(Collectors.toList());
        pageInfo.setList(vos);
        return pageInfo;
    }

    /**
     * 新增
     *
     * @param gdsSpu 信息
     * @return 结果
     */
    public int insertGdsSpu(GdsSpu gdsSpu) {
        gdsSpu.preInsert();
        return gdsSpuMapper.insertGdsSpu(gdsSpu);
    }

    /**
     * 修改
     *
     * @param gdsSpu 信息
     * @return 结果
     */
    public int updateGdsSpu(GdsSpu gdsSpu) {
        gdsSpu.preUpdate();
        return gdsSpuMapper.updateGdsSpu(gdsSpu);
    }

    /**
     * 删除对象
     *
     * @param id 需要删除的数据ID
     * @return 结果
     */
    public int deleteGdsSpuById(Long id) {
        return gdsSpuMapper.deleteGdsSpuById(id);
    }

}
