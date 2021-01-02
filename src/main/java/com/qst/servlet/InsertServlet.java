package com.qst.servlet;

import com.qst.bean.Person;
import com.qst.bean.Phone;
import com.qst.dao.UserDao;
import com.qst.dao.PhoneDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

@WebServlet("/InsertServlet")
public class InsertServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        doPost(request, response);
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");


        String phone_name = request.getParameter("name"); //获取jsp页面传过来的参数
        String phone_brand = request.getParameter("brand");
        String phone_species = request.getParameter("species");
        String phone_price = request.getParameter("price");
        int userPrice=Integer.parseInt(phone_price);
        Phone phone = new Phone(); //实例化一个对象，组装属性
        phone.setPhone_name(phone_name);
        phone.setPhone_brand(phone_brand);
        phone.setPhone_species(phone_species);
        phone.setPhone_price(userPrice);

        PhoneDao ud = new PhoneDao();
        PhoneDao sd = new PhoneDao();

        if(ud.register(phone)){
            List<Phone> phoneAll = sd.getPhoneAll();
            HttpSession httpSession = request.getSession();
            httpSession.setAttribute("phoneAll", phoneAll);
            System.out.println("11111"+phoneAll);
           PrintWriter w = response.getWriter();
            w.write("<script>");
            w.write("alert(\"添加成功！\");");
            w.write("window.location.href='insert.jsp'");
            w.write("</script>");
            w.flush();
            w.close();

        }
    }
}