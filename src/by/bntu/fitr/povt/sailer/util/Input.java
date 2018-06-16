package by.bntu.fitr.povt.sailer.util;

import java.util.Scanner;

public class Input {

    public static int inputInteger() {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        return i;
    }

    public static double inputDouble() {
        Scanner in = new Scanner(System.in);
        double i = in.nextDouble();
        return i;
    }

    public static char inputChar() {
        Scanner in = new Scanner(System.in);
        char i = in.next().charAt(0);
        return i;
    }

    public static String inputString() {
        Scanner in = new Scanner(System.in);
        String i = in.next();
        return i;
    }
}
