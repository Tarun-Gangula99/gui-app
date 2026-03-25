<%@ page import="java.util.*,com.ecommerce.model.Cart" %>

<h2>Cart</h2>

<%
List<Cart> cart = (List<Cart>) session.getAttribute("cart");

if(cart != null){
    for(Cart c : cart){
%>
        <p><%= c.getProductName() %> - ₹<%= c.getPrice() %></p>
<%
    }
}
%>
