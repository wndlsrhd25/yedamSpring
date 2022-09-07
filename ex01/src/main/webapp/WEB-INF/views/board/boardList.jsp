<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판</title>
</head>
<body>
   <table>
      <thead>
         <tr>
            <th>번호</th>
            <th>제목</th>
            <th>작성자</th>
            <th>작성일</th>
         </tr>
      </thead>
      <tbody>
         <c:forEach var="board" items="${ boardList }">
            <tr onclick="location.href='info?bno=${board.bno }'">
               <td>${board.bno}</td>
               <td>${board.title}</td>
               <td>${board.writer}</td>
               <td><fmt:formatDate value="${board.regdate}" pattern="yyyy년MM월dd일"></fmt:formatDate></td>
            </tr>
         </c:forEach>
      </tbody>
   </table>
   <!-- <button type="button" onclick="location.href='insert'">등록</button>-->
   <button type="button" onclick="location.href='../'">홈으로</button> 
</body>
</html>