package com.jinshuo.mall.admin.domain.ord;

import com.jinshuo.mall.admin.domain.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import lombok.NoArgsConstructor;
import io.swagger.annotations.ApiModelProperty;


/**
 * 订单收货地址表 ord_order_address
 *
 * @author dyh
 * @date 2020-08-07
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrdOrderAddress extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    @ApiModelProperty("id")
    private Long id;
    /**
     * 订单编号
     */
    @ApiModelProperty("id")
    private Long orderId;
    /**
     * 收货人名称
     */
    @ApiModelProperty("id")
    private String userName;
    /**
     * 收件人地址
     */
    @ApiModelProperty("id")
    private String userAddress;
    /**
     * 收件人手机号码
     */
    @ApiModelProperty("id")
    private String userPhone;

}
