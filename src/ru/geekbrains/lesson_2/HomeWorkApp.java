package ru.geekbrains.lesson_2;

public class HomeWorkApp {
    public static void main(String[] args) {
        setIntegerArray();      // задание 1
        setEmptyIntegerArray(); // задание 2
        setArrayWhithLoop();    // задание 3
        createSquareArray();    // задание 4
        getArray();             // задание 5
        getMaxMinArray();       // задание 6
        checkBalance();         // задание 7
        shiftedCyclically();    // задание 8
    }

    /*
    1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
    С помощью цикла и условия заменить 0 на 1, 1 на 0;
     */
    static void setIntegerArray() {

        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    /*
    2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
     */
    static void setEmptyIntegerArray() {
        int a = 8;
        int b = 10;

        if (a >= b) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    /*
    3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
     */
    static void setArrayWhithLoop() {
        int value = 18;

        if (value <= 0) {
            System.out.println("Красный");
        } else if (0 > value && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    /*
    4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
    и с помощью цикла(-ов) заполнить его диагональные элементы единицами
    (можно только одну из диагоналей, если обе сложно). Определить элементы одной
    из диагоналей можно по следующему принципу: индексы таких элементов равны,
    то есть [0][0], [1][1], [2][2], …, [n][n];
     */
    static void createSquareArray() {
        int a = 8;
        int b = 10;

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    /*
    5. Написать метод, принимающий на вход два аргумента: len и initialValue,
    и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;
    */
    static void getArray() {
        int a = 8;
        int b = 10;

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    /*
    6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы ;
    */
    static void getMaxMinArray() {
        int a = 8;
        int b = 10;

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    /*
    7. ** Написать метод, в который передается не пустой одномерный целочисленный массив,
    метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
    **Примеры:
    checkBalance([2, 2, 2, 1, 2, 2, ||| 10, 1]) → true, т.е. 2 + 2 + 2 + 1 + 2 + 2 = 10 + 1
    checkBalance([1, 1, 1, ||| 2, 1]) → true, т.е. 1 + 1 + 1 = 2 + 1
    граница показана символами |||, эти символы в массив не входят и не имеют никакого отношения к ИЛИ
    */
    static void checkBalance() {
        int a = 8;
        int b = 10;

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    /*
    8. *** Написать метод, которому на вход подается одномерный массив и число n
    (может быть положительным, или отрицательным), при этом метод должен сместить все элементы массива на n позиций.
     Элементы смещаются циклично. Для усложнения задачи нельзя пользоваться вспомогательными массивами.
     Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1] при n = -2 (на два влево)
      -> [ 6, 1, 3, 5 ]. При каком n в какую сторону сдвиг можете выбирать сами.
    */
    static void shiftedCyclically() {
        int a = 8;
        int b = 10;

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
}
