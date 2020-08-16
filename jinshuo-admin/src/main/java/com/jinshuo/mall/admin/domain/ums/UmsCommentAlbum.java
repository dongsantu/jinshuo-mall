package com.jinshuo.mall.admin.domain.ums;

import com.jinshuo.mall.admin.domain.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * 评论相册表 ums_comment_album
 * 
 * @author dyh
 * @date 2020-08-12
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UmsCommentAlbum extends BaseEntity
{
	private static final long serialVersionUID = 1L;

	/** 评论编号 */
	@ApiModelProperty("评论编号")
	private Long commentId;
	/** 图片 */
	@ApiModelProperty("图片")
	private String url;
}
