<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>${arrDan}단  ${row}까지 출력</h1>
	
	<c:forEach items="${list}" var="item">
		
		<c:forEach items="${item.arrDan}" var="dan1">
			<img src="/seolsam/res/img/${dan1}.png" style="width: 25px; height: 25px;">	
		</c:forEach>
		
		<img src="/seolsam/res/img/x.png" style="width: 25px; height: 25px;">
		
		<c:forEach items="${item.arrRow}" var="row1">
			<img src="/seolsam/res/img/${row1}.png" style="width: 25px; height: 25px;">	
		</c:forEach>

		<img src="/seolsam/res/img/ecol.png" style="width: 25px; height: 25px;">

		<c:forEach items="${item.arrResult}" var="result">
			<img src="/seolsam/res/img/${result}.png" style="width: 25px; height: 25px;">
		</c:forEach>
		
		<br/>
	
	</c:forEach>
	
	<a href="/seolsam/gugu/index"><input type="button" value="뒤로" ></a>
	
	</body>
</html>