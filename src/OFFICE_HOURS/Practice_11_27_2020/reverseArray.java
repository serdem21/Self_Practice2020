package OFFICE_HOURS.Practice_11_27_2020;
import java.util.Arrays;
public class reverseArray {

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        arr = reverse(arr);
        System.out.println(Arrays.toString(arr));
        double[] arr2 = {100, 200, 300, 400, 500};
        arr2 = reverse(arr2);

        System.out.println(Arrays.toString(arr2));

        char[] ch1 = {'A', 'B', 'C'};
        ch1 = reverse(ch1);
        System.out.println(Arrays.toString(ch1));

        String[] str = {"cybertek school"};
        str = reverse(str);
        System.out.println(Arrays.toString(str));
    }


    public static int[] reverse(int[] arr) {
        int[] reverse = new int[arr.length - 1];
        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            reverse[j] = arr[i];
        }
        return reverse;
    } // reverses an array of integer and returns it
    public static double[] reverse(double[] arr) {
        double[] reverse = new double[arr.length];

        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {  //i: index numbers of arr in reversed order
            reverse[j] = arr[i];  // j: index numbers of reverse array, in natual morder
        }

        return reverse;
    }// reverses an array of double and returns it
    public static char[] reverse(char[] arr) {
        char[] reverse = new char[arr.length];

        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {  //i: index numbers of arr in reversed order
            reverse[j] = arr[i];  // j: index numbers of reverse array, in natual morder
        }

        return reverse;
    }// reverses an array of char and returns it
    public static String[] reverse(String[] arr) {
        String[] reverse = new String[arr.length];
        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            reverse[j] = arr[i];
        }
        return reverse;

    }// reverses an array of double and returns it



}





