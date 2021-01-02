package com.qst.servlet;

import com.qst.bean.Phone;
import com.qst.dao.PhoneDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet("/SearchspeciesServlet")
public class SearchspeciesServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        PhoneDao ud = new PhoneDao();

        List<Phone> speciesAll = ud.getSpecies();
        HttpSession httpSession = request.getSession();
        httpSession.setAttribute("speciesAll", speciesAll);
        request.getRequestDispatcher("/species.jsp").forward(request, response);
    }
}