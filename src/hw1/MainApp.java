package hw1;

public class MainApp {
    public static void main(String[] args) {
    printThreeWords();
    checkSumSign();
    }
    public static void printThreeWords  (){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign(){
        int a=40;
        int b=60;
        int c = a + b;
        if(c >=0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");

        }
    }

}
