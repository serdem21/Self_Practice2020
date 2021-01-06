package OFFICE_HOURS.Practice_11_27_2020;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class reverseArray2 {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(arr));

        int[] reverse = new int[arr.length];
        for(int i=arr.length-1, j=0; i>=0; i--,j++) {
            reverse[j] = arr[i];

        }
        System.out.println(Arrays.toString(reverse));

        System.out.println("=============================================================================");

        int[] arr2 = {1,2,3,4,5,6,7,8,9,10};

        ArrayList<Integer> reverseList = new ArrayList();
        for(int i=arr2.length-1; i>=0; i--){  // iteration alwasy index 0 to last index
           reverseList.add(arr2[i]);
            }
        System.out.println(reverseList);
        }




    }

