package com.jinshuo.mall.admin.domain.ums;

import com.jinshuo.mall.admin.domain.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 会员收货地址表 ums_member_address
 * 
 * @author dyh
 * @date 2020-08-12
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UmsMemberAddress extends BaseEntity
{
	private static final long serialVersionUID = 1L;

	/** 会员编号 */
	@ApiModelProperty("会员编号")
	private Long memId;
	/** 所在省 */
	@ApiModelProperty("所在省")
	private String province;
	/** 所在市 */
	@ApiModelProperty("所在市")
	private String city;
	/** 所在区县 */
	@ApiModelProperty("所在区县")
	private String districts;
	/** 详细地址 */
	@ApiModelProperty("详细地址")
	private String address;
	/** 收货人 */
	@ApiModelProperty("收货人")
	private String receiver;
	/** 联系手机 */
	@ApiModelProperty("联系手机")
	private String mobile;
	/** 是否默认收货地址 */
	@ApiModelProperty("是否默认收货地址")
	private Integer isDefault;

}
