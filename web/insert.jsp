<%--
  Created by IntelliJ IDEA.
  User: VULCAN
  Date: 2020/12/29
  Time: 17:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="zxx">

<head>
    <title>添加信息</title>
    <!-- Meta tag Keywords -->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta charset="UTF-8" />
    <meta name="keywords"
          content="Desk Login form Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
    <!-- //Meta tag Keywords -->

    <link href="//fonts.googleapis.com/css?family=Mukta:200,300,400,500,600,700,800" rel="stylesheet">

    <!--/Style-CSS -->
    <link rel="stylesheet" href="css/style.css" type="text/css" media="all" />
    <!--//Style-CSS -->
</head>

<body background="images/firstbg.jpg">
<section class="w3l-forms-main-61">
    <div class="form-inner">
        <div class="wrapper">
            <div class="d-grid top-form">
                <div class="logo">
                    <a class="brand-logo" href="login.html"><span><span class="fa fa-viadeo"
                                                                        aria-hidden="true"></span>手机销售系统</span></a>
                    <!-- if logo is image enable this
                                <a class="brand-logo" href="#index.html">
                                    <img src="image-path" alt="Your logo" title="Your logo" style="height:35px;" />
                                </a> -->
                </div>
            </div>
            <div class="form-bg-blur">
                <div class="form-61">
                    <h4 class="form-head">添加手机</h4>

                    <form action="InsertServlet" method="POST">
                        <div class="">
                            <p class="text-head">手机名称</p>
                            <input type="text" name="name" class="input" required />
                        </div>
                        <div class="">
                            <p class="text-head">手机品牌</p>
                            <input type="text" name="brand" class="input" required />
                        </div>
                        <div class="">
                            <p class="text-head">手机种类</p>
                            <input type="text" name="species" class="input" required />
                        </div>
                        <div class="">
                            <p class="text-head">手机价格</p>
                            <input type="text" name="price" class="input" required />
                        </div>
                        <!-- <label class="remember">
                             <input type="checkbox">
                             <span class="checkmark"></span>记住我
                         </label>-->
                        <button type="submit" class="signinbutton btn">添加</button>
                        <!--                        <p class="signup">还没注册？<a href="#forgot" class="signuplink">点我</a></p>-->
                    </form>
                </div>
            </div>
            <!--
            <div class="go-to-home text-center">
                <p>Want to Create account? <a class="btn" href="signup.html"> Signup </a></p>
            </div> -->
        </div>
        <div class="copyright text-center">
            <div class="wrapper">
                <p class="copy-footer-29">© 2021 Phone insert form. All rights reserved | Designed by <a
                        href="https://space.bilibili.com/37505828">nanako</a></p>
            </div>
        </div>
    </div>
</section>
</body>
</html>
