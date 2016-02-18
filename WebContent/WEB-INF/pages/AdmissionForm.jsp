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

	<h2>${headerMsg}</h2>
	<h1>STUDENT ADMISSION FORM FOR ENGINEERING COURSES</h1>

	<form action="/GontuSpringMVC_Eclipse/submitAdmissionForm"
		method="post">
		<table>
			<tr>
				<td>Student name:</td>
				<td><input type="text" name="studentName" /></td>
			</tr>
			<tr>
				<td>Student hobby:</td>
				<td><input type="text" name="studentHobby" /></td>
			</tr>
			<tr>
				<td>Student mobile:</td>
				<td><input type="text" name="studentMobile" /></td>
			</tr>
			<tr>
				<td>Student data urodzenia:</td>
				<td><input type="text" name="studentDOB" /></td>
			</tr>
			<tr>
				<td>Student's skills set:</td>
				<td>
				<select name="studentSkills" multiple>
						<option value="Java_Core">Java_Core</option>
						<option value="Spring_Core">Spring_Core</option>
						<option value="Spring_MVC">Spring_MVC</option>
				</select></td>
			</tr>
		</table>

		<input type="submit" value="Submit this form by click here" />

	</form>
</body>
</html>