package com.jinshuo.mall.admin.domain.gds;

import com.jinshuo.mall.admin.domain.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 表 gds_unit
 * 
 * @author dyh
 * @date 2020-08-12
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GdsUnit extends BaseEntity
{
	private static final long serialVersionUID = 1L;

	/** 名称 */
	@ApiModelProperty("名称")
	private String name;
	/**  */
	@ApiModelProperty("")
	private Integer sort;

}
