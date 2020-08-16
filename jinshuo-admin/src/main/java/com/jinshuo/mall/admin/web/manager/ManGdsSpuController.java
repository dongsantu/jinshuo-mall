package com.jinshuo.mall.admin.web.manager;

import com.jinshuo.mall.admin.application.service.gds.IGdsSpuService;
import com.jinshuo.mall.admin.domain.gds.GdsSpu;
import com.jinshuo.mall.core.response.WrapperResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2020/8/12.
 */
@Slf4j
@RestController
@Api(description = "产品中心主接口")
@RequestMapping("/v1/h5/user/gdsmain")
public class ManGdsSpuController {

    @Autowired
    private IGdsSpuService spuService;

    @PostMapping(value = "/saveGdsSpu")
    @ApiOperation(httpMethod = "POST", value = "保存产品")
    public WrapperResponse saveGdsSpu(@RequestBody GdsSpu gdsSpu) {
        return WrapperResponse.success(spuService.insertGdsSpu(gdsSpu));
    }
}
