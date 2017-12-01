<%@ page pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <%@ taglib uri="http://seolsam.com/jsp/jstl/pagetag" prefix="pagetag" %>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<c:import url="/WEB-INF/views/inc/head.jsp"/>
	
	<script>
		function goPage(page){
			$("#page").val(page);
			$("#frmSearch").submit();
		}
	</script>
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
            <form id="frmSearch" id="frmSearch" action="${_ctx}/board/doc/list"   method = "get" class="search_area">
                <input type="hidden" name="page" id="page" value="1" />
                <input type="hidden" name="mapId" value="${map.mapId}" />
                
                <dl>
                    <dt>검색타입</dt>
                    <dd>
                        <select name="searchType" style="height:30px;">
                            <option value="">::검색목록::</option>
                            <option value="T">제목</option>
                            <option value="C">내용</option>
                            <option value="R">작성자</option>
                            <option value="TC">제목+내용</option>
                        </select>
                    </dd>
                    
                    
                    <dt>검색어</dt>
                    <dd>
                    <input type="text" name="searchText" style="height:30px;" />
                    </dd>
                    
                    <dd>
                    <input type="submit" value="검색" style="width:50px; height:30px;"/>
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
                
                <pagetag:paging page="${search}" script="goPage"></pagetag:paging>
    
                <div class="btnSet">
                    <a href="${_ctx}/board/doc/write?mapId=${map.mapId}" class="disPB btnBase">글쓰기</a>
                </div>
                
            </div>
        </div>
    
    </div>
	</div>
</body>
</html>