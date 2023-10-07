package org.example;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int input;

        System.out.println("Введіть числа (введіть 0, щоб завершити):");

        do {
            input = scanner.nextInt();
            sum += input;
        } while (input != 0);

        System.out.println("Сума всіх введених чисел: " + sum);
    }
}


