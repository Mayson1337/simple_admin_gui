package de.polo.Utils;

import javax.swing.*;
import java.sql.SQLException;

public class WindowManager {
    public static void playerLoggedIn(int id) {
        try {
            AccountManager.getUserFromId(id);
            JFrame frame = new JFrame();
            JPanel panel = new JPanel();
            JLabel adminGroupName = new JLabel(AccountManager.getGroupName());
        } catch (SQLException e) {
            for (int i = 0; i < 5; i++) {
                System.out.println("User with ID: " + id + " could NOT been loaded with success.");
            }
            throw new RuntimeException(e);
        }
    }
}
