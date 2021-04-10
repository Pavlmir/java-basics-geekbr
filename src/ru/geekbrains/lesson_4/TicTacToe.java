package ru.geekbrains.lesson_4;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    static void start() {
        char[][] field = createField();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input number of points to win...");
        int pointWin = scanner.nextInt();
        drawField(field);

        while (true) {
            doPlayerMove(field);
            if (isWin(field, 'X', pointWin) || isDraw(field)) {
                break;
            }

            doAIMove(field);
            if (isWin(field, 'O', pointWin) || isDraw(field)) {
                break;
            }
        }
    }

    static boolean isWin(char[][] field, char sign, int pointWin) {
        // horizontal
        boolean isWinLine = false;
        int numb = 0;
        for (int i = 0; i < field.length; i++) { // обходим строки
            isWinLine = true;
            for (int j = 0; j < field[0].length; j++) { // обходим столбцы
                if (field[i][j] != sign) {
                    isWinLine = false;
                    break;
                }
                else {
                    numb = numb + 1;
                }
            }
            if (isWinLine == true || numb == pointWin) {
                return true;
            }
        }

        // vertical
        numb = 0;
        for (int j = 0; j < field[0].length; j++) { // обходим столбцы
            isWinLine = true;
            for (int i = 0; i < field.length; i++) { // обходим строки
                if (field[i][j] != sign) {
                    isWinLine = false;
                    break;
                }
                else {
                    numb = numb + 1;
                }
            }
            if (isWinLine == true || numb == pointWin) {
                return true;
            }
        }

        // diagonals down
        numb = 0;
        for (int i = 0; i < field.length; i++) { // обходим строки
            if (field[i][i] != sign) {
                isWinLine = false;
                break;
            }
            else {
                numb = numb + 1;
            }
        }
        if (isWinLine == true || numb == pointWin) {
            return true;
        }

        // diagonals up
        numb = 0;
        for (int i = 0; i < field.length; i++) { // обходим строки
            if (field[i][field.length - i - 1] != sign) {
                isWinLine = false;
                break;
            }
            else {
                numb = numb + 1;
            }
        }
        if (isWinLine == true || numb == pointWin) {
            return true;
        }

        return false;
    }

    static boolean isDraw(char[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                if (isCellFree(field, i, j)) {
                    return false;
                }
            }
        }
        return true;
    }

    static void doAIMove(char[][] field) {
        Random random = new Random();
        int row, col;

        do {
            row = random.nextInt(field.length);
            col = random.nextInt(field.length);
        } while (isCellOccupied(field, row, col));

        field[row][col] = 'O';
        drawField(field);
    }

    static void doPlayerMove(char[][] field) {
        int row;
        int col;
        do {
            System.out.println("Please input coordinates...");
            row = getCoordinate("row", field.length);
            col = getCoordinate("col", field.length);
        } while (isCellOccupied(field, row, col));

        field[row][col] = 'X';
        drawField(field);
    }

    static boolean isCellFree(char[][] field, int row, int col) {
        return !isCellOccupied(field, row, col);
    }

    static boolean isCellOccupied(char[][] field, int row, int col) {
        return field[row][col] != '-';
    }

    static int getCoordinate(String coordType, int fieldSize) {
        Scanner scanner = new Scanner(System.in);
        int coord;

        do {
            System.out.printf("Please input %s-coordinate [1-%s]...%n", coordType, fieldSize);
            coord = scanner.nextInt() - 1;
        } while (coord < 0 || coord >= fieldSize);

        return coord;
    }

    static char[][] createField() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input size of the field n x n...");
        int n = scanner.nextInt();
        char[][] field = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                field[i][j] = '-';
            }
        }
        return field;
    }

    static void drawField(char[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                System.out.print(field[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}