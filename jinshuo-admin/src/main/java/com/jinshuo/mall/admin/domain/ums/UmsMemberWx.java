package com.jinshuo.mall.admin.domain.ums;

import com.jinshuo.mall.admin.domain.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 微信账户表 ums_member_wx
 * 
 * @author dyh
 * @date 2020-08-12
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UmsMemberWx extends BaseEntity
{
	private static final long serialVersionUID = 1L;

	/** 账户编号 */
	@ApiModelProperty("账户编号")
	private Long userId;
	/** 1:公众号 2：小程序 */
	@ApiModelProperty("1:公众号 2：小程序")
	private Integer type;
	/** 昵称 */
	@ApiModelProperty("昵称")
	private String nickname;
	/** uinonId */
	@ApiModelProperty("uinonId")
	private String unionid;
	/** 微信openid */
	@ApiModelProperty("微信openid")
	private String openid;
	/** 头像 */
	@ApiModelProperty("头像")
	private String avatar;
	/** 性别 */
	@ApiModelProperty("性别")
	private Integer sex;
	/** 店铺id */
	@ApiModelProperty("店铺id")
	private Long shopId;

}
