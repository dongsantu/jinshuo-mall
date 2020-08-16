package com.jinshuo.mall.admin.domain.ord;

import com.jinshuo.mall.admin.domain.BaseEntity;
import com.jinshuo.mall.core.model.IdentifiedEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import lombok.NoArgsConstructor;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 表 ord_cart_item
 *
 * @author dyh
 * @date 2020-08-07
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrdCartItem extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**  */
    @ApiModelProperty("id")
    private Long cartId;
    /**  */
    @ApiModelProperty("id")
    private Long spuId;
    /**  */
    @ApiModelProperty("id")
    private Long skuId;
    /**  */
    @ApiModelProperty("id")
    private BigDecimal goodsPrice;
    /**  */
    @ApiModelProperty("id")
    private BigDecimal addPrice;
    /**  */
    @ApiModelProperty("id")
    private Integer quantity;
    /**  */
    @ApiModelProperty("id")
    private Date addTime;
}
