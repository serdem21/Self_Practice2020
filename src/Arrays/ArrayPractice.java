package Arrays;

import java.util.Arrays;

public class ArrayPractice {

    public static void main(String[] args) {
        int[] arr1 = {200000, 1000000, 4000000, 6000, 300000, 12345551, 90000};
        int max = arr1[0];
        int min = arr1[0];

        for (int each : arr1) {
            if (each > max) {
                max = each;
            }

            if (each < min) {
                min = each;
            }
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println("max num: " + max + " \n" + "min num: " + min );

        System.out.println("================================================");

        int[] numbers = {1,2,3,4,5,6,7,8,9,10,11,12,35,77,89,43,50,66};
            int count=0;
        for(int each : numbers){
            if(each%2==0){
                count++;
            }
            if(each%2 !=0){
                count++;
            }
            System.out.println();
            }
        }


    }

