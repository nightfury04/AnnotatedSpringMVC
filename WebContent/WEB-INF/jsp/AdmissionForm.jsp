<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Admission</title>
</head>
<body>
<h1> ${commonObject} </h1>
<form action="/AnnotatedSpringMVC/studentAdmission" method="post">


<form:errors path="objStudent.*"/>
<table>
<tr>
<td>Name:</td>
<td><input type="text" name="studentName" value=""></td>
</tr>
<tr>

<tr>
<td>DOB:</td>
<td><input type="text" name="dateOfBirth" value=""></td>
</tr>
<tr>

<td>Subject Name:</td>
<td><input type="text" name="subjectName" value=""></td>
</tr>
<tr>
<td>Roll Number:</td>
<td><input type="text" name="rollNo" value=""></td>
</tr>
<tr>
<td>Class:</td>
<td><input type="text" name="className" value=""></td>
<td>Section:</td>
<td><input type="text" name="section" value=""></td>
</tr>
<tr>
<td>School:</td>
<td><input type="text" name="schoolName" value=""></td>
</tr>
<tr>
<td>Skill set:</td>
<td>
<select name="studentSkills" multiple="multiple">
<option value="Cooking"> Cooking </option>
<option value="Eating"> Eating </option>
<option value="Sleeping"> Sleeping </option>
<option value="Studying"> Studying </option>
</select>
</td>
</tr>
<tr>
<td>Street Address line:</td>
<td><input type="text" name="address.addressLine" value=""></td>
</tr>

<tr>
<td>City:</td>
<td><input type="text" name="address.city" value=""></td>
</tr>

<tr><td><input type="submit" value="Submit"></td></tr>
</table>

</form>
</body>
</html>