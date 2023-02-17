package de.polo.Utils;

import javax.swing.*;
import java.awt.*;

public class StyleManager {
    public static JButton acceptButton(JButton button) {
        String buttonText = button.getText();
        button.setForeground(Color.white);
        button.setBackground(Color.decode("#006400"));
        return button;
    }
    public static JButton denyButton(JButton button) {
        String buttonText = button.getText();
        button.setForeground(Color.white);
        button.setBackground(Color.red);
        return button;
    }
}
