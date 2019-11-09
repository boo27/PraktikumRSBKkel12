<%-- 
    Document   : home
    Created on : Sep 22, 2019, 12:45:58 PM
    Author     : WIN 10
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Home Page</title>
<link rel="stylesheet" href="css/bootstrap.min.css">
<script src="https://code.jquery.com/jquery-1.12.4.min.js" integrity="sha384-nvAa0+6Qg9clwYCGGPpDQLVpLNn0fRaROjHqs13t4Ggj3Ez50XnGQqc/r8MhnRDZ" crossorigin="anonymous"></script>
<script src="js/bootstrap.min.js"></script>
<style>
    body, html {
        background-image: url(img/background.jpg);
        background-size: cover;
        background-attachment: fixed;        
    }
    th {
        background-color: pink;
        text-align: center;
    }
    td {
        background-color: antiquewhite;
    }
    td:nth-child(1) {
        text-align: center;
    }
    .menu {
		margin-left: -15px; 
		margin-right: 15px;
	}
	.daftar{
		border: 2px solid #e5e5e5; 
		border-radius: 5px; 
		padding: 5px;
	}
	.table th, .table td{
		text-align: center;
	}
	.nav{
		padding: 5px; 
		border: 2px solid #e5e5e5;
		border-radius: 5px;
	}
	.nav li{
		border-bottom: 2px solid #e5e5e5;
		border-radius: 5px;
	}
	.daftar h3{
                margin-top: 50px;
		margin-bottom: 25px;
	}

</style>
</head>


<nav class="navbar navbar-default navbar-inverse">
    <div class="container-fluid">
      <!-- Brand and toggle get grouped for better mobile display -->
      <div class="navbar-header">
        <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
          <span class="sr-only">Toggle navigation</span>
          <span class="icon-bar"></span>
          <span class="icon-bar"></span>
          <span class="icon-bar"></span>
        </button>
        <a class="navbar-brand" href="#">Universitas Diponegoro</a>
      </div>

      <!-- Collect the nav links, forms, and other content for toggling -->
      <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
        <ul class="nav navbar-nav">
          <li class="active"><a href="./StudentServlet">Home <span class="sr-only">(current)</span></a></li>              
        </ul>           
        <ul class="nav navbar-nav navbar-right">              
          <li class="dropdown">
            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Dhyn<span class="caret"></span></a>
            <ul class="dropdown-menu">
              <li><a href="./profile.jsp">Profile</a></li>                  
              <li><a href="./login.jsp">Logout</a></li>                  
            </ul>
          </li>
        </ul>
      </div><!-- /.navbar-collapse -->
    </div><!-- /.container-fluid -->
</nav>

<div class="container">
    <div class="row content col-md-8 col-md-offset-2">
	<div class="col-md-3 menu">
	<ul class="nav nav-pills nav-stacked" style="">
            <li><a href="#">Home</a></li>
            <li><a href="./profile.jsp">Profile</a></li> 
            <li><a href="./login.jsp">Logout</a></li>
	</ul>
	</div>
	<div class="col-md-9 daftar" background-color="white">
            <form action="./StudentServlet" method="POST">
                <table class="table table-bordered" background-color="white">
                <tr>
                <td>Student ID</td>
                <td><input class="form-control" type="text" name="studentId" value="${student.studentId}" /></td>
                </tr>
                <tr>
                <td>First Name</td>
                <td><input class="form-control" type="text" name="firstname" value="${student.firstName}" /></td>
                </tr>
                <tr>
                <td>Last Name</td>
                <td><input class="form-control" type="text" name="lastname" value="${student.lastName}" /></td>
                </tr>
                <tr>
                <td>Alamat</td>
                <td><input class="form-control" type="text" name="alamat" value="${student.alamat}" /></td>
                </tr>
                <tr>
                <td colspan="2">
                <input type="submit" class="btn btn-primary btn-sm" name="action" value="Add" />
                <input type="submit" class="btn btn-default btn-sm" name="action" value="Edit" />
                <input type="submit" class="btn btn-danger btn-sm" name="action" value="Delete" />
                <input type="submit" class="btn btn-warning btn-sm" name="action" value="Search" />
                </td>
                </tr>
                </table>
            </form>
            <h3 align="center" style="color:white;">Informasi Data</h3>
		<table class="table table-bordered table-hover">
                    <thead>
                    <tr>
                    <th>No. ID</th>
                    <th>First Name</th>
                    <th>Last Name</th>
                    <th>Alamat</th>
                    </tr>
                    </thead>
                    <tbody>
                    <s:forEach items="${allStudents}" var="stud">
                    <tr>
                        <td>${stud.studentId}</td>
			<td>${stud.firstName}</td>
                        <td>${stud.lastName}</td>
                        <td>${stud.alamat}</td>
                    </tr>
                    </s:forEach>
                    </tbody>
                </table>
            </div>
	</div>
    </div>
</div>
</html>
