package com.jinshuo.mall.admin.domain.ums;

import com.jinshuo.mall.admin.domain.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 会员表 ums_member
 * 
 * @author dyh
 * @date 2020-08-12
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UmsMember extends BaseEntity
{
	private static final long serialVersionUID = 1L;

	/** 邀请码 */
	@ApiModelProperty("邀请码")
	private String inviteCode;
	/** 登陆账号 */
	@ApiModelProperty("登陆账号")
	private Long username;
	/** 登陆密码 */
	@ApiModelProperty("登陆密码")
	private String password;
	/** shop_id */
	@ApiModelProperty("shop_id")
	private Long shopId;
	/** rank_id */
	@ApiModelProperty("rank_id")
	private Long rankId;
	/** 客户号 */
	@ApiModelProperty("客户号")
	private String memNo;
	/** 客户名称 */
	@ApiModelProperty("客户名称")
	private String name;
	/** 证件类型 */
	@ApiModelProperty("证件类型")
	private Integer cardType;
	/** 证件号码 */
	@ApiModelProperty("证件号码")
	private String cardId;
	/** 真实姓名 */
	@ApiModelProperty("真实姓名")
	private String surname;
	/** 最后登录ip */
	@ApiModelProperty("最后登录ip")
	private String loginIp;
	/** 最后登录时间 */
	@ApiModelProperty("最后登录时间")
	private Date loginAt;
	/** 手机号 */
	@ApiModelProperty("手机号")
	private String mobile;
	/** email */
	@ApiModelProperty("email")
	private String email;
	/** 微信号 */
	@ApiModelProperty("微信号")
	private String weixin;
	/** 1、粉丝；2、会员；3、普通会员；4、分销员 */
	@ApiModelProperty("1、粉丝；2、会员；3、普通会员；4、分销员")
	private Integer type;
	/** 1、微信；2、小程序；3、app；4、PC；5、手工录入 */
	@ApiModelProperty("1、微信；2、小程序；3、app；4、PC；5、手工录入")
	private Integer sourceCanal;
	/** 会员等级 */
	@ApiModelProperty("会员等级")
	private Integer level;
	/** 性别 */
	@ApiModelProperty("性别")
	private Integer sex;
	/** 头像 */
	@ApiModelProperty("头像")
	private String avatar;
	/** 年龄 */
	@ApiModelProperty("年龄")
	private Integer age;
	/** 出生年月日 */
	@ApiModelProperty("出生年月日")
	private String birthday;
	/** 用户所在国家 */
	@ApiModelProperty("用户所在国家")
	private String country;
	/** 用户所在省份 */
	@ApiModelProperty("用户所在省份")
	private String province;
	/** 用户所在城市 */
	@ApiModelProperty("用户所在城市")
	private String city;
	/** 1、是；0、不是 */
	@ApiModelProperty("1、是；0、不是")
	private Integer isDis;
	/** 是否粉丝0：不是 1：是 */
	@ApiModelProperty("是否粉丝0：不是 1：是")
	private Integer isFans;
	/** 上级用户 */
	@ApiModelProperty("上级用户")
	private Long pid;
	/** 父类绑定时间 */
	@ApiModelProperty("父类绑定时间")
	private Date pidTime;
	/** 成为团长时间 */
	@ApiModelProperty("成为团长时间")
	private Date commanderTime;
	/** 消费总额 */
	@ApiModelProperty("消费总额")
	private BigDecimal consumeAmount;
	/** 消费订单数 */
	@ApiModelProperty("消费订单数")
	private Integer consumeOrder;
	/** 最近消费时间 */
	@ApiModelProperty("最近消费时间")
	private Date consumeTime;
	/** 关注时间 */
	@ApiModelProperty("关注时间")
	private Date subscribeTime;

}
