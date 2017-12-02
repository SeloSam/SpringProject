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
			//해당한 input 박스에 백그라운드 색 바꾸기
			$("#join input[type='text'], input[type='password'], input[type='email']").focusin(function(){
				$(this).css("background-color", "#98d5f3");
			}).focusout(function(){
				$(this).css("background-color", "white");
			});
			
			//login id 포커스
			$("#lgnId").focus();
			
			//login ID 포커스 들어오면 주조건 isCheckedLgnId
			$("#lgnId").focus(function(){
				$("#isCheckedLgnId").val("N");
			});
			$("#imgCaptcha").click(function(){
	 			$(this).attr("src", "${_ctx}/captcha/index");
			});
		});
			
		function doJoin(){
			if($("#frmJoin").valid()){
				$.get("${_ctx}/captcha/isRight", {captcha : $("#captcha").val()}, function(data){
					//captcha성공시
					if(data == 1){
						var url = "seolsam/join";
						$.post=(url, $("#frmJoin").serialize(), function(data){
							if(data == 1){
								alert("회원가입에 성공하셨습니다.");
								document.location.href="/seolsam/index";
							}else{
								alert("회원가입에 실패했습니다. 관리자에게 문의 ㄱㄱ");
							}
						});
					}else{
						alert("캡챠 문자 다시 확인");
					}
				});
			} 
			
			
			$("#frmJoin").submit();
		}
		
		
		
		//login id check1
		function checkLgnId(){
			var lgnId=$("#lgnId").val();
			if(lgnId==""){
				$("#lgnId").focus();
				alert("로그인ID를 입력하세요");
			}else{
				var url="${_ctx}/join/checkLgnId";
				$.post(url, {id:lgnId}, function(data){
					if(data.code==0){
						$("#isCheckedLgnId").val("Y");
						alert(data.msg);
					}else{
						$("#isCheckedLgnId").val("N");
						alert(data.msg);
					}
				});
			}
		}
		
		
		//email check
		function checkEmail(){
			var email=$("#email").val();
			if(email==""){
				$("#email").focus();
				alert("이메일을 작성하세요");
			}else{
				var url="${_ctx}/join/checkEmail";
				$.post(url, {email:email}, function(data){
					if(data.code==0){
						alert(data.msg);
					}else{
						alert(data.msg);
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
        <input type="hidden" name="isCheckedLgnId" id="isCheckedLgnId" value="N" />
        	<dl>
            	<dt>로그인 ID</dt>
                <dd><input type="text" name="lgnId" minlength="4" id="lgnId" maxlength="20" placeholder="아이디" style="width:60%" checkId="true" required/><!-- /* alphanumeric="true" */ -->
                	<input type="button" onclick="checkLgnId()" value="IDcheck" style="width:80px; height:40px; vertical-align: top; cursor:pointer;"/>
                </dd>
                <dt>로그인 PW</dt>
                <dd><input type="password" name="lgnPw" id="lgnPw" minlength="6" maxlength="20" placeholder="비밀번호" checkPw="true" required/></dd>
                <dt>로그인 PW</dt>
                <dd><input type="password" name="lgnPw1" placeholder="비밀번호" equalTo="#lgnPw" required/></dd>
                <dt>이름</dt>
                <dd><input type="text" name="name" placeholder="이름" minlength="2" maxlength="10" required/></dd>
                <dt>핸드폰</dt>
                <dd><input type="text" name="phone" minlength="13" placeholder="전화번호" phone="true"/></dd>
                <dt>이메일</dt>
                <dd><input type="email" name="email" id="email"  style="width:60%" placeholder="이메일" required/>
                	<input type="button" onclick="checkEmail()" value="Echeck" style="width:80px; height:40px; vertical-align: top; cursor:pointer;"/>
            	</dd>
                <dt>캡챠</dt>
                <dd>
					<img src="${_ctx}/captcha/index" id="imgCaptcha" style="cursor:pointer;" />
                	<input type="text" name="captcha" id="captcha" placeholder="이미지 문자 작성" style="width:238px" required/>
            	</dd>
            </dl>
            <a href="#" class="loginBtn" onclick="doJoin();">저장</a>
            <a href="${_ctx}/login" class="joinBtn">취소</a>
        </form>
    </div>
</div>
</body>
</html>
