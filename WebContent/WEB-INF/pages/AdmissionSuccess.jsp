<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Insert title here</title>
</head>
<body>

	<h1>Congratulations!! the Engineering college has processes your
		Application form successfully</h1>

	<h2>${headerMsg}</h2>

	<table>
		<tr>
			<td>Student name:</td>
			<td>${student1.studentName}</td>
		</tr>
		<tr>
			<td>Student hobby:</td>
			<td>${student1.studentHobby}</td>
		</tr>
	</table>

</body>
</html>