package by.bntu.fitr.povt.sailer.view;

import java.util.Scanner;

public class View {

    public String read(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return scanner.next();
    }

    public static void show(String message) {
        System.out.print(message);
    }
}