package com.jinshuo.mall.admin.domain.ums;

import com.jinshuo.mall.admin.domain.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 表 ums_mer_menu
 * 
 * @author dyh
 * @date 2020-08-12
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UmsMerMenu extends BaseEntity
{
	private static final long serialVersionUID = 1L;

	/**  */
	@ApiModelProperty("")
	private Long merchantId;
	/**  */
	@ApiModelProperty("")
	private Long shopId;
	/** 角色id */
	@ApiModelProperty("角色id")
	private Long roleId;
	/**  */
	@ApiModelProperty("")
	private Long menuId;

}
