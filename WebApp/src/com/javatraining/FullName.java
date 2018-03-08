package com.javatraining;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "FullName")
public class FullName extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("Text/html");
        String fname = request.getParameter("fname");
        fname = fname +""+request.getParameter("mname");
        fname = fname +""+request.getParameter("lname");
        String name = request.getParameter("fname");
        String age = request.getParameter("mname");
        String mobile = request.getParameter("lname");
        PrintWriter out = response.getWriter();
        if(fname.isEmpty()){
            out.println("<h3><strong>No DATA Entered</strong></h3>");
        }
        else{
            out.println("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n" +
                    "  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\">\n" +
                    "  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n" +
                    "  <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\"></script>\n" +
                    "  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\"></script>");
            out.println("<h1 class=\"text-center\">Personal Details</h1><div class=\"row\"><div class=\"col-md-4\"></div><div class=\"col-md-4\"><table class=\"table\"> <thead><tr><th>Name</th><th>Age</th><th>Mobile</th></tr><tr><td>"+name+"</td><td>"+age+"</td><td>"+mobile+"</td></tr></div><div class=\"col-md-4\"></div></div>");
        }

    }
}
