package com.jinshuo.mall.admin.web.user;

import com.alibaba.fastjson.JSONObject;
import com.jinshuo.mall.admin.application.dto.qry.gds.GdsSpuQry;
import com.jinshuo.mall.admin.application.service.gds.IGdsSpuService;
import com.jinshuo.mall.core.response.WrapperResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Administrator on 2020/8/12.
 */
@Slf4j
@RestController
@Api(description = "产品中心主接口")
@RequestMapping("/v1/h5/user/gdsmain")
public class PublicGdsSpuController {

    @Autowired
    private IGdsSpuService spuService;

    @PostMapping(value = "/queryGdsSpuPage")
    @ApiOperation(httpMethod = "POST", value = "分页查询产品信息")
    public WrapperResponse queryGdsSpuPage(@RequestBody GdsSpuQry qry) {
        log.info(" -- 用户分页查询产品信息查询条件：" + JSONObject.toJSONString(qry));
        return WrapperResponse.success(spuService.selectGdsSpuPage(qry));
    }

    @PostMapping(value = "/queryGdsSpuDetail/{id}")
    @ApiOperation(httpMethod = "POST", value = "查询产品详情")
    public WrapperResponse getProducts(@PathVariable(value = "id") Long id) {
        return WrapperResponse.success(spuService.selectGdsSpuById(id));
    }

}
