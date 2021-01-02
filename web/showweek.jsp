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
    <title>周销量统计</title>
    <style type="text/css">
        table
        {
            border-collapse: collapse;
            margin: 0 auto;
            text-align: center;
            color: #ffc54a;
            font-weight: bolder;
            font-size: 20px;
        }
        table a
        {
            color: #fc636b;
            text-decoration: none;
        }
        table td, table th
        {
            border: 1px solid #cad9ea;//线条

        height: 30px;
        }
        table thead th
        {
            background-color: #a23d33;//标题
        width: 100px;
            height: 40px;
        }
        table tr:nth-child(odd)
        {
            background: #fff;//奇数行
        }
        table tr:nth-child(even)
        {
            background: #F5FAFA;//偶数行
        }
        button{
            background-color: #a23d33;
            color: #ffc54a;
        }
    </style>
</head>

<body>

<table  width="90%" class="table">
    <thead>
    <tr>
        <th>当年周数</th>
        <th>销售量</th>
    </tr>
    </thead>

    <c:forEach var="U" items="${weekAll}">
        <tr>
            <td>${U.weeks}</td>
            <td>${U.count}</td>
        </tr>
    </c:forEach>
    <form action="selecttime.jsp">
        <input type="submit" value="返回" style="color: #ffc54a;background-color: #fc636b;width: 63px;height: 40px;top: 7px;left: 4px;font-size: 24px;position: absolute;"/>
    </form>
</table>
</body>
