package com.jinshuo.mall.admin.domain.ums;

import com.jinshuo.mall.admin.domain.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 我的收藏表 ums_member_collect
 * 
 * @author dyh
 * @date 2020-08-12
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UmsMemberCollect extends BaseEntity
{
	private static final long serialVersionUID = 1L;

	/** 会员编号 */
	@ApiModelProperty("会员编号")
	private Long memId;
	/** 收藏类型 */
	@ApiModelProperty("收藏类型")
	private Integer type;
	/** 收藏对象编号 */
	@ApiModelProperty("收藏对象编号")
	private Long targetId;

}
