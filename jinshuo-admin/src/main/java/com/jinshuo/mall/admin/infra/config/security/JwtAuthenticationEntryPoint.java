package com.jinshuo.mall.admin.infra.config.security;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Administrator on 2020/7/2.
 */
@Slf4j
@Component
public class JwtAuthenticationEntryPoint implements AuthenticationEntryPoint {
    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException authException) throws IOException, ServletException {
        /*System.out.println(" URL " + request.getRequestURI() + "没有凭证!");
        System.out.println("JwtAuthenticationEntryPoint:" + authException.getMessage());
        response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "没有凭证");
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/javascript;charset=utf-8");
        response.setStatus(401);
        response.getWriter().print(JSONObject.toJSONString("没有访问权限!"));*/


        log.info(" ----->>>>>>>> 没有访问权限!" );
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json");
        response.getWriter().println("没有访问权限!");

        response.setStatus(401);
        response.getWriter().flush();
    }
}
