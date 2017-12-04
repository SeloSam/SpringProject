<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page pageEncoding="UTF-8"%>

<%-- <c:set var="_ctx" 
 value="${pageContext.request.contextPath == '/' ? '' : pageContext.request.contextPath }" 
 scope="application" />
	 --%>

<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<%@ include file="/WEB-INF/views/inc/head.jsp" %>
<!-- 	<script>
		function frmIdCk(){
			url="${_ctx}/find/findId";
			$.post(url,$('#frmIdCk').serialize(), function(data){
				if(data==1){
					alert("입력한 메일로 비밀번호가 발송됨.");
					location.href="${_ctx}";
				}else if(data==0){
					alert("검색결과가없음");
					location.reload();
				}else{
					alert("[ERROR : 비밀번호 찾기 오류]");
				}
			});
			$("#frmIdCk").submit();
		}
	</script> -->

</head> 
<body>
<div id="loginWrap">
    <div id="login">
    	<h1>아이디 찾기</h1>
        <form id="frmIdCk" method="post" name="idCkBlock" action="${_ctx}/security/find" target="_self" class="login_area">
        	<dl>
            	<dt>이름</dt>
                <dd><input type="text" name="name" placeholder="User Name" required></dd>
                <dt>이메일</dt>
                <dd><input type="email" name="email" id="inputEmail" placeholder="Email" required></dd>
            </dl>
            <a href="#" id="btnIdCk" class="idCkBtn" >확인</a>
            <a href="${_ctx}/join" class="joinBtn">뒤로가기</a>
        </form>
    </div>
</div>
</body>
</html>
