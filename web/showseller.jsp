<%--
  Created by IntelliJ IDEA.
  User: VULCAN
  Date: 2020/12/28
  Time: 10:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <base href="<%=basePath%>">
    <title>个人用户页面</title>
    <link rel="stylesheet" type="text/css" href="css/user.css">
</head>

<body>
<form action="UpdatesellServlet" method="post">
    <div class="user">
        <ul class="menu-list">
            <li>
                <div class="title">
                    用户类型：<br />
                    <div class="text">
                        管理员
                    </div>
                </div>
            </li>
            <li>
                <div class="title">
                    用户ID：<br />
                    <div class="text">
                        <input type="text" readonly value="${seller.seller_id}" name="seller_id" style="width: 250px;height: 50px;font-size: 40px;color: #ffc54a;background-color: #fc636b;">
                    </div>
                </div>
            </li>
            <li>
                <div class="title">
                    用户号码：<br />
                    <div class="text">
                        <input type="text" value="${seller.seller_pn}" name="seller_pn" style="width: 250px;height: 50px;font-size: 40px;color: #ffc54a;background-color: #fc636b;">
                    </div>
                </div>
            </li>
            <li>
                <div class="title">
                    用户密码：<br />
                    <div class="text">
                        <input type="text" value="${seller.seller_pd}" name="seller_pd" style="width: 250px;height: 50px;font-size: 40px;color: #ffc54a;background-color: #fc636b;">
                    </div>
                </div>
            </li>
        </ul>
        <div class="button">
            <input type="submit" value="修改" style="width:100px;height:56px;font-size: 35px;color: #ffc54a;background-color: #fc636b;"/>
        </div>
    </div>
</form>
</body>

