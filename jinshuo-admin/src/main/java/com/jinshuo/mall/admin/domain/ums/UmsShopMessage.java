package com.jinshuo.mall.admin.domain.ums;

import com.jinshuo.mall.admin.domain.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 表 ums_shop_message
 * 
 * @author dyh
 * @date 2020-08-12
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UmsShopMessage extends BaseEntity
{
	private static final long serialVersionUID = 1L;

	/**  */
	@ApiModelProperty("")
	private Long shopId;
	/**  */
	@ApiModelProperty("")
	private String username;
	/**  */
	@ApiModelProperty("")
	private String password;
	/**  */
	@ApiModelProperty("")
	private String signName;
	/**  */
	@ApiModelProperty("")
	private Integer total;
	/**  */
	@ApiModelProperty("")
	private Integer used;
	/**  */
	@ApiModelProperty("")
	private Integer remaining;

}
