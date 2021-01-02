package com.qst.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.qst.dao.PhoneDao;
import com.qst.utils.Dateutils;

@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String phone_id = request.getParameter("phone_id");
        int userId=Integer.parseInt(phone_id);
        String phone_name=new String(request.getParameter("phone_name").getBytes("iso-8859-1"),"utf-8");
        String phone_brand = new String(request.getParameter("phone_brand").getBytes("iso-8859-1"),"utf-8");
        String phone_species = new String(request.getParameter("phone_species").getBytes("iso-8859-1"),"utf-8");
        String phone_price=request.getParameter("phone_price");
        int userPrice=Integer.parseInt(phone_price);
        String phone_date=request.getParameter("phone_date");
        Date userDate=Dateutils.strToDate(phone_date);

        PhoneDao ud = new PhoneDao();

        if(ud.update(userId,phone_name,phone_brand,phone_species,userPrice,userDate)){
            request.getRequestDispatcher("/SearchallServlet").forward(request, response);
        }else{
            response.sendRedirect("index.jsp");
        }
    }
}

