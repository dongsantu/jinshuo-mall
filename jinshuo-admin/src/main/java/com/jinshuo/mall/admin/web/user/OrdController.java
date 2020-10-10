package com.jinshuo.mall.admin.web.user;

import com.jinshuo.mall.admin.application.service.ord.IOrdOrderService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2020/8/16.
 */
@Slf4j
@RestController
@Api(tags = "用户—订单接口")
@RequestMapping("/v1/h5/user/ordmain")
public class OrdController {

    @Autowired
    private IOrdOrderService ordOrderService;

 /*   @PostMapping("/createOrder")
    @ApiOperation("创建订单")
    public WrapperResponse createOrder(@Valid @RequestBody GdsOrderCmd cmd) {
        return WrapperResponse.success(gdsOrderService.createOrder(cmd));
    }*/
}
