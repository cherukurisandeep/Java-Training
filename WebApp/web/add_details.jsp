<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Personal Details</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
<%@include file="header.jsp" %>
<div class="row">
<div class="col-md-4"></div>
<div class="col-md-4">
    <h1 class="text-center"> Contacts Details Form</h1>
<form class="container" action="/fullDetails" method="post">
    <div class="row">
    <label class="col-2">Name</label>
    <input class="col form-control" type="text" name="fname" id="fname" placeholder="Name">
    </div>
        </br>
    <div class="row">
        <label class="col-2">Email</label>
        <input class="col form-control" type="email" name="email" id="email" placeholder="Name">
    </div>
    </br>
    <div class="row">
    <label class="col-2">Age</label>
    <input class="col form-control" type="number" name="mname" id="mname" placeholder="Age">
    </div>
        </br>
    <div class="row">
    <label class="col-2">Mobile</label>
    <input class="col form-control" type="number" name="lname" id="lname" placeholder="Mobile">
    </div>
        </br>
    </br>
    <input class="col-md-4 form-control btn btn-success" style="left: 268px" type="submit" value="Submit">
</form>
</div>
<div class="col-md-4"></div>
</div>
</body>
</html>