package com.tms;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;

import java.io.IOException;

@WebFilter("/c65annotation")
public class MyFirstFilter implements Filter { //jakarta.servlet
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Filter 1 work!");
        filterChain.doFilter(servletRequest, servletResponse); //Important!!!
    }
}
