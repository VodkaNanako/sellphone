package com.qst.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.qst.dao.PhoneDao;
@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String phone_id = request.getParameter("phone_id");
        int userId = Integer.parseInt(phone_id);

        PhoneDao ud = new PhoneDao();

        if(ud.delete(userId)){
            request.getRequestDispatcher("/SearchallServlet").forward(request, response);
        }else{
            response.sendRedirect("index.jsp");
        }
    }
}
