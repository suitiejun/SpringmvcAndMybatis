package com.shinowit.framework.interceptor;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by Administrator on 2014/12/22.
 */
public class checkloginInterceptor extends HandlerInterceptorAdapter{
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        HttpSession session=request.getSession();

        if (null!=session && session.getAttribute("login_text")!=null){
            return  true;
        }
        String url=request.getRequestURI();
        if (url.endsWith("/login/logintest") || url.endsWith("html/login.jsp")){
            return true;
        }
        response.sendRedirect(request.getContextPath()+"/html/login.jsp");

        return false;
    }
}
