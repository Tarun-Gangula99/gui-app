package com.ecommerce.dao;

public class UserDAO {

    public static boolean validate(String user, String pass) {
        return user.equals("admin") && pass.equals("admin");
    }
}
