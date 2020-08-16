package com.jinshuo.mall.admin.domain.ums;

import com.jinshuo.mall.admin.domain.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * 积分流水表 ums_score_record
 * 
 * @author dyh
 * @date 2020-08-12
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UmsScoreRecord extends BaseEntity
{
	private static final long serialVersionUID = 1L;

	/** 会员编号 */
	@ApiModelProperty("会员编号")
	private Long memId;
	/** 目标类型 */
	@ApiModelProperty("目标类型")
	private Integer tragetType;
	/** 目标id */
	@ApiModelProperty("目标id")
	private Long tragetId;
	/** 1、增加；2、消费 */
	@ApiModelProperty("1、增加；2、消费")
	private Integer type;
	/** 积分值 */
	@ApiModelProperty("积分值")
	private Integer score;
	/** 积分来源 */
	@ApiModelProperty("积分来源")
	private Integer expendScosourceType;
	/** 来源详情 */
	@ApiModelProperty("来源详情")
	private String sourceMemo;
}
