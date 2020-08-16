package com.jinshuo.mall.admin.domain.ums;

import com.jinshuo.mall.admin.domain.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 表 ums_menu
 * 
 * @author dyh
 * @date 2020-08-12
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UmsMenu extends BaseEntity
{
	private static final long serialVersionUID = 1L;

	/** 菜单类型 1:一级菜单 2:二级菜单 3:三级菜单 */
	@ApiModelProperty("菜单类型 1:一级菜单 2:二级菜单 3:三级菜单")
	private Integer menuRank;
	/** 1:系统 2：菜单 3：按钮 */
	@ApiModelProperty("1:系统 2：菜单 3：按钮")
	private Integer menuType;
	/** 菜单名称 */
	@ApiModelProperty("菜单名称")
	private String menuName;
	/** 0正常 1停用 */
	@ApiModelProperty("0正常 1停用")
	private Integer menuStatus;
	/** 排序 */
	@ApiModelProperty("排序")
	private Integer sort;
	/** 上级id */
	@ApiModelProperty("上级id")
	private String pid;
	/** 菜单描述 */
	@ApiModelProperty("菜单描述")
	private String menuDesc;
	/** 菜单代码 */
	@ApiModelProperty("菜单代码")
	private String menuCode;

}
