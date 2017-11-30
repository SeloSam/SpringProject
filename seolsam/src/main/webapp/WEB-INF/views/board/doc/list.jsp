<%@ page pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
 <%@ taglib uri="http://seolsam.com/jsp/jstl/pagetag" prefix="pagetag" %>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<c:import url="/WEB-INF/views/inc/head.jsp"/>
	
</head>
<body>
	<div id="wrap">
		<c:import url="/WEB-INF/views/inc/menu.jsp"/>
		<c:import url="/WEB-INF/views/inc/left.jsp"/>
		  
		<div id="rightWrap">
    
    	<div class="rightBlock">
            <div class="page_top">
                <h1>${map.mapName}</h1>
            </div>
            
            <!-- 검색 시작 -->
            <form id="searchEngine" method="post" name="searchEngine" action="#" target="_self" title="검색" class="search_area">
                
                <dl>
                    <dt>input[type=radio]</dt>
                    <dd>
                        <label for="radio1"><input type="radio" id="radio1"> radio1</label>
                        <label for="radio2"><input type="radio" id="radio2"> radio2</label>
                        <label for="radio3"><input type="radio" id="radio3"> radio3</label>
                    </dd>
                    <dt>input[type=check]</dt>
                    <dd>
                        <label for="check1"><input type="checkbox" id="check1"> check1</label>
                        <label for="check2"><input type="checkbox" id="check2"> check1</label>
                        <label for="check3"><input type="checkbox" id="check3"> check3</label>
                    </dd>
                    <dt>input[type=text]</dt>
                    <dd>
                        <input type="text" id="text1" placeholder="글자입력" title="입력">
                    </dd>
                    <dt>select</dt>
                    <dd>
                        <select name="select" title="선택">
                            <option value="select1">select1</option>
                            <option value="select2">select2</option>
                            <option value="select3">select3</option>
                        </select>
                    </dd>
                    <dt>input[type=submit]</dt>
                    <dd>
                        <input type="submit" title="입력">
                    </dd>
                </dl>            
            </form>
            <!-- 검색 끝 -->
            
            <div class="boardWrap">
                
                <table class="base_tbl">
                    <thead>
                        <tr>
                            <th width="8%">번호</th>
                            <th>제목</th>
                            <th width="15%">등록자</th>
                            <th width="15%">등록일</th>
                            <th width="10%">첨부파일</th>
                            <th width="10%">조회수</th>
                        </tr>
                    </thead>
                    <tbody>
                    	<c:forEach items="${list}" var="item">
	                        <tr>
	                            <td>${item.docId}</td>
	                            <td class="txtCut alignLeft"><a href="#">${item.title}</a></td>
	                            <td>${item.name}</td>
	                            <td><fmt:formatDate value="${item.regDt}" pattern="yyyy-MM-dd" /></td>
	                            <td>N</td>
	                            <td>${item.cntRead}</td>
	                        </tr>
                        </c:forEach>
                    </tbody>
                </table>
                
                <pagetag:paging page="" script="goPage"></pagetag:paging>
    
                <div class="btnSet">
                    <a href="${_ctx}/board/doc/write?mapId=${map.mapId}" class="disPB btnBase">글쓰기</a>
                </div>
                
            </div>
        </div>
    
    </div>
	</div>
</body>
</html>