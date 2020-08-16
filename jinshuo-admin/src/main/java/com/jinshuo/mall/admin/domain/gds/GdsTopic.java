package com.jinshuo.mall.admin.domain.gds;

import com.jinshuo.mall.admin.domain.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 表 gds_topic
 * 
 * @author dyh
 * @date 2020-08-12
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GdsTopic extends BaseEntity
{
	private static final long serialVersionUID = 1L;

	/**  */
	@ApiModelProperty("")
	private Integer showType;
	/**  */
	@ApiModelProperty("")
	private String code;
	/** 1:活动  2:主题 */
	@ApiModelProperty("1:活动  2:主题")
	private Integer type;
	/**  */
	@ApiModelProperty("")
	private Integer sort;
	/**  */
	@ApiModelProperty("")
	private Long pid;
	/**  */
	@ApiModelProperty("")
	private Long shopId;
	/**  */
	@ApiModelProperty("")
	private String name;
	/**  */
	@ApiModelProperty("")
	private Date startTime;
	/**  */
	@ApiModelProperty("")
	private Date endTime;
	/**  */
	@ApiModelProperty("")
	private Integer topicStatus;
	/**  */
	@ApiModelProperty("")
	private String topicDesc;
	/**  */
	@ApiModelProperty("")
	private String mainPicture;
	/**  */
	@ApiModelProperty("")
	private String signPicture;
	/**  */
	@ApiModelProperty("")
	private String posterPicture;
	/**  */
	@ApiModelProperty("")
	private String color;
	/**  */
	@ApiModelProperty("")
	private Integer headingShowFlag;
	/** 字体颜色 */
	@ApiModelProperty("字体颜色")
	private String headingColor;
}
