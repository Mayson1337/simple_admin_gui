package de.polo.Commands;

import de.polo.Utils.TaskManager;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.Arrays;

public class MainCMD {
    public static void start() throws IOException {
        System.out.println(Arrays.toString(Window.getWindows()));
        System.out.println(" ");
        System.out.println("============= PROJECT ALPHA =============");
        System.out.println(" ");
        System.out.println("List of all tasks:");
        System.out.println(" 1. Execute");
        System.out.println(" 2. List Executable commands");
        System.out.println(" 3. Run AI");
        System.out.println(" 100. Exit");
        System.out.println(" ");
        int task = Integer.parseInt(TaskManager.readLine());
        TaskManager.runTask(task);
    }

}
