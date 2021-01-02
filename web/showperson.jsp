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
<form action="UpdateoneServlet" method="post">
    <div class="user">
        <ul class="menu-list">
            <li>
                <div class="title">
                    用户类型：<br />
                    <div class="text">
                        普通用户
                    </div>
                </div>
            </li>
            <li>
                <div class="title">
                    用户ID：<br />
                    <div class="text">
                        <input type="text" readonly value="${person.person_id}" name="person_id" style="width: 250px;height: 50px;font-size: 40px;color: #ffc54a;background-color: #fc636b;">
                    </div>
                </div>
            </li>
            <li>
                <div class="title">
                    用户号码：<br />
                    <div class="text">
                        <input type="text" value="${person.person_pn}" name="person_pn" style="width: 250px;height: 50px;font-size: 40px;color: #ffc54a;background-color: #fc636b;">
                    </div>
                </div>
            </li>
            <li>
                <div class="title">
                    用户密码：<br />
                    <div class="text">
                        <input type="text" value="${person.person_pd}" name="person_pd" style="width: 250px;height: 50px;font-size: 40px;color: #ffc54a;background-color: #fc636b;">
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

