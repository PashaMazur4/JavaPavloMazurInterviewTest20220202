package org.example.tests.test1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите целое число");
            int i = in.nextInt();
            if (i > 7) {
                System.out.println("Привет");
            }
        }
        catch (InputMismatchException exception) {
            System.out.println("Недопустимый символ. Введите целое число");
        }
    }
}
