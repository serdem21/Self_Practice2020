package Methods_11_2020;

public class characterWrapper {
    public static void main(String[] args) {

//        char n = 'K';
//        System.out.println(Character.isDigit(n));   // false
//        System.out.println(Character.isLetter(n));

        String str = "a3@df~!-02sd_+3dmnAkY";
        String digits = "";
        String letters = "";
        String specialChar = "";

        for(char each: str.toCharArray()){
            if(Character.isDigit(each)){
                digits+=each;
            }else if(Character.isLetter(each)){
                letters+=each;
            }else{
                specialChar+=each;
            }
        }
        System.out.println("digits: " + digits);
        System.out.println("letters: " + letters);
        System.out.println("specialChar: " + specialChar);



    }
}
