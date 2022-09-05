<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="insertEmpInfo">	
<div>
	<label>ID : <input type="text" name="employeeId" ></label>
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
	<label>phone_number : <input type="text" name="phoneNumber" ></label>
</div>
<div>
	<label>hire_date : <input type="text" name="hireDate" ></label>
</div>
<div>
	<label>job_id : <input type="text" name="jobId"></label>
</div>
<div>
	<label>salary : <input type="text" name="salary"></label>
</div>

<div>
	<button type="submit">등록</button>
</div>
</form>
</body>
</html>