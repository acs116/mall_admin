<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>addCategory</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
<script>
$(document).ready(function(){
	$('#addProductCommonBtn').click(function(){
		console.log('addBtn click...')
		$('#addProductCommonForm').submit();
	});
});
</script>
</head>
<body>
	<h1>카데고리 추가</h1>
	<form id="addProductCommonForm" method="post" action="${pageContext.request.contextPath }/product/addProductCommon">
				
				<div>					
					categoryNo : <input type="hidden" name="categoryNo">
				</div>
				<div>					
					productCommonName : <input type="text" name="productCommonName">
				</div>
				<div>					
					productCommonPrice : <input type="text" name="productCommonPrice">
				</div>
				<div>					
					productCommonDescription : <input type="text" name="productCommonDescription">
				</div>				
				<div>					
					<button id="addProductCommonBtn" type="button">상품추가</button>
				</div>				
			</form> 
</body>
</html>