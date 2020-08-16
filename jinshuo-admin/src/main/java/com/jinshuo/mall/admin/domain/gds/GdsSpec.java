package com.jinshuo.mall.admin.domain.gds;

import com.jinshuo.mall.admin.domain.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 表 gds_spec
 * 
 * @author dyh
 * @date 2020-08-12
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GdsSpec extends BaseEntity
{
	private static final long serialVersionUID = 1L;

	/**  */
	@ApiModelProperty("")
	private Long shopId;
	/** 名称 */
	@ApiModelProperty("名称")
	private String name;
	/** 商品类别编号 */
	@ApiModelProperty("商品类别编号")
	private Long categoryId;
	/** 排序 */
	@ApiModelProperty("排序")
	private Integer sort;

}
