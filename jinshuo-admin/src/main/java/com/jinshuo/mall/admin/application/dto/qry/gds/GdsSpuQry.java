package com.jinshuo.mall.admin.application.dto.qry.gds;

import com.jinshuo.mall.admin.application.dto.qry.PageQry;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * Created by Administrator on 2020/8/12.
 */
@Data
public class GdsSpuQry extends PageQry {

    @ApiModelProperty(value = "查询类型 1：最新开抢 2：开抢预告  3:已结束抢购  4:即将结束抢购")
    private Integer qryType;

    @ApiModelProperty(value = "排序类型 1：销售价 2：销量  3：库存  4：添加时间 5：权重")
    private Integer sortType;

    @ApiModelProperty(value = "是否升序 0->升序  1(其他)->降序")
    private Integer isAscending;

    @ApiModelProperty(value = "商品状态 0=>销售中 1=>下架 3=>售罄 2=>预售 4=>未上架")
    private Integer goodsStatus;

    @ApiModelProperty(value = "品牌id")
    private Long brandId;

    @ApiModelProperty(value = "类目id")
    private Long categoryId;

    @ApiModelProperty(value = "商品名称")
    private String spuName;

    @ApiModelProperty(value = "标签")
    private List<Long> tags;

    @ApiModelProperty(value = "是否抢购商品")
    private Integer isScareBuy;

    @ApiModelProperty(value = "是否热门")
    private Integer isHot;

    @ApiModelProperty(value = "参与->0 不参与->1(分销)")
    private Integer isDis;

    @ApiModelProperty(value = "产品标签属性")
    private Long featureId;

    @ApiModelProperty(value = "供应商id")
    private Long supplierId;

    @ApiModelProperty(value = "标签")
    private Long tag;

    @ApiModelProperty(value = "地区")
    private String areaName;

    @ApiModelProperty(value = "是否单规格")
    private Integer singleSku;
}
