package com.javatraining;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("Text/html");
        PrintWriter out = response.getWriter();
        System.out.println("POSTMethod");
        String userName = request.getParameter("userName");
        String password = request.getParameter("userPassword");
        System.out.println(userName+"==>"+password);
        if(userName.equals("sandeep") && password.equals("SB-Password123!")) {
            System.out.println("username");
            System.out.println("Success");
            HttpSession session = request.getSession();
            session.setAttribute("username", userName);
            session.setMaxInactiveInterval(30 * 60);
            response.sendRedirect("/index.jsp");
        }
        else{
                System.out.println("Failed");
                RequestDispatcher reqDes= getServletContext().getRequestDispatcher("/login.jsp");
                out.println("<p>Incorrect EmailId & Password</p>");
                reqDes.include(request,response);
            }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
