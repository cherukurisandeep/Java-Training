<%--
  Created by IntelliJ IDEA.
  User: sb-sandeep
  Date: 14/3/18
  Time: 6:02 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="postgres"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Update Contact</title>
    <link rel="stylesheet"
          href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
          crossorigin="anonymous">
</head>
<body>
<%@include file="header.jsp" %>
<postgres:setDataSource var="snapshot" driver="org.postgresql.Driver" url="jdbc:postgresql://localhost:5432/TestDB"
                        user="test" password="test" />
<postgres:query dataSource="${snapshot}" var="result">Select * from users where email= '<%= request.getParameter("cId")%>';</postgres:query>
<div class="row">
    <div class="col-md-4"></div>
    <div class="col-md-4">
        <h1 class="text-center"> Edit Contact</h1>
        <form class="container" action="/edit" method="post">
            <div class="row">
                <label class="col-2">Name</label>
                <input class="col form-control" type="text" name="fname" value="${result.rows[0].name}"
                       id="fname" placeholder="Name">
            </div>
            <div class="row">
               <%-- <label class="col-2">Email</label>--%>
                <input class="col form-control" type="hidden" name="email" value="${result.rows[0].email}"
                       id="email" placeholder="Email">
            </div>
            </br>
            <div class="row">
                <label class="col-2">Age</label>
                <input class="col form-control" type="number" name="age" value="${result.rows[0].age}"
                       id="age" placeholder="Age">
            </div>
            </br>
            <div class="row">
                <label class="col-2">Mobile</label>
                <input class="col form-control" type="number" name="mobile" value="${result.rows[0].mobile}"
                       id="mobile" placeholder="Mobile">
            </div>
            </br>
            </br>
            <input class="col-md-4 form-control btn btn-success"
                   style="left: 268px" type="submit" value="UPDATE">
        </form>
    </div>
    <div class="col-md-4"></div>
</div>

</body>
</html>
