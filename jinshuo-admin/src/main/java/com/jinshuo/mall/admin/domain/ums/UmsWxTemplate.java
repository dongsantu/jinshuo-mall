package com.jinshuo.mall.admin.domain.ums;

import com.jinshuo.mall.admin.domain.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 微信配置表 ums_wx_template
 * 
 * @author dyh
 * @date 2020-08-12
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UmsWxTemplate extends BaseEntity
{
	private static final long serialVersionUID = 1L;

	private Long id;
	/** 店铺id */
	@ApiModelProperty("店铺id")
	private Long shopId;
	/** 模板名称 */
	@ApiModelProperty("模板名称")
	private String templateName;
	/** 模板id */
	@ApiModelProperty("模板id")
	private String templateId;
	/** 模板类型 1:购买成功通知 2：实物发货通知通知 3：虚拟发码通知 */
	@ApiModelProperty("模板类型 1:购买成功通知 2：实物发货通知通知 3：虚拟发码通知")
	private Integer templateType;
	/** 平台秘钥 */
	@ApiModelProperty("平台秘钥")
	private String templateContent;
	/** 模板编号 */
	@ApiModelProperty("模板编号")
	private String templateCode;
}
