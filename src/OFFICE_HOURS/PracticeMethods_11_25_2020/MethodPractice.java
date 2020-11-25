package OFFICE_HOURS.PracticeMethods_11_25_2020;

public class MethodPractice {
    public static void main(String[] args) {
        dicisibleBy3Between1tO100();
        System.out.println();
        System.out.println("Hello");

        dicisibleBy3Between1tO100();
        System.out.println("How are you?");

        divisibleBy3(50,90 );




    }

    public static void dicisibleBy3Between1tO100() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 != 0) { // if the number is not divisible by3
                continue; // then skip
            }
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void divisibleBy3(int start, int end){
        for(int i=start; i<=end; i++){
            if(i%3 !=0){
                continue;
            }
        }
    }

}

