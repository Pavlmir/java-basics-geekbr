package ru.geekbrains.lesson_2;

import java.util.Arrays;

public class HomeWorkApp {
    public static void main(String[] args) {

        int[] array1 = setIntegerArray();
        System.out.println("Задание 1: " + Arrays.toString(array1));

        int[] array2 = setEmptyIntegerArray();
        System.out.println("Задание 2:" + Arrays.toString(array2));

        int[] array3 = setArrayWhithLoop();
        System.out.println("Задание 3:" + Arrays.toString(array3));

        int[][] array4 = createSquareArray();
        System.out.println("Задание 4:");
        for (int i = 0; i < array4.length; i++) {  //идём по строкам
            for (int j = 0; j < array4.length; j++) {//идём по столбцам
                System.out.print(" " + array4[i][j] + " "); //вывод элемента
            }
            System.out.println(); // перенос строки ради визуального сохранения табличной формы
        }

        int[] array5 = getArray(7, 8);
        System.out.println("Задание 5:" + Arrays.toString(array5));

        System.out.println("\nЗадание 6:");
        int[] array6 = getMaxMinArray();
        System.out.println("\nМинимальный элемент массива = " + array6[0]);
        System.out.println("Максимальный элемент массива = " + array6[1] + "\n");

        int[] array7 = {1, 2, 2, 2, 1, 2, 2, 10, 1, 1};
        System.out.println("Задание 7:");
        System.out.println(checkBalance(array7));

        int[] numbs = {3, 5, 6, 1};
        int[] array8 = shiftedCyclically(numbs, -2);
        System.out.println("Задание 8:" + Arrays.toString(array8));
    }

    /*
    1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
    С помощью цикла и условия заменить 0 на 1, 1 на 0;
     */
    static int[] setIntegerArray() {
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
        }
        return array;
    }

    /*
    2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
     */
    static int[] setEmptyIntegerArray() {
        int[] array = new int[100];
        ;
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        return array;
    }

    /*
    3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
     */
    static int[] setArrayWhithLoop() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] = array[i] * 2;
            }
        }
        return array;
    }

    /*
    4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
    и с помощью цикла(-ов) заполнить его диагональные элементы единицами
    (можно только одну из диагоналей, если обе сложно). Определить элементы одной
    из диагоналей можно по следующему принципу: индексы таких элементов равны,
    то есть [0][0], [1][1], [2][2], …, [n][n];
     */
    static int[][] createSquareArray() {
        int[][] twoDimArray = new int[5][5];
        for (int i = 0; i < twoDimArray.length; i++) {  //идём по строкам
            for (int j = 0; j < twoDimArray.length; j++) {//идём по столбцам
                if (i == j | (i + j == twoDimArray.length - 1)) {
                    twoDimArray[i][j] = 1;
                }
            }
        }
        return twoDimArray;
    }

    /*
    5. Написать метод, принимающий на вход два аргумента: len и initialValue,
    и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;
    */
    static int[] getArray(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = initialValue;
        }

        return array;
    }

    /*
    6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы ;
    */
    static int[] getMaxMinArray() {
        int[] array = new int[7];

        // Заполняем
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.print(array[i] + ", ");
        }

        int minPosition = 0;
        int maxPosition = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[minPosition] > array[i]) {
                minPosition = i;
            }
            if (array[maxPosition] < array[i]) {
                maxPosition = i;
            }
        }
        int[] arrayMinMax = {array[minPosition], array[maxPosition]};

        return arrayMinMax;
    }

    /*
    7. ** Написать метод, в который передается не пустой одномерный целочисленный массив,
    метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
    **Примеры:
    checkBalance([2, 2, 2, 1, 2, 2, ||| 10, 1]) → true, т.е. 2 + 2 + 2 + 1 + 2 + 2 = 10 + 1
    checkBalance([1, 1, 1, ||| 2, 1]) → true, т.е. 1 + 1 + 1 = 2 + 1
    граница показана символами |||, эти символы в массив не входят и не имеют никакого отношения к ИЛИ
    */
    static boolean checkBalance(int[] array) {
        boolean isFound = false;
        int sumLeft = 0;
        int sumRight = 0;

        for (int i = 2; i < array.length - 1; i++) {
            sumLeft = 0;
            sumRight = 0;

            for (int j = 0; j < i; j++) {
                sumLeft = sumLeft + array[j];
            }

            for (int l = i; l < array.length; l++) {
                sumRight = sumRight + array[l];
            }

            if (sumLeft == sumRight) {
                isFound = true;
                break;
            }
        }

        return isFound;
    }

    /*
    8. *** Написать метод, которому на вход подается одномерный массив и число n
    (может быть положительным, или отрицательным), при этом метод должен сместить все элементы массива на n позиций.
     Элементы смещаются циклично. Для усложнения задачи нельзя пользоваться вспомогательными массивами.
     Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1] при n = -2 (на два влево)
      -> [ 6, 1, 3, 5 ]. При каком n в какую сторону сдвиг можете выбирать сами.
    */
    static int[] shiftedCyclically(int[] array, int n) {
        // Убираем полные обороты, если кол-во шагов сдвига больше размера массива
        if ( Math.abs(n) >= array.length)
            n = n % array.length;

        int a;

        for (int i = 0; i < Math.abs(n); i++) //Универсальный цикл для левого или правого сдвига
        {
            if (n > 0) { //Для правого - двигаем массив с конца
                a = array[array.length - 1];//запоминаем последний элемент для записи его в первый элемент
                for (int j = array.length - 1; j > 0; j--)
                {
                    array[j] = array[j - 1];
                }
                array[0] = a;
            }
            else
            { //Для левого - двигаем массив с начала
                a = array[0]; //запоминаем первый элемент для записи его в последний элемент
                for (int j = 0; j < array.length - 1; j++)
                {
                    array[j] = array[j + 1];
                }
                array[array.length - 1] = a;
            }
        }
        return array;
    }
}
