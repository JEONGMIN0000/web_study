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
	
	<h1> jstl2 </h1>
	
	<c:set var="var1" value="값 들어가는 곳"/>
	${var1}
	
	<a href="/jstl1">jstl1 페이지</a>
	
	<c:url var="jstl1Url" value="/jstl1" />
	<a href="${jstl1Url}">jstl1 c url</a>
	
<%-- 	${msgXml} --%>
	<c:out value="${msgXml}" escapeXml="true"/>
	
	${msg1}
	${msg2}
 	<c:out value="${msg1}" escapeXml="true"/> <%-- escapeXml="false" 생략 --%>
	<c:out value="${msg2}" escapeXml="true"/>
	
<!-- 이동	 -->
<%-- 	<c:redirect url="/jstl1"/> --%>
<%--	
	<script>
		location.href = "/jstl1";
	</script>
--%>
</body>
</html>