<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
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
	${User.name}��! ȸ�������� ���ϵ帳�ϴ�.
	<br>
	�α����� ���ֽñ� �ٶ��ϴ�.
	<br>
	<a href="${_ctx}/login">�α��� ȭ������ �̵�</a>
</body>
</html>