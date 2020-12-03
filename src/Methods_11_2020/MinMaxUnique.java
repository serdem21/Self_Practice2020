package Methods_11_2020;
 import java.util.Arrays;
public class MinMaxUnique {

    public static void main(String[] args) {
        int[] arr = {10, 40, 49, 3, 45, 22, 90, -5 , 5, 90, 40, 45, 10};

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

       int max = 0;
       for(int each:arr){
            if(each>max){
                max =each;
            }
        }
        System.out.println(max);

         int min = 0;
         for(int each : arr){
        if(each<min){
            min=each;
        }
    }
        System.out.println(min);
        System.out.println("======================================");
    for(int each :arr){
        int count =0;
        for(int each2:arr){
           if(each==each2){
               count++;
           }

           }
            if(count==1){
                System.out.print(each+ " ");
        }
    }





    }

    }
