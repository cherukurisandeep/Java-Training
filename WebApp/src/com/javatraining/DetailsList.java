package com.javatraining;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@WebServlet(name = "DetailsList")
public class DetailsList extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("Text/html");
        String fname = request.getParameter("fname");
        fname = fname +""+request.getParameter("mname");
        fname = fname +""+request.getParameter("lname");
        String name = request.getParameter("fname");
        int age = Integer.parseInt(request.getParameter("mname"));
        String email = request.getParameter("email");
        String mobile = request.getParameter("lname");
        PrintWriter out = response.getWriter();
        Connection connection = null;



        System.out.println("-------- PostgreSQL "
                + "JDBC Connection Testing ------------");

        try {

            Class.forName("org.postgresql.Driver");

        } catch (ClassNotFoundException e) {

            System.out.println("Where is your PostgreSQL JDBC Driver? "
                    + "Include in your library path!");
            e.printStackTrace();
            return;

        }

        System.out.println("PostgreSQL JDBC Driver Registered!");


        try {

            connection = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/TestDB", "test",
                    "test");
            System.out.println("connection"+connection);
            String sql = "INSERT INTO users VALUES (?, ?, ?, ?)";
            System.out.println("sql123"+sql);
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setString(1,name);
            pstmt.setString(2,email);
            pstmt.setInt(3,age);
            pstmt.setString(4,mobile);
            System.out.println(pstmt);
            pstmt.executeUpdate();
           // connection.commit();
            System.out.println("Successfully inserted");
        } catch (SQLException e) {
            System.out.println("Connection Failed! Check output console");
            e.printStackTrace();
            return;
        }
        if (connection != null) {
            System.out.println("You made it, take control your database now!");
        } else {
            System.out.println("Failed to make connection!");
        }
        if(fname.isEmpty()){
            out.println("<h3><strong>No DATA Entered</strong></h3>");
        }
        else{
            response.sendRedirect("listView.jsp");
            /*out.println("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n" +
                    "  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\">\n" +
                    "  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n" +
                    "  <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\"></script>\n" +
                    "  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\"></script>");
            out.println("<h1 class=\"text-center\">Personal Details</h1><div class=\"row\"><div class=\"col-md-4\"></div><div class=\"col-md-4\"><table class=\"table\"> <thead><tr><th>Name</th><th>Age</th><th>Mobile</th></tr><tr><td>"+name+"</td><td>"+age+"</td><td>"+mobile+"</td></tr></div><div class=\"col-md-4\"></div></div>");*/
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
