package com.jinshuo.mall.admin.application.dto.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class McSetOrderDeliveryDto {

    @ApiModelProperty(value = "id")
    @JsonSerialize(using = ToStringSerializer.class)
	private Long id;

    @ApiModelProperty(value = "订单id")
    @JsonSerialize(using = ToStringSerializer.class)
    private Long  setOrderId;

    @ApiModelProperty(value = " 套餐订单信息")
	private String mcSetOrder;

    @ApiModelProperty(value = " 申请大米数量")
	private Integer  applyRiceNum;

    @ApiModelProperty(value = " 订单号")
    private String orderNo;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    @ApiModelProperty(value = " apply_date")
	private Date applyDate;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    @ApiModelProperty(value = " apply_date")
    private Date createDate;


    @ApiModelProperty(value = " apply_status")
	private Integer applyStatus;

    @ApiModelProperty(value = " 快递信息")
    private String goodsOrderExpress;
}

	
