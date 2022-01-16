<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Customer Registration Form</title>
<style type="text/css">
.error {
	color: red;
}
</style>
</head>
<body>
	<h3>Los campos marcados con * son requeridos</h3>
	<form:form action="processForm" modelAttribute="customer">
	
	First Name: <form:input path="firstName" />
		<br>
	* Last Name: <form:input path="lastName" />
		<form:errors path="lastName" cssClass="error" />
		<br>
	* Free Passes: <form:input path="freePasses" />
		<form:errors path="freePasses" cssClass="error" />
		<br>
		<input type="submit" value="Submit">
	</form:form>
</body>
</html>