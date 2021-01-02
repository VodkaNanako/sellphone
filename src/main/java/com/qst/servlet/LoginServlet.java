package com.qst.servlet;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.qst.bean.Person;
import com.qst.bean.Seller;
import com.qst.dao.UserDao;
import com.qst.dao.SellerDao;
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {  //需要继承HttpServlet  并重写doGet  doPost方法
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        doPost(request, response);  //将信息使用doPost方法执行   对应jsp页面中的form表单中的method
    }
    public void doPost(HttpServletRequest request,
                       HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");

        String phone = request.getParameter("phone"); //得到jsp页面传过来的参数
        String pwd = request.getParameter("password");
        String sellerphone = request.getParameter("phone"); //得到jsp页面传过来的参数
        String sellerpwd = request.getParameter("password");

        UserDao ud = new UserDao();
        SellerDao sd=new SellerDao();

        if(sd.login(sellerphone, sellerpwd)){
            Seller seller;
            seller=sd.getSellerone(sellerphone,sellerpwd);
            HttpSession  httpSession = request.getSession();
            httpSession.setAttribute("seller",seller);
            request.getRequestDispatcher("/first.jsp").forward(request, response);//转发到成功页面
        }
        if (ud.login(phone, pwd)){
            Person person;
            person=ud.getPersonone(phone,pwd);
                    HttpSession  httpSession = request.getSession();
            httpSession.setAttribute("person",person);
            request.getRequestDispatcher("/second.jsp").forward(request, response);//转发到成功页面
        }
        else{
            PrintWriter w = response.getWriter();
            w.write("<script>");
            w.write("alert(\"登录失败！\");");
            w.write("window.location.href='login.html'");
            w.write("</script>");
            w.flush();
            w.close();
            response.sendRedirect("login.html"); //重定向到首页
        }

    }

}
