<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Insurer Details</title>

<link rel="icon" type="image/ico" href="images/patient.png" />
<link rel="stylesheet" type="text/css" href="style/style2.css">
</head>
<body>
<header>
<span class="header-title">Insurer Details</span>

<nav>
<a class="nav-link" href="viewallpackages">Home</a>
<a class="nav-link" href="viewallinsurer">Insurer</a>
<a class="nav-link" href="registerpatient">RegisterPatient</a>
<a class="nav-link" href="viewallpatient">AllPatient</a>
<a class="nav-link" href="logout">Logout</a>
</nav>

</header>

<article>
<h2 class="article-heading">HI ${insurer.patientName } </h2>
<h3>Amount $ ${bal} has been added to ur account.<br>
		Thanks for coming<br>
		We are always with you</h3>

</article>
<footer>
<p>Copyright &copy; 2020</p>
</footer>
</body>
</html>
