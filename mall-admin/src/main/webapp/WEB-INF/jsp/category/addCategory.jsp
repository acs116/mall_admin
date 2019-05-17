<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>addCategory</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
<script>
$(document).ready(function(){
	$('#addBtn').click(function(){
		console.log('addBtn click...')
		$('#addCategoryForm').submit();
	});
});
</script>
</head>
<body>
	<h1>카데고리 추가</h1>
	<form id="addCategoryForm" method="post" action="${pageContext.request.contextPath }/category/addCategory">
				<div>
					이름:
				</div>
				<div>					
					<input type="text" name="categoryName">
				</div>
				<div>					
					<button id="addBtn" type="button">추가</button>
				</div>				
			</form> 
</body>
</html>