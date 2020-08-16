package com.jinshuo.mall.admin.domain.gds;

import com.jinshuo.mall.admin.domain.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * 表 gds_mc_set
 * 
 * @author dyh
 * @date 2020-08-12
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GdsMcSet extends BaseEntity
{
	private static final long serialVersionUID = 1L;

	/**  */
	@ApiModelProperty("")
	private String title;
	/**  */
	@ApiModelProperty("")
	private String picture;
	/**  */
	@ApiModelProperty("")
	private BigDecimal originalPrice;
	/**  */
	@ApiModelProperty("")
	private BigDecimal price;
	/**  */
	@ApiModelProperty("")
	private Integer riceNum;
	/**  */
	@ApiModelProperty("")
	private Integer expiryDate;
	/**  */
	@ApiModelProperty("")
	private String detail;
	/**  */
	@ApiModelProperty("")
	private Integer salesNum;
	/**  */
	@ApiModelProperty("")
	private Integer vegetablesNum;

}
