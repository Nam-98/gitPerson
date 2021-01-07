<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<fieldset>
		<legend>Output</legend>
   <form action="delete.person" method="post">
		<input type=text name=num placeholder="번호"><br>
		<input type=submit>
	</form>
	</fieldset>
</body>
</html>