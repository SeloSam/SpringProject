<%@ page pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:set var="_ctx" 
 value="${pageContext.request.contextPath == '/' ? '' : pageContext.request.contextPath }" 
 scope="application" />

    <div id="leftWrap">
    
    
    <script>
    
    var d=null;
    
    $(function(){
    	 loadingTree();
     });
     
     //tree 가져오기
     function loadingTree(){
    	var url="${_ctx}/board/map/listByTree";
    	$.get(url, function(data){
    		d = new dTree('d');
    		
    		if($.isArray(data)){
	    		/* d.add(0,-1,'My example tree'); */
    			$(data).each(function(){
    				console.log(this);
    				
    				if(this.parMapId==null){
    					d.add(this.mapId, -1, this.mapName);
    				}else if(this.mapType == 'F'){
    					d.add(this.mapId, this.parMapId, this.mapName);
    					
    				}else{
    					d.add(this.mapId, this.parMapId, this.mapName, "${_ctx}/board/doc/list?mapId="+this.mapId);
    				}
    			});
    		}else{
    			alert("데이터가 잘못되었습니다. 관리자에게 문의하세요");
    		}
			$("#category").html(d.toString());
			
			d.openAll();
    	});
     }
    </script>
    
    	<div id="infoWrap">
        	<div class="info_txt">
                <p class="info_name">${user.name}</p>
                <p class="info_date">${user.email}</p>
                <p class="info_date">2017.11.27 PM 14:13</p>
                <p  class="info_pic"><img src="${_ctx}/res/img/thum_img.jpg" alt="thum"></p>
            </div>
            
            <span><a href="">나의정보수정</a></span>
            <span><a href="${_ctx}/logout">로그아웃</a></span>
        
        </div>
        
        <div id="category">
        
        <!-- dtree 시작 -->
        </div>
    
    </div>
