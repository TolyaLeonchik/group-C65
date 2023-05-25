package com.tms;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.annotation.WebServlet;

import java.io.IOException;

@WebFilter("/c65annotation")
public class MySecondFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Filter 2 work!");
        filterChain.doFilter(servletRequest, servletResponse);
    }
}
