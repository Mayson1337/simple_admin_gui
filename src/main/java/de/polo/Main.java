package de.polo;

import de.polo.GUIs.Login;
import de.polo.Utils.AccountManager;

public class Main {
    public static final String name = "ProjectAlpha";
    public static final String prefix = "[" + name + "]";
    public static void main(String[] args) {
        System.out.println(prefix + " started.");
        Login.createLoginWindow();
        AccountManager.setup();
    }
}