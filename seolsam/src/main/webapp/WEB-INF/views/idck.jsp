<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page pageEncoding="UTF-8"%>

<c:set var="_ctx" 
 value="${pageContext.request.contextPath == '/' ? '' : pageContext.request.contextPath }" 
 scope="application" />
	

<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<%@ include file="/WEB-INF/views/inc/head.jsp" %>
	<script>
		$(function(){
			$("#btnIdCk").click(function(){
				$("#frmIdCk").submit();
			});
			
		});
	</script>

</head>
<body>
<div id="loginWrap">
    <div id="login">
    	<h1>아이디 찾기</h1>
        <form id="frmIdCk" method="post" name="idCkBlock" action="${_ctx}/security/idck" target="_self" class="login_area">
        	<dl>
            	<dt>id</dt>
                <dd><input type="text" name="id" placeholder="User ID" required></dd>
                <dt>이메일</dt>
                <dd><input type="email" name="email" id="inputEmail" placeholder="Email" required></dd>
            </dl>
            <a href="javascript:;" id="btnIdCk" class="idCkBtn" >확인</a>
            <a href="${_ctx}/join" class="joinBtn">뒤로가기</a>
        </form>
    </div>
</div>
</body>
</html>
