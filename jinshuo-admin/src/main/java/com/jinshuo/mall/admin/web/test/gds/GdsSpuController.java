package com.jinshuo.mall.admin.web.test.gds;

import com.jinshuo.mall.admin.application.dto.qry.gds.GdsSpuQry;
import com.jinshuo.mall.admin.application.service.gds.IGdsSpuService;
import com.jinshuo.mall.admin.domain.gds.GdsSpu;
import com.jinshuo.mall.core.response.WrapperResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * 信息操作处理
 *
 * @author dyh
 * @date 2020-08-12
 */
@RestController
@RequestMapping("/v1/wx/user/gdsSpu")
@Api(tags = "")
@Slf4j
public class GdsSpuController {

    @Autowired
    private IGdsSpuService gdsSpuService;


    /**
     * 查询列表
     */
    @PostMapping("/listGdsSpu")
    @ApiOperation(value = "列表", notes = "列表")
    public WrapperResponse listGdsSpu(@Valid @RequestBody GdsSpuQry qry) {
        return WrapperResponse.success(gdsSpuService.selectGdsSpuPage(qry));
    }

    /**
     * 新增保存
     */
    @PostMapping("/addGdsSpu")
    @ApiOperation(value = "新增", notes = "新增")
    public WrapperResponse addGdsSpu(@Valid @RequestBody GdsSpu gdsSpu) {
        return WrapperResponse.success(gdsSpuService.insertGdsSpu(gdsSpu));
    }

    /**
     * 修改保存
     */
    @PostMapping("/editGdsSpu")
    @ApiOperation(value = "修改", notes = "修改")
    public WrapperResponse editSaveGdsSpu(@Valid @RequestBody GdsSpu gdsSpu) {
        return WrapperResponse.success(gdsSpuService.updateGdsSpu(gdsSpu));
    }

    /**
     * 删除
     */
    @PostMapping("/removeGdsSpu/{id}")
    @ApiOperation(value = "删除", notes = "删除")
    public WrapperResponse removeGdsSpu(@PathVariable(value = "id") Long id) {
        return WrapperResponse.success(gdsSpuService.deleteGdsSpuById(id));
    }

}
