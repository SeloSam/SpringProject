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
		//login id check
		function checkLgnId(){
			var lgnId=$("#lgnId").val();
			if(lgnId==""){
				$("#lgnId").focus();
				alert("로그인ID를 입력하세요");
			}else{
				var url="${_ctx}/join/checkLgnId";
				$.post(url, {id:lgnId}, function(data){
					if(data.code==0){
						alert(data.msg);
					}else{
						alert(data.msg);
					}
				});
			}
		}
		
		
		function checkEmail(){
			var email=$("#email").val();
			if(email==""){
				$("#email").focus();
				alert("이메일을 작성하세요");
			}else{
				var url="${_ctx}/join/checkEmail";
				$.post(url, {email:email}, function(data){
					if(data.code==0){
						
					}
				});
			}
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
                <dd><input type="text" name="lgnId" minlength="4" id="lgnId" maxlength="20" placeholder="아이디" style="width:60%" required/>
                	<input type="button" onclick="checkLgnId()" value="IDcheck" style="width:80px; height:40px; vertical-align: top; cursor:pointer;"/>
                </dd>
                <dt>로그인 PW</dt>
                <dd><input type="password" name="lgnPw" id="lgnPw" minlength="6" maxlength="20" placeholder="비밀번호"required/></dd>
                <dt>로그인 PW</dt>
                <dd><input type="password" name="lgnPw1" placeholder="비밀번호" equalTo="#lgnPw" required/></dd>
                <dt>이름</dt>
                <dd><input type="text" name="name" placeholder="이름" minlength="2" maxlength="10" required/></dd>
                <dt>핸드폰</dt>
                <dd><input type="text" name="phone" minlength="13" placeholder="전화번호"/></dd>
                <dt>이메일</dt>
                <dd><input type="email" name="email" id="email"  style="width:60%" placeholder="이메일" required/>
                	<input type="button" onclick="checkEmail()" value="Echeck" style="width:80px; height:40px; vertical-align: top; cursor:pointer;"/>
            	</dd>
            </dl>
            <a href="#" class="loginBtn" onclick="doJoin();">저장</a>
            <a href="${_ctx}/login" class="joinBtn">취소</a>
        </form>
    </div>
</div>
</body>
</html>
