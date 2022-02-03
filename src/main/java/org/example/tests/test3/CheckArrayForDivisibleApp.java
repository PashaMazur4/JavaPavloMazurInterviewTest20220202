package org.example.tests.test3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CheckArrayForDivisibleApp {
    public static void main(String[] args) {
        int [] nums = new int[5];
        Scanner in = new Scanner(System.in);
        try {
            for (int i = 0; i < nums.length; i++) {
                System.out.println("Введите целое число:");
                nums[i] = in.nextInt();
            }
            CheckArrayForDivisibleByThreeNumbers.checkArrayForDivisibleByThreeNumbers(nums);
        }
        catch (InputMismatchException exception) {
            System.out.println("Введено некорректное значение. Попробуйте заново.");
        }

    }
}
