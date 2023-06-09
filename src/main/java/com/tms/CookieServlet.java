package com.tms;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.Writer;

@WebServlet("/cookie")
public class CookieServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie[] cookies = req.getCookies();
        boolean flag = false;

        for (Cookie c : cookies){
            if (c.getName().equals("name")) {                       //работает если уже есть cookie и только с .equals()
                req.setAttribute("name", c.getValue());
                flag = true;
                req.getRequestDispatcher("/helloUser.jsp").forward(req, resp);
            }
        }
        if (!flag) {                                                //срабатывает при случае если нету cookie
            Cookie cookie = new Cookie("name", "YoungMan");
            resp.addCookie(cookie);
        }

        Writer writer = resp.getWriter();
        writer.write("Try again! We add cookie to you!");
    }
}
