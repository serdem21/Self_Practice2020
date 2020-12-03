package OFFICE_HOURS.Practice_10_28_2020_StringAndLoop;

public class DoWhile_Practice {

    public static void main(String[] args) {

// for loop more easy and more preferable
        for (int i = 1; i <= 20; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

        System.out.println("===========================================");

        int i = 1; // initialization

        do{ // just do it
           if(i%2==0){
               System.out.println(i);  // statement
           }
           i++;  // iteration after statement
        }while(i<=20);  // condition


    }
}
