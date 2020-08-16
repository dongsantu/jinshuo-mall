package com.jinshuo.mall.admin.domain.ord;

import com.jinshuo.mall.admin.domain.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import lombok.NoArgsConstructor;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 表 ord_cart
 *
 * @author dyh
 * @date 2020-08-07
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrdCart extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**  */
    @ApiModelProperty("id")
    private Long shopId;
    /**  */
    @ApiModelProperty("id")
    private Long userId;
    /**  */
    @ApiModelProperty("id")
    private Integer quantity;
    /**  */
    @ApiModelProperty("id")
    private BigDecimal totalMoney;
}
