package org.example;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        if (findMissingNumber(numbers) == 0)
            System.out.println("Нема пропущених чисел ");
        else
            System.out.println("Пропущене число: " + findMissingNumber(numbers));
    }

    public static int findMissingNumber(int[] numbers) {
        // Знаходимо очікувану суму чисел від 1 до 10
        int expectedSum = 10 * (10 + 1) / 2;

        // Знаходимо суму чисел у масиві
        int actualSum = 0;
        for (int num : numbers) {
            actualSum += num;
        }

        // Повертаємо різницю між очікуваною та фактичною сумою
        return expectedSum - actualSum;
    }

}



