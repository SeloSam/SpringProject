<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page pageEncoding="UTF-8"%>

    <div id="leftWrap">
    
    	<div id="infoWrap">
        
        	<div class="info_txt">
                <p class="info_name">${User.name}</p>
                <p class="info_date">2017.11.27 PM 14:13</p>
                <p  class="info_pic"><img src="${_ctx}/res/img/thum_img.jpg" alt="thum"></p>
            </div>
            
            <span><a href="#">로그아웃</a></span>
        
        </div>
        
        <div id="category">
        
        <!-- dtree 시작 -->
            <div class="dtree">
                <div class="dTreeNode"><img id="id0" alt="" src="${_ctx}/res/img/dtree_img/base.gif"><a href="#">전체</a></div>
                
                <div class="clip" id="dd0" style="display: block;">
                    
                    <div class="dTreeNode dtreeDepth1 txtCut">
                        <a href="javascript: d.o(1);"><img id="jd1" alt="" src="${_ctx}/res/img/dtree_img/minus.gif"></a><img id="id1" alt="" src="${_ctx}/res/img/dtree_img/folderopen.gif"><a class="node" id="sd1" onclick="javascript: d.s(1);" href="#">뎁스1</a>
                    </div>
                    
                    <div class="clip" id="dd1" style="display: block;">
                        
                        <div class="dTreeNode dtreeDepth2 txtCut"><img alt="" src="${_ctx}/res/img/dtree_img/line.gif">
                            <a href="javascript: d.o(2);"><img id="jd2" alt="" src="${_ctx}/res/img/dtree_img/minusbottom.gif"></a><img id="id2" alt="" src="${_ctx}/res/img/dtree_img/folderopen.gif"><a class="node" id="sd2" onclick="javascript: d.s(2);" href="#">뎁스1_1</a>
                        </div>
                        
                        <div class="clip" id="dd2" style="display: block;">
                            <div class="dTreeNode dtreeDepth3 txtCut"><img alt="" src="${_ctx}/res/img/dtree_img/line.gif"><img alt="" src="${_ctx}/res/img/dtree_img/empty.gif"><img alt="" src="${_ctx}/res/img/dtree_img/join.gif"><img id="id3" alt="" src="${_ctx}/res/img/dtree_img/page.gif"><a class="node" id="sd3" onclick="javascript: d.s(3);" href="#">뎁스1_1_1</a></div>
                            <div class="dTreeNode dtreeDepth3 txtCut"><img alt="" src="${_ctx}/res/img/dtree_img/line.gif"><img alt="" src="${_ctx}/res/img/dtree_img/empty.gif"><img alt="" src="${_ctx}/res/img/dtree_img/join.gif"><img id="id4" alt="" src="${_ctx}/res/img/dtree_img/page.gif"><a class="node" id="sd4" onclick="javascript: d.s(4);" href="#">뎁스1_1_2</a></div>
                            <div class="dTreeNode dtreeDepth3 txtCut"><img alt="" src="${_ctx}/res/img/dtree_img/line.gif"><img alt="" src="${_ctx}/res/img/dtree_img/empty.gif"><img alt="" src="${_ctx}/res/img/dtree_img/join.gif"><img id="id5" alt="" src="${_ctx}/res/img/dtree_img/page.gif"><a class="node" id="sd5" onclick="javascript: d.s(5);" href="#">뎁스1_1_3</a></div>
                            <div class="dTreeNode dtreeDepth3 txtCut"><img alt="" src="${_ctx}/res/img/dtree_img/line.gif"><img alt="" src="${_ctx}/res/img/dtree_img/empty.gif"><img alt="" src="${_ctx}/res/img/dtree_img/join.gif"><img id="id6" alt="" src="${_ctx}/res/img/dtree_img/page.gif"><a class="node" id="sd6" onclick="javascript: d.s(6);" href="#">뎁스1_1_4</a></div>
                            <div class="dTreeNode dtreeDepth3 txtCut"><img alt="" src="${_ctx}/res/img/dtree_img/line.gif"><img alt="" src="${_ctx}/res/img/dtree_img/empty.gif"><img alt="" src="${_ctx}/res/img/dtree_img/joinbottom.gif"><img id="id7" alt="" src="${_ctx}/res/img/dtree_img/page.gif"><a class="node" id="sd7" onclick="javascript: d.s(7);" href="#">뎁스1_1_5</a></div>
                        </div>
                        
                    </div>
                    
                    <div class="dTreeNode dtreeDepth1 txtCut">
                        <a href="javascript: d.o(8);"><img id="jd8" alt="" src="${_ctx}/res/img/dtree_img/minusbottom.gif"></a><img id="id8" alt="" src="${_ctx}/res/img/dtree_img/folderopen.gif"><a class="node" id="sd8" onclick="javascript: d.s(8);" href="#">뎁스1_2</a>
                        
                    </div>
                    
                    <div class="clip" id="dd8" style="display: block;">
                        
                        <div class="dTreeNode dtreeDepth2 txtCut"><img alt="" src="${_ctx}/res/img/dtree_img/empty.gif">
                            <a href="javascript: d.o(9);"><img id="jd9" alt="" src="${_ctx}/res/img/dtree_img/plusbottom.gif"></a><img id="id9" alt="" src="${_ctx}/res/img/dtree_img/folder.gif"><a class="node" id="sd9" onclick="javascript: d.s(9);" href="#">뎁스2_1</a>
                        </div>
                        
                        <div class="clip" id="dd9" style="display: none;">
                            <div class="dTreeNode dtreeDepth3 txtCut"><img alt="" src="${_ctx}/res/img/dtree_img/empty.gif"><img alt="" src="${_ctx}/res/img/dtree_img/empty.gif"><img alt="" src="${_ctx}/res/img/dtree_img/join.gif"><img id="id10" alt="" src="${_ctx}/res/img/dtree_img/page.gif"><a class="node" id="sd10" onclick="javascript: d.s(10);" href="#">뎁스2_1_1</a></div>
                            <div class="dTreeNode dtreeDepth3 txtCut"><img alt="" src="${_ctx}/res/img/dtree_img/empty.gif"><img alt="" src="${_ctx}/res/img/dtree_img/empty.gif"><img alt="" src="${_ctx}/res/img/dtree_img/join.gif"><img id="id11" alt="" src="${_ctx}/res/img/dtree_img/page.gif"><a class="node" id="sd11" onclick="javascript: d.s(11);" href="#">뎁스2_1_1</a></div>
                            <div class="dTreeNode dtreeDepth3 txtCut"><img alt="" src="${_ctx}/res/img/dtree_img/empty.gif"><img alt="" src="${_ctx}/res/img/dtree_img/empty.gif"><img alt="" src="${_ctx}/res/img/dtree_img/join.gif"><img id="id12" alt="" src="${_ctx}/res/img/dtree_img/page.gif"><a class="node" id="sd12" onclick="javascript: d.s(12);" href="#">뎁스2_1_1</a></div>
                            <div class="dTreeNode dtreeDepth3 txtCut"><img alt="" src="${_ctx}/res/img/dtree_img/empty.gif"><img alt="" src="${_ctx}/res/img/dtree_img/empty.gif"><img alt="" src="${_ctx}/res/img/dtree_img/join.gif"><img id="id13" alt="" src="${_ctx}/res/img/dtree_img/page.gif"><a class="node" id="sd13" onclick="javascript: d.s(13);" href="#">뎁스2_1_1</a></div>
                            <div class="dTreeNode dtreeDepth3 txtCut"><img alt="" src="${_ctx}/res/img/dtree_img/empty.gif"><img alt="" src="${_ctx}/res/img/dtree_img/empty.gif"><img alt="" src="${_ctx}/res/img/dtree_img/joinbottom.gif"><img id="id14" alt="" src="${_ctx}/res/img/dtree_img/page.gif"><a class="nodeSel" id="sd14" onclick="javascript: d.s(14);" href="#">뎁스2_1_1</a></div>
                        </div>
                        
                    </div>
                    
                </div>
            </div>
            <!-- dtree 끝 -->
        
        </div>
    
    </div>
