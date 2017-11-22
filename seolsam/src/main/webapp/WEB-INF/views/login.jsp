<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page pageEncoding="UTF-8"%>

<c:set var="_ctx" 
 value="${pageContext.request.contextPath == '/' ? '' : pageContext.request.contextPath }" 
 scope="application" />


<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<%@ include file="/WEB-INF/views/inc/head.jsp" %>
</head>

<body>

<div id="loginWrap">

	
    <div id="login">
    	<h1>Login</h1>
        <form id="loginBlock" method="post" name="loginBlock" action="#" target="_self" title="로그인" class="login_area">
        
        	<dl>
            	<dt>id</dt>
                <dd><input type="text" name="id" placeholder="User ID" title="ID"></dd>
                <dt>pw</dt>
                <dd><input type="password" name="pw" placeholder="Password" title="pw"></dd>
            </dl>
            
            <a href="${_ctx}/list" class="loginBtn">로그인</a>
            <a href="${_ctx}/join" class="joinBtn">회원가입</a>
        
        </form>
        
    </div>

	

</div>

</body>
</html>
