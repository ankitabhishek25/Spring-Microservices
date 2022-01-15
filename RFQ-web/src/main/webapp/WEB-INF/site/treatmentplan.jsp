<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Adding Customer</title>
<link rel="icon" type="image/ico" href="images/patient.png" />
<link rel="stylesheet" type="text/css" href="style/style.css">
</head>
<body>
<header>
<span class="header-title">Treatment Plan</span>
<img class="header-logo" src="images/patient.png" alt="Add"></img>
<nav>
<a class="nav-link" href="viewallpackages">Home</a>
<a class="nav-link" href="viewallinsurer">Insurer</a>
<a class="nav-link" href="registerpatient">RegisterPatient</a>
<a class="nav-link" href="viewallpatient">AllPatient</a>
<a class="nav-link" href="logout">Logout</a>
</nav>
</header>
<br><br>
	<div id="wrapper">
		<div id="header">
			<h2>Treatment Details of ${patient.name }</h2>
		</div>
	</div>
<div id="container">
			<h2>Treatment Details of ${patient.name }</h2>
		</div>
	<div id="container">
		<h3></h3>

		<form:form action="" 
			>


			<table>
				<tbody>
					<tr>
						<td><label>Package Name:</label></td>
						<td>${treatment.packagename} </td>
					</tr>

					<tr>
						<td><label>TestDetails:</label></td>
						<td>${treatment.testdetails} </td>
					</tr>

<tr>
						<td><label>Cost:</label></td>
						<td>${treatment.cost} </td>
					</tr>
					<tr>
						<td><label>Specialist:</label></td>
						<td>${treatment.specialist}</td>
					</tr>
					<tr>
						<td><label>StartDate:</label></td>
						<td>${treatment.treatmentcommencementdate}</td>
					</tr>
					<tr>
						<td><label>EndDate:</label></td>
						<td>${treatment.treatmentEndDate}</td>
					</tr>
					
					
					<tr>
						<td><label>TreatmentStattus:</label></td>
						<td>INPROGRESS</td>
					</tr>
					


				</tbody>
			</table>


		</form:form>

		<div style=""></div>

		
	</div>
<footer>
<p>Copyright &copy; 2020</p>
</footer>
</body>
</html>