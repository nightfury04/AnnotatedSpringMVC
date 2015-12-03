<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Admission</title>
</head>
<body>
${commonObject}
<form action="/AnnotatedSpringMVC/studentAdmission" method="post">
<table>
<tr>
<td>First Name</td>
<td><input type="text" name="studentName" value=""></td>
</tr>
<tr>
<td>Subject Name</td>
<td><input type="text" name="subjectName" value=""></td>
</tr>
<tr><td><input type="submit" value="Submit"></td></tr>
</table>

</form>
</body>
</html>