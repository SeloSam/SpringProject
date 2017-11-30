<%@ page pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<c:import url="/WEB-INF/views/inc/head.jsp"/>
	<script>
	function doWrite(){
		$("#frmWrap").submit();
	};
	</script>
</head>
<body>
	<div id="wrap">
		<c:import url="/WEB-INF/views/inc/menu.jsp"/>
		<c:import url="/WEB-INF/views/inc/left.jsp"/>
		<div id="rightWrap">
    
    	<div class="rightBlock">
            <div class="page_top">
                <h1>[${map.mapName}] 게시판 등록</h1>
            </div>
            
            <div class="boardWrap">
               	<form action="${_ctx}/board/doc/doWrite" id="frmWrap" method="post">
               		<input type="hidden" name="mapId" value="${map.mapId}"/>
	                <table class="base_tbl tbl_write">
	                	<tbody><tr>
	                        <th width="20%" class="t_color">제목입력</th>
	                        <td><input type="text" name="title"/></td>
	                    </tr>
	                    <tr>
	                        <th class="t_color">내용입력</th>
	                        <td><textarea name="boardContents"></textarea></td>
	                    </tr>
	                	</tbody>
	                </table>
	               
	                <div class="btnSet alignCenter">
	                    <a href="#" class="disPB btnBase" onclick="doWrite();"id = "btnSave">저장</a>
	                    <a href="${_ctx}/list" class="disPB btnBase">취소</a>
	                </div>
            	</form>
            </div>
        </div>
    
    </div>  
	</div>
</body>
</html>

