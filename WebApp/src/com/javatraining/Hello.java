package com.javatraining;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Hello")
public class Hello extends HttpServlet {
    private String message;
    public void init() throws ServletException{
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("Text/html");
        String name = request.getParameter("name");
        message = "hello "+ name + " Welocome to 1st Servlet";
        PrintWriter out = response.getWriter();
        out.println("<h1>" + message + "</h1>");
    }
}
