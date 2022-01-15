<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register Patient</title>
<link rel="icon" type="image/ico" href="images/add.png" />
<link rel="stylesheet" type="text/css" href="style/style.css">
</head>
<body>
<header>
<span class="header-title">Patient Registration</span>
<img class="header-logo" src="images/add.png" alt="Add"></img>
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
			<h1>Patient Details Saving Form</h1>
		</div>
	</div>

	<div id="container">
		<h3>Fill All The Details</h3>

		<form:form action="savePatient" modelAttribute="patient"
			method="POST">


			<table>
				<tbody>
					<tr>
						<td><label>Patient Name:</label></td>
						<td><form:input path="name" /></td>
					</tr>

					<tr>
						<td><label>Age:</label></td>
						<td><form:input path="age" /></td>
					</tr>

					<tr>
						<td>Ailment:</td>
						<td><form:select path="ailment">
								<form:option value="Urology" />
								<form:option value="Orthopedics" />
							</form:select></td>
					</tr>
					<tr>
						<td>Package:</td>
						<td><form:select path="treatmentpackagename">
								<form:option value="Package1" />
								<form:option value="Package2"/>
							</form:select></td>
					</tr>
					
					<tr>
						<td><label>TreatmentCommencementDate:(yyyy-mm-dd)</label></td>
						<td><form:input path="treatmentcommencementdate" /></td>
					</tr>
					<tr>
						<td><label></label></td>
						<td><input type="submit" value="Save" class="save" /></td>
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