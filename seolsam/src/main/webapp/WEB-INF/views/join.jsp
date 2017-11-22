<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

<meta http-equiv="X-UA-Compatible" content="IE=Edge"/>
<meta name="keywords" content="한국경영원 인재개발원" />
<meta name="subject" content="한국경영원 인재개발원" />
<meta name="description" content="매뉴얼" />
<meta name="robots" content="길라잡이, 매뉴얼" />
<meta name="copyright" content="COPYRIGHT ⓒ KMS. ALL RIGHTS RESERVED." />
<title>test</title>


<!-- css -->
<link href="${_ctx}/res/css/base.css" rel="stylesheet" type="text/css" />
<link href="${_ctx}/res/css/layout.css" rel="stylesheet" type="text/css" />

<!-- js -->
<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js"></script>
<script type="text/javascript" src="${_ctx}/res/js/main.js"></script>


</head>

<body>

<div id="loginWrap">
    <div id="join">
    	<h1>Join</h1>
        <form id="joinBlock" method="post" name="joinBlock" action="#" target="_self" title="회원가입" class="join_area">
        	<dl>
            	<dt>first name</dt>
                <dd><input type="text" name="first name" placeholder="First Name" title="first name"></dd>
                <dt>last name</dt>
                <dd><input type="text" name="last name" placeholder="Last Name" title="Last name"></dd>
                <dt>user Id</dt>
                <dd><input type="text" name="user id" placeholder="User id" title="user id"></dd>
                <dt>pw</dt>
                <dd><input type="password" name="pw" placeholder="Password" title="pw"></dd>
                <dt>date of birth</dt>
                <dd><input type="text" name="date of birth" placeholder="date of birth" title="date of birth"></dd>
                <dt>Phone number</dt>
                <dd><input type="text" name="Phone number" placeholder="Phone number" title="Phone number"></dd>
            </dl>
            <a href="list" class="loginBtn">Save</a>
            <a href="index" class="joinBtn">Cancel</a>
        </form>
    </div>
</div>
</body>
</html>
