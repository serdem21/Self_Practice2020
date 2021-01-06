package OFFICE_HOURS.Practice_01_06_2021;

import java.io.FileNotFoundException;

public class exception {

    public static void main(String[] args) {

        System.out.println("Test Started");
        String str = null;

      //  System.out.println(str.charAt(0));  unchecked


      //  throw new Car(); ERROR
       // throw new IllegalStateException();// unchecked   // throw, throws , try- only for exceptions

       // throw new FileNotFoundException();  //check exception //
        System.out.println(25/0);  // unchecked



        /*
         exception handling:
        1. try & catch: can handle any exception
        2.throws =for only checked exceptions. used in signature of method
                  method itself is going to throw exception when you call it

         */
    }
}
