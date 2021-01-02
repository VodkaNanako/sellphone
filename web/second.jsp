<%--
  Created by IntelliJ IDEA.
  User: VULCAN
  Date: 2020/12/29
  Time: 15:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>管理首页</title>
    <link rel="stylesheet" type="text/css" href="css/top-areat.css"/>
    <link rel="stylesheet" type="text/css" href="css/jm.css"/>
    <style type="text/css">
        * {
            text-decoration: none;
        }
    </style>
</head>
<body style="margin-left: 0px;margin-top: 0px;margin-right: 0px;margin-bottom: 0px;" background="images/firstbg.jpg">
<div class="top-area">
    <ul class="menu-list">
        <li>
            <div class="img"><a href="https://space.bilibili.com/37505828" target="_blank"><img src="images/head.jpg"/></a></div>
            <div class="one">
                <div class="first">
                    <a href="login.html">nanako</a>
                </div>
                <div class="second">
                    <a href="login.html">手机销售系统</a>
                </div>
            </div>
        </li>
        <li>
            <div class="firstA">
                <a href="#" onclick="document.getElementById('cont1').style.display='block',
						document.getElementById('cont2').style.display='none',document.getElementById('cont3').style.display='none',
						document.getElementById('cont4').style.display='none'">
                    手 机 信 息 </a>
            </div>
        </li>
        <li>
            <div class="secondA">
                <a href="#" onclick="document.getElementById('cont2').style.display='block',
						document.getElementById('cont1').style.display='none',document.getElementById('cont3').style.display='none',
						document.getElementById('cont4').style.display='none'">
                    <label>销 售 信 息</label> </a>
            </div>
        </li>
        <li>
            <div class="thridA">
                <a href="#" onclick="document.getElementById('cont3').style.display='block',
					    document.getElementById('cont1').style.display='none',document.getElementById('cont2').style.display='none',
						document.getElementById('cont4').style.display='none'">
                    <label>分 类 模 块</label> </a>
            </div>
        </li>
        <li>
            <div class="fifthA">
                <a href="#" onclick="document.getElementById('cont4').style.display='block',
					    document.getElementById('cont1').style.display='none',document.getElementById('cont2').style.display='none',
						document.getElementById('cont3').style.display='none'">
                    <label>个人中心</label> </a>
            </div>
        </li>
    </ul>
</div>

<div class="jm">
    <div id="cont1" style="display:block">
        　 <iframe src="WatchallServlet" width="1200px" height="800"></iframe>
    </div>
    <div id="cont2" style="display:none">
        　 <iframe src="selecttime.jsp" width="1200px" height="800"></iframe>
    </div>
    <div id="cont3" style="display:none">
        　 <iframe src="SearchspeciesServlet" width="1200px" height="800"></iframe>
    </div>
    <div id="cont4" style="display:none">
        　 <iframe src="SearchoneServlet" width="1200px" height="800"></iframe>
    </div>
</div>
</body>
</html>
