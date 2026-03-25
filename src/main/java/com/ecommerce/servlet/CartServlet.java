package com.ecommerce.servlet;

import com.ecommerce.model.Cart;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.util.*;

public class CartServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        String name = req.getParameter("name");
        double price = Double.parseDouble(req.getParameter("price"));

        HttpSession session = req.getSession();
        List<Cart> cart = (List<Cart>) session.getAttribute("cart");

        if (cart == null) {
            cart = new ArrayList<>();
        }

        cart.add(new Cart(name, price));
        session.setAttribute("cart", cart);

        res.sendRedirect("cart.jsp");
    }
}
