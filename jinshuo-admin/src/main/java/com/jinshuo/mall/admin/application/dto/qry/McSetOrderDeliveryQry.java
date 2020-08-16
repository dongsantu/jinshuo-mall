package com.jinshuo.mall.admin.application.dto.qry;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class McSetOrderDeliveryQry {

	@ApiModelProperty(value = "当前页")
    private Integer pageNum = 1;

    @ApiModelProperty(value = "每页条数")
    private Integer pageSize = 10;


    @ApiModelProperty(value = " 订单号")
    private String  orderNo;

    @ApiModelProperty(value = " 订单id")
	private Long  setOrderId;

    @ApiModelProperty(value = " apply_rice_num")
	private Integer  applyRiceNum;

    @ApiModelProperty(value = " 申请时间")
	private Date applyDate;

    @ApiModelProperty(value = " 申请状态")
	private Integer  applyStatus;

    @ApiModelProperty(value = "创建查询时间开始")
    private Date createStarTime;

    @ApiModelProperty(value = "创建查询时间结束")
    private Date createEndTime;

}

	
