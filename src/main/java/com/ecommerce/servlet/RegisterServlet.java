package com.ecommerce.servlet;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;

public class RegisterServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        String username = req.getParameter("username");
        String password = req.getParameter("password");

        // For now just store in session (no DB)
        HttpSession session = req.getSession();
        session.setAttribute("user", username);

        // Redirect to login page
        res.sendRedirect("login.jsp");
    }
}
