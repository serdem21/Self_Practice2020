package Methods_11_2020;

public class MethodswithParameters {

    public static void main(String[] args) {
        int age = 35;
        eligibleToBuyAlcohol(age); // age =35
        eligibleToBuyAlcohol(20); // not eligible

        calculateAge(1990, 2020);
    }

    public static void eligibleToBuyAlcohol(int age) {
        if (age >= 21) {  // condition
            System.out.println("Eligible");
        } else {
            System.out.println("Not Eligible");
        }
    }

    public static void calculateAge(int birthYear, int currentYear) {

        if (birthYear < currentYear) {
            System.out.println("Your age is: " + (currentYear - birthYear));

        }else{
            System.out.println("invalid age");
        }
    }
}