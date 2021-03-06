<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Formulario de registro de estudiantes</title>
</head>
<body>
	<form:form action="processForm" modelAttribute="student">
		First Name: <form:input path="firstName" />
		<br>
		<br>
		Last Name: <form:input path="lastName" />
		<br>
		<br>
		Country: 
			<form:select path="country">
			<form:options items="${countryOptions}" />
		</form:select>
		<br>
		<br>
		Favorite Languaje: 
		<form:radiobuttons path="favoriteLanguage"
			items="${student.favoriteLanguageOptions}" />
		<br>
		<br>
		Operating Systems:
		 
		Linux<form:checkbox path="operatingSystems" value="Linux" />
		Windows<form:checkbox path="operatingSystems" value="Windows" />
		Mac OS<form:checkbox path="operatingSystems" value="MAC" />
		Other<form:checkbox path="operatingSystems" value="Other" />

		<br>
		<br>

		<input type="submit" value="Submit">
	</form:form>
</body>
</html>