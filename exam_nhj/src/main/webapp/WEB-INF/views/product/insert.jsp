<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	h3 { 
	text-align: center; 	
	}
	tr,td{
	border : 1px solid black;
	}
	table {
	border : 1px solid black;
	margin-left: auto; 
	margin-right: auto;

	}

	
</style>
</head>
<body>
<br>
<h3>상품 등록</h3>
<br>
	<form name="insertProduct" action="insert" method="POST" onSubmit="return false">
		<table>
			<tr>
				<td>상품ID</td>
				<td><input type="text" name="productId" value="${productId }"
					readOnly></td>
			</tr>
			<tr>
				<td>이름</td>
				<td><input type="text" name="productName" ></td>
			</tr>
			<tr>
				<td>단가</td>
				<td><input type="text" name="productPrice" ></td>
			</tr>
			<tr>
				<td>상품정보</td>
				<td><textarea rows="3" cols="50" type="text" name="productInfo" ></textarea></td>
			</tr>
			<tr>
				<td>등록일자</td>
				
				<c:set var="now" value="<%=new java.util.Date()%>" />
				<fmt:formatDate var="sysdate" value="${now}" pattern="yyyy/MM/dd" />
				<td><input type="text" name="productDate" value="${sysdate}" readonly/></td>
			</tr>
			<tr>
			
				<td>공급업체</td>
				<td><input type="text" name="company" ></td>
			</tr>
			<tr>
				<td>담당자</td>
				<td><input type="text" name="managerId" ></td>
			</tr>
		</table>
		<div style="text-align: center;">
		<br>
		<button style="display: inline-block;" type="button" onclick="javascript:productInsert();">등록</button>
		&nbsp&nbsp&nbsp&nbsp<button style="display: inline-block;" type="button" onclick="location.href='list'">조회</button>
		</div>
	</form>
	
	<script>
		function productInsert(){
			let name = document.querySelector("input[name='productName']");
			
			if(name.value == ""){
				alert("상품명이 등록되지 않았습니다.");
				name.focus();
				return;
			}
			
			alert("게시글이 등록되었습니다.");
			insertProduct.submit();
		}
	</script>
</body>
</html>