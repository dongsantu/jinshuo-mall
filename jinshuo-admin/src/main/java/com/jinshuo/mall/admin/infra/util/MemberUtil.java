package com.jinshuo.mall.admin.infra.util;

import com.jinshuo.mall.admin.infra.config.security.JwtBaseUser;
import com.jinshuo.mall.admin.infra.config.security.SecurityUserDetails;
import com.jinshuo.mall.core.exception.JsException;
import com.jinshuo.mall.core.exception.JsReturnCode;
import org.springframework.security.core.context.SecurityContextHolder;

/**
 * Created by Administrator on 2020/7/11.
 */
public class MemberUtil {

    public static final boolean ISDEV = false;

    /**
     * 加载缓存信息
     *
     * @return
     */
    public static String getUsername() {
        SecurityUserDetails o = null;
        try {
            o = (SecurityUserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        } catch (Exception e) {
            throw new JsException(JsReturnCode.SYS100013.getCode(), JsReturnCode.SYS100013.getMsg());
        }
        //System.out.println(" -- o " + JSONObject.toJSONString(o));
        return o.getUsername();
    }

    public static JwtBaseUser getJwtBaseUser() {
        if (ISDEV) {
            System.out.println(" ******************************************************* ");
            System.out.println(" ********************警告警告 debug********************* ");
            System.out.println(" ******************************************************* ");
            JwtBaseUser jwtBaseUser = new JwtBaseUser();
            jwtBaseUser.setId(232204895489359872L);
            jwtBaseUser.setName("牛三斤");
            jwtBaseUser.setRefereeCode(996586L);
            return jwtBaseUser;
        }
        SecurityUserDetails o = null;
        try {
            o = (SecurityUserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        } catch (Exception e) {
            throw new JsException(JsReturnCode.SYS100013.getCode(),JsReturnCode.SYS100013.getMsg());
        }
        //System.out.println(" -- o " + JSONObject.toJSONString(o));
        return o.getJwtBaseUser();
    }

}
