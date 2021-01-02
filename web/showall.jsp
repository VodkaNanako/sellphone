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
    <title>所有用户页面</title>
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
    </style>
</head>

<body>

<table  width="90%" class="table">
    <thead>
    <tr>
        <th>编号</th>
        <th>手机名称</th>
        <th>手机品牌</th>
        <th>手机种类</th>
        <th>手机价格</th>
        <th>售卖日期</th>
        <th>操作</th>
    </tr>
    </thead>

    <c:forEach var="U" items="${phoneAll}"  >
        <form action="UpdateServlet" method="post">
            <tr>
                <td><input readonly type="text" value="${U.phone_id}" name="phone_id" style="color: #ffc54a; font-weight: bolder;" ></td>
                <td><input type="text" value="${U.phone_name}" name="phone_name" style="color: #fc636b;"></td>
                <td><input type="text" value="${U.phone_brand}" name="phone_brand" style="color: #00a1d6;"></td>
                <td><input type="text" value="${U.phone_species}" name="phone_species" style="color: #ff69b4;"></td>
                <td><input type="text" value="${U.phone_price}" name="phone_price" style="color: #40E0D0; font-weight: bolder;"></td>
                <td><input type="text" value="${U.phone_date}" name="phone_date"></td>
                <td>
                   <a href="DeleteServlet?phone_id=${U.phone_id}">删除</a>
                    <input type="submit" value="更新" style="color: #ffc54a;background-color: #fc636b;font-size: 18px;"/>
                </td>
            </tr>
    </form>
    </c:forEach>
</table>
</body>
