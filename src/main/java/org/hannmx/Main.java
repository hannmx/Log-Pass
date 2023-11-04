package org.hannmx;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final String confirmPassword = "qwerty";

        System.out.print("Введите логин: ");
        String login = scanner.nextLine();

        System.out.print("\nВведите пароль: ");
        String password = scanner.nextLine();

        try {
            boolean result = Valid.validLogPass(login, password, confirmPassword);
            System.out.println("Результат проверки: " + result);
        }catch (WrongLoginException e) {
            System.out.println("WrongLoginException: " + e.getMessage());
        }catch (WrongPasswordException e) {
            System.out.println("WrongPasswordException: " + e.getMessage());
        }
    }
}