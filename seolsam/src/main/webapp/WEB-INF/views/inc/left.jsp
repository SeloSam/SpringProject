<%@ page pageEncoding="UTF-8"%>

    <div id="leftWrap">
    
    	<div id="infoWrap">
        
        	<div class="info_txt">
                <p class="info_name">${user.name}</p>
                <p class="info_date">${user.email}</p>
                <p class="info_date">2017.11.27 PM 14:13</p>
                <p  class="info_pic"><img src="${_ctx}/res/img/thum_img.jpg" alt="thum"></p>
            </div>
            
            <span><a href="${_ctx}/logout">로그아웃</a></span>
        
        </div>
        
        <div id="category">
        
        <!-- dtree 시작 -->
            <div class="dtree">
            </div>
            <!-- dtree 끝 -->
        
        </div>
    
    </div>
