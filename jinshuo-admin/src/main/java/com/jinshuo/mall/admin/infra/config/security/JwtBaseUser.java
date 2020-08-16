package com.jinshuo.mall.admin.infra.config.security;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * Created by Administrator on 2020/7/2.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class JwtBaseUser {
    public String username;

    public String password;

    public Long id;

    public String userType;

    private String phone;

    private String name;

    private Integer sex;

    private Date birthDate;

    private Long refereeId;

    private Long refereeCode;

    private String weixin;

    private String zfb;

    private String cardId;

    private String bankId;

    private String bankCode;

    private String bankName;

    private String bankSub;

    private String futuresComp;

    private String futuresId;

    private String email;

    private Date registerDate;

    private String photo;

}
