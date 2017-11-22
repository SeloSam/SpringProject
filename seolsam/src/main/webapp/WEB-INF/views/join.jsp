<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page pageEncoding="UTF-8"%>

<c:set var="_ctx" 
 value="${pageContext.request.contextPath == '/' ? '' : pageContext.request.contextPath }" 
 scope="application" />

    
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<c:import url="/WEB-INF/views/inc/head.jsp" />
	<script>
		$(function(){
			$("#frmJoin").validate();
		});
			
		function doJoin(){
			 $("#frmJoin").submit();
		}
	</script>


</head>

<body>

<div id="loginWrap">
    <div id="join">
    	<h1>회원가입</h1>
        <form id="frmJoin" name="frmJoin" action="${_ctx}/join" method="post">
        	<dl>
            	<dt>로그인 ID</dt>
                <dd><input type="text" name="lgnId" placeholder="login Id" required/></dd>
                <dt>로그인 PW</dt>
                <dd><input type="password" name="lgnPw" placeholder="login Pw"required/></dd>
                <dt>로그인 PW</dt>
                <dd><input type="password" name="lgnPw" placeholder="login Pw"required/></dd>
                <dt>이름</dt>
                <dd><input type="text" name="name" placeholder="name"required/></dd>
                <dt>핸드폰</dt>
                <dd><input type="text" name="phone" placeholder="phone"/></dd>
                <dt>이메일</dt>
                <dd><input type="text" name="email" placeholder="email" required/></dd>
            </dl>
            <a href="#" class="loginBtn" onclick="doJoin();">저장</a>
            <a href="index" class="joinBtn">취소</a>
        </form>
    </div>
</div>
</body>
</html>
