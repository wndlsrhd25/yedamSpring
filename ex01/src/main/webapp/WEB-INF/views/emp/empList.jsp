<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>전체조회</title>
<script src="https://code.jquery.com/jquery-2.2.4.js" integrity="sha256-iT6Q9iMJYuQiMWNd9lDyBUStIq/8PuOW33aOqmvFpqI=" crossorigin="anonymous"></script>

<style>
th,td,table {
	border : 1px solid black;
}
</style>


</head>

<body>
<table>
<thead>
	<tr>
	    <th>employee_id</th>
	    <th>first_name</th>
	    <th>last_name</th>
	    <th>email</th>
	    <th>hire_date</th>
	    <th>salary</th>  
	    <th>Delete</th> 
	</tr>
</thead>
<tbody>
	<c:forEach items="${empList}" var="list">
	<tr onclick="location.href='getInfo?employeeId=${list.employeeId }'">
	    <td>${list.employeeId }</td>
	    <td>${list.firstName }</td>
	    <td>${list.lastName }</td>
	    <td>${list.email }</td>
	    <td>${list.hireDate }</td>
	    <td>${list.salary }</td>
	    <td><button type="button" onclick="deleteInfo(${list.employeeId}, event)">삭제</button></td>
	</tr>
	</c:forEach>
</tbody>
</table>
<!-- <button type="button" onclick="location.href='insertInfo'">등록</button> -->
<button type="button" onclick="location.href='insertForm'">등록</button>

<script>
 
 // 버튼 클릭시 Row 값 가져오기
 
 
/*  $(".deleteBtn").click(function(){ 
     var delBtn = $(this);
     
     var tr = delBtn.parent().parent();
     //var td = tr.children();

     var employeeId = tr.eq(0).text();
     console.log(employeeId);

 }); */
 
  function deleteInfo(id,event){
	 event.stopPropagation();
	 location.href='deleteInfo/'+id;
 } 
 </script>
</body>
</html>