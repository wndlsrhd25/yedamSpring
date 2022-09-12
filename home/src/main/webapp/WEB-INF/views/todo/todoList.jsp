<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
th,td{
	border : 1px solid black;
}


</style>
</head>
<body>
<h3>todoList</h3>

<div>
<form name="insertForm" action="insert" method="POST" onsubmit="return false">
<input type="text" name="contents">
<button type="submit" onclick="insertBtn()">등록</button>
</form>
</div>

<table>
      <tbody>
         <c:forEach var="todo" items="${ todoList }">
            <tr>
               <td>${todo.no}</td>
               <td>${todo.contents}</td>
               <td>${todo.todoYn}</td>
               <td><button type="button" onclick="deleteInfo(${todo.no},event)">x</button></td>
            </tr>
         </c:forEach>
      </tbody>
   </table>
   
<script>
function insertBtn(){
	let contents = document.getElementsByName('contents')[0];

	if(contents.value==""){
		alert("내용을 입력하세요");
		contents.focus();
		return;
	}
	
	insertForm.submit();
}

function deleteInfo(no,event){
	
	event.stopPropagation();
	let conno = no;
	console.log(conno);
	location.href='delete/'+no;
}
</script>
</body>
</html>