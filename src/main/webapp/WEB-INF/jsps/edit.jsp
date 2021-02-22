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
 <form action="/update-player">
                    <div class="form-group">
                        <label for="email">Product Name:</label>
                        <input type="text" class="form-control" name="prodName" th:value="${product.prodName}" />
                    </div>
                      <input type="hidden" name="id" value="${product.id}" />
                    <button type="submit" class="btn btn-success">Save</button>
                </form>
</body>
</html>