<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/day03_task/MyServlet" method="post">
		<h1>post방식</h1>
		<input type="text" name="id" placeholder="아이디">
		<input type="text" name="pw" placeholder="비밀번호">
		<button>제출</button>
	</form>
	
	<form action="/day03_task/MyServlet" method="get">
		<h1>get방식</h1>
		<input type="text" name="id" placeholder="아이디">
		<input type="text" name="pw" placeholder="비밀번호">
		<button>제출</button>
	</form>
</body>
</html>