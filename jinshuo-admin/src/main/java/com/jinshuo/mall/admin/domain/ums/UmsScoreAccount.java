package com.jinshuo.mall.admin.domain.ums;

import com.jinshuo.mall.admin.domain.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * 会员积分账户表 ums_score_account
 * 
 * @author dyh
 * @date 2020-08-12
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UmsScoreAccount extends BaseEntity
{
	private static final long serialVersionUID = 1L;

	/** 会员编号 */
	@ApiModelProperty("会员编号")
	private Long memId;
	/** 总积分 */
	@ApiModelProperty("总积分")
	private Integer totalScore;
	/** 消耗积分 */
	@ApiModelProperty("消耗积分")
	private Integer expendScore;
	/** 可用积分 */
	@ApiModelProperty("可用积分")
	private Integer useableScore;
}
