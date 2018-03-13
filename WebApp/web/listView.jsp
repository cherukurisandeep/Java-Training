<%--
  Created by IntelliJ IDEA.
  User: sb-sandeep
  Date: 12/3/18
  Time: 12:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.sql.*" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Iterator" %>
<html>
<head>
    <title>List View</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
<%@include file="header.jsp" %>
<%
    List detailsList = new ArrayList();
    Connection connection = null;
    Iterator iterate;
    ResultSet rs;
    try {

        Class.forName("org.postgresql.Driver");

    } catch (ClassNotFoundException e) {

        System.out.println("Where is your PostgreSQL JDBC Driver? "
                + "Include in your library path!");
        e.printStackTrace();
        return;

    }
    try{
        connection = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/TestDB", "test",
                "test");
        System.out.println(connection);
        String sql = "Select * from users";
        Statement st = connection.createStatement();
        st.executeQuery(sql);
        rs= st.getResultSet();
        ResultSetMetaData rmd= rs.getMetaData();
        int columns = rmd.getColumnCount();
        while(rs.next()){
            detailsList.add(rs.getString("name"));
            detailsList.add(rs.getString("email"));
            detailsList.add(rs.getInt("age"));
            detailsList.add(rs.getString("mobile"));
        };
        System.out.println(detailsList);
        rs.close();
        st.close();
    }catch (SQLException e) {
        System.out.println("List Printing Exception :"+ e);
    }%>
<h1 class="text-center">Contacts List View</h1>
<div class="row">
    <div class="col-3"></div>
    <div class="col-6">
        <div class="row">
            <div class="col"></div>
            <div class="col"></div>
            <div class="col">
                <%--<a href="./add_details.jsp"><strong>Add New Data</strong>--%>
                <button class="btn btn-info" style="margin-left: 350px" onclick="location.href = 'add_details.jsp';">Add New Contact</button>
            </div>
        </div>
        <table class="table">
            <thead class="thead-dark"><tr>
                <th>Name</th>
                <th>Age</th>
                <th>Email</th>
                <th>Mobile</th>
            </tr></thead>
            <%
                for(iterate = detailsList.iterator(); iterate.hasNext();){
                    System.out.println(iterate);
            %>
            <tr>
                <td><%= iterate.next()%></td>
                <td><%= iterate.next()%></td>
                <td><%= iterate.next()%></td>
                <td><%= iterate.next()%></td>
            </tr>
            <%
                }
            %>
        </table>
    </div>
    <div class="col-3"></div>
</div>
</body>
</html>
