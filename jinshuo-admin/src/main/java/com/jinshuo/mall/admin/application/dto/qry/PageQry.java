package com.jinshuo.mall.admin.application.dto.qry;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Created by Administrator on 2020/8/10.
 */
@Data
public class PageQry {
    private Long id;

    @ApiModelProperty(value = "页码")
    private Integer pageNum = 0;

    @ApiModelProperty(value = "每页数量")
    private Integer pageSize = 10;
}
