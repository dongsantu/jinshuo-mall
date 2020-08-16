package com.jinshuo.mall.admin.domain.ums;

import com.jinshuo.mall.admin.domain.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 表 ums_visitor_log
 * 
 * @author dyh
 * @date 2020-08-12
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UmsVisitorLog extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	

	/** 0客户 1商家 2供应商 3店铺 4系统 */
	@ApiModelProperty("0客户 1商家 2供应商 3店铺 4系统")
	private Integer userType;
	/**  */
	@ApiModelProperty("")
	private Long userId;
	/**  */
	@ApiModelProperty("")
	private String ipAddr;
	/**  */
	@ApiModelProperty("")
	private Integer visitCount;
	/**  */
	@ApiModelProperty("")
	private Date visitFirstTime;
	/**  */
	@ApiModelProperty("")
	private Date visitLastTime;

}
