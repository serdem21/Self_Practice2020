package OFFICE_HOURS.Practice_10_28_2020_StringAndLoop;
// write a program that can return the frequency of the word from the sentence

/*
Sentence = "Java" is a proggramming language, I like to learn "Java"
word = "Java"
 */
public class frequencyOfWord2 {

    public static void main(String[] args) {

        String sentence = "Java is a programming language, I like to learn Java always Java always Java";
        String word = "Java";


        int count =0;
        while(sentence.contains(word)){
            sentence = sentence.replaceFirst(word, "");// we need to remove one at a time to count
            count++;
        }
        System.out.println(count);
        System.out.println(sentence);

        System.out.println("==================================================================================");


    }
}
