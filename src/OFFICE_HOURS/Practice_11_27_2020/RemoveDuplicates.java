package OFFICE_HOURS.Practice_11_27_2020;
import java.util.Arrays;
import java.util.ArrayList;

public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 3, 4}; // expecting result should be [1,2,3,4]

        ArrayList<Integer> List = new ArrayList<>();
        for (int each : arr) {
            if (!List.contains(each)) {
                List.add(each);
            }
        }
        // System.out.print(List);
        // get original from ArrayList to Array
        int[] nonDup = new int[List.size()];
        for (int i = 0; i <= nonDup.length - 1; i++) {
            nonDup[i] = List.get(i);
        }
        System.out.println(Arrays.toString(nonDup));


        int[] arr2 = {5, 5, 5, 6, 6, 6, 6, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8};
        int[] nonDup2 = removeDuplicates(arr2);

        System.out.println(Arrays.toString(nonDup2));

    }

    public static int[] removeDuplicates(int[] arr) {  // method
        ArrayList<Integer> List = new ArrayList<>();
        for (int each : arr) {
            if (!List.contains(each)) {
            }
        }
        System.out.print(List);

        // get original from ArrayList to Array
        int[] nonDup = new int[List.size()];
        for (int i = 0; i <= nonDup.length - 1; i++) {
            nonDup[i] = List.get(i);
        }
        return nonDup;
    }

    public static double[] removeDuplicates(double[] arr) {
        ArrayList<Double> list = new ArrayList<>(); //[1, 2, 3,4 ]
        for (double each : arr) {
            if (!list.contains(each)) {
                list.add(each);
            }
        }

        double[] nonDup = new double[list.size()]; // [1,2,3,4]

        for (int i = 0; i <= nonDup.length - 1; i++) {
            nonDup[i] = list.get(i);
        }

        return nonDup;

    }
}