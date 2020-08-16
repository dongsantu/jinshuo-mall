package com.jinshuo.mall.admin.infra.config.security;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

/**
 * Created by Administrator on 2020/7/2.
 */
public class SecurityUserDetails implements UserDetails {

    private JwtBaseUser jwtBaseUser;

    private Collection<? extends GrantedAuthority> authorities;

    public SecurityUserDetails(JwtBaseUser jwtBaseUser) {
        this.jwtBaseUser = jwtBaseUser;
    }

    @Override
    public String getPassword() {
        return jwtBaseUser.getPassword();
    }

    @Override
    public String getUsername() {
        return jwtBaseUser.getUsername();
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    /**
     * 账户是否过期
     *
     * @return
     */
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    /**
     * 是否禁用
     *
     * @return
     */
    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    /**
     * 密码是否过期
     *
     * @return
     */
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    /**
     * 是否启用
     *
     * @return
     */
    @Override
    public boolean isEnabled() {
        return true;
    }

    public JwtBaseUser getJwtBaseUser(){
        return this.jwtBaseUser;
    }
}
