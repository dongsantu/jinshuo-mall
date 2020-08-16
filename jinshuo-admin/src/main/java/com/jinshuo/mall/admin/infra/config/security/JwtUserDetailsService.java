package com.jinshuo.mall.admin.infra.config.security;

import com.jinshuo.mall.admin.application.service.impl.ums.JwtBaseUserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2020/7/2.
 */
@Service
public class JwtUserDetailsService implements UserDetailsService {

    @Autowired
    private JwtBaseUserServiceImpl jwtBaseUserService;

    /**
     * 这个要重写
     * @param user
     * @return
     * @throws UsernameNotFoundException
     */
    @Override
    public UserDetails loadUserByUsername(String user) throws UsernameNotFoundException {
       /* System.out.println("JwtUserDetailsService:" + user);
        List<GrantedAuthority> authorityList = new ArrayList<>();
        authorityList.add(new SimpleGrantedAuthority("ROLE_USER"));*/
        JwtBaseUser jwtBaseUser = jwtBaseUserService.getByUsername(user);
        //SecurityUserDetails userDetails = new SecurityUserDetails(jwtBaseUser);
        //return new SecurityUserDetails(user,authorityList);
        return new SecurityUserDetails(jwtBaseUser);
    }

}
