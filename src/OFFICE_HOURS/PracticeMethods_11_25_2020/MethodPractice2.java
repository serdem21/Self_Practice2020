package OFFICE_HOURS.PracticeMethods_11_25_2020;

public class MethodPractice2 {
    public static void main(String[] args) {
        max(400,500);
        System.out.println(max(40, 50 )*2);
        //========================================

        System.out.println(max(100,200,400));

        System.out.println(max(10,20,30,40));

        min(1000, 2000);
        System.out.println(min(1000,2000));

        System.out.println(min(30,56,19));

       // System.out.println(min(50,55,65,45));

        System.out.println(max(5.5,8.1));


    }
         public static int max(int a, int b){
        int maximum = (a>=b)? a:b;
        return maximum;

    }
        public static int max(int a, int b, int c){
        int n = max(a,b);
        return max(n, c);

    }
    public static int max(int a, int b, int c, int d) {
        int k = max(a, b, c);
        return max(k, d);
    }
        public static double max(double a, double b){
        double maximum = (a>=b)? a:b;
        return maximum;

    }
     public static int min(int a, int b){
       int minimum = (a<=b)? a:b;
       return minimum;
     }
    public static int min(int a, int b, int c){
        int t = min(a,b);
        return min(t,c);
    }
    public static int min(int a, int b, int c, int d){
        int q = min(a,b,c);
        return min(q,d);
    }
}
