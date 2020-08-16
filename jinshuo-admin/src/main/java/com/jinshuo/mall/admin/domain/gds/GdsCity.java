package com.jinshuo.mall.admin.domain.gds;

import com.jinshuo.mall.admin.domain.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 表 gds_city
 * 
 * @author dyh
 * @date 2020-08-12
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GdsCity extends BaseEntity
{
	private static final long serialVersionUID = 1L;

	/**  */
	@ApiModelProperty("")
	private Long shopId;
	/**  */
	@ApiModelProperty("")
	private Long areaId;
	/**  */
	@ApiModelProperty("")
	private String areaProName;
	/**  */
	@ApiModelProperty("")
	private String areaName;
	/**  */
	@ApiModelProperty("")
	private String areaCode;
	/**  */
	@ApiModelProperty("")
	private Date openTime;
	/**  */
	@ApiModelProperty("")
	private String openBusiness;
}
