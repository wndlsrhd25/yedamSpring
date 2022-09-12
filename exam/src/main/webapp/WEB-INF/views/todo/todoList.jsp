<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>todoList</h3>
<table>
      <tbody>
         <c:forEach var="todo" items="${ todoList }">
            <tr>
               <td>${todo.no}</td>
               <td>${todo.contents}</td>
               <td>${todo.todoYn}</td>
            </tr>
         </c:forEach>
      </tbody>
     
   </table>

</body>
</html>