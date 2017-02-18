<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Success Page</title>
</head>
<body>
<h1>${headerMessage}</h1>
<h3>Success!!</h3>
<p>
${objStudent.studentName} is successfully registered!!<br />
Details:<br />
Name: ${objStudent.studentName}<br />
Subject: ${objStudent.subjectName}<br />
Roll No: ${objStudent.rollNo}<br />
Class: ${objStudent.className}<br />
Section: ${objStudent.section}<br />
School: ${objStudent.schoolName}<br />
</p>
</body>
</html>