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
                System.out.println("Der Nutzer mit der ID: " + id + " konnte nicht geladen werden.");
            }
            throw new RuntimeException(e);
        }
    }
}
