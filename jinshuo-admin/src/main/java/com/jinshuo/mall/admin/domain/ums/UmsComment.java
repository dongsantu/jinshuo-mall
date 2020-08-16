package com.jinshuo.mall.admin.domain.ums;

import com.jinshuo.mall.admin.domain.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 用户评论表 ums_comment
 * 
 * @author dyh
 * @date 2020-08-12
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UmsComment extends BaseEntity
{
	private static final long serialVersionUID = 1L;

	/** 订单编号 */
	@ApiModelProperty("订单编号")
	private Long orderId;
	/** 产品编号 */
	@ApiModelProperty("产品编号")
	private Long spuId;
	/** 用户编号 */
	@ApiModelProperty("用户编号")
	private Long memberId;
	/** 1、商品；2、酒店；3、门票 */
	@ApiModelProperty("1、商品；2、酒店；3、门票")
	private Integer type;
	/** 评论内容 */
	@ApiModelProperty("评论内容")
	private String content;
	/** 1：待审核,2、显示3、隐藏 */
	@ApiModelProperty("1：待审核,2、显示3、隐藏")
	private Integer commentStatus;
	/** 审核员编号 */
	@ApiModelProperty("审核员编号")
	private Long auditorId;
	/** 审核时间 */
	@ApiModelProperty("审核时间")
	private Date auditorTime;
	/** 审核备注 */
	@ApiModelProperty("审核备注")
	private String auditorRemaks;
}
