package com.jinshuo.mall.admin.domain.ums;

import com.jinshuo.mall.admin.domain.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 微信菜单表 ums_wx_menu
 * 
 * @author dyh
 * @date 2020-08-12
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UmsWxMenu extends BaseEntity
{
	private static final long serialVersionUID = 1L;

	/** 店铺id */
	@ApiModelProperty("店铺id")
	private Long shopId;
	/** 父节点id */
	@ApiModelProperty("父节点id")
	private Integer parentId;
	/** 名称 */
	@ApiModelProperty("名称")
	private String name;
	/** 链接 */
	@ApiModelProperty("链接")
	private String url;
	/** 类型 */
	@ApiModelProperty("类型")
	private String type;
	/** 层级 */
	@ApiModelProperty("层级")
	private Integer level;
	/** 排序 */
	@ApiModelProperty("排序")
	private Integer sort;

}
