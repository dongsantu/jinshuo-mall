package com.jinshuo.mall.admin.domain.gds;

import com.jinshuo.mall.admin.domain.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 表 gds_brand
 * 
 * @author dyh
 * @date 2020-08-12
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GdsBrand extends BaseEntity
{
	private static final long serialVersionUID = 1L;

	/** 名称 */
	@ApiModelProperty("名称")
	private String name;
	/** 图片地址 */
	@ApiModelProperty("图片地址")
	private String pictureUrl;
	/** 商品数量 */
	@ApiModelProperty("商品数量")
	private Integer itemNum;
	/** 排序 */
	@ApiModelProperty("排序")
	private Integer sort;

}
