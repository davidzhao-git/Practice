
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>


<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>All Courses Page</title>
</head>

<body>
	<h2>All Courses Page</h2>
	
	<c:forEach var="course" items="${allCourses}">
		<p>${course}</p>
		<p>${course.getCourseName()}</p> 
	</c:forEach>
	
	
	
	<sf:form modelAttribute="course" action="register" method="post">
		<div>
			<label for="courseName">Course Name:</label>
			<sf:input path="courseName" /><br><br>
		</div>
		<div>
			<input type="submit" value="Save">
		</div>
	</sf:form>
	
	
</body>
</html>

