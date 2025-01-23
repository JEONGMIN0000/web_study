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

	<h1>관리자 페이지</h1>
	<h2> 호실 정보 수정</h2>
	
<!-- 	<form action="/admin/modifyUser" method="post"> -->
	<form action="" method="post">
<%-- 		<input type="hidden" name="id" value="${user.id}" ><br/> --%>
		<label> 아이디 <input type="text" name="id" value="${user.id}" disabled> </label><br/>
		<label> 비밀번호 <input type="text" name="pw" value="${user.pw}"> </label><br/>
		<label> 이름 <input type="text" name="name" value="${user.name}"> </label><br/>
		<h4>사용자 타입 </h4>
		<label> 고객 <input type="radio" name="userType" value="CUS" <c:if test="${user.userType == 'CUS'}"> checked </c:if>> </label>
		<label> 관리자 <input type="radio" name="userType" value="ADM" <c:if test="${user.userType == 'ADM'}"> checked </c:if>> </label>
		
<!-- 		<select name="userType"> -->
<%-- 			<option value="CUS" <c:if test="${user.userType == 'CUS'}"> selected </c:if> >사용자</option> --%>
<%-- 			<option value="ADM" <c:if test="${user.userType == 'ADM'}"> selected </c:if>>관리자</option> --%>
<!-- 		</select> -->
		
		<br/><br/>
		<button type="submit">수정하기</button>
		<button type="button" onclick="location.href='/admin/users'">고객목록보기</button>
	</form>
	
</body>
</html>