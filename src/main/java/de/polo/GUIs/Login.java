package de.polo.GUIs;

import de.polo.SQL.MySQL;
import de.polo.Utils.StyleManager;
import de.polo.Utils.WindowManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;

public class Login {
    public static void createLoginWindow() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JLabel usernameLabel = new JLabel("Username");
        JLabel passwordLabel = new JLabel("Password");
        usernameLabel.setForeground(Color.white);
        passwordLabel.setForeground(Color.white);
        panel.add(usernameLabel);
        panel.add(passwordLabel);

        JTextField username = new JTextField();
        JPasswordField password = new JPasswordField();
        panel.add(username);
        panel.add(password);

        JButton loginButton = new JButton("Login");
        StyleManager.acceptButton(loginButton);
        panel.add(loginButton);
        panel.setBackground(Color.decode("#252525"));
        loginButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (username.getText().equalsIgnoreCase("") && password.getPassword().equals("")) {
                        JOptionPane.showMessageDialog(new JOptionPane(), "Überprüfe deine Eingabe.");
                        System.out.println("Error button click.");
                    } else {
                        Statement statement = null;
                        try {
                            statement = MySQL.getStatement();
                            ResultSet result = statement.executeQuery("SELECT `id` FROM `admins` WHERE `username` = '" + username.getText() + "' AND `password` = '" + Arrays.toString(password.getPassword()) + "'");
                            if (result.next()) {
                                frame.setVisible(false);
                                WindowManager.playerLoggedIn(result.getInt(1));
                            }
                        } catch (SQLException ex) {
                            throw new RuntimeException(ex);
                        }
                    }
                }
                public void onHover(MouseEvent e) {

                }
            });

        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
