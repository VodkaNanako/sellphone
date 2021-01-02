<%--
  Created by IntelliJ IDEA.
  User: VULCAN
  Date: 2020/12/30
  Time: 14:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>选择时间</title>
    <link rel="stylesheet" type="text/css" href="css/list.css"/>
    <style type="text/css">
        * {
            text-decoration: none;
        }
    </style>
</head>
<body>
<div class="list">
    <ul class="menu-list">
        <li>
            <div class="word">
                <a href="YearServlet">按年份统计</a>
            </div>
            <div class="img">
                <img src="images/years.png">
            </div>
        </li>
        <li>
            <div class="word">
                <a href="MonthServlet">按月份统计</a>
            </div>
            <div class="img">
                <img src="images/months.png">
            </div>
        </li>
        <li>
            <div class="word">
                <a href="WeekServlet">按周数统计</a>
            </div>
            <div class="img">
                <img src="images/weeks.png">
            </div>
        </li>
        <li>
            <div class="word">
                <a href="DayServlet">按天数统计</a>
            </div>
            <div class="img">
                <img src="images/days.png">
            </div>
        </li>
    </ul>
</div>
</body>
</html>
