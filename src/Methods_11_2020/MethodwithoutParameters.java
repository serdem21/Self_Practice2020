package Methods_11_2020;

import Task_11_05_2020_Practices.MethodsWithoutparameters;
import Task_11_05_2020_Practices.MethodsWithoutparameters2;

public class MethodwithoutParameters {

    public static void main(String[] args) {

        printHello5times();
        System.out.println("Sinan");
        printHello5times();
        System.out.println("School Name");
        printHello5times();

        MethodsWithoutparameters.printHello5times();
        System.out.println("Odd number: ");
        MethodsWithoutparameters2.OddNumber1to100();
        System.out.println("Even number");
        MethodsWithoutparameters2.evenNumber1to100();
    }

    public static void printHello5times() {  // custom method

        for (int i = 1; i < 6; i++) {  // statement
            System.out.println("Hello");

        }
    }

}
