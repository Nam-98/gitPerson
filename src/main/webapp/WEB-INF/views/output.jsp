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
		<c:forEach var="l" items='${list}'>
            <div>
               <span>${l.seq}</span><span>${l.name}</span><span>${l.contact}</span><span>${l.reg_date}</span><span>
                  </span>
            </div>
         </c:forEach>
   <form action="delete.person" method="post">
		<input type=text name=num placeholder="번호"><br>
		<input type=submit>
	</form>
	</fieldset>
</body>
</html>