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
<span class="header-title">Insurance Claim Form</span>

<nav>
<a class="nav-link" href="viewallpackages">Home</a>
<a class="nav-link" href="viewallinsurer">Insurer</a>
<a class="nav-link" href="registerpatient">RegisterPatient</a>
<a class="nav-link" href="viewallpatient">AllPatient</a>
<a class="nav-link" href="logout">Logout</a>
</nav>

</header>

	<div id="wrapper">
		<div id="header">
			<h1>Insurance Claim Form</h1>
		</div>
	</div>
<br>
	<div id="container">
		<h3>Fill All The Details</h3>

		<form:form action="showBalance" modelAttribute="insurer" 
			method="POST">


			<table>
				<tbody>
					<tr>
						<td><label>Patient Name:</label></td>
						<td><form:input path="patientName" value="${object.name}"/></td>
						
					</tr>

					<tr>
						<td><label>Ailment:</label></td>
						<td><form:input path="ailment" value="${object.ailment}"/> </td>
					</tr>
					<tr>
						<td><label>TreatmentPackageName:</label></td>
						<td><form:input path="treatmentPackageName" value="${object.treatmentpackagename}"/></td>
					</tr>

					<tr>
						<td>Insurer:</td>
						<td><form:select path="insurerName">
						<form:option value="Select" />
								<form:option value="LIC" />
								<form:option value="Apollo" />
								<form:option value="American Insured" />
							</form:select></td>
					</tr>
					
			
					
					<tr>
						<td><label></label></td>
						<td><input type="submit" value="Save" class="save" /></td>
					</tr>
					
					<tr>
					<td> </td>
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