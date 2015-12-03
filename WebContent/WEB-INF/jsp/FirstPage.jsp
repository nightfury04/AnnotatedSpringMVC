<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Annotated Spring Framework</title>
</head>
<body>
<h1>Hello ${fname} ${lname}!!!</h1>

<c:if test="${countryname ne null}">
You are from ${countryname}.
</c:if>

<p>Welcome to the first annotated Spring MVC</p>

<a href="/AnnotatedSpringMVC/AdmissionForm.htm">Click for student admission</a>


</body>
</html>