package hw1;

public class MainApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 40;
        int b = 60;
        int c = a + b;
        if (c >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = 10;
        if (value <= 0) {
            System.out.println("Красный");

        } else if (value > 0 || value <= 100) {
            System.out.println("Жёлтый");

        } else if (value > 100) {
            System.out.println("Зелёный");
        }
    }


    public static void compareNumbers() {

        int a = 50;
        int b = 90;
        if (a >= b) {

            System.out.println("a > = b");
        } else {
            System.out.println("a < b");

        }

    }
}


