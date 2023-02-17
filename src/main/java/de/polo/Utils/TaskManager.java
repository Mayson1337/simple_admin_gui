package de.polo.Utils;

import de.polo.Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaskManager {
    public static void runTask(int task) throws IOException {
        System.out.println(task);
        switch (task) {
            case 1 -> {
                System.out.println("You can now execute your command.");
                String command = readLine();
                runCommand(command);
            }
            case 2 -> {
                for (int i = 0; i < tasks().length; i++) {
                    System.out.println(">> " + tasks()[i]);
                }
            }
            case 100 -> System.exit(0);
            default -> System.out.println(Main.prefix + "an error occurred");
        }
    }
    public static String[] tasks() {
        return new String[]{"exit", "addUser"};
    }
    public static void runCommand(String cmd) {
        cmd = cmd.toLowerCase();
        switch(cmd) {
            case "exit" -> {
                System.out.println("");
                System.exit(0);
            }
            case "addUser" -> {
                System.out.println("Insert the user you wanna add.");
            }
            default -> System.out.println("Command not found. Run Task 2.");
        }
    }
    public static String readLine() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return reader.readLine();
    }
}
