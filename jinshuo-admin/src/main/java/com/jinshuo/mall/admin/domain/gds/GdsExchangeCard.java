package com.jinshuo.mall.admin.domain.gds;

import com.jinshuo.mall.admin.domain.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 表 gds_exchange_card
 * 
 * @author dyh
 * @date 2020-08-12
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GdsExchangeCard extends BaseEntity
{
	private static final long serialVersionUID = 1L;

	/**  */
	@ApiModelProperty("")
	private Long exchangeId;
	/**  */
	@ApiModelProperty("")
	private Long cardSeq;
	/**  */
	@ApiModelProperty("")
	private String cardNo;
	/**  */
	@ApiModelProperty("")
	private String cardPwd;
	/**  */
	@ApiModelProperty("")
	private Integer cardStatus;
	/**  */
	@ApiModelProperty("")
	private Date useTime;
	/**  */
	@ApiModelProperty("")
	private Integer activationStatus;
	/**  */
	@ApiModelProperty("")
	private Date activationTime;
	/**  */
	@ApiModelProperty("")
	private Date exchangeDate;

}
