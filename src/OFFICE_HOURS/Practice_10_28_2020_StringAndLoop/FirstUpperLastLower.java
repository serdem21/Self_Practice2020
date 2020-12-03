package OFFICE_HOURS.Practice_10_28_2020_StringAndLoop;
/*
Write a program that asksuser to enter a String.I
if string started with uppercase and ending with lowercase letter then print true,
otherwise print false
 */
import java.util.Scanner;

public class FirstUpperLastLower {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        input.close();

        char f = str.charAt(0);
        char l = str.charAt(str.length()-1);

        boolean start = f>=65 && f<=90; // true
        boolean end = l>=97 && l<=122;
      //  boolean isValid = f>=65 && f<=90 && l>=97 && l<=122;
        if(start && end){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
