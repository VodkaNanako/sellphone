package com.qst.servlet;

import com.qst.bean.Phone;
import com.qst.dao.PhoneDao;
import com.qst.dao.SellerDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet("/WatchallServlet")
public class WatchallServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        PhoneDao ud = new PhoneDao();
        List<Phone> phoneAll = ud.getPhoneAll();
        HttpSession httpSession = request.getSession();
        httpSession.setAttribute("phoneAll", phoneAll);

        request.getRequestDispatcher("/watchall.jsp").forward(request, response);
    }
}