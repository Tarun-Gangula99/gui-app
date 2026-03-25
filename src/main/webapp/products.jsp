<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<h2>Products</h2>

<c:forEach var="p" items="${products}">
    <p>${p.name} - ₹${p.price}</p>
    <form action="cart" method="post">
        <input type="hidden" name="name" value="${p.name}">
        <input type="hidden" name="price" value="${p.price}">
        <button>Add to Cart</button>
    </form>
</c:forEach>

<a href="cart.jsp">Go to Cart</a>
