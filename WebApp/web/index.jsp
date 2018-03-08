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
  </head>
  <body>
  <div class="row">
    <div class="col"></div>
    <div class="col">
      <h3>First Servlet Page</h3>
  <form action="hello">
    <input type="text" id = 'name' name="name" placeholder="name">
      <input type="submit" value="Clickme">
  </form>
  <h3>Want to see your Full Name</h3>
  <button onclick="window.location.href='/details.html'">Click Here to Fill Personal Details</button>
    </div>
    <div class="col"></div>
  </div>
  </body>
</html>
