<%--
  Created by IntelliJ IDEA.
  User: sb-sandeep
  Date: 12/3/18
  Time: 8:16 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
    <link href="//netdna.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <script src="//netdna.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
    <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
    <link href="//maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css" rel="stylesheet">
</head>
<body>
<form  action="/login" method="post">
    <div class="container">
        <div class="row">
            <div class="col-md-offset-5 col-md-3" style="margin-top: 150px">
                <div class="form-login">
                    <h4>Login</h4>
                    <input type="text" id="userName" name="userName" class="form-control" placeholder="username" />
                    </br>
                    <input type="password" id="userPassword" name="userPassword" class="form-control" placeholder="password" />
                    </br>
                    <div class="wrapper">
            <span class="group-btn">
                <input type="submit" class="btn btn-primary btn-md pull-right" value="login ">
                <%--<a href="#" class="btn btn-primary btn-md pull-right">login <i class="fa fa-sign-in"></i></a>--%>
            </span>
                    </div>
                </div>

            </div>
        </div>
    </div>
</form>
</body>
</html>
