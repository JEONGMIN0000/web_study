<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1> result-bmi 페이지 </h1>
	<p>이름: ${name}</p>
    <p>키: ${height} cm</p>
	<p>몸무게: ${weight} kg</p>
    <p>BMI: ${result}</p>
    
    
	<p>이름 : ${personBmi.name}</p>
	<p>키 : ${personBmi.height}</p>
	<p>몸무게 : ${personBmi.weight}</p>
	<p>bmi 지수 : ${personBmi.bmi}</p>
</body>
</html>