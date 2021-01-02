package com.qst.servlet;

import com.qst.bean.DateSeller;
import com.qst.bean.Phone;
import com.qst.dao.DateDao;
import com.qst.dao.PhoneDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet("/YearServlet")
public class YearServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        DateDao ud = new DateDao();
        List<DateSeller> yearAll = ud.getDateYear();
        request.setAttribute("yearAll",yearAll);
       request.getRequestDispatcher("/showyear.jsp").forward(request,response);
    }
}
