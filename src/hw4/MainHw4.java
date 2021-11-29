package hw4;

import java.util.Random;
import java.util.Scanner;

public class MainHw4 {

    static final int SIZE = 3;
//    static final int DOTS_TO_WIN = 3;

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
            if (checkWin(DOT_X)) {
                System.out.println("Поздравляем! Вы выиграли!");
                break;
            }
            if (isFull()) {
                System.out.println("Ничья");
                break;
            }

            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
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

    /*public static boolean checkWin(char c) {            //метод проверки победы (8 возможных вариантов УПРОСТИТЬ!!!!)
        if (map[0][0] == c && map[0][1] == c && map[0][2] == c) {
            return true;
        }
        if (map[1][0] == c && map[1][1] == c && map[1][2] == c) {
            return true;
        }
        if (map[2][0] == c && map[2][1] == c && map[2][2] == c) {
            return true;
        }

        if (map[0][0] == c && map[1][0] == c && map[2][0] == c) {
            return true;
        }
        if (map[0][1] == c && map[1][1] == c && map[2][1] == c) {
            return true;
        }
        if (map[0][2] == c && map[1][2] == c && map[2][2] == c) {
            return true;
        }

        if (map[0][0] == c && map[1][1] == c && map[2][2] == c) {
            return true;
        }
        if (map[0][2] == c && map[1][1] == c && map[2][0] == c) {
            return true;
        }

        return false;
    }
}*/
    public static boolean checkWin(char c) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                int a = 0, b = 0, d = 0, e = 0;
                if (map[i][2 - j] == c) {//правая диагональ
                    a++;
                }
                if (a == SIZE) {
                    return true;
                } else if (map[i][j] == c) {//левая диагональ
                    b++;
                }
                if (b == SIZE) {
                    return true;
                } else if (map[0][j] == c || map[1][j] == c || map[2][j] == c) {//столбцы меняются
                    d++;
                }
                if (d == map.length) {
                    return true;
                } else if (map[i][0] == c || map[i][1] == c || map[i][2] == c) {   //строки меняются
                    e++;
                    if (e == map[i].length) {
                        return true;

                    }
                }
            }

            return false;
        }
        return false;
    }
}








