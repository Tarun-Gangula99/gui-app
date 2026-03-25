package com.ecommerce.servlet;

import com.ecommerce.dao.ProductDAO;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;

public class ProductServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        req.setAttribute("products", ProductDAO.getProducts());
        req.getRequestDispatcher("products.jsp").forward(req, res);
    }
}
