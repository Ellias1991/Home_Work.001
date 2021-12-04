package hw4;

import java.util.Random;
import java.util.Scanner;

public class MainHw4 {

    static final int SIZE = 3;
    static final int DOTS_TO_WIN = 3;

    static final char DOT_X = 'X';
    static final char DOT_O = 'O';
    static final char DOT_EMPTY = '.';

    static char[][] map;

    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();


    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X, DOTS_TO_WIN)) {
                System.out.println("Поздравляем! Вы выиграли!");
                break;
            }
            if (isFull()) {
                System.out.println("Ничья");
                break;
            }

            aiTurn();
            printMap();
            if (checkWin(DOT_O, DOTS_TO_WIN)) {
                System.out.println("Компьютер победил.");
                break;
            }
            if (isFull()) {
                System.out.println("Ничья");
                break;
            }
        }
    }


    public static void initMap() {    //метод инициализирующий карту  с точками
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printMap() {
        System.out.print("  ");          //пробелы обозначили
        for (int i = 1; i <= SIZE; i++) {
            System.out.print(i + " ");   //распечатаны номера столбов
        }
        System.out.println();                 //перенос строки
        for (int i = 0; i < SIZE; i++) {      //метод распечатывающий карту с точками
            System.out.print(i + 1 + " ");    //распечатаны номера строк
            for (int j = 0; j < SIZE; j++) {
                System.out.printf("%c ", map[i][j]);
            }
            System.out.println();
        }
    }

    public static void humanTurn() {     //метод означающий ход человека
        int x, y;
        do {
            System.out.println("input X,Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(y, x));
        map[y][x] = DOT_X;             //y---номер строки, х--номер столбца
    }

    public static boolean isCellValid(int y, int x) {   //метод проверяющий правильно ли сделан ход
        if (y < 0 || x < 0 || y >= SIZE || x >= SIZE) {
            return false;
        }
        return map[y][x] == DOT_EMPTY;
    }

    public static void aiTurn() {          //метод означающий ход компьютера
        int x, y;
        do {
            y = random.nextInt(SIZE);
            x = random.nextInt(SIZE);
        } while (!isCellValid(y, x));
        map[y][x] = DOT_O;
    }

    public static boolean isFull() {      //метод проверяющий заполнено ли поле полностью
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean checkingLines(int y, int x, int vy, int vx, char c, int Winline) {
        if (x + vx * (Winline - 1) > SIZE - 1 || (y + vy * (Winline - 1) > SIZE - 1 || y + vy * (Winline - 1) < 0)) {
            return false;
        }
        for (int i = 0; i < Winline; i++) {
            if (map[y + i * vy][x + i * vx] != c) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkWin(char c, int Winline) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (checkingLines(i, j, 0, 1, c, Winline)) return true;
                if (checkingLines(i, j, 1, 0, c, Winline)) return true;
                if (checkingLines(i, j, 1, 1, c, Winline)) return true;
                if (checkingLines(i, j, -1, 1, c, Winline)) return true;
            }
        }
        return false;

    }

}






