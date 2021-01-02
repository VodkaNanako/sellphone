package com.qst.servlet;

import com.qst.bean.DateSeller;
import com.qst.dao.DateDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/MonthServlet")
public class MonthServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        DateDao ud = new DateDao();
        List<DateSeller> monthAll = ud.getDateMonth();
        request.setAttribute("monthAll",monthAll);
       request.getRequestDispatcher("/showmonth.jsp").forward(request,response);
    }
}
