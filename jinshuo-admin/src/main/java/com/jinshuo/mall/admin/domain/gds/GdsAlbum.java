package com.jinshuo.mall.admin.domain.gds;

import com.jinshuo.mall.admin.domain.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 表 gds_album
 *
 * @author dyh
 * @date 2020-08-12
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GdsAlbum extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * 商品编号
     */
    @ApiModelProperty("商品编号")
    private Long spuId;
    /**
     * 商品sku编号
     */
    @ApiModelProperty("商品sku编号")
    private Long skuId;
    /**
     * 图片地址
     */
    @ApiModelProperty("图片地址")
    private String url;
    /**
     * 资源类型
     */
    @ApiModelProperty("资源类型")
    private Integer type;
    /**
     * 排序
     */
    @ApiModelProperty("排序")
    private Integer sort;

}
