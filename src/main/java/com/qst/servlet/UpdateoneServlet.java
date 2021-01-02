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
import com.qst.dao.UserDao;

@WebServlet("/UpdateoneServlet")
public class UpdateoneServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String person_id = request.getParameter("person_id");
        int userId=Integer.parseInt(person_id);
        String person_pn=request.getParameter("person_pn");
        String person_pd=request.getParameter("person_pd");

        UserDao ud = new UserDao();

        if(ud.update(userId,person_pn,person_pd)){

            Person person;
            person=ud.getPersonone(person_pn,person_pd);

            HttpSession httpSession = request.getSession();
            httpSession.setAttribute("person",person);
            request.getRequestDispatcher("/SearchoneServlet").forward(request, response);
        }else{
            response.sendRedirect("index.jsp");
        }
    }
}

