package com.jinshuo.mall.admin.domain.gds;

import com.jinshuo.mall.admin.domain.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 表 gds_category
 * 
 * @author dyh
 * @date 2020-08-12
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GdsCategory extends BaseEntity
{
	private static final long serialVersionUID = 1L;

	/** shopId */
	@ApiModelProperty("shopId")
	private Long shopId;
	/** 父ID */
	@ApiModelProperty("父ID")
	private Long pid;
	/** 是否叶子节点(0:是 1:否) */
	@ApiModelProperty("是否叶子节点(0:是 1:否)")
	private Integer leaf;
	/** 层级 */
	@ApiModelProperty("层级")
	private Integer level;
	/** 标题 */
	@ApiModelProperty("标题")
	private String name;
	/** 类目类型 */
	@ApiModelProperty("类目类型")
	private Integer cateType;
	/** 排序序列 */
	@ApiModelProperty("排序序列")
	private Integer orderSeq;
	/** 类目图片 */
	@ApiModelProperty("类目图片")
	private String pictureUrl;
	/** 后台类目id集合 */
	@ApiModelProperty("后台类目id集合")
	private String backCategories;
	/** 是否需要审核(0:是 1:否) */
	@ApiModelProperty("是否需要审核(0:是 1:否)")
	private Integer needAudit;
	/** 是否显示 */
	@ApiModelProperty("是否显示")
	private Integer isShow;
}
