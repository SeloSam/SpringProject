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
	

	/*<c:if test="${not empty SPRING_SECURITY_LAST_EXCEPTION}">
	  	alert("${SPRING_SECURITY_LAST_EXCEPTION.message}");
	  	history.pushState(null, null, location.origin + location.pathname);
	  	<c:remove var = "SPRING_SECURITY_LAST_EXCEPTION" scope = "session" />
	  </c:if>*/
	
	$(function(){
		var params=getUrlParams();
		if(params.error==1){
			alert("잘못된 회원정보 입니다. 다시 확인하십시오.");
			history.pushState(null, null, location.origin + location.pathname);
		}
		$("#frmLogin").validate();
		
		//enter 입력시 로그인 버튼으로 
		$("#inputPw").keyup(function(event){
			if(event.which==13){
				$("#btnLogin").click();
			}
		});

		$("#btnLogin").click(function(){
			$("#frmLogin").submit();
		});
	});
	
	function getUrlParams(){
		var params={};
		window.location.search.replace(/[?&]+([^=&]+)=([^&]*)/gi, function(str, key, value) { params[key] = value; });
		return params;
	}
	
	$(function(){
		$("#login input[type='text'], input[type='password']").focusin(function(){
			$(this).css("background-color","#98d5f3");
		}).focusout(function(){
			$(this).css("background-color","white");
		});
	})
	
	</script>

</head>

<body>

<div id="loginWrap">

	
    <div id="login">
    	<h1>Login</h1>
        <form id="frmLogin" method="post" name="loginBlock" action="${_ctx}/security/login" target="_self" class="login_area">
        	<dl>
            	<dt>id</dt>
                <dd><input type="text" name="id" placeholder="User ID" required></dd>
                <dt>pw</dt>
                <dd><input type="password" name="pw" id="inputPw" placeholder="Password" required></dd>
            </dl>
            <a href="javascript:;" id="btnLogin" class="loginBtn" >로그인</a>
            <a href="${_ctx}/join" class="joinBtn">회원가입</a>
        
        </form>
        
    </div>

	

</div>

</body>
</html>
