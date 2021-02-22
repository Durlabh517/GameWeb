<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2>Players:</h2>
<table>

<c:forEach items="${mode }" var="modes">
<tr>

<td><a href="detail?id=${modes.id}">${modes.name }</a></td>



</tr>

</c:forEach>
</table>


</body>

</html>