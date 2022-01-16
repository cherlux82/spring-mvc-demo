<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Confirmacion de Estudiante</title>
</head>
<body>

	The student is confirmed: ${student.firstName} ${student.lastName} from
	country: ${student.country}
	<br>
	<br> Favorite Languaje: ${student.favoriteLanguage }

	<br>
	<br> Operating Systems: 
	<ul>
		<c:forEach var="temp" items="${student.operatingSystems}">
			<li>${temp}</li>
		</c:forEach>
	</ul>

</body>
</html>