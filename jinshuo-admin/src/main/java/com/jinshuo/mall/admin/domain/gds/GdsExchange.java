package com.jinshuo.mall.admin.domain.gds;

import com.jinshuo.mall.admin.domain.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 表 gds_exchange
 * 
 * @author dyh
 * @date 2020-08-12
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GdsExchange extends BaseEntity
{
	private static final long serialVersionUID = 1L;

	/**  */
	@ApiModelProperty("")
	private Long shopId;
	/**  */
	@ApiModelProperty("")
	private String name;
	/**  */
	@ApiModelProperty("")
	private String logo;
	/**  */
	@ApiModelProperty("")
	private String spec;
	/**  */
	@ApiModelProperty("")
	private Integer count;
	/**  */
	@ApiModelProperty("")
	private Date starDate;
	/**  */
	@ApiModelProperty("")
	private Date endDate;
	/**  */
	@ApiModelProperty("")
	private BigDecimal faceValue;

}
