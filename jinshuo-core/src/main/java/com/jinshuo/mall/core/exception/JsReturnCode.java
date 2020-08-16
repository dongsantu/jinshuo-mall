package com.jinshuo.mall.core.exception;

/**
 * @Classname JsReturnCode
 * @Description TODO
 * @Date 2019/6/20 17:36
 * @Created by dyh
 */
public enum JsReturnCode implements ReturnCode {

    WS205001(205001, "获取用户信息失败！"),
    WS205002(205002, "获取粉丝列表openid失败"),
    WS205003(205003, "获取粉丝信息列表失败"),
    WS205004(205004, "获取access_token失败"),
    WS205005(205005, "获取网页授权access_token失败"),
    WS205006(205006, "获取网页授权用户信息失败"),
    WS205007(205007, "创建菜单失败"),
    WS205008(205008, "创建带参数二维码信息失败"),
    WS205009(205009, "获取素材列表失败"),
    WS205010(205010, "获取第三方平台预售码失败"),
    WS205011(205011, "获取第三方平台令牌失败"),
    WS205012(205012, "获取第三方平台授权信息失败"),
    WS205013(205013, "获取第三方平台获取/刷新接口调用令牌失败"),
    WS205014(205014, "获取JS-SDK jsapi_ticket失败"),
    WS205015(205015, "发送模板消息失败"),
    WS205016(205016, "获取小程序acceess_token失败"),
    WS205017(205017, "小程序码生成失败"),
    WS205018(205018, "推送小程序订阅消息失败"),
    WS205019(205019, "获取小程序基本信息失败"),
    WS205020(205020, "设置服务器域名失败"),
    WS205021(205021, "设置业务域名失败"),
    WS205022(205022, "绑定体验者失败"),
    WS205023(205023, "解除绑定体验者失败"),
    WS205024(205024, "上传小程序代码失败"),
    WS205025(205025, "获取小程序体验版二维码失败"),
    WS205026(205026, "提交审核失败"),
    WS205027(205027, "查询最新一次提交的审核状态失败"),
    WS205028(205028, "发布已通过审核的小程序失败"),


    /**
     * SYS 000000 error code enum.
     */
    SYS000000(000000, "操作成功"),

    /**
     * SYS SYS000001 error code enum.
     */
    SYS000001(-1, "操作失败"),


    /**
     * SYS 100000 error code enum.
     */
    SYS100000(100000, "服务器内部错误"),
    /**
     * Gl 100001 error code enum.
     */
    SYS100001(100001, "网络异常，请稍后再试！"),
    /**
     * SYS 100002 error code enum.
     */
    SYSS100002(100002, "目标服务器错误"),
    /**
     * SYS 100003 error code enum.
     */
    SYS100003(100003, "用户帐号不存在"),
    /**
     * SYS 100004 error code enum.
     */
    SYS100004(100004, "您的账户已停用"),
    /**
     * SYS 100005 error code enum.
     */
    SYS100005(100005, "密码错误"),
    /**
     * SYS 100006 error code enum.
     */
    SYS100006(100006, "您没有请求权限"),
    /**
     * SYS 100007 error code enum.
     */
    SYS100007(100007, "接口不存在"),
    /**
     * SYS 100008 error code enum.
     */
    SYS100008(100008, "输入参数错误"),
    /**
     * SYS 100009 error code enum.
     */
    SYS100009(100009, "访问频率过高"),
    /**
     * SYS 100010 error code enum.
     */
    SYS100010(100010, "访问次数达到限制"),
    /**
     * SYS 100011 error code enum.
     */
    SYS100011(100011, "被禁止的IP"),

    SYS100012(100012, "参数为空！"),

    SYS100013(100013, "登陆已过期，请重新登陆！"),

    SYS100099(100099, "网络异常，请稍后再试！"),






    SYS20001(20001, "该手机号已经注册！"),

    SYS20002(20002, "验证码错误！"),

    SYS20003(20003, "验证码已超时！"),

    SYS20004(20004, "用户名或密码错误！"),

    SYS20005(20005, "参数为空！"),

    SYS20006(20006, "手机号码错误！"),




    SYS30001(30001, "网络异常，请稍后再试！"),


    SYS40001(40001, "金额不能为负！"),

    SYS40002(40002, "提现金额大于可提金额！"),

    SYS40003(40003, "金额必须大于0！"),

    SYS40004(40004, "提现申请记录不存在！"),

    SYS40005(40005, "尚未审核！"),

    SYS40006(40006, "已打款，请勿重复操作！"),

    SYS40007(40007, "状态异常，请联系管理员！"),

    SYS40008(40008, "已计算佣金，请勿重复计算！"),


    SYS50001(50001, "产品不存在，请重新下单！"),
    SYS50002(50002, "请先选择服务！"),
    SYS50003(50003, "请输入需要续费的月数！"),


    /*
    错误码解释

    1 开头为系统，全局错误
    2 公共业务 全局错误
    3 用户模块错误
    4 财务模块
    5 产品订单模块

     */;


    private int code;
    private String msg;


    JsReturnCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static JsReturnCode getEnum(int code) {
        for (JsReturnCode ele : JsReturnCode.values()) {
            if (ele.getCode() == code) {
                return ele;
            }
        }
        return null;
    }


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }


}
