<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1> ask-bmi 페이지 </h1>
	
	<form action="/quiz/quiz04/result-bmi" method="post">
		이름 : <input type="text" name="name">
		키 : <input type="text" name="height">
		몸무게 : <input type="text" name="weight">
		<button type="submit">BMI 계산</button>
	</form>

</body>
</html>