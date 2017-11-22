<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page pageEncoding="UTF-8"%>
<c:set var="_ctx" 
 value="${pageContext.request.contextPath == '/' ? '' : pageContext.request.contextPath }" 
 scope="application" />
 
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

<meta http-equiv="X-UA-Compatible" content="IE=Edge"/>
<meta name="keywords" content="한국경영원 인재개발원" />
<meta name="subject" content="한국경영원 인재개발원" />
<meta name="description" content="매뉴얼" />
<meta name="robots" content="길라잡이, 매뉴얼" />
<meta name="copyright" content="COPYRIGHT ⓒ KMS. ALL RIGHTS RESERVED." />
<title>seolsam</title>


<!-- css -->
<link href="${_ctx}/res/css/base.css" rel="stylesheet" type="text/css" />
<link href="${_ctx}/res/css/layout.css" rel="stylesheet" type="text/css" />

<!-- js -->
<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js"></script>
<script type="text/javascript" src="${_ctx}/res/js/main.js"></script>


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
