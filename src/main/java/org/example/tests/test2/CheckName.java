package org.example.tests.test2;

import java.util.Scanner;

public class CheckName {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name:");
        String str = in.nextLine();
        if (str.equals("Вячеслав")) {
            System.out.println("Привет, Вячеслав");
        }
        else {
            System.out.println("Нет такого имени");
        }
    }
}
