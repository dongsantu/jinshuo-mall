package com.jinshuo.mall.admin.infra.config.security;

import com.alibaba.fastjson.JSONObject;
import io.jsonwebtoken.ExpiredJwtException;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

/**
 * Created by Administrator on 2020/7/2.
 */
@Component
public class JwtAuthorizationTokenFilter extends OncePerRequestFilter {

    private final UserDetailsService userDetailsService;
    private final JwtTokenUtil jwtTokenUtil;
    private final String tokenHeader;

    public JwtAuthorizationTokenFilter(@Qualifier("jwtUserDetailsService") UserDetailsService userDetailsService,
                                       JwtTokenUtil jwtTokenUtil, @Value("${jwt.token}") String tokenHeader) {
        this.userDetailsService = userDetailsService;
        this.jwtTokenUtil = jwtTokenUtil;
        this.tokenHeader = tokenHeader;
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain) throws ServletException, IOException {
        System.out.println(" -- ");
        System.out.println(JSONObject.toJSONString(request.getRequestURI()) + " -- " + JSONObject.toJSONString(request.getHeaderNames()));
        Map<String, String[]> map = request.getParameterMap();
        final String requestHeader = request.getHeader("Authorization");
        String username = null;
        String authToken = null;
        if (requestHeader != null && requestHeader.startsWith("Bearer ")) {
            authToken = requestHeader.substring(7);
            try {
                //username = jwtTokenUtil.getUsernameFromToken(authToken);
                username = jwtTokenUtil.getUsernameFromJwt(authToken);
            } catch (ExpiredJwtException e) {
            }
        }

        if (username != null && SecurityContextHolder.getContext().getAuthentication() == null) {
            UserDetails userDetails = this.userDetailsService.loadUserByUsername(username);
            if (jwtTokenUtil.validateToken(authToken, userDetails)) {
                logger.info(" -- 放入缓存信息 ：" + request.getRequestURI());
                UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
                SecurityContextHolder.getContext().setAuthentication(authentication);
            }
        }
        logger.info(" -- " + request.getRequestURI() + " 校验完成 username -> " + username);
        super.doFilter(request, response, chain);
        //chain.doFilter(request, response);
    }

}
