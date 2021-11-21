package hw2;

public class Main {
    public static void main(String[] args) {
        isCheckingSum(5, 6);
        //System.out.println((isCheckingSum(5, 6)));
        plusOrMinus(100);
        isPlusOrMinus(-9);
        //System.out.println((isPlusOrMinus(-9)));
        int a = 10;
        printPhraseXTimes("Я люблю кодить на Java!", a);
        int x=2024;
        isLeapYear(x);

    }

    public static boolean isCheckingSum(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void plusOrMinus(int a) {
        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean isPlusOrMinus(int a) {
        if (a < 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void printPhraseXTimes(String Phrase, int a) {
        for (int i = 0; i < a; i++) {
            System.out.println(Phrase);
        }

    }

    public static boolean isLeapYear(int x) {


        if (x %400 == 0 && x%4 == 0) {
            return true;
        } else {
            return false;
        }

    }
}



