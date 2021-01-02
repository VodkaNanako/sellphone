package com.qst.servlet;

import com.qst.bean.Person;
import com.qst.bean.Seller;
import com.qst.dao.SellerDao;
import com.qst.dao.UserDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/UpdatesellServlet")
public class UpdatesellServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String seller_id = request.getParameter("seller_id");
        int userId=Integer.parseInt(seller_id);
        String seller_pn=request.getParameter("seller_pn");
        String seller_pd=request.getParameter("seller_pd");

        SellerDao ud = new SellerDao();

        if(ud.update(userId,seller_pn,seller_pd)){

            Seller seller;
            seller=ud.getSellerone(seller_pn,seller_pd);

            HttpSession httpSession = request.getSession();
            httpSession.setAttribute("seller",seller);
            request.getRequestDispatcher("/SearchsellServlet").forward(request, response);
        }else{
            response.sendRedirect("index.jsp");
        }
    }
}

