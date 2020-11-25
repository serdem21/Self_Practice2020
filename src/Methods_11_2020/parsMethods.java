package Methods_11_2020;

public class parsMethods {
    public static void main(String[] args) {
        String data1 = "123";
       // System.out.println(data1+3);

        int num = Integer.parseInt(data1); // autobox
        System.out.println(num+1);

        double  num2 = Double.parseDouble(data1);
        System.out.println(num2+5.6);

        String s1 = "5.9";
         double d = Double.parseDouble(s1); // none
        double d2 = Double.parseDouble(s1);
        System.out.println(d+5);

        String s2 = "true"; // other than true, anything will be displayed false

        boolean b = Boolean.parseBoolean(s2); // none, unboxing
        Boolean b2 = Boolean.parseBoolean(s2); // auto boxing

        String s3 = "False";
        Boolean b3 = Boolean.parseBoolean(s3);
        System.out.println(b3);




    }
}
