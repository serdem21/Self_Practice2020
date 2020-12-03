package OFFICE_HOURS.Practice_10_28_2020_StringAndLoop;

public class CatDod {

    public static void main(String[] args) {

        String sentence = "dog dog Dog DoG cat  cAt CaT";

        String temp = sentence.toLowerCase(); // aftert his we do not need to worry about case sensitivity

        int countDog = 0;


        while (temp.contains("dog")) {
            temp = temp.replaceFirst("dog", "");
            countDog++;
        }
        System.out.println("Number of dogs: " + countDog);

        int countCat = 0;
        while(temp.contains("cat")){
            temp = temp.replaceFirst("cat", "");
            countCat++;
        }
        System.out.println("Number of cat: " + countCat);

        System.out.println(countCat == countDog); // false



    }
}