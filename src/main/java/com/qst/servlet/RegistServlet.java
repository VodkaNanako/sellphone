package com.qst.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.qst.dao.UserDao;
import com.qst.bean.Person;
@WebServlet("/RegistServlet")
public class RegistServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        doPost(request, response);
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");


        String person_pn = request.getParameter("phone"); //获取jsp页面传过来的参数
        String person_pd = request.getParameter("password");
        Person person = new Person(); //实例化一个对象，组装属性
        person.setPerson_pn(person_pn);
        person.setPerson_pd(person_pd);

        UserDao ud = new UserDao();

        try {
            if(ud.register(person)){
                request.setAttribute("phone", person_pn);  //向request域中放置参数
                PrintWriter w = response.getWriter();
                w.write("<script>");
                w.write("alert(\"注册成功！\");");
                w.write("window.location.href='login.html'");
                w.write("</script>");
                w.flush();
                w.close();
            }else{
                PrintWriter w = response.getWriter();
                w.write("<script>");
                w.write("alert(\"注册失败！\");");
                w.write("window.location.href='regist.html'");
                w.write("</script>");
                w.flush();
                w.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}