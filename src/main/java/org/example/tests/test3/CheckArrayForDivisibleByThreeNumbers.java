package org.example.tests.test3;

import java.util.ArrayList;

public class CheckArrayForDivisibleByThreeNumbers {
    public static void checkArrayForDivisibleByThreeNumbers (int [] arrayToCheck) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i: arrayToCheck
        ) {
            if (i % 3 == 0 && i != 0) {
                result.add(i);
            }
        }
        if (result.isEmpty()) {
            System.out.println("В массиве нет чисел кратных 3");
        }
        else {
            System.out.println("Числа кратные 3: " + result.toString());
        }
    }
}
