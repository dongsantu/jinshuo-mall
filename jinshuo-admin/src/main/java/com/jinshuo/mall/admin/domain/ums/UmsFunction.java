package com.jinshuo.mall.admin.domain.ums;

import com.jinshuo.mall.admin.domain.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 用户店铺关联表 ums_function
 * 
 * @author dyh
 * @date 2020-08-12
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UmsFunction extends BaseEntity
{
	private static final long serialVersionUID = 1L;

	/** 功能名称 */
	@ApiModelProperty("功能名称")
	private String functionName;
	/** 模块编码 */
	@ApiModelProperty("模块编码")
	private String functionCode;

}
