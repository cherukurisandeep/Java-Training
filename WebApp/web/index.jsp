<%--
  Created by IntelliJ IDEA.
  User: sb-sandeep
  Date: 8/3/18
  Time: 1:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Personal Details</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">

  </head>
  <body>
  <%@include file="header.jsp" %>
  <div class="row">
    <div class="col"></div>
    <div class="col">
<%--      <h3> First Servlet Page</h3>
  <form action="hello">
    <input type="text" id = 'name' name="name" placeholder="name">
      <input class="btn btn-primary" type="submit" value="Clickme">
  </form>
  <h3>--Registration--</h3>--%>
      <h3 class="text-center"><strong>Welcome to PhoneBook</strong></h3>
      <div class="row" style="margin-top: 200px">
        <div class="col">
  <button class="btn btn-primary text-center" onclick="window.location.href='/add_details.jsp'">
    <i class="large material-icons align-center">person_add</i>
    Add New Contact</button>
        </div>
        <div class="col">
      <button class="btn btn-primary text-center" onclick="window.location.href='/contactsList.jsp'">
        <i class="large material-icons align-center">people</i>
        View Contacts</button>
        </div>
      </div>
    </div>
    <div class="col"></div>
  </div>
  </body>
</html>
