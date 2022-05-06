package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class Util {

    private static final String URL = "jdbc:mysql://localhost:3306/MySQL";
    private static final String USER = "root";
    private static final String PASSWORD = "xkp7mj#E";
    private static Connection connection =null;
    private Util() {
    }

    public static Connection getConnection() {
        try { connection= DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return connection;
    }
}

