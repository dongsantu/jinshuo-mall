package com.jinshuo.mall.admin.infra.mapper.gds;

import com.jinshuo.mall.admin.application.dto.qry.gds.GdsSpuQry;
import com.jinshuo.mall.admin.domain.gds.GdsSpu;

import java.util.List;

/**
 * 数据层
 *
 * @author dyh
 * @date 2020-08-12
 */
public interface GdsSpuMapper {
    /**
     * 查询信息
     *
     * @param id ID
     * @return 信息
     */
    GdsSpu selectGdsSpuById(Long id);

    /**
     * 查询列表
     *
     * @param gdsSpu 信息
     * @return 集合
     */
    List<GdsSpu> selectGdsSpuList(GdsSpu gdsSpu);

    /**
     * 新增
     *
     * @param gdsSpu 信息
     * @return 结果
     */
    int insertGdsSpu(GdsSpu gdsSpu);

    /**
     * 修改
     *
     * @param gdsSpu 信息
     * @return 结果
     */
    int updateGdsSpu(GdsSpu gdsSpu);

    /**
     * 删除
     *
     * @param id ID
     * @return 结果
     */
    int deleteGdsSpuById(Long id);

    /**
     * 批量删除
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    int deleteGdsSpuByIds(String[] ids);

    /**
     * 查询列表
     *
     * @param gdsSpu 信息
     * @return 集合
     */
    List<GdsSpu> selectGdsSpuListByQry(GdsSpu gdsSpu);


    /**
     * 查询列表
     *
     * @param qry 信息
     * @return 集合
     */
    List<GdsSpu> selectListByFront(GdsSpuQry qry);

}