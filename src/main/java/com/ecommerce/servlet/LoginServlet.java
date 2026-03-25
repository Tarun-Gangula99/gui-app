package com.ecommerce.servlet;

import com.ecommerce.dao.UserDAO;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;

public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        String user = req.getParameter("username");
        String pass = req.getParameter("password");

        if (UserDAO.validate(user, pass)) {
            req.getSession().setAttribute("user", user);
            res.sendRedirect("products");
        } else {
            res.sendRedirect("login.jsp");
        }
    }
}
