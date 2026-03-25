package com.ecommerce.dao;

import com.ecommerce.model.Product;
import java.util.*;

public class ProductDAO {

    public static List<Product> getProducts() {
        List<Product> list = new ArrayList<>();

        list.add(new Product(1, "Mobile", 15000));
        list.add(new Product(2, "Laptop", 50000));
        list.add(new Product(3, "Shoes", 2000));
        list.add(new Product(4, "Watch", 3000));

        return list;
    }
}
