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
import java.sql.SQLException;
import java.sql.Statement;

@WebServlet(name = "EditContact")
public class EditContact extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Connection connection = null;
        Statement stmt = null;
        PrintWriter out = response.getWriter();
        String name = request.getParameter("fname");
        String email =  request.getParameter("email");
        System.out.println(email);
        Integer age = Integer.parseInt(request.getParameter("age"));
        String mobile = request.getParameter("mobile");
        if( name.isEmpty() && email.isEmpty() && mobile.isEmpty()){
            out.println("<h3>There is no data to update</h3>");
        }
        else{
            try {
                Class.forName("org.postgresql.Driver");
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
                return;
            }
            try {
                connection= DriverManager.getConnection("jdbc:postgresql://localhost:5432/TestDB", "test",
                "test");
                connection.setAutoCommit(false);
                stmt= connection.createStatement();
                String sql = "UPDATE users SET name='"+name+"',age='"+age+"',mobile='"+mobile+"' WHERE email = '"+email+"'";
                System.out.println(sql);
                stmt.executeUpdate(sql);
                connection.commit();
                stmt.close();
                connection.close();
                response.sendRedirect("contactsList.jsp");

            } catch (SQLException e) {
                e.printStackTrace();
                System.out.println(e);
            }
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
