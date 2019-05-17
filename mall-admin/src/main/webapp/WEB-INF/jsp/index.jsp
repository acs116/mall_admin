<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>INDEX</h1>
		<h3>쇼핑몰 관리자 메인 페이지</h3>
		<a href="${pageContext.request.contextPath }/category/addCategory">카데고리등록</a>
		<a href="${pageContext.request.contextPath }/category/getCategoryList">카데고리리스트</a>
		<a href="${pageContext.request.contextPath }/member/addMember">회원가입</a>
		<a href="${pageContext.request.contextPath }/product/addProductCommon">상품등록</a>
		<div>		
		
		<c:if test="${memberLogin == null}">		
		<a href="${pageContext.request.contextPath }/member/login">로그인</a>
		</c:if>
		</div>
		
		<div>
		<c:if test="${memberLogin != null}">		
		<a href="${pageContext.request.contextPath }/member/logout">로그아웃</a>
		</c:if>
		</div>
</body>
</html>