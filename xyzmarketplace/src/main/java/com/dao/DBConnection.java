package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static DBConnection connection;
    private Connection con;

    private DBConnection() {
        String url = "jdbc:h2:mem:";
        String driver = "org.h2.Driver";
        String user = "";
        String password = "";

        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static DBConnection getConnection() {
        if(connection == null) {
            synchronized (DBConnection.class) {
                if(connection == null)
                connection = new DBConnection();
            }
        }
        return connection;
    }

    public Connection getCon() {
        return con;
    }
}
