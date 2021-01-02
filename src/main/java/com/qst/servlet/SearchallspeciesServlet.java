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

@WebServlet("/SearchallspeciesServlet")
public class SearchallspeciesServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String phone_species = request.getParameter("phone_species");

        PhoneDao ud = new PhoneDao();

        List<Phone> searchspecies = ud.getPhoneSpecies(phone_species);

        HttpSession httpSession = request.getSession();
        httpSession.setAttribute("searchspecies", searchspecies);
        request.getRequestDispatcher("/showallspecies.jsp").forward(request, response);
    }
}