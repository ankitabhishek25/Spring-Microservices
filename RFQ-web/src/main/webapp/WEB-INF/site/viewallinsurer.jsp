<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Insurer Details</title>
<link rel="icon" type="image/ico" href="images/agents.png" />
<link rel="stylesheet" type="text/css" href="style/style.css">
</head>
<body>
<header>
<span class="header-title">Insurer Details</span>
<img class="header-logo" src="images/agents.png" alt="Agent"></img>
<nav>
<a class="nav-link" href="viewallpackages">Home</a>
<a class="nav-link" href="viewallinsurer">Insurer</a>
<a class="nav-link" href="registerpatient">RegisterPatient</a>
<a class="nav-link" href="viewallpatient">AllPatient</a>
<a class="nav-link" href="logout">Logout</a>
</nav>

</header>

<article>


<table>
<tr>
<th class="col-left">InsurerName</th>
<th class="col-right">PackageName</th>
<th class="col-right">AmountLimit</th>
<th class="col-right">DisbursementDuration</th>


</tr>
<c:forEach items="${list}" var="list">
<tr>
<td class="col-left"> <c:out value="${list.insurerName}"/></td>
<td class="col-right"> <c:out value="${list.insurerPackageName}"/></td>
<td class="col-right"> <c:out value="${list.insuranceAmountLimit}"/></td>
<td class="col-right"> <c:out value="${list.disbursementDuration}"/></td>

</tr>
</c:forEach>

</table>
</article>





<footer>
<p>Copyright &copy; 2020</p>
</footer>
</body>
</html>