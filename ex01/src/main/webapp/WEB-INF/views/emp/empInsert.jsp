<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 교수님과 함께  -->
<form action="insertInfo" method="post">	
<div>
	<label>ID : <input type="text" name="employeeId"></label>
</div>
<div>
	<label>first_name : <input type="text" name="firstName" ></label>
</div>
<div>
	<label>last_name : <input type="text" name="lastName" ></label>
</div>
<div>
	<label>email : <input type="text" name="email" ></label>
</div>
<div>
	<label>job_id : <input type="text" name="jobId" ></label>
</div>
<div>
	<label>salary : <input type="text" name="salary" ></label>
</div>
<div>
	<button type="submit">등록</button>
	<button type="button">목록</button>
</div>
</form>
</body>
</html>