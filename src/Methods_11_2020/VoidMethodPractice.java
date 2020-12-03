package Methods_11_2020;

import java.util.Arrays;

public class VoidMethodPractice {


    public static void main(String[] args) {
        int[] a1 = {100, -200, 300, 50, 40, 59, 700, 0, 1, 2};
        arrayMaxNumber(a1);
        arrayMinNumber(a1);
        int[] a2 = {1, 2, 3, 5, 19, 35, -23, 44};
        arrayMaxNumber(a2);
        arrayMinNumber(a2);


    }

    public static void arrayMaxNumber(int[] arr) {
        // Arrays.sort(arr);
        //System.out.println("Maximum Number: " + arr[arr.length - 1]);
        int max = arr[0];
        for (int each : arr) {
            if (each > max) {
                max = each;
            }
        }
        System.out.println("Maximum number: " + max);

    }

    public static void arrayMinNumber(int[] arr) {
        int min = arr[0];
        for (int each : arr) {
            if (each < min) {
                min = each;
            }
        }
        System.out.println("min number: " + min);
    }

}
