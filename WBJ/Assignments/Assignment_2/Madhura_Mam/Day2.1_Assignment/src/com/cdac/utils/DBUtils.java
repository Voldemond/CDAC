package com.cdac.utils;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtils {
    private static final String URL = "jdbc:mysql://localhost:3306/advjava";
    private static final String USER = "root";
    private static final String PASSWORD = "cdac";

    public static Connection getConnection() throws Exception {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
