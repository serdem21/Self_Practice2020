package OFFICE_HOURS.Practice_10_28_2020_StringAndLoop;

public class FrequencyToLowerCase {

    public static void main(String[] args) {
        String sentence = "java Java JAVA java Java Java";
        String word = "Java";
        word = word.toLowerCase();
        String temp = sentence.toLowerCase();

        int count = 0;

        while(temp.contains(word)){
            temp = temp.replaceFirst(word, "");
            count++;
        }
        System.out.println(count);

    }
}
