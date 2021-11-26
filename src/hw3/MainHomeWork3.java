package hw3;

import java.util.Arrays;

public class MainHomeWork3 {

    public static void main(String[] args) {
        newArray();
        newArray2();
        dualArr();


        int[] arr = new int[]{1, 1, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
            System.out.println(Arrays.toString(arr));
        }
    }

    public static void newArray() {
        int[] arr = new int[100];
        for (int i = 0; i < 100; i++) {
            arr[i] = i;
            System.out.print(arr[i] + " ");
        }

    }

    public static void newArray2() {

        int[] arr = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
                System.out.println(Arrays.toString(arr));
            }
        }
    }

    public static void dualArr() {
        int[][] arr = new int[3][3];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i] == arr[j]) {
                    arr[i][j] = 1;
                } else if (i + j == arr.length - 1)
                    arr[i][j] = 1;

                System.out.printf("%4d", arr[i][j]);
            }
            System.out.println();
        }
    }

    public static int[] getArrLength(int len) {

        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            int initialValue = 5;
            if (arr[i] == initialValue && len == arr.length) {

            }
        }
        return arr;
    }

    public static void findMinMaxInArray(int min, int max) {
        int[] arr = new int[]{1, 7, 9, 20, -50,};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr.length) {
                arr[i] = max;
            } else if (arr[i] < arr.length) {
                arr[i] = min;
                System.out.println(arr[i]);
            }
        }
    }

    public static boolean arrBig() {
        int[] arr = new int[]{5, 5, 5, 7, 8,};
        for (int i = 0; i < arr.length; i++) {
        }
        if (arr[0] + arr[1] + arr[2] == arr[3] + arr[4]) {
            return true;
        } else {
            return false;
        }
    }

    public static void cycleNew() {
        int[] arr = new int[]{5, 5, 5, 7, 8,};
        int n = 2;
        for (int i = 0; i < arr.length; i++) {
            if (n == 2) {
                arr[i] = arr[i + 2];
            }
            System.out.println(arr[i]);
        }


    }
}





