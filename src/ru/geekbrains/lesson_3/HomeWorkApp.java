package ru.geekbrains.lesson_3;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWorkApp {
    public static void main(String[] args) {

        int num1 = 0;
        int num2 = 0;

        // Задание 1
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Введите 2 любых целых числа: ");
        num1 = scan1.nextInt();
        num2 = scan1.nextInt();
        boolean isWithin = checkNumber(num1, num2);
        System.out.printf("Сумма чисел %s и %s в промежутке от 10 до 20: %s%n", num1, num2, isWithin);

        // Задание 2
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Введите 1 любое целое число: ");
        num1 = scan2.nextInt();
        checkNegativePositivePrint(num1);

        // Задание 3
        Scanner scan3 = new Scanner(System.in);
        System.out.println("Введите 1 любое целое число: ");
        num1 = scan3.nextInt();
        boolean isNegative = checkNegativePositive(num1);
        System.out.printf("Число %s отрицательное %s%n", num1, isNegative);

        // Задание 4
        Scanner scan4 = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String str = scan4.nextLine();
        Scanner scan5 = new Scanner(System.in);
        System.out.println("Сколько раз вывести строку: ");
        num1 = scan5.nextInt();
        PrintScreen(str, num1);

        // Задание 5
        Scanner scanYear = new Scanner(System.in);
        System.out.println("Введите год: ");
        int year = scanYear.nextInt();
        boolean isLeapYear = getLeapYear(year);
        System.out.printf("Год %s високосный: %s", year, isLeapYear);

    }

    /*
   1. Написать метод, принимающий на вход два целых числа и проверяющий,
   что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
     */
    static boolean checkNumber(int num1, int num2) {
        boolean isWithin = false;
        int sum = num1 + num2;
        if (sum >= 10 && sum <= 20) {
            isWithin = true;
        }
        return isWithin;
    }

    /*
    2. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
     положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
     */
    static void checkNegativePositivePrint(int num) {
        if (num >= 0) {
            System.out.printf("Число %s положительное %n", num);
        } else {
            System.out.printf("Число %s отрицательное %n", num);
        }
    }

    /*
    3. Написать метод, которому в качестве параметра передается целое число.
    Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
     */
    static boolean checkNegativePositive(int num) {
        boolean isNegative = false;
        if (num < 0) {
            isNegative = true;
        }

        return isNegative;
    }

    /*
    4. Написать метод, которому в качестве аргументов передается строка и число, метод должен отпечатать
     в консоль указанную строку, указанное количество раз;
     */
    static void PrintScreen(String str, int num) {
        for (int i = 1; i <= num; i++) {
            System.out.printf("Строка: %s %n", str);
        }
    }

    /*
    5. * Написать метод, который определяет, является ли год високосным,
     и возвращает boolean (високосный - true, не високосный - false).
     Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
    */
    static boolean getLeapYear(int year) {
        boolean isLeapYear = false;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            isLeapYear = true;
        }
        return isLeapYear;
    }
}
