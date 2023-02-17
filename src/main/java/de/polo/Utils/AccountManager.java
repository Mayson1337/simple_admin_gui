package de.polo.Utils;

import de.polo.SQL.MySQL;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;

public class AccountManager {
    public static HashMap<Integer, String> admingroups = new HashMap<Integer, String>();
    public static int grouplevel = 0;

    public static void setup() {
        admingroups.put(4, "Administration");
        admingroups.put(3, "High-Level-Support");
        admingroups.put(2, "Mid-Level-Support");
        admingroups.put(1, "Low-Level-Support");
        admingroups.put(0, "not assigned");
    }
    public static String getUserFromId(int id) throws SQLException {
        Statement statement = MySQL.getStatement();
        ResultSet result = statement.executeQuery("SELECT `admingroup` FROM admins WHERE id = " + id);
        grouplevel = result.getInt(1);
        return "soon"; // return user
    }
    public static void createUser() {
        //Create user
    }
    public static String getGroupName() {
        return admingroups.get(grouplevel);
    }
}
