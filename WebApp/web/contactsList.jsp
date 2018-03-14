<%--
  Created by IntelliJ IDEA.
  User: sb-sandeep
  Date: 14/3/18
  Time: 1:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="postgres"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Contacts</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<script>
    function test(email) {
        location.href='contactEdit.jsp?cId='+email;
    }
</script>
<body>
<%@include file="header.jsp" %>
<h1 class="text-center">Contacts List View</h1>
<postgres:setDataSource var="snapshot" driver="org.postgresql.Driver" url="jdbc:postgresql://localhost:5432/TestDB"
user="test" password="test" />
<postgres:query dataSource="${snapshot}" var="result">Select * from users;</postgres:query>

<div class="row">
    <div class="col-3"></div>
    <div class="col-6">
        <div class="row">
            <div class="col"></div>
            <div class="col"></div>
            <div class="col">
                <button class="btn btn-info" style="margin-left: 350px" onclick="location.href = 'add_details.jsp';">Add New Contact</button>
            </div>
            </br>
        </div>
        <table class="table">
            <thead class="thead-dark"><tr>
                <td><strong>Name</strong></td>
                <td><strong>Email</strong></td>
                <td><strong>Age</strong></td>
                <td><strong>Mobile</strong></td>
                <td><strong>Action</strong></td>
            </tr>
            </thead>
            <core:forEach var="row" items = "${result.rows}">
                <tr>
                    <td><core:out value="${row.name}" /></td>
                    <td><core:out value="${row.email}" /></td>
                    <td><core:out value="${row.age}" /></td>
                    <td><core:out value="${row.mobile}" /></td>
                    <td><button class="btn btn-primary" onclick="test('${row.email}')">Edit</button></td>
                </tr>
            </core:forEach>
        </table>

    </div>
    <div class="col-3"></div>
</div>
</body>
</html>
