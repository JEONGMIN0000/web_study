<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>관리자 페이지</h1>
	<h2>users 고객 목록</h2>

	<p> 
		${user.id} ${user.pw} ${user.name}
		<c:choose>
			<c:when test="${user.userType == 'CUS'}"> 사용자 </c:when>
			<c:when test="${user.userType == 'ADM'}"> 관리자 </c:when>
		</c:choose>
	</p>
	<br/>
	<button type="button" onclick="modifyUser('${user.id}')"> 수정하기 </button>
<%-- 	<button type="button" onclick="location.href='/admin/modifyUser/${user.id}'">수정하기</button> --%>
	<button type="button" onclick="location.href='/admin/users'">고객목록보기</button>
	
	<script>
		
	function modifyUser(id) {
	    location.href = '/admin/modifyUser?id=' + id;
	}
		
	</script>

</body>
</html>