<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<c:import url="WEB-INF/views/inc/head.jsp"/>
	<script type="text/javascript">
		$(function(){
			history.pushState(null, null, location.origin+location.pathname);
		});
	</script>

<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	${User.name}님! 회원가입을 축하드립니다.
	<br>
	로그인을 해주시길 바랍니다.
	<br>
	<a href="${_ctx}/login">로그인 화면으로 이동</a>
</body>
</html>