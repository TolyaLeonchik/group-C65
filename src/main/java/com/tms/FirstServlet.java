package com.tms;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

//на какой путь?
@WebServlet("/c65annotation")
public class FirstServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doGet(req, resp); было, но если хочешь сам описать то вместо него
        //request - запрос
        //response - ответ

        resp.setContentType("text/html"); //как браузеру оторазить полученную информацию
        //PrintWriter printWriter = resp.getWriter();
        //printWriter.println("<h1> HELLO WORLD! From c65 </h1>");

        HttpSession session = req.getSession(); //Cookie
        PrintWriter writer = resp.getWriter();
        String name = (String) session.getAttribute("name");
        if (name == null) {
            session.setAttribute("name", "Vaserman"); //name -> Vaserman
            writer.print("Hello, I don't know who you are");
        } else {
            writer.print("Hello my dear " + session.getAttribute("name"));
        }

        //create request attribute
        /*req.setAttribute("name", "Bill Gates");*/

        req.getRequestDispatcher("/WEB-INF/pages/dz.html").forward(req, resp);
    }


    //Жизненный цикл
    //1. init() - когда мы к нему обращаемся в 1 раз
    //2. service() - выполняется каджый раз при вызове сервлета
    //3. destroy() - когда приложение умирает/закрывается/ломается

    //При первом обращении
    @Override
    public void init(ServletConfig config) throws ServletException {
        //super.init(config);
        System.out.println("INIT METHOD!!!");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.service(req, resp); // MAAAASTHAAAAAVE
        System.out.println("Service method");
    }

    @Override
    public void destroy() {
        System.out.println("Destroy method");
    }
}
