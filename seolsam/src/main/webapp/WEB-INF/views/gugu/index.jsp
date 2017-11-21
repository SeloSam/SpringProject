<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" pageEncoding="UTF-8"%>
<html>
<head>
	<title>gugudan 화면</title>
</head>
<body>
<h1>
	gugudan 화면<br>
</h1>
<form action="/seolsam/gugu/gugu" method="get">
			<label>원하는 구구단을 입력하세요~(2~9 숫자만)</label><br><br>
			<input type="text" name="dan" style="width:30" placeholder="dan">	
			
			<input type="text" name="row" style="width:30" placeholder="val">	
			<input type="submit" value="확인">
</form>		
</body>
</html>
