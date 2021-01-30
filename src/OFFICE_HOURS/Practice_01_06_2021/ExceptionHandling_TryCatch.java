package OFFICE_HOURS.Practice_01_06_2021;

import java.util.NoSuchElementException;

public class ExceptionHandling_TryCatch {

    public static void main(String[] args) {
        try{
            throw new NoSuchElementException("Element not found"); //ID

        }catch (NoSuchElementException e){

        }
    }
}
