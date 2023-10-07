package org.example;

import java.util.Scanner;

public class Task4 {

    public static String STORED_PASSWORD = "secret123";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputPassword;

        System.out.println("Введіть пароль:");

        while (true) {
            inputPassword = scanner.nextLine();

            if (inputPassword.equals(STORED_PASSWORD)) {
                System.out.println("Пароль вірний!");
                break;
            } else {
                System.out.println("Невірний пароль, спробуйте ще раз:");
            }
        }
    }
}

