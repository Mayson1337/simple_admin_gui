package de.polo.SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQL {
    static String url = "jdbc:mysql://localhost/database";
    static String user = "root";
    static String password = "wao5ea3Shiem4ahghiThaemar8Xiesoo";
    static int port = 3306;
    private static boolean error;
    public static Connection connection;
    public static Connection getConnection() throws SQLException {
        if(connection != null) {
            return connection;
        }
        Connection connection = DriverManager.getConnection(url, user, password);

        for (int i = 0; i < 5; i++) {
            System.out.println("[MySQL]: SQL is ready to go.");
        }
        return connection;
    }

    public static Statement getStatement() throws SQLException {
        if(connection != null) {
            return (Statement) connection;
        }
        Connection connection = DriverManager.getConnection(url, user, password);

        return connection.createStatement();
    }
    public static boolean isError() {
        return error;
    }

    public static void setError(boolean error) {
        MySQL.error = error;
    }

    public static void endConnection() throws SQLException {
        MySQL.connection.close();
    }

}
