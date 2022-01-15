<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Insurer Details</title>
<link rel="icon" type="image/ico" href="images/patient.png" />
<link rel="stylesheet" type="text/css" href="style/style.css">
</head>
<body>
<header>
<span class="header-title">Patient Details</span>
<img class="header-logo" src="images/patient.png" alt="patient"></img>
<nav>
<a class="nav-link" href="viewallpackages">Home</a>
<a class="nav-link" href="viewallinsurer">Insurer</a>
<a class="nav-link" href="registerpatient">RegisterPatient</a>
<a class="nav-link" href="logout">Logout</a>
</nav>

</header>

<article>
<h2 class="article-heading"> </h2>

<table>
<tr>
<th class="col-left">PatientName</th>
<th class="col-right">Age</th>
<th class="col-right">Ailment</th>
<th class="col-right">Package</th>
<th class="col-right">TreatmentCommencementDate</th>
<th class="col-right">Insurance Claim</th>


</tr>
<c:forEach items="${list}" var="list">
<tr>
<td class="col-left"> <c:out value="${list.name}"/></td>
<td class="col-right"> <c:out value="${list.age}"/></td>
<td class="col-right"> <c:out value="${list.ailment}"/></td>
<td class="col-right"> <c:out value="${list.treatmentpackagename}"/></td>
<td class="col-right"> <c:out value="${list.treatmentcommencementdate}"/></td>
<td class="col-right">  <a href="claim?id=${list.id}">CLAIM</a></td>
</tr>
</c:forEach>

</table>
</article>





<footer>
<p>Copyright &copy; 2020</p>
</footer>
</body>
</html>