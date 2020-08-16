package com.jinshuo.mall.admin.domain.ord;

import com.jinshuo.mall.admin.domain.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 表 ord_express
 *
 * @author dyh
 * @date 2020-08-07
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrdExpress extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * 快递名称
     */
    @ApiModelProperty("id")
    private String expressCompanyName;
    /**
     * 快递单号
     */
    @ApiModelProperty("id")
    private String expressNo;
    /**
     * 快递编码
     */
    @ApiModelProperty("id")
    private String expressCode;
    /**
     * 订单id
     */
    @ApiModelProperty("id")
    private Long orderId;

}
