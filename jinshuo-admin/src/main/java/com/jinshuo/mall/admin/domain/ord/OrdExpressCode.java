package com.jinshuo.mall.admin.domain.ord;

import com.jinshuo.mall.admin.domain.BaseEntity;
import com.jinshuo.mall.core.model.IdentifiedEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import lombok.NoArgsConstructor;
import io.swagger.annotations.ApiModelProperty;

/**
 * 表 ord_express_code
 * 
 * @author dyh
 * @date 2020-08-07
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrdExpressCode extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/**  */
	@ApiModelProperty("id")
	private Long id;
	/** 快递名称 */
	@ApiModelProperty("id")
	private String expressCompanyName;
	/** 快递单号 */
	@ApiModelProperty("id")
	private String expressCode;
}
