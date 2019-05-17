<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>카데고리 목록</h1>
		<table border="1">
			<tr>
				<th>categoryNo</th>
				<th>categoryName</th>				
			<tr>
			<c:forEach var="categoryList" items="${categoryList}">
				<tr>
					<td>
					<a href="${pageContext.request.contextPath }/product/addProductCommon">${categoryList.categoryNo}</a>
					</td>			
					<td>${categoryList.categoryName}</td>
				<tr>	
			</c:forEach>
		</table>
		<a href="${pageContext.request.contextPath }/">처음으로</a>
</body>
</html>