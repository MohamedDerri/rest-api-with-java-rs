package com.derri.cabinetmedecinrest.Dao;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Connection {

    private static Connection con = null;

    static
    {
        String url = "jdbc:mysql://localhost:3306/medecin";
        String user = "root";
        String pass = "medderri";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("after DB");
            con = (Connection) DriverManager.getConnection(url, user, pass);
        }
        catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
    public static Connection getInstance()
    {
        return con;
    }

    public Object createStatement() {
        return null;
    }

    public Object prepareStatement(String sql) {
        return null;
    }
}
